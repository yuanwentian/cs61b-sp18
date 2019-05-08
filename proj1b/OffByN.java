public class OffByN implements CharacterComparator {
    public int n;
    public OffByN(int N) {
        n = N;
    }
    public boolean equalChars(char x, char y) {
        int diff = x - y;
        if (Math.abs(diff) == n) {
            return true;
        }
        return false;
    }
}
