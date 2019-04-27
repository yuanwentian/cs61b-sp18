/** Planet class */
public class Planet {

    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;
    public static final double G = 6.67e-11;

    public Planet(double xP, double yP, double xV, double yV, double m, String img) {
        this.xxPos = xP;
        this.yyPos = yP;
        this.xxVel = xV;
        this.yyVel = yV;
        this.mass = m;
        this.imgFileName = img;
    }

    public Planet(Planet p) {
        this.xxPos = p.xxPos;
        this.yyPos = p.yyPos;
        this.xxVel = p.xxVel;
        this.yyVel = p.yyVel;
        this.mass = p.mass;
        this.imgFileName = p.imgFileName;
    }

    public double calcDistance(Planet p) {
        return Math.sqrt(Math.pow(this.xxPos - p.xxPos, 2) + Math.pow(this.yyPos - p.yyPos, 2));
    }

    public double calcForceExertedBy(Planet p) {
        double r = this.calcDistance(p);
        double F = G * this.mass * p.mass / (r * r);
        return F;
    }

    public double calcForceExertedByX(Planet p) {
        double NetForce = this.calcForceExertedBy(p);
        double dx = this.xxPos - p.xxPos;
        double r = this.calcDistance(p);
        double ForceX = - NetForce * (dx / r);
        return ForceX;
    }

    public double calcForceExertedByY(Planet p) {
        double NetForce = this.calcForceExertedBy(p);
        double dy = this.yyPos - p.yyPos;
        double r = this.calcDistance(p);
        double ForceY = -  NetForce * (dy / r);
        return ForceY;
    }

    public double calcNetForceExertedByX(Planet[] allPlanets) {
        double NetForceX = 0;
        for(Planet p : allPlanets) {
            if (this.calcDistance(p) == 0) continue;
            NetForceX += this.calcForceExertedByX(p);
        }
        return NetForceX;
    }

    public double calcNetForceExertedByY(Planet[] allPlanets) {
        double NetForceY = 0;
        for(Planet p : allPlanets) {
            if (this.calcDistance(p) == 0) continue;
            NetForceY += this.calcForceExertedByY(p);
        }
        return NetForceY;
    }

    public void update(double dt,double fX,double fY) {
        double xxAcc = fX / this.mass;
        double yyAcc = fY / this.mass;
        this.xxVel = this.xxVel + xxAcc * dt;
        this.yyVel = this.yyVel + yyAcc * dt;
        this.xxPos = this.xxPos + xxVel * dt;
        this.yyPos = this.yyPos + yyVel * dt;
    }

    public void draw() {
        StdDraw.picture(this.xxPos, this.yyPos, "images/" + this.imgFileName);
    }
}
