public final class Class_az {
   // $FF: synthetic field
   public int a;
   // $FF: synthetic field
   private static final int[] d;
   // $FF: synthetic field
   public String b;
   // $FF: synthetic field
   public Class_ge c = new Class_ge();

   private static boolean a(int var0) {
      return var0 != 0;
   }

   private static boolean a(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean a(int var0, int var1) {
      return var0 <= var1;
   }

   public final void a(String var1, String var2) {
      int var3 = d[0];
      if (a(Class_dx.ai) && a((Object)Class_fn.d().b(), (Object)this) && b(Class_dx.an, this.c.size() - d[1])) {
         var3 = d[1];
      }

      this.c.addElement(String.valueOf((new StringBuilder("c3@")).append(var1)));
      Class_ge var4 = Class_ft.a.b(var2, d[2]);
      int var5 = d[0];
      "".length();
      if (((110 + 108 - 142 + 94 ^ 100 + 126 - 198 + 116) & (15 ^ 19 ^ 168 ^ 142 ^ -" ".length())) == 0) {
         while(!c(var5, var4.size())) {
            this.c.addElement(String.valueOf((new StringBuilder("c0")).append(var4.elementAt(var5))));
            ++var5;
         }

         if (a(var3)) {
            Class_dx.ac().ai();
         }

         this.b();
      }
   }

   public final void a(String var1) {
      int var2 = d[0];
      if (a(Class_dx.ai) && a((Object)Class_fn.d().b(), (Object)this) && b(Class_dx.an, this.c.size() - d[1])) {
         var2 = d[1];
      }

      Class_ge var3 = Class_ft.a.b(var1, d[2]);
      int var4 = d[0];
      "".length();
      if (((152 ^ 164) & ~(118 ^ 74)) == 0) {
         while(!c(var4, var3.size())) {
            this.c.addElement(var3.elementAt(var4));
            ++var4;
         }

         if (a(var2)) {
            Class_dx.ac().ai();
         }

         this.b();
      }
   }

   private static boolean b(int var0, int var1) {
      return var0 == var1;
   }

   private static void a() {
      d = new int[4];
      d[0] = (12 ^ 68) & ~(205 ^ 133);
      d[1] = " ".length();
      d[2] = (10 ^ 35) + (45 ^ 7) - -(194 ^ 196) + (45 ^ 106);
      d[3] = 53 + 53 - 103 + 167 ^ 79 + 79 - 147 + 141;
   }

   private void b() {
      "".length();
      if (-" ".length() <= 0) {
         while(!a(this.c.size(), d[3])) {
            this.c.removeElementAt(d[1]);
         }

      }
   }

   public Class_az() {
   }

   public Class_az(String var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   static {
      a();
   }

   private static boolean c(int var0, int var1) {
      return var0 >= var1;
   }
}
