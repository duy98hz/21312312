import java.io.DataInputStream;
import java.util.Random;

public final class Class_dq {
   // $FF: synthetic field
   private static Random a;
   // $FF: synthetic field
   private static final int[] b;

   private static boolean c(int var0) {
      return var0 != 0;
   }

   public static byte[] a(DataInputStream var0) {
      try {
         byte[] var1 = new byte[var0.readInt()];
         var0.read(var1);
         "".length();
         return var1;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   private static boolean b(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean d(int var0) {
      return var0 < 0;
   }

   private static void a() {
      b = new int[12];
      b[0] = -(30 ^ 25);
      b[1] = 185 ^ 183;
      b[2] = (37 ^ 126 ^ 111 ^ 8) & (16 + 142 - 94 + 95 ^ 161 + 74 - 176 + 104 ^ -" ".length());
      b[3] = -" ".length();
      b[4] = 135 ^ 170;
      b[5] = " ".length();
      b[6] = "   ".length();
      b[7] = -(-6637 & 15853) & -5 & 98047;
      b[8] = -1282 & 90109;
      b[9] = 148 ^ 168;
      b[10] = 184 ^ 160;
      b[11] = 174 ^ 138 ^ 57 ^ 20;
   }

   private static boolean e(int var0) {
      return var0 > 0;
   }

   public static void a(String var0) {
      try {
         label54: {
            try {
               Class_cr.e.platformRequest(var0);
               "".length();
            } catch (Exception var5) {
               var5.printStackTrace();
               break label54;
            }

            "".length();
            if (-" ".length() >= 0) {
               return;
            }

            return;
         }
      } finally {
         Class_cr.e.notifyDestroyed();
      }

      "".length();
      if ("   ".length() < (50 ^ 76 ^ 126 ^ 4)) {
         ;
      }
   }

   public static String a(String var0, String var1, String var2) {
      StringBuffer var3 = new StringBuffer();
      int var5 = b[2];
      "".length();
      if (((177 ^ 151) & ~(65 ^ 103)) != 0) {
         return null;
      } else {
         int var4;
         while(!b(var4 = var0.indexOf(var1), b[3])) {
            var3.append(String.valueOf((new StringBuilder(String.valueOf(var0.substring(b[2], var4)))).append(var2)));
            "".length();
            var0 = var0.substring(var4 + var1.length());
         }

         var3.append(var0);
         "".length();
         return var3.toString();
      }
   }

   public static int a(int var0, int var1) {
      return b[0] + a.nextInt(b[1]);
   }

   public static String a(int var0) {
      int var1 = b[2];
      if (d(var0, b[9])) {
         var1 = var0 / b[9];
         var0 %= b[9];
      }

      int var2 = b[2];
      if (d(var1, b[9])) {
         var2 = var1 / b[9];
         var1 %= b[9];
      }

      int var3 = b[2];
      if (d(var2, b[10])) {
         var3 = var2 / b[10];
         var2 %= b[10];
      }

      String var4 = "";
      if (e(var3)) {
         var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(var3));
         var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append("d"));
         var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(var2).append("h"));
         "".length();
         if (" ".length() <= 0) {
            return null;
         }
      } else if (e(var2)) {
         var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(var2));
         var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append("h"));
         var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(var1).append("'"));
         "".length();
         if (" ".length() <= ((0 + 130 - 19 + 22 ^ 8 + 136 - 87 + 106) & (121 ^ 102 ^ 131 ^ 186 ^ -" ".length()))) {
            return null;
         }
      } else {
         if (d(var1, b[11])) {
            var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(var1));
            "".length();
            if ("  ".length() > "  ".length()) {
               return null;
            }
         } else {
            var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append("0").append(var1));
         }

         var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(":"));
         if (d(var0, b[11])) {
            var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append(var0));
            "".length();
            if (null != null) {
               return null;
            }
         } else {
            var4 = String.valueOf((new StringBuilder(String.valueOf(var4))).append("0").append(var0));
         }
      }

      return var4;
   }

   public static void a(String var0, short var1) {
      Class_dp.a(var0, String.valueOf((new StringBuilder("sms://")).append(var1)), new Class_cw("", Class_bc.q(), b[7], (Object)null), new Class_cw("", Class_bc.q(), b[8], (Object)null));
   }

   public static String[] a(String var0, String var1) {
      Class_ge var2 = new Class_ge();
      int var3 = var0.indexOf(var1);
      "".length();
      if ("  ".length() <= 0) {
         return null;
      } else {
         while(!d(var3)) {
            var2.addElement(var0.substring(b[2], var3));
            var3 = (var0 = var0.substring(var3 + var1.length())).indexOf(var1);
         }

         var2.addElement(var0);
         String[] var5 = new String[var2.size()];
         if (e(var2.size())) {
            int var4 = b[2];
            "".length();
            if (null != null) {
               return null;
            }

            while(!c(var4, var2.size())) {
               var5[var4] = (String)var2.elementAt(var4);
               ++var4;
            }
         }

         return var5;
      }
   }

   public static int b(int var0) {
      return a.nextInt(var0);
   }

   private static boolean c(int var0, int var1) {
      return var0 >= var1;
   }

   static {
      a();
      a = new Random();
   }

   public static byte[] a(Class_bg var0) {
      try {
         byte[] var1 = new byte[var0.b().readInt()];
         var0.b().read(var1);
         "".length();
         return var1;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   private static boolean f(int var0) {
      return var0 == 0;
   }

   private static boolean d(int var0, int var1) {
      return var0 > var1;
   }

   public static String b(String var0) {
      String var1 = "";
      String var2 = "";
      if (c(var0.equals(""))) {
         return var1;
      } else {
         if (b(var0.charAt(b[2]), b[4])) {
            var2 = "-";
            var0 = var0.substring(b[5]);
         }

         int var3 = var0.length() - b[5];
         "".length();
         if (null != null) {
            return null;
         } else {
            for(; !d(var3); --var3) {
               if (f((var0.length() - b[5] - var3) % b[6]) && e(var0.length() - b[5] - var3)) {
                  var1 = String.valueOf((new StringBuilder(String.valueOf(var0.charAt(var3)))).append(".").append(var1));
                  "".length();
                  if ((4 + 27 - -52 + 85 ^ 17 + 91 - 41 + 105) <= "  ".length()) {
                     return null;
                  }
               } else {
                  var1 = String.valueOf((new StringBuilder(String.valueOf(var0.charAt(var3)))).append(var1));
               }
            }

            return String.valueOf((new StringBuilder(String.valueOf(var2))).append(var1));
         }
      }
   }

   public static byte[] b(Class_bg var0) {
      try {
         byte[] var1 = new byte[var0.b().readInt()];
         var0.b().read(var1);
         "".length();
         return var1;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }
}
