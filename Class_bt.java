final class Class_bt implements Runnable {
   // $FF: synthetic field
   private static final int[] a;

   public final void run() {
      label28: {
         try {
            Thread.sleep(20000L);
         } catch (InterruptedException var3) {
            break label28;
         }

         "".length();
         if ((190 ^ 186) <= "  ".length()) {
            return;
         }
      }

      if (a(Class_ez.i.f)) {
         label22: {
            try {
               Class_ez.i.p.close();
            } catch (Exception var2) {
               break label22;
            }

            "".length();
            if (((140 ^ 163) & ~(173 ^ 130)) == "  ".length()) {
               return;
            }
         }

         Class_ez.g = (boolean)a[0];
         Class_ez.i.f = (boolean)a[1];
         Class_ez.i.b = (boolean)a[1];
         Class_ez.i.o.b();
      }

   }

   private static void a() {
      a = new int[2];
      a[0] = " ".length();
      a[1] = (36 ^ 31 ^ 83 ^ 97) & (1 + 0 - -12 + 131 ^ 6 + 135 - 130 + 142 ^ -" ".length());
   }

   static {
      a();
   }

   private static boolean a(int var0) {
      return var0 != 0;
   }
}
