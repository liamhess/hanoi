public class tuermevonhanoi {
        public static void main(String[] args) {
          verlege(3,'a','b','c');
        }
        
        static void verlege (           // drucke die Verlegeoperationen, um
          int n,                        // n Scheiben
          char start,                   // vom Startort
          char zwischen,                // unter Zuhilfenahme eines Zwischenortes
          char ziel) {                  // zum Ziel zu bringen
      
          if (n>0) {
              verlege(n-1, start, ziel, zwischen);
              System.out.println("Scheibe " + n +" von " + start + " nach " + ziel);
              verlege(n-1, zwischen, start, ziel);
              }
          }
      
}
