public final class Class_ck {
   // $FF: synthetic field
   public short a;
   // $FF: synthetic field
   public String b;
   // $FF: synthetic field
   public byte c;
   // $FF: synthetic field
   private static final int[] j;
   // $FF: synthetic field
   public String d;
   // $FF: synthetic field
   public byte e;
   // $FF: synthetic field
   public byte f;
   // $FF: synthetic field
   public short g;
   // $FF: synthetic field
   public short h;
   // $FF: synthetic field
   public boolean i;

   public final boolean a() {
      return (boolean)(a(this.c) && a(this.c, j[0]) ? j[1] : j[2]);
   }

   private static boolean a(int var0, int var1) {
      return var0 <= var1;
   }

   public Class_ck(short var1, byte var2, byte var3, String var4, String var5, byte var6, short var7, short var8, boolean var9) {
      this.a = var1;
      this.c = var2;
      this.f = var3;
      this.b = var4;
      this.d = var5;
      this.e = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
   }

   static {
      c();
   }

   private static boolean b(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean a(int var0) {
      return var0 >= 0;
   }

   private static void c() {
      j = new int[5];
      j[0] = 175 ^ 198 ^ 127 ^ 25;
      j[1] = " ".length();
      j[2] = (33 ^ 120) & ~(101 ^ 60);
      j[3] = 99 ^ 80 ^ 128 ^ 164;
      j[4] = 138 + 2 - 82 + 126 ^ 144 + 138 - 125 + 4;
   }

   public final boolean b() {
      return (boolean)(b(this.c, j[3]) && a(this.c, j[4]) ? j[1] : j[2]);
   }
}
