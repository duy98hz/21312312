import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;

public final class Class_by {
   // $FF: synthetic field
   public static int[][] a;
   // $FF: synthetic field
   public short b;
   // $FF: synthetic field
   private static Hashtable f;
   // $FF: synthetic field
   private static Image[] g;
   // $FF: synthetic field
   public short c;
   // $FF: synthetic field
   private static final int[] h;
   // $FF: synthetic field
   public short d;
   // $FF: synthetic field
   public short e;

   public static void a(int var0, byte[] var1) {
      Class_df var2;
      if (a(var2 = (Class_df)f.get(String.valueOf(var0)))) {
         var2 = new Class_df();
         f.put(String.valueOf(var0), var2);
         "".length();
      }

      var2.d = Class_db.a(var1);
      if (d(Class_fq.a.f)) {
         Class_eb.a(String.valueOf(var0), var1);
      }

   }

   private static boolean a(int var0, int var1) {
      return var0 < var1;
   }

   public static void a(Class_er var0, int var1, int var2, int var3, int var4, int var5) {
      if (a(var1, a.length) && a(a[var1][h[2]], g[a[var1][h[1]]].getWidth()) && a(a[var1][h[4]], g[a[var1][h[1]]].getWidth()) && a(a[var1][h[3]], g[a[var1][h[1]]].getHeight()) && a(a[var1][h[5]], g[a[var1][h[1]]].getHeight())) {
         var0.a(g[a[var1][h[1]]], a[var1][h[2]], a[var1][h[3]], a[var1][h[4]], a[var1][h[5]], h[1], var2, var3, h[4]);
         "".length();
         if (" ".length() == 0) {
            return;
         }
      } else {
         Class_df var6;
         if (a(var6 = (Class_df)f.get(String.valueOf(var1)))) {
            var6 = new Class_df();
            f.put(String.valueOf(var1), var6);
            "".length();
            var6.d = Class_db.a(Class_eb.c(String.valueOf(var1)));
            if (a(var6.d)) {
               var6.b = System.currentTimeMillis();
               Class_ao.a().h(var1);
               "".length();
               if (" ".length() > " ".length()) {
                  return;
               }
            }
         } else if (a(var6.d) && c(e(System.currentTimeMillis() - var6.b, 60000L))) {
            var6.b = System.currentTimeMillis();
            Class_ao.a().h(var1);
         }

         if (b(var6)) {
            if (b(var6.d)) {
               if (b(var6.d.getHeight(), h[7])) {
                  var1 = var6.d.getWidth();
                  var5 = var6.d.getHeight() / h[4];
                  if (d(Class_bc.n % h[8])) {
                     var6.a = (byte)((var6.a + h[2]) % h[4]);
                  }

                  var0.a(var6.d, h[1], var6.a * var5, var1, var5, h[1], var2, var3, h[4]);
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  var0.a(var6.d, h[1], h[1], var6.d.getWidth(), var6.d.getHeight(), h[1], var2, var3, h[4]);
               }
            }

            var6.c = System.currentTimeMillis();
            return;
         }
      }

   }

   public Class_by() {
      f();
   }

