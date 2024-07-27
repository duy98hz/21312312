public final class Class_ec {
   // $FF: synthetic field
   public Class_df a;
   // $FF: synthetic field
   public int b;
   // $FF: synthetic field
   public int c;
   // $FF: synthetic field
   public int d;
   // $FF: synthetic field
   public int e;
   // $FF: synthetic field
   public int f;
   // $FF: synthetic field
   public int g;
   // $FF: synthetic field
   public long h;
   // $FF: synthetic field
   public boolean i;
   // $FF: synthetic field
   private static final int[] m;
   // $FF: synthetic field
   public byte j;
   // $FF: synthetic field
   public Class_ck k;
   // $FF: synthetic field
   public int l;

   public final void a(int var1, int var2) {
      this.d = var1;
      this.b = var2;
      this.f = var1 - this.e >> m[1];
      this.g = var2 - this.l >> m[1];
      this.j = (byte)m[1];
   }

   private static void a() {
      m = new int[4];
      m[0] = (7 ^ 28 ^ 197 ^ 191) & (63 ^ 116 ^ 190 ^ 148 ^ -" ".length());
      m[1] = "  ".length();
      m[2] = 74 + 142 - 129 + 93 ^ 92 + 56 - 22 + 51;
      m[3] = " ".length();
   }

   static {
      a();
   }

   public Class_ec(short var1, short var2, int var3, int var4, int var5, int var6) {
      this.i = (boolean)m[0];
      this.h = 0L;
      this.c = var1;
      this.k = Class_ch.a(var2);
      this.e = var5;
      this.l = var4;
      this.d = var5;
      this.b = var6;
      this.f = var5 - var3 >> m[1];
      this.g = m[2];
   }

   public Class_ec(short var1, short var2, int var3, int var4) {
      this.i = (boolean)m[0];
      this.h = 0L;
      this.c = var1;
      this.k = Class_ch.a(var2);
      this.e = this.d = var3;
      this.l = this.b = var4;
      this.j = (byte)m[3];
   }
}
