import javax.microedition.lcdui.Image;

public final class Class_bx {
   // $FF: synthetic field
   private static final int[] d;
   // $FF: synthetic field
   public static Class_fk a;
   // $FF: synthetic field
   public static Class_fk b;
   // $FF: synthetic field
   public static int c;

   public static void a(short var0, byte[] var1) {
      try {
         Class_bj var2;
         if (a(var2 = (Class_bj)b.a(String.valueOf(var0)))) {
            var2 = new Class_bj();
         }

         b.a(String.valueOf(var0), var2);
         if (a(var1.length)) {
            var2.a = Image.createImage(var1, d[0], var1.length);
            "".length();
            if (-" ".length() >= ((40 ^ 92 ^ 84 ^ 52) & (242 ^ 173 ^ 21 ^ 94 ^ -" ".length()))) {
               return;
            }
         } else {
            var2.b = (long)((int)(System.currentTimeMillis() / 1000L));
         }

         System.currentTimeMillis();
      } catch (Exception var3) {
         return;
      }

      "".length();
      if ("   ".length() != 0) {
         ;
      }
   }

   static {
      a();
      c = d[0];
      b = new Class_fk();
      a = new Class_fk();
   }

   private static boolean a(int var0) {
      return var0 > 0;
   }

   private static void a() {
      d = new int[1];
      d[0] = ("  ".length() ^ 124 ^ 42) & (143 + 181 - 260 + 162 ^ 121 + 64 - 104 + 101 ^ -" ".length());
   }

   private static boolean b(int var0) {
      return var0 >= 0;
   }

   public static Class_bj a(short var0) {
      try {
         Class_bj var1;
         if (b(var1 = (Class_bj)b.a(String.valueOf(var0))) && (!b(var1) || !a(var1.a))) {
            System.currentTimeMillis();
         } else {
            if (a(var1)) {
               var1 = new Class_bj();
               b.a(String.valueOf(var0), var1);
            }

            var1.a = Class_db.a(Class_eb.c(String.valueOf((new StringBuilder("effect ")).append(var0))));
            if (a(var1.a) && a(a(System.currentTimeMillis() / 1000L - var1.b, 10L))) {
               var1.b = (long)((int)(System.currentTimeMillis() / 1000L));
               if (b(var0)) {
                  var1.a = Class_bc.a(String.valueOf((new StringBuilder("/eff_auto/")).append(var0).append(".png")));
               }

               if (a(var1.a) && c(Class_ez.c().d())) {
                  Class_ao.a().c(var0);
                  var1.b = (long)((int)(System.currentTimeMillis() / 1000L));
               }

               System.currentTimeMillis();
               "".length();
               if (((60 ^ 31) & ~(175 ^ 140)) == (27 ^ 31)) {
                  return null;
               }
            }
         }

         return var1;
      } catch (Exception var2) {
         return null;
      }
   }

   private static boolean a(Object var0) {
      return var0 == null;
   }

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static boolean c(int var0) {
      return var0 != 0;
   }

   private static boolean b(Object var0) {
      return var0 != null;
   }
}
