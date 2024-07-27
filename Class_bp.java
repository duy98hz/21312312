import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

public class Class_bp implements CommandListener {
   // $FF: synthetic field
   private TextField a;
   // $FF: synthetic field
   private static Class_bp b;
   // $FF: synthetic field
   private int c;
   // $FF: synthetic field
   private Command d;
   // $FF: synthetic field
   private static final int[] e;
   // $FF: synthetic field
   private Command f;
   // $FF: synthetic field
   private int g;
   // $FF: synthetic field
   private TextField h;
   // $FF: synthetic field
   private int i;
   // $FF: synthetic field
   private ChoiceGroup j;
   // $FF: synthetic field
   private TextField k;
   // $FF: synthetic field
   private int l;
   // $FF: synthetic field
   private Form m;

   public void commandAction(Command var1, Displayable var2) {
      if (a(var1, this.d)) {
         label33: {
            label32: {
               try {
                  this.c = Integer.parseInt(this.a.getString());
                  this.l = Integer.parseInt(this.h.getString());
                  if (!b(this.l, e[1]) || c(this.l, e[6]) && !a(this.l, e[8])) {
                     this.i = Integer.parseInt(this.k.getString());
                     this.g = this.j.getSelectedIndex();
                     Class_ex.g().d = new Class_ds(this.c, this.l, this.i, this.g);
                     Class_bm.d(String.valueOf((new StringBuilder("Auto lật hình. Số lần: ")).append(this.c).append(" - Vị trí: ").append(this.l).append(" - Delay: ").append(this.i).append(" - Kiểu: ").append(this.g)));
                     break label32;
                  }

                  Class_bm.d("Vị trí phải từ 1 - 9 hoặc -1");
               } catch (Exception var4) {
                  Class_bm.d("Có lỗi xảy ra");
                  break label33;
               }

               "".length();
               if (" ".length() >= "  ".length()) {
                  return;
               }
               break label33;
            }

            "".length();
            if ("   ".length() == -" ".length()) {
               return;
            }
         }
      }

      Display.getDisplay(Class_cr.e).setCurrent(Class_el.a);
   }

   public static Class_bp a() {
      if (a(b)) {
         b = new Class_bp();
      }

      return b;
   }

   private static void c() {
      e = new int[9];
      e[0] = 63 ^ 99 ^ 128 ^ 184;
      e[1] = -" ".length();
      e[2] = 118 + 168 - 235 + 127 ^ 79 + 61 - 112 + 100;
      e[3] = (49 ^ 118) & ~(65 ^ 6);
      e[4] = -(-15930 & 32315) & -13331 & 30715;
      e[5] = "  ".length();
      e[6] = " ".length();
      e[7] = 114 ^ 118;
      e[8] = 147 ^ 154;
   }

   private static boolean a(Object var0) {
      return var0 == null;
   }

   private static boolean a(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean b(int var0, int var1) {
      return var0 != var1;
   }

   static {
      c();
   }

   private static boolean c(int var0, int var1) {
      return var0 >= var1;
   }

   public void b() {
      this.m = new Form("Cài đặt auto lật hình");
      this.a = new TextField("Số lần lật hình:", String.valueOf(this.c), e[4], e[5]);
      this.h = new TextField("Cài ô muốn lật\n - Cài -1 để lật ngẫu nhiên\n - Cài từ 1 đến 9 để lật theo ô cố định", String.valueOf(this.l), e[5], e[3]);
      this.k = new TextField("Khoảng cách delay:", String.valueOf(this.i), e[4], e[5]);
      int var10004 = e[6];
      String[] var10005 = new String[e[5]];
      var10005[e[3]] = "Lật hình cho server team";
      var10005[e[6]] = "Lật hình cho server lậu";
      this.j = new ChoiceGroup("Chọn kiểu lật:", var10004, var10005, (Image[])null);
      this.d = new Command("Bắt đầu", e[7], e[3]);
      this.f = new Command("Thoát", e[7], e[6]);
      this.j.setSelectedIndex(this.g, (boolean)e[6]);
      this.m.append(this.a);
      "".length();
      this.m.append(this.h);
      "".length();
      this.m.append(this.k);
      "".length();
      this.m.append(this.j);
      "".length();
      this.m.addCommand(this.d);
      this.m.addCommand(this.f);
      this.m.setCommandListener(this);
      Display.getDisplay(Class_cr.e).setCurrent(this.m);
   }

   public Class_bp() {
      this.c = e[0];
      this.l = e[1];
      this.i = e[2];
      this.g = e[3];
   }

   private static boolean a(Object var0, Object var1) {
      return var0 == var1;
   }
}
