public final class Class_cm {
   // $FF: synthetic field
   public Class_de[] a;
   // $FF: synthetic field
   private static final int[] b;

   private static boolean a(int var0) {
      return var0 == 0;
   }

   public Class_cm(int var1) {
      if (a(var1)) {
         this.a = new Class_de[b[0]];
      }

      if (a(var1, b[1])) {
         this.a = new Class_de[b[2]];
      }

      if (a(var1, b[3])) {
         this.a = new Class_de[b[4]];
      }

      if (a(var1, b[5])) {
         this.a = new Class_de[b[3]];
      }

   }

   static {
      a();
   }

   private static boolean a(int var0, int var1) {
      return var0 == var1;
   }

   private static void a() {
      b = new int[6];
      b[0] = 153 ^ 145;
      b[1] = " ".length();
      b[2] = 79 ^ 105 ^ 176 ^ 132;
      b[3] = "  ".length();
      b[4] = 223 ^ 138 ^ 52 ^ 107;
      b[5] = "   ".length();
   }
}
