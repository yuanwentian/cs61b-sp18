public class NBody {

    public static String imageToDraw = "images/starfield.jpg";

    public static int readNumberOfPlanets(String path) {
        In in = new In(path);
        int numberOfPlanets = in.readInt();
        return numberOfPlanets;
    }

    public static double readRadius(String path) {
        In in = new In(path);
        int numberOfPlanets = in.readInt();
        double radius = in.readDouble();
        return radius;
    }

    public static Planet[] readPlanets(String path) {
        In in = new In(path);
        int numberOfPlanets = in.readInt();
        double radius = in.readDouble();
        Planet[] allPlanets = new Planet[numberOfPlanets];
        for(int i = 0; i < allPlanets.length; i++){
            allPlanets[i] = getPlanet(in);
        }
        return allPlanets;
    }

    public static Planet getPlanet(In in) {
        double xxPos = in.readDouble();
        double yyPos = in.readDouble();
        double xxVel = in.readDouble();
        double yyVel = in.readDouble();
        double mass = in.readDouble();
        String imgFileName = in.readString();
        return new Planet(xxPos, yyPos, xxVel, yyVel, mass, imgFileName);
    }

    public static void drawBackground(double radius, String imageToDraw) {
        StdDraw.setScale(-radius, radius);
        StdDraw.clear();
        StdDraw.picture(0, 0, imageToDraw);
    }

    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];
        int n = readNumberOfPlanets(filename);
        Planet[] planets = readPlanets(filename);
        double radius = readRadius(filename);
        for (double t=0; t <= T; t+=dt) {
            double[] xForces = new double[n];
            double[] yForces = new double[n];
            for (int i=0; i<n; i++){
                xForces[i] = planets[i].calcNetForceExertedByX(planets);
                yForces[i] = planets[i].calcNetForceExertedByY(planets);
            }
            for (int i=0; i<n; i++){
                planets[i].update(dt, xForces[i], yForces[i]);
            }
            drawBackground(radius, imageToDraw);
            for(Planet p : planets) {
                p.draw();
            }
            StdDraw.show();
            StdDraw.pause(10);
        }
        StdOut.printf("%d\n", planets.length);
        StdOut.printf("%.2e\n", radius);
        for (int i = 0; i < planets.length; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                          planets[i].xxPos, planets[i].yyPos, planets[i].xxVel,
                          planets[i].yyVel, planets[i].mass, planets[i].imgFileName);
        }
    }
}

