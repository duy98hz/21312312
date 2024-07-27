public final class Class_bq {
   // $FF: synthetic field
   public short a;
   // $FF: synthetic field
   public short b;
   // $FF: synthetic field
   public byte c;
   // $FF: synthetic field
   private static final int[] f;
   // $FF: synthetic field
   public short d;
   // $FF: synthetic field
   public byte e;

   static {
      a();
   }

   public Class_bq(int var1, int var2, int var3) {
      this.e = (byte)f[0];
      this.a = (short)var3;
      this.d = (short)var1;
      this.b = (short)var2;
   }

   private static void a() {
      f = new int[1];
      f[0] = (100 ^ 74) & ~(28 ^ 50);
   }
}
