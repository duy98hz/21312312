import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.rms.RecordStore;

public final class Class_eb {
   // $FF: synthetic field
   private static final int[] a;

   public static void a(String var0, byte[] var1) {
      try {
         RecordStore var2;
         if (a((var2 = RecordStore.openRecordStore(String.valueOf((new StringBuilder("vj")).append(var0)), (boolean)a[0])).getNumRecords())) {
            var2.setRecord(a[0], var1, a[1], var1.length);
            "".length();
            if ("   ".length() == ((162 ^ 174) & ~(130 ^ 142))) {
               return;
            }
         } else {
            var2.addRecord(var1, a[1], var1.length);
            "".length();
         }

         var2.closeRecordStore();
      } catch (Exception var3) {
         var3.printStackTrace();
         return;
      }

      "".length();
      if ("   ".length() > 0) {
         ;
      }
   }

   private static void b() {
      a = new int[3];
      a[0] = " ".length();
      a[1] = (27 + 11 - -77 + 34 ^ 18 + 0 - -8 + 167) & (117 ^ 51 ^ 156 ^ 142 ^ -" ".length());
      a[2] = -" ".length();
   }

   public static void a() {
      d("nj_arrow");
      d("nj_effect");
      d("nj_image");
      d("nj_part");
      d("nj_skill");
      d("data");
      d("dataVersion");
      d("map");
      d("mapVersion");
      d("skill");
      d("killVersion");
      d("item");
      d("itemVersion");
   }

   public static void a(String var0, String var1) {
      try {
         b(var0, var1.getBytes("UTF-8"));
      } catch (Exception var3) {
         var3.printStackTrace();
         return;
      }

      "".length();
      if (((95 + 140 - 171 + 97 ^ 118 + 125 - 220 + 120) & (146 ^ 171 ^ 158 ^ 137 ^ -" ".length())) >= 0) {
         ;
      }
   }

   private static void d(String var0) {
      try {
         RecordStore.deleteRecordStore(String.valueOf((new StringBuilder("vj")).append(var0)));
      } catch (Exception var2) {
         return;
      }

      "".length();
      if (((124 ^ 86) & ~(60 ^ 22)) == 0) {
         ;
      }
   }

   public static String a(String var0) {
      byte[] var1;
      if (a((Object)(var1 = c(var0)))) {
         return null;
      } else {
         try {
            return new String(var1, "UTF-8");
         } catch (Exception var3) {
            return new String(var1);
         }
      }
   }

   public static void b(String var0, byte[] var1) {
      try {
         RecordStore var2;
         if (a((var2 = RecordStore.openRecordStore(String.valueOf((new StringBuilder("vj")).append(var0)), (boolean)a[0])).getNumRecords())) {
            var2.setRecord(a[0], var1, a[1], var1.length);
            "".length();
            if (null != null) {
               return;
            }
         } else {
            var2.addRecord(var1, a[1], var1.length);
            "".length();
         }

         var2.closeRecordStore();
      } catch (Exception var3) {
         return;
      }

      "".length();
      if (-" ".length() != ("  ".length() & ("  ".length() ^ -" ".length()))) {
         ;
      }
   }

   public static int b(String var0) {
      try {
         ByteArrayInputStream var1 = new ByteArrayInputStream(c(var0));
         DataInputStream var2 = new DataInputStream(var1);
         int var3 = var2.readInt();
         var2.close();
         var1.close();
         return var3;
      } catch (Exception var4) {
         return a[2];
      }
   }

   static {
      b();
   }

   public static void a(String var0, int var1) {
      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         DataOutputStream var3 = new DataOutputStream(var2);
         var3.writeInt(var1);
         var2.flush();
         var3.flush();
         b(var0, var2.toByteArray());
      } catch (Exception var4) {
         return;
      }

      "".length();
      if (-" ".length() <= (139 + 0 - 112 + 115 ^ 46 + 21 - 44 + 115)) {
         ;
      }
   }

   private static boolean a(int var0) {
      return var0 > 0;
   }

   private static boolean a(Object var0) {
      return var0 == null;
   }

   public static byte[] c(String var0) {
      try {
         RecordStore var1;
         byte[] var2 = (var1 = RecordStore.openRecordStore(String.valueOf((new StringBuilder("vj")).append(var0)), (boolean)a[1])).getRecord(a[0]);
         var1.closeRecordStore();
         return var2;
      } catch (Exception var3) {
         return null;
      }
   }
}