   public static boolean a(int var0) {
      if (!a(var0, a.length) || !a(a[var0][h[2]], g[a[var0][h[1]]].getWidth()) || !a(a[var0][h[4]], g[a[var0][h[1]]].getWidth()) || !a(a[var0][h[3]], g[a[var0][h[1]]].getHeight()) || c(a[var0][h[5]], g[a[var0][h[1]]].getHeight())) {
         Class_df var1;
         if (a(var1 = (Class_df)f.get(String.valueOf(var0)))) {
            var1 = new Class_df();
            f.put(String.valueOf(var0), var1);
            "".length();
            var1.d = Class_db.a(Class_eb.c(String.valueOf(var0)));
            if (a(var1.d)) {
               var1.b = System.currentTimeMillis();
               Class_ao.a().h(var0);
            }

            return (boolean)h[1];
         }

         if (b(var1.d)) {
            return (boolean)h[2];
         }

         if (a(var1.d) && c(d(System.currentTimeMillis() - var1.b, 60000L))) {
            var1.b = System.currentTimeMillis();
            Class_ao.a().h(var0);
            return (boolean)h[1];
         }
      }

      return (boolean)h[2];
   }

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static int b(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public static void b(Class_er var0, int var1, int var2, int var3, int var4, int var5) {
      if (a(var1, a.length) && a(a[var1][h[2]], g[a[var1][h[1]]].getWidth()) && a(a[var1][h[4]], g[a[var1][h[1]]].getWidth()) && a(a[var1][h[3]], g[a[var1][h[1]]].getHeight()) && a(a[var1][h[5]], g[a[var1][h[1]]].getHeight())) {
         var0.a(g[a[var1][h[1]]], a[var1][h[2]], a[var1][h[3]], a[var1][h[4]], a[var1][h[5]], var4, var2, var3, var5);
         "".length();
         if ((119 ^ 115) < "   ".length()) {
            return;
         }
      } else {
         Class_df var6;
         if (a(var6 = (Class_df)f.get(String.valueOf(var1)))) {
            var6 = new Class_df();
            f.put(String.valueOf(var1), var6);
            "".length();
            var6.d = Class_db.a(Class_eb.c(String.valueOf(var1)));
            if (a(var6.d)) {
               var6.b = System.currentTimeMillis();
               Class_ao.a().h(var1);
               "".length();
               if (null != null) {
                  return;
               }
            }
         } else if (a(var6.d) && c(c(System.currentTimeMillis() - var6.b, 60000L))) {
            var6.b = System.currentTimeMillis();
            Class_ao.a().h(var1);
         }

         if (b(var6)) {
            if (b(var6.d)) {
               var0.a(var6.d, h[1], h[1], var6.d.getWidth(), var6.d.getHeight(), var4, var2, var3, var5);
            }

            var6.c = System.currentTimeMillis();
            return;
         }
      }

   }

   private static boolean c(int var0) {
      return var0 > 0;
   }

   public static void a() {
      g = null;
      System.gc();
      Image[] var10000 = new Image[h[0]];
      var10000[h[1]] = Class_bc.a("/img/Big0.png");
      var10000[h[2]] = Class_bc.a("/img/Big1.png");
      var10000[h[3]] = Class_bc.a("/img/Big2.png");
      var10000[h[4]] = Class_bc.a("/img/Big3.png");
      var10000[h[5]] = Class_bc.a("/img/Big4.png");
      g = var10000;
      int[] var0 = new int[h[2]];
      var0[h[1]] = h[6];
      Image.createRGBImage(var0, h[2], h[2], (boolean)h[2]);
      "".length();
   }

   public static int b(int var0) {
      return a[var0][h[5]];
   }

   public static void c(Class_er var0, int var1, int var2, int var3, int var4, int var5) {
      if (a(var1, a.length) && a(a[var1][h[2]], g[a[var1][h[1]]].getWidth()) && a(a[var1][h[4]], g[a[var1][h[1]]].getWidth()) && a(a[var1][h[3]], g[a[var1][h[1]]].getHeight()) && a(a[var1][h[5]], g[a[var1][h[1]]].getHeight())) {
         var0.a(g[a[var1][h[1]]], a[var1][h[2]], a[var1][h[3]], a[var1][h[4]], a[var1][h[5]], h[1], var2, var3, h[4]);
         "".length();
         if (-"  ".length() > 0) {
            return;
         }
      } else {
         Class_df var6;
         if (a(var6 = (Class_df)f.get(String.valueOf(var1)))) {
            var6 = new Class_df();
            f.put(String.valueOf(var1), var6);
            "".length();
            var6.d = Class_db.a(Class_eb.c(String.valueOf(var1)));
            if (a(var6.d)) {
               var6.b = System.currentTimeMillis();
               Class_ao.a().h(var1);
               "".length();
               if (((138 ^ 156) & ~(1 ^ 23)) > ((50 ^ 54) & ~(161 ^ 165))) {
                  return;
               }
            }
         } else if (a(var6.d) && c(a(System.currentTimeMillis() - var6.b, 60000L))) {
            var6.b = System.currentTimeMillis();
            Class_ao.a().h(var1);
         }

         if (b(var6)) {
            if (b(var6.d)) {
               if (b(var6.d.getHeight(), h[7])) {
                  var1 = var6.d.getWidth();
                  var5 = var6.d.getHeight() / h[4];
                  if (d(Class_bc.n % h[8])) {
                     var6.a = (byte)((var6.a + h[2]) % h[4]);
                  }

                  var0.a(var6.d, h[1], var6.a * var5, var1, var5, h[1], var2, var3, h[4]);
                  "".length();
                  if ("  ".length() > (16 ^ 12 ^ 57 ^ 33)) {
                     return;
                  }
               } else {
                  var0.a(var6.d, h[1], h[1], var6.d.getWidth(), var6.d.getHeight(), h[1], var2, var3, h[4]);
               }
            }

            var6.c = System.currentTimeMillis();
            return;
         }
      }

   }

   private static boolean d(int var0) {
      return var0 == 0;
   }

   private static boolean b(int var0, int var1) {
      return var0 > var1;
   }

   public static void b() {
      g = null;
      System.gc();
   }

   private static int c(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static boolean a(Object var0) {
      return var0 == null;
   }

   private static boolean b(Object var0) {
      return var0 != null;
   }

   private static void e() {
      h = new int[9];
      h[0] = 180 ^ 177;
      h[1] = (161 ^ 180) & ~(107 ^ 126);
      h[2] = " ".length();
      h[3] = "  ".length();
      h[4] = "   ".length();
      h[5] = 14 + 118 - 85 + 103 ^ 26 + 10 - -24 + 86;
      h[6] = -(-(-16723 & 32122) & -961 & 2013282279);
      h[7] = 39 ^ 90 ^ 242 ^ 172;
      h[8] = 38 ^ 103 ^ 46 ^ 105;
   }

   private static int d(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public static void c() {
      try {
         Enumeration var0 = f.keys();
         "".length();
         if ((28 ^ 24) <= "   ".length()) {
            return;
         }

         while(!d(var0.hasMoreElements())) {
            String var1 = (String)var0.nextElement();
            Class_df var2 = (Class_df)f.get(var1);
            if (c(b(System.currentTimeMillis() - var2.c, 180000L))) {
               f.remove(var1);
               "".length();
            }
         }
      } catch (Exception var3) {
         return;
      }

      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   private static int e(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static void f() {
      try {
         DataInputStream var0;
         short var1;
         a = new int[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(Class_eb.c("nj_image")))).readShort()][h[0]];
         int var2 = h[1];
         "".length();
         if (((226 ^ 176) & ~(194 ^ 144)) != 0) {
            return;
         }

         while(!c(var2, var1)) {
            a[var2][h[1]] = var0.readUnsignedByte();
            a[var2][h[2]] = var0.readShort();
            a[var2][h[3]] = var0.readShort();
            a[var2][h[4]] = var0.readShort();
            a[var2][h[5]] = var0.readShort();
            ++var2;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         return;
      }

      "".length();
      if (null == null) {
         ;
      }
   }

   private static boolean c(int var0, int var1) {
      return var0 >= var1;
   }

   static {
      e();
      f = new Hashtable();
   }

   public Class_by(int var1, int var2, int var3, int var4, int var5) {
      this.c = (short)var2;
      this.e = (short)var3;
      this.d = (short)var4;
      this.b = (short)var5;
   }

   public static void d() {
      new Class_by();
   }
}
