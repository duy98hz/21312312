public final class Class_gg {
   // $FF: synthetic field
   private static int a;
   // $FF: synthetic field
   private static int b;
   // $FF: synthetic field
   private static final int[] c;
   // $FF: synthetic field
   private static Class_ge d;
   // $FF: synthetic field
   private static int e;
   // $FF: synthetic field
   private static int f;
   // $FF: synthetic field
   private static int g;
   // $FF: synthetic field
   private static Class_cd h;
   // $FF: synthetic field
   private static int i;

   public static void a(String var0, int var1, Class_ft var2) {
      if (c(b(var0))) {
         if (c(Class_bc.g, c[17])) {
            f = c[15];
         }

         if (e(d.size(), c[9])) {
            d.removeElementAt(c[11]);
         }

         d.addElement(new Class_cd(var0, var2, var1));
      }

   }

   private static void c() {
      c = new int[21];
      c[0] = 41 ^ 70 ^ 69 ^ 47;
      c[1] = "  ".length();
      c[2] = "   ".length() ^ 125 ^ 106;
      c[3] = 168 ^ 199 ^ 61 ^ 69;
      c[4] = -14369 & 14818;
      c[5] = 126 + 36 - 125 + 93;
      c[6] = -(-10565 & 16255) & -24769 & 30718;
      c[7] = 127 ^ 47;
      c[8] = (101 ^ 71) + (56 ^ 76) - (86 ^ 58) + (225 ^ 151);
      c[9] = 74 ^ 64;
      c[10] = 249 ^ 197;
      c[11] = (226 ^ 175) & ~(106 ^ 39);
      c[12] = 190 ^ 186;
      c[13] = 105 + 36 - -9 + 2 ^ 54 + 142 - 82 + 30;
      c[14] = "   ".length();
      c[15] = " ".length();
      c[16] = 45 ^ 43;
      c[17] = 27 + 85 - 24 + 40;
      c[18] = 132 ^ 131;
      c[19] = 27 ^ 43;
      c[20] = 121 ^ 38 ^ 79 ^ 41;
   }

   public static boolean a() {
      return (boolean)(c(b, c[0]) && c(d.size()) ? c[15] : c[11]);
   }

   private static boolean a(int var0) {
      return var0 > 0;
   }

   private static boolean a(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean b(int var0) {
      return var0 != 0;
   }

   public static void a(String var0) {
      if (c(b(var0))) {
         if (c(Class_bc.g, c[17])) {
            f = c[15];
         }

         if (e(d.size(), c[9])) {
            d.removeElementAt(c[11]);
         }

         d.addElement(new Class_cd(var0));
      }

   }

   static {
      c();
      d = new Class_ge();
      b = c[0];
      f = c[1];
      a = c[2];
   }

   private static boolean b(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean c(int var0) {
      return var0 == 0;
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   private static boolean c(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean b(String var0) {
      if (a((Object)h) && a((Object)h.a) && b(var0.equals(h.a))) {
         return (boolean)c[15];
      } else if (a(d.size()) && b(var0.equals(((Class_cd)d.lastElement()).a))) {
         return (boolean)c[15];
      } else if (b(var0.length(), c[13])) {
         return (boolean)c[11];
      } else {
         String var1;
         String var2;
         if (a((Object)h) && a((Object)h.a) && b(b, c[14]) && d(h.a.length(), c[13])) {
            var1 = var0.substring(c[11], c[13]);
            var2 = h.a.substring(c[11], c[13]);
            if (b(var1.equals(var2))) {
               int var5 = c[18];
               "".length();
               if ((40 ^ 44) <= 0) {
                  return (boolean)((152 ^ 144) & ~(67 ^ 75));
               }

               while(b(var5, var0.length()) && b(var5, h.a.length()) && (!d(var0.charAt(var5), c[19]) || e(var0.charAt(var5), c[20])) && !a(var0.charAt(var5), h.a.charAt(var5))) {
                  ++var5;
               }

               var2 = var0.substring(var5, var0.length());
               Class_cd var6 = h;
               var6.a = String.valueOf((new StringBuilder(String.valueOf(var6.a))).append(", ").append(var2));
               b = c[1];
               i = c[11];
               return (boolean)c[15];
            }
         }

         if (a(d.size()) && d((var1 = ((Class_cd)d.lastElement()).a).length(), c[13])) {
            var2 = var0.substring(c[11], c[13]);
            String var3 = var1.substring(c[11], c[13]);
            if (b(var2.equals(var3))) {
               int var4 = c[18];
               "".length();
               if ("  ".length() < 0) {
                  return (boolean)((22 ^ 119) & ~(18 ^ 115));
               }

               while(b(var4, var0.length()) && b(var4, var1.length()) && (!d(var0.charAt(var4), c[19]) || e(var0.charAt(var4), c[20])) && !a(var0.charAt(var4), var1.charAt(var4))) {
                  ++var4;
               }

               var0 = var0.substring(var4, var0.length());
               (new StringBuffer(String.valueOf(var1))).append(", ").append(var0).toString();
               "".length();
               return (boolean)c[15];
            }
         }

         return (boolean)c[11];
      }
   }

   public static void b() {
      if (c(b)) {
         if (b((g += (f - g) / c[14]) - f, c[14])) {
            g = f + c[1];
            b = c[1];
            i = c[11];
            return;
         }
      } else if (c(b, c[1])) {
         if (e(i += c[15], h.c)) {
            b = c[14];
            i = c[11];
            return;
         }
      } else if (c(b, c[14])) {
         if (b(g + e, f + Class_bc.g - c[2])) {
            g -= c[16];
            "".length();
            if (-"   ".length() > 0) {
               return;
            }
         } else {
            g -= c[1];
         }

         if (b(g + e, f)) {
            b = c[12];
            i = c[11];
            return;
         }
      } else if (c(b, c[12])) {
         if (e(i += c[15], c[9])) {
            b = c[0];
            i = c[11];
            return;
         }
      } else if (c(b, c[0])) {
         if (a(d.size())) {
            Class_cd var0 = (Class_cd)d.firstElement();
            d.removeElementAt(c[11]);
            if (a((Object)h) && b(var0.a.equals(h.a))) {
               return;
            }

            h = var0;
            e = var0.b.a(h.a);
            i = c[11];
            b = c[11];
            g = Class_bc.g;
            return;
         }

         h = null;
      }

   }

   private static boolean d(int var0, int var1) {
      return var0 >= var1;
   }

   public static void a(Class_er var0) {
      int var1 = f;
      int var2 = Class_bc.an - c[3];
      int var3 = Class_bc.g;
      if (b(Class_bc.ay)) {
         if (d(Class_bc.g, c[4])) {
            var1 = c[5];
            var3 = Class_bc.g - c[6];
            "".length();
            if ("  ".length() < "  ".length()) {
               return;
            }
         } else {
            var1 = c[7];
            var3 = Class_bc.g - c[8] - c[9];
         }

         var2 = Class_bc.an - c[10];
         f = var1 + c[1];
      }

      if (a((Object)h) && (!a((Object)Class_bc.ap) || b((Object)Class_bc.ap.c))) {
         var0.c(c[11], c[11], Class_bc.g, Class_bc.an);
         if (b(Class_bc.ay)) {
            Class_ai.c(var1, var2 - c[12], var3 + c[9], a + c[13], var0);
            "".length();
            if (-" ".length() > 0) {
               return;
            }
         } else {
            var0.a(c[11]);
            var0.b(var1 - c[1], var2, var3 + c[1], a);
         }

         var0.c(var1, var2, var3, a);
         h.b.a(var0, h.a, g, var2 + c[14], c[11]);
      }

   }

   private static boolean b(Object var0) {
      return var0 == null;
   }

   private static boolean e(int var0, int var1) {
      return var0 > var1;
   }
}
