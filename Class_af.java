public final class Class_af {
   // $FF: synthetic field
   public boolean a;
   // $FF: synthetic field
   public String b;
   // $FF: synthetic field
   private static final int[] e;
   // $FF: synthetic field
   public short c;
   // $FF: synthetic field
   public short d;

   public Class_af(String var1, short var2, short var3) {
      this.a = (boolean)e[0];
      this.c = var2;
      this.d = var3;
      this.b = var1;
   }

   private static void a() {
      e = new int[1];
      e[0] = (4 ^ 72) & ~(62 ^ 114);
   }

   static {
      a();
   }
}
