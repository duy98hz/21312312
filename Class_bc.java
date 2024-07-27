import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class Class_bc extends Class_da implements Class_do, Runnable {
   // $FF: synthetic field
   private static int bq;
   // $FF: synthetic field
   public static boolean a;
   // $FF: synthetic field
   private static boolean br;
   // $FF: synthetic field
   private static int bs;
   // $FF: synthetic field
   private static int bt;
   // $FF: synthetic field
   private static int bu;
   // $FF: synthetic field
   public static String b;
   // $FF: synthetic field
   public static boolean c;
   // $FF: synthetic field
   public static boolean d;
   // $FF: synthetic field
   public static int e;
   // $FF: synthetic field
   public static boolean f;
   // $FF: synthetic field
   public static int g;
   // $FF: synthetic field
   public static Class_ew h;
   // $FF: synthetic field
   public static Class_ey i;
   // $FF: synthetic field
   private static Image bv;
   // $FF: synthetic field
   public static long j;
   // $FF: synthetic field
   public static int k;
   // $FF: synthetic field
   private static final int[] bw;
   // $FF: synthetic field
   private static Image bx;
   // $FF: synthetic field
   public static String l;
   // $FF: synthetic field
   private static Image by;
   // $FF: synthetic field
   private static long bz;
   // $FF: synthetic field
   public static boolean m;
   // $FF: synthetic field
   public static int n;
   // $FF: synthetic field
   private static int ca;
   // $FF: synthetic field
   public static String o;
   // $FF: synthetic field
   public static boolean p;
   // $FF: synthetic field
   public static boolean q;
   // $FF: synthetic field
   private static int[] cb;
   // $FF: synthetic field
   public static boolean r;
   // $FF: synthetic field
   public static String s;
   // $FF: synthetic field
   public static boolean t;
   // $FF: synthetic field
   public static String u;
   // $FF: synthetic field
   private static int cc;
   // $FF: synthetic field
   public static boolean v;
   // $FF: synthetic field
   static boolean w;
   // $FF: synthetic field
   private static Image[] cd;
   // $FF: synthetic field
   private int[] ce;
   // $FF: synthetic field
   public static int x;
   // $FF: synthetic field
   private static int[] cf;
   // $FF: synthetic field
   private Class_er cg = new Class_er();
   // $FF: synthetic field
   public static int y;
   // $FF: synthetic field
   public static int z;
   // $FF: synthetic field
   public static Class_ai aa;
   // $FF: synthetic field
   public static boolean ab;
   // $FF: synthetic field
   public static Image[] ac;
   // $FF: synthetic field
   public static int ad;
   // $FF: synthetic field
   public static boolean ae;
   // $FF: synthetic field
   private static Image[][] ch;
   // $FF: synthetic field
   private static long ci;
   // $FF: synthetic field
   private static long cj;
   // $FF: synthetic field
   public static boolean af;
   // $FF: synthetic field
   public static int ag;
   // $FF: synthetic field
   public static int ah;
   // $FF: synthetic field
   public static boolean ai;
   // $FF: synthetic field
   public static boolean aj;
   // $FF: synthetic field
   public static Class_dn ak;
   // $FF: synthetic field
   private int[] ck;
   // $FF: synthetic field
   public static Image[] al;
   // $FF: synthetic field
   private static int cl;
   // $FF: synthetic field
   public static Class_bf am;
   // $FF: synthetic field
   public static int an;
   // $FF: synthetic field
   private static int[] cm;
   // $FF: synthetic field
   public static boolean ao;
   // $FF: synthetic field
   public static Class_cf ap;
   // $FF: synthetic field
   private boolean cn;
   // $FF: synthetic field
   public static int aq;
   // $FF: synthetic field
   public static Class_fq ar;
   // $FF: synthetic field
   private static Image[] co;
   // $FF: synthetic field
   private static Class_ab[] cp;
   // $FF: synthetic field
   public static boolean as;
   // $FF: synthetic field
   public static int at;
   // $FF: synthetic field
   public static boolean[] au;
   // $FF: synthetic field
   private static int cq;
   // $FF: synthetic field
   public static Class_et av;
   // $FF: synthetic field
   public static Class_ah aw;
   // $FF: synthetic field
   private static int[] cr;
   // $FF: synthetic field
   public static String ax;
   // $FF: synthetic field
   private static boolean[] cs;
   // $FF: synthetic field
   public static boolean ay;
   // $FF: synthetic field
   public static Class_fx az;
   // $FF: synthetic field
   private static int[] ct;
   // $FF: synthetic field
   public static boolean ba;
   // $FF: synthetic field
   public static boolean bb;
   // $FF: synthetic field
   public static boolean bc;
   // $FF: synthetic field
   private int[] cu;
   // $FF: synthetic field
   public static Image bd;
   // $FF: synthetic field
   private static int[] cv;
   // $FF: synthetic field
   public static byte be;
   // $FF: synthetic field
   public static Class_dc bf;
   // $FF: synthetic field
   private static int[] cw;
   // $FF: synthetic field
   public static String bg;
   // $FF: synthetic field
   public static boolean[] bh;
   // $FF: synthetic field
   public static Class_bc bi;
   // $FF: synthetic field
   private static Image cx;
   // $FF: synthetic field
   private static int cy;
   // $FF: synthetic field
   public static long bj;
   // $FF: synthetic field
   public static int bk;
   // $FF: synthetic field
   public static Image bl;
   // $FF: synthetic field
   public static boolean[] bm;
   // $FF: synthetic field
   private static int cz;
   // $FF: synthetic field
   private static int da;
   // $FF: synthetic field
   public static int bn;
   // $FF: synthetic field
   public static Class_eh bo;
   // $FF: synthetic field
   private static int db;
   // $FF: synthetic field
   public static boolean bp;

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public final void a(String var1, String var2, String var3, String var4) {
      bf.a(var4, new Class_cw(var1, this, bw[63], var3), (Class_cw)null, new Class_cw(var2, this, bw[62], (Object)null));
      ap = bf;
   }

   public static boolean a(int var0, int var1, int var2, int var3) {
      if (e(ba) && e(c)) {
         return (boolean)bw[0];
      } else {
         return (boolean)(f(ah, var0) && i(ah, var0 + var2) && f(e, var1) && i(e, var1 + var3) ? bw[1] : bw[0]);
      }
   }

   public static void a() {
      int var0 = bw[0];
      "".length();
      if (null == null) {
         while(!f(var0, bw[2])) {
            au[var0] = (boolean)bw[0];
            ++var0;
         }

      }
   }

   private static boolean f(int var0, int var1) {
      return var0 >= var1;
   }

   public static Image a(String var0) {
      var0 = String.valueOf((new StringBuilder("/x")).append(Class_er.b).append(var0));
      Image var1 = null;

      try {
         var1 = Image.createImage(var0);
      } catch (IOException var3) {
         return var1;
      }

      "".length();
      if (((126 + 65 - 126 + 122 ^ 123 + 122 - 164 + 56) & (12 ^ 103 ^ 11 ^ 82 ^ -" ".length())) > (70 + 109 - 101 + 75 ^ 32 + 24 - 40 + 141)) {
         return null;
      } else {
         return var1;
      }
   }

   public static void b() {
      bf.e = bw[61];
      bf.a(Class_cv.mq, (Class_cw)null, (Class_cw)null, (Class_cw)null);
      ap = bf;
      bf.a = (boolean)bw[1];
   }

   private static boolean a(Object var0) {
      return var0 == null;
   }

   public final void c() {
      if (i(Class_ex.g().d())) {
         Class_ez.c().a();
      }

      Class_ex.g().e();
      q = (boolean)bw[0];
      this.cn = (boolean)bw[1];
   }

   static {
      s();
      f = (boolean)bw[0];
      bd = null;
      p = (boolean)bw[1];
      bb = (boolean)bw[1];
      as = (boolean)bw[0];
      ay = (boolean)bw[0];
      bh = new boolean[bw[2]];
      cs = new boolean[bw[2]];
      au = new boolean[bw[2]];
      cp = new Class_ab[bw[3]];
      i = new Class_ey();
      be = (byte)bw[0];
      s = "2.1";
      bm = new boolean[bw[4]];
      bs = bw[0];
      al = new Image[bw[5]];
      aq = bw[6];
      cj = 0L;
      bc = (boolean)bw[0];
      v = (boolean)bw[0];
      cy = g;
   }

   protected final void a(int var1) {
      ad = bw[0];
      if (k(var1, -(29 ^ 58))) {
         label174: {
            if (k(var1, -(151 ^ 177))) {
               label175: {
                  if (k(var1, -(103 ^ 113))) {
                     label172: {
                        if (k(var1, -(187 ^ 174))) {
                           if (!k(var1, -(31 ^ 24))) {
                              break label172;
                           }

                           if (k(var1, -(86 ^ 80))) {
                              if (k(var1, -(136 ^ 141))) {
                                 if (!k(var1, -(73 ^ 77))) {
                                    au[bw[20]] = (boolean)bw[0];
                                    return;
                                 }

                                 if (!k(var1, -"   ".length())) {
                                    au[bw[3]] = (boolean)bw[0];
                                    return;
                                 }

                                 if (!k(var1, -"  ".length())) {
                                    break label174;
                                 }

                                 if (!k(var1, -" ".length())) {
                                    break label175;
                                 }

                                 if (k(var1, 6 ^ 12)) {
                                    if (k(var1, 122 ^ 89)) {
                                       if (k(var1, 89 ^ 115)) {
                                          if (k(var1, 190 ^ 142)) {
                                             if (k(var1, 183 ^ 134)) {
                                                if (k(var1, 112 ^ 66)) {
                                                   if (k(var1, 112 ^ 67)) {
                                                      if (k(var1, 31 ^ 43)) {
                                                         if (k(var1, 17 ^ 36)) {
                                                            if (!k(var1, 94 ^ 104)) {
                                                               if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e)) {
                                                                  au[bw[20]] = (boolean)bw[0];
                                                                  cs[bw[20]] = (boolean)bw[1];
                                                               }

                                                               return;
                                                            }

                                                            if (!k(var1, 109 ^ 90)) {
                                                               au[bw[22]] = (boolean)bw[0];
                                                               cs[bw[22]] = (boolean)bw[1];
                                                               return;
                                                            }

                                                            if (!k(var1, 80 ^ 104)) {
                                                               if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e)) {
                                                                  au[bw[24]] = (boolean)bw[0];
                                                                  cs[bw[24]] = (boolean)bw[1];
                                                               }

                                                               return;
                                                            }

                                                            if (!k(var1, 147 ^ 170)) {
                                                               au[bw[26]] = (boolean)bw[0];
                                                               cs[bw[26]] = (boolean)bw[1];
                                                               return;
                                                            }

                                                            "".length();
                                                            if ("  ".length() != "  ".length()) {
                                                               return;
                                                            }
                                                         } else if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e)) {
                                                            au[bw[4]] = (boolean)bw[0];
                                                            cs[bw[4]] = (boolean)bw[1];
                                                         }

                                                         return;
                                                      }

                                                      if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e)) {
                                                         au[bw[3]] = (boolean)bw[0];
                                                         cs[bw[3]] = (boolean)bw[1];
                                                      }

                                                      return;
                                                   }

                                                   if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e)) {
                                                      au[bw[16]] = (boolean)bw[0];
                                                      cs[bw[16]] = (boolean)bw[1];
                                                   }

                                                   return;
                                                }

                                                if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e)) {
                                                   au[bw[5]] = (boolean)bw[0];
                                                   cs[bw[5]] = (boolean)bw[1];
                                                }

                                                return;
                                             }

                                             if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e)) {
                                                au[bw[1]] = (boolean)bw[0];
                                                cs[bw[1]] = (boolean)bw[1];
                                             }

                                             return;
                                          }

                                          au[bw[0]] = (boolean)bw[0];
                                          cs[bw[0]] = (boolean)bw[1];
                                          return;
                                       }

                                       au[bw[27]] = (boolean)bw[0];
                                       cs[bw[27]] = (boolean)bw[1];
                                       return;
                                    }

                                    au[bw[29]] = (boolean)bw[0];
                                    cs[bw[29]] = (boolean)bw[1];
                                    return;
                                 }
                              }

                              au[bw[4]] = (boolean)bw[0];
                              cs[bw[4]] = (boolean)bw[1];
                              return;
                           }
                        }

                        au[bw[31]] = (boolean)bw[0];
                        cs[bw[31]] = (boolean)bw[1];
                        return;
                     }
                  }

                  au[bw[33]] = (boolean)bw[0];
                  cs[bw[33]] = (boolean)bw[1];
                  return;
               }
            }

            au[bw[5]] = (boolean)bw[0];
            return;
         }
      }

      au[bw[24]] = (boolean)bw[0];
   }

   public static void a(String var0, int var1, Object var2) {
      bf.a(var0, (Class_cw)null, new Class_cw(Class_cv.rk, bi, var1, (Object)null, g / bw[5] - bw[54], an - bw[56]), (Class_cw)null);
      ap = bf;
   }

   private static boolean g(int var0, int var1) {
      return var0 > var1;
   }

   public final void run() {
      label173: {
         try {
            Thread.sleep(10L);
         } catch (InterruptedException var11) {
            break label173;
         }

         "".length();
         if (-"  ".length() > 0) {
            return;
         }
      }

      w = (boolean)bw[1];
      "".length();
      if (((68 ^ 24 ^ 135 ^ 195) & (4 + 111 - 2 + 15 ^ 23 + 22 - 7 + 114 ^ -" ".length())) == 0) {
         label169:
         while(!e(w)) {
            try {
               label189: {
                  long var1;
                  if (d(b((var1 = System.currentTimeMillis()) - bz, 780L)) && e(m)) {
                     bz = var1;
                     m = (boolean)bw[1];
                     "".length();
                     if (-"   ".length() > 0) {
                        return;
                     }
                  } else {
                     m = (boolean)bw[0];
                  }

                  if (d(b(var1 - ci, 7800L)) && e(ai)) {
                     ci = var1;
                     ai = (boolean)bw[1];
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     ai = (boolean)bw[0];
                  }

                  if (f(x)) {
                     x -= bw[1];
                  }

                  if (g(n += bw[1], bw[37])) {
                     if (f(b(System.currentTimeMillis() - cj, 20000L)) && a((Object)h, (Object)ak)) {
                        Class_cr.e.notifyDestroyed();
                     }

                     n = bw[0];
                  }

                  if (b((Object)h)) {
                     if (b((Object)ap)) {
                        ap.a();
                        "".length();
                        if ((2 ^ 72 ^ 207 ^ 128) == 0) {
                           return;
                        }
                     } else if (i(i.c)) {
                        i.b();
                        i.a();
                     }

                     if (e(q)) {
                        h.c();
                     }

                     h.b();
                  }

                  if (i(Class_ct.a) && f(b(System.currentTimeMillis(), Class_ct.c))) {
                     label186: {
                        Class_ct.a = (boolean)bw[0];

                        try {
                           if (!f(Class_ct.b)) {
                              break label186;
                           }

                           Class_dx.ac().a((int)Class_ct.b, (Object)null);
                        } catch (Exception var7) {
                           var7.printStackTrace();
                           break label186;
                        }

                        "".length();
                        if (" ".length() < 0) {
                           return;
                        }
                     }
                  }

                  if (f(Class_gc.a) && e(Class_gc.a -= bw[1])) {
                     Class_gc.b();
                  }

                  if (i(this.cn)) {
                     label187: {
                        this.cn = (boolean)bw[0];
                        ar.a();

                        try {
                           Class_bk.ac();
                           Class_dx.v();
                           Class_dx.aa();
                           h();
                           Class_gc.b();
                           Class_dx.a((boolean)bw[1]);
                           Class_dx.ae = bw[38];
                           b(Class_eo.f);
                           Class_dx.bw.removeAllElements();
                           Class_dx.bq.removeAllElements();
                           Class_dx.x.removeAllElements();
                           Class_dx.ew.removeAllElements();
                           Class_bk.au = null;
                        } catch (Exception var8) {
                           var8.printStackTrace();
                           break label187;
                        }

                        "".length();
                        if ("   ".length() < 0) {
                           return;
                        }
                     }
                  }

                  Class_el.a.repaint();
                  Class_el.a.serviceRepaints();
                  long var12 = System.currentTimeMillis() - var1;

                  try {
                     int var10000;
                     if (g(Class_cl.a)) {
                        var10000 = bw[39];
                        "".length();
                        if ((247 ^ 139 ^ 88 ^ 32) == 0) {
                           return;
                        }
                     } else {
                        var10000 = Class_cl.a;
                     }

                     int var13 = var10000;
                     if (h(b(var12, (long)var13))) {
                        Thread.sleep(1L * ((long)var13 - var12));
                        "".length();
                        if (" ".length() < 0) {
                           return;
                        }
                        continue;
                     }

                     Thread.sleep(1L);
                  } catch (InterruptedException var9) {
                     break label189;
                  }

                  "".length();
                  if (null != null) {
                     return;
                  }
                  continue;
               }
            } catch (Exception var10) {
               label119: {
                  try {
                     Thread.sleep(1000L);
                  } catch (InterruptedException var6) {
                     var6.printStackTrace();
                     break label119;
                  }

                  "".length();
                  if (-"   ".length() > 0) {
                     return;
                  }
               }

               System.out.println("GameCanvas.run() error");
               StackTraceElement[] var5;
               int var4 = (var5 = var10.getStackTrace()).length;
               int var3 = bw[0];
               "".length();
               if ("  ".length() > "   ".length()) {
                  return;
               }

               while(true) {
                  if (f(var3, var4)) {
                     continue label169;
                  }

                  StackTraceElement var2 = var5[var3];
                  System.out.println(var2);
                  ++var3;
               }
            }

            "".length();
            if (null != null) {
               return;
            }
         }

      }
   }

   public static void a(String var0, Class_cw var1, Class_cw var2) {
      bf.a(var0, var1, (Class_cw)null, var2);
      ap = bf;
   }

   public static void a(String var0, int var1, Object var2, int var3, Object var4) {
      (new StringBuffer("yeso no dilog ")).append(var3).toString();
      "".length();
      bf.a(var0, new Class_cw(Class_cv.lm, bi, var1, var2), new Class_cw("", bi, var1, var2), new Class_cw(Class_cv.se, bi, var3, var4));
      ap = bf;
   }

   private static void r() {
      if (e(f)) {
         co = new Image[bw[16]];
         int var0 = bw[0];
         "".length();
         if (-(221 ^ 167 ^ 22 ^ 104) > 0) {
            return;
         }

         while(!f(var0, bw[16])) {
            co[var0] = a(String.valueOf((new StringBuilder("/e/w")).append(var0).append(".png")));
            ++var0;
         }

         cm = new int[bw[5]];
         cr = new int[bw[5]];
         (cv = new int[bw[5]])[bw[0]] = cv[bw[1]] = bw[6];
      }

   }

   public final void d() {
      (new Thread(this)).start();
   }

   private static boolean d(int var0) {
      return var0 >= 0;
   }

   public static void a(Class_er var0) {
      if (i(Class_cl.x)) {
         var0.a(bw[0]);
         var0.b(bw[0], bw[0], Class_dx.dy, Class_dx.bt);
         String var2 = "Phan Quân";
         Class_ft.p.a(var0, var2, y - Class_ft.l.a(var2) / bw[5], bw[31], bw[0], Class_ft.r);
         var2 = "";
         Class_ft.p.a(var0, var2, y - Class_ft.l.a(var2) / bw[5], bw[40], bw[0], Class_ft.r);
      } else {
         if (i(as)) {
            if (g(n % bw[27], bw[22])) {
               var0.a(bw[41]);
               "".length();
               if ((145 ^ 148) <= 0) {
                  return;
               }
            } else {
               var0.a(bw[0]);
            }

            var0.b(bw[0], bw[0], Class_dx.dy, Class_dx.bt);
            "".length();
            if (-"   ".length() >= 0) {
               return;
            }
         } else if (i(br) && e(f) && b((Object)cd)) {
            var0.a(cz);
            var0.b(bw[0], bw[0], Class_dx.dy, da);
            int var1;
            if (d(aq) && i(aq, bw[1])) {
               if (b((Object)cd[bw[0]])) {
                  var1 = -((Class_dx.ae >> bw[1]) % bw[42]);
                  "".length();
                  if ((38 ^ 35) <= 0) {
                     return;
                  }

                  while(!f(var1, Class_dx.dy)) {
                     var0.a(cd[bw[0]], var1, ca, bw[0]);
                     var1 += 24;
                  }
               }

               if (b((Object)cd[bw[1]])) {
                  var1 = -((Class_dx.ae >> bw[5]) % bw[42]);
                  "".length();
                  if (((161 ^ 156 ^ 85 ^ 78) & (145 + 163 - 218 + 87 ^ 60 + 51 - 39 + 79 ^ -" ".length())) > 0) {
                     return;
                  }

                  while(!f(var1, Class_dx.dy)) {
                     var0.a(cd[bw[1]], var1, cl, bw[0]);
                     var1 += 24;
                  }
               }

               if (b((Object)cd[bw[16]])) {
                  var1 = -((Class_dx.ae >> bw[3]) % bw[43]);
                  "".length();
                  if (null != null) {
                     return;
                  }

                  while(!f(var1, Class_dx.dy)) {
                     var0.a(cd[bw[16]], var1, bu, bw[0]);
                     var1 += 64;
                  }
               }

               if (b((Object)bx)) {
                  var0.a(bx, bq, bt, bw[16]);
               }

               if (b((Object)bv)) {
                  var1 = bw[0];
                  "".length();
                  if (" ".length() == 0) {
                     return;
                  }

                  while(!f(var1, bw[5])) {
                     var0.a(bv, cf[var1], cb[var1], bw[16]);
                     ++var1;
                  }
               }

               if (b((Object)cd[bw[5]])) {
                  var1 = -((Class_dx.ae >> bw[16]) % bw[44]);
                  "".length();
                  if (null != null) {
                     return;
                  }

                  while(!f(var1, Class_dx.dy)) {
                     var0.a(cd[bw[5]], var1, cq, bw[0]);
                     var1 += 192;
                  }

                  return;
               }
            } else if (f(aq, bw[5]) && i(aq, bw[20])) {
               if (b((Object)bx)) {
                  var0.a(bx, bq, bt, bw[16]);
               }

               if (b((Object)bv)) {
                  var1 = bw[0];
                  "".length();
                  if (-"   ".length() > 0) {
                     return;
                  }

                  while(!f(var1, cf.length)) {
                     var0.a(bv, cf[var1], cb[var1], bw[16]);
                     ++var1;
                  }
               }

               if (k(aq, bw[5])) {
                  if (b((Object)cd[bw[16]])) {
                     var1 = -((Class_dx.ae >> ct[bw[16]]) % cw[bw[16]]);
                     "".length();
                     if (null != null) {
                        return;
                     }

                     while(!f(var1, Class_dx.dy)) {
                        var0.a(cd[bw[16]], var1, bu, bw[0]);
                        var1 += cw[bw[16]];
                     }
                  }

                  if (b((Object)cd[bw[5]])) {
                     var1 = -((Class_dx.ae >> ct[bw[5]]) % cw[bw[5]]);
                     "".length();
                     if (null != null) {
                        return;
                     }

                     while(!f(var1, Class_dx.dy)) {
                        var0.a(cd[bw[5]], var1, cq, bw[0]);
                        var1 += cw[bw[5]];
                     }
                  }

                  if (b((Object)cd[bw[1]])) {
                     var1 = -((Class_dx.ae >> ct[bw[1]]) % cw[bw[1]]);
                     "".length();
                     if (((30 ^ 10 ^ 84 ^ 93) & (147 ^ 130 ^ 204 ^ 192 ^ -" ".length())) != 0) {
                        return;
                     }

                     while(!f(var1, Class_dx.dy)) {
                        var0.a(cd[bw[1]], var1, cc, bw[0]);
                        var1 += cw[bw[1]];
                     }
                  }

                  if (b((Object)cd[bw[0]])) {
                     var1 = -((Class_dx.ae >> ct[bw[0]]) % cw[bw[0]]);
                     "".length();
                     if (" ".length() != " ".length()) {
                        return;
                     }

                     while(!f(var1, Class_dx.dy)) {
                        var0.a(cd[bw[0]], var1, db, bw[0]);
                        var1 += cw[bw[0]];
                     }

                     return;
                  }
               }
            } else if (f(aq, bw[22]) && i(aq, bw[12])) {
               var0.a(cz);
               var0.b(bw[0], bw[0], Class_dx.dy, Class_dx.bt);
               if (k(aq, bw[24]) && b((Object)cd[bw[16]])) {
                  var1 = -((Class_dx.ae >> ct[bw[16]]) % cw[bw[16]]);
                  "".length();
                  if (((103 ^ 67) & ~(1 ^ 37)) > 0) {
                     return;
                  }

                  for(; !f(var1, Class_dx.dy); var1 += cw[bw[16]]) {
                     if (k(aq, bw[29]) && k(aq, bw[31])) {
                        var0.a(cd[bw[16]], var1, bu, bw[0]);
                        "".length();
                        if (((61 + 138 - -16 + 15 ^ 81 + 77 - 52 + 56) & (26 ^ 124 ^ 6 ^ 36 ^ -" ".length())) < -" ".length()) {
                           return;
                        }
                     } else {
                        var0.a(cd[bw[16]], var1, Class_dx.bt - Class_er.b(cd[bw[16]]), bw[0]);
                     }
                  }
               }

               if (k(aq, bw[24]) && k(aq, bw[29]) && k(aq, bw[31]) && b((Object)cd[bw[5]])) {
                  if (h(Class_eo.ah, bw[45])) {
                     var0.a(cd[bw[5]], Class_dx.dy, cq, bw[0]);
                     "".length();
                     if (-" ".length() >= 0) {
                        return;
                     }
                  } else {
                     var1 = -((Class_dx.ae >> ct[bw[5]]) % cw[bw[5]]);
                     "".length();
                     if ("   ".length() < 0) {
                        return;
                     }

                     for(; !f(var1, Class_dx.dy); var1 += cw[bw[5]]) {
                        if (h(aq, bw[2])) {
                           var0.a(cd[bw[5]], var1, cq + bw[31], bw[0]);
                           "".length();
                           if (((144 ^ 156) & ~(11 ^ 7)) != ((133 ^ 152) & ~(24 ^ 5) & ~((81 ^ 23) & ~(223 ^ 153)))) {
                              return;
                           }
                        } else {
                           var0.a(cd[bw[5]], var1, cq, bw[0]);
                        }
                     }
                  }
               }

               if (k(aq, bw[29]) && k(aq, bw[31]) && b((Object)cd[bw[1]]) && k(Class_eo.ah, bw[46])) {
                  var1 = -((Class_dx.ae >> ct[bw[1]]) % cw[bw[1]]);
                  "".length();
                  if (((65 ^ 9) & ~(41 ^ 97)) < 0) {
                     return;
                  }

                  while(!f(var1, Class_dx.dy)) {
                     var0.a(cd[bw[1]], var1, cc, bw[0]);
                     var1 += cw[bw[1]];
                  }
               }

               if (!k(Class_eo.ah, bw[45]) || h(Class_eo.ah, bw[47])) {
                  var0.a(bw[48]);
                  var0.b(bw[0], db + bw[49], Class_dx.dy, Class_dx.bt);
               }

               if (b((Object)cd[bw[0]])) {
                  var1 = -((Class_dx.ae >> ct[bw[0]]) % cw[bw[0]]);
                  "".length();
                  if ((234 ^ 167 ^ 18 ^ 91) <= 0) {
                     return;
                  }

                  while(!f(var1, Class_dx.dy)) {
                     var0.a(cd[bw[0]], var1, db, bw[0]);
                     var1 += cw[bw[0]];
                  }
               }

               if (b((Object)bv)) {
                  if (k(aq, bw[33]) && k(aq, bw[10])) {
                     var1 = bw[0];
                     "".length();
                     if ("   ".length() <= " ".length()) {
                        return;
                     }

                     while(!f(var1, bw[5])) {
                        var0.a(bv, cf[var1], cb[var1], bw[16]);
                        ++var1;
                     }

                     return;
                  }

                  var1 = bw[0];
                  "".length();
                  if (-(139 ^ 143) > 0) {
                     return;
                  }

                  while(!f(var1, bw[5])) {
                     var0.a(bv, cf[var1], cb[var1] - bw[50], bw[16]);
                     ++var1;
                  }

                  return;
               }
            }
         } else {
            var0.a(cz);
            var0.b(bw[0], bw[0], Class_dx.dy, Class_dx.bt);
         }

      }
   }

   private static boolean a(Object var0, Object var1) {
      return var0 == var1;
   }

   public static boolean a(int var0, int var1) {
      if (i(f)) {
         return (boolean)bw[0];
      } else {
         int var10000;
         if (h(cv[bw[0]], bw[6])) {
            var10000 = bw[0];
            "".length();
            if (((78 ^ 111 ^ 25 ^ 41) & (31 ^ 41 ^ 16 ^ 55 ^ -" ".length())) >= "  ".length()) {
               return (boolean)((37 ^ 105 ^ 237 ^ 134) & (88 + 30 - -20 + 0 ^ 147 + 136 - 242 + 132 ^ -" ".length()));
            }
         } else {
            var10000 = bw[1];
         }

         int var2 = var10000;
         if (k(cv[var2], bw[6])) {
            return (boolean)bw[0];
         } else {
            cv[var2] = bw[0];
            cm[var2] = var0;
            cr[var2] = var1;
            return (boolean)bw[1];
         }
      }
   }

   private static void s() {
      bw = new int[71];
      bw[0] = (115 ^ 37) & ~(100 ^ 50);
      bw[1] = " ".length();
      bw[2] = 188 ^ 156 ^ 98 ^ 76;
      bw[3] = 102 + 140 - 239 + 183 ^ 87 + 160 - 160 + 103;
      bw[4] = 50 ^ 28 ^ 185 ^ 146;
      bw[5] = "  ".length();
      bw[6] = -" ".length();
      bw[7] = (31 ^ 14) + (59 ^ 82) - -(16 ^ 50) + (90 ^ 14);
      bw[8] = -(-258 & 30005) & -133 & 30199;
      bw[9] = 92 + 105 - 86 + 49;
      bw[10] = 187 ^ 180;
      bw[11] = 70 ^ 87;
      bw[12] = 30 ^ 14;
      bw[13] = 157 + 131 - 84 + 24 ^ 168 + 33 - 30 + 7;
      bw[14] = 126 + 18 - -53 + 51 ^ 57 + 83 - 45 + 46;
      bw[15] = 211 ^ 186;
      bw[16] = "   ".length();
      bw[17] = 48 + 100 - 54 + 56 ^ 156 + 59 - 138 + 105;
      bw[18] = 14 ^ 66;
      bw[19] = -(122 + 1 - 80 + 87 ^ 109 + 94 - 50 + 38);
      bw[20] = 37 + 126 - 70 + 53 ^ 32 + 47 - -49 + 20;
      bw[21] = -(28 ^ 82);
      bw[22] = 111 ^ 124 ^ 28 ^ 8;
      bw[23] = 104 + 204 - 204 + 122 ^ 94 + 99 - 179 + 126;
      bw[24] = 11 ^ 3;
      bw[25] = 197 ^ 162;
      bw[26] = 44 ^ 37;
      bw[27] = 88 + 155 - 204 + 125 ^ 93 + 169 - 112 + 24;
      bw[28] = 105 ^ 42;
      bw[29] = 7 ^ 106 ^ 234 ^ 140;
      bw[30] = 72 ^ 32;
      bw[31] = 124 ^ 112;
      bw[32] = -(8 ^ 123 ^ 42 ^ 70);
      bw[33] = 79 + 111 - 176 + 146 ^ 169 + 98 - 197 + 103;
      bw[34] = -(144 ^ 132 ^ 51 ^ 98);
      bw[35] = -(250 ^ 132 ^ 167 ^ 186);
      bw[36] = 76 ^ 109;
      bw[37] = -171 & 10170;
      bw[38] = 67 ^ 46 ^ 205 ^ 196;
      bw[39] = 162 ^ 138;
      bw[40] = 214 ^ 192;
      bw[41] = -" ".length() & -1 & 16777215;
      bw[42] = 66 ^ 90;
      bw[43] = 30 ^ 78 ^ 52 ^ 36;
      bw[44] = (4 ^ 88) + (158 ^ 191) - -(149 ^ 180) + (224 ^ 194);
      bw[45] = 61 + 51 - 88 + 122 ^ 86 + 36 - 112 + 181;
      bw[46] = 87 ^ 57 ^ 246 ^ 172;
      bw[47] = 251 ^ 148 ^ 114 ^ 42;
      bw[48] = -22337 & 1136448;
      bw[49] = 154 ^ 142;
      bw[50] = (122 ^ 109) + (247 ^ 193) - -(12 ^ 44) + (209 ^ 196);
      bw[51] = 119 ^ 27 ^ 8 ^ 88;
      bw[52] = 163 ^ 147;
      bw[53] = 89 + 78 - 47 + 71 ^ 72 + 81 - 74 + 61;
      bw[54] = 24 ^ 59;
      bw[55] = 1 ^ 24;
      bw[56] = 15 ^ 61;
      bw[57] = 115 ^ 59 ^ 205 ^ 188;
      bw[58] = 84 + 43 - 102 + 102 ^ 48 ^ 14;
      bw[59] = 45 + 167 - 157 + 194 ^ 26 + 31 - 44 + 118;
      bw[60] = -(-2561 & 3000);
      bw[61] = -(-7778 & 32357) & -521 & 25599;
      bw[62] = -20545 & 29426;
      bw[63] = -(-28675 & 31759) & -4355 & 16319;
      bw[64] = -(-10855 & 32623) & -2113 & 32763;
      bw[65] = 107 ^ 2 ^ 183 ^ 192;
      bw[66] = -336 & 9215;
      bw[67] = -9473 & 98293;
      bw[68] = -20743 & 909103;
      bw[69] = -26657 & 126655;
      bw[70] = -(-3623 & 24511) & -1 & 909279;
   }

   public static void b(String var0) {
      bf.a(var0, (Class_cw)null, new Class_cw(Class_cv.no, bi, bw[62], (Object)null), (Class_cw)null);
      ap = bf;
      bf.a = (boolean)bw[1];
   }

   private static boolean h(int var0, int var1) {
      return var0 == var1;
   }

   public static void e() {
      Class_ez.c().a((String)Class_ed.c, (int)14444);
   }

   public final void f() {
      if (e(f)) {
         int var1 = bw[0];
         "".length();
         if ((179 ^ 183) == 0) {
            return;
         }

         for(; !f(var1, bw[5]); ++var1) {
            if (k(this.cu[var1], bw[6])) {
               int[] var10000 = this.cu;
               var10000[var1] += bw[1];
               if (f(this.cu[var1], bw[4])) {
                  this.cu[var1] = bw[6];
               }

               if (e(var1)) {
                  var10000 = this.ck;
                  var10000[var1] -= bw[1];
                  "".length();
                  if (" ".length() >= "   ".length()) {
                     return;
                  }
               } else {
                  var10000 = this.ck;
                  var10000[var1] += bw[1];
               }

               var10000 = this.ce;
               var10000[var1] -= bw[1];
            }
         }
      }

   }

   protected final void b(int var1, int var2) {
      ba = (boolean)bw[1];
      ae = (boolean)bw[1];
      cj = System.currentTimeMillis();
      k = var1;
      ag = var2;
      ah = var1;
      e = var2;
   }

   public static void b(int var0) {
      int var1;
      int var2;
      int var3;
      label315: {
         int[] var10000;
         label314: {
            var1 = bw[0];
            var2 = bw[0];
            var3 = bw[0];
            aq = var0;
            if (k(var0, (11 ^ 104) & ~(204 ^ 175)) && k(var0, " ".length())) {
               if (!k(var0, "  ".length())) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[5];
                  var10000[bw[5]] = bw[16];
                  var10000[bw[16]] = bw[3];
                  ct = var10000;
                  "".length();
                  if ("  ".length() >= "   ".length()) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, "   ".length())) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[5];
                  var10000[bw[5]] = bw[16];
                  var10000[bw[16]] = bw[3];
                  ct = var10000;
                  "".length();
                  if (null != null) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, 115 ^ 119)) {
                  var1 = bw[26];
                  var2 = bw[20];
                  "".length();
                  if (null != null) {
                     return;
                  }
                  break label314;
               }

               if (!k(var0, 59 ^ 62)) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[1];
                  var10000[bw[5]] = bw[1];
                  var10000[bw[16]] = bw[1];
                  ct = var10000;
                  "".length();
                  if (-" ".length() == (0 + 88 - -36 + 12 ^ 26 + 24 - 17 + 107)) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, 169 ^ 175)) {
                  var1 = bw[31];
                  "".length();
                  if (-(172 ^ 169) >= 0) {
                     return;
                  }
                  break label314;
               }

               if (!k(var0, 184 ^ 191)) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[5];
                  var10000[bw[5]] = bw[16];
                  var10000[bw[16]] = bw[3];
                  ct = var10000;
                  "".length();
                  if (((212 ^ 158 ^ 214 ^ 195) & (127 + 56 - 60 + 111 ^ 143 + 113 - 132 + 57 ^ -" ".length())) != 0) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, 165 ^ 173)) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[5];
                  var10000[bw[5]] = bw[16];
                  var10000[bw[16]] = bw[3];
                  ct = var10000;
                  "".length();
                  if (null != null) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, 205 ^ 196)) {
                  var1 = bw[12];
                  var2 = bw[27];
                  var3 = bw[20];
                  "".length();
                  if (-" ".length() != -" ".length()) {
                     return;
                  }
                  break label314;
               }

               if (!k(var0, 66 ^ 72)) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[1];
                  var10000[bw[5]] = bw[1];
                  var10000[bw[16]] = bw[1];
                  ct = var10000;
                  "".length();
                  if (null != null) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, 17 ^ 26)) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[5];
                  var10000[bw[5]] = bw[16];
                  var10000[bw[16]] = bw[3];
                  ct = var10000;
                  "".length();
                  if ("  ".length() < 0) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, 83 ^ 95)) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[5];
                  var10000[bw[5]] = bw[16];
                  var10000[bw[16]] = bw[3];
                  ct = var10000;
                  "".length();
                  if ((10 ^ 14) <= "   ".length()) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, 120 ^ 117)) {
                  var1 = bw[51];
                  "".length();
                  if ("  ".length() < -" ".length()) {
                     return;
                  }
                  break label314;
               }

               if (!k(var0, 109 ^ 99)) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[5];
                  var10000[bw[5]] = bw[16];
                  var10000[bw[16]] = bw[3];
                  ct = var10000;
                  "".length();
                  if ("   ".length() == -" ".length()) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, 58 ^ 53)) {
                  var10000 = new int[bw[3]];
                  var10000[bw[0]] = bw[1];
                  var10000[bw[1]] = bw[5];
                  var10000[bw[5]] = bw[16];
                  var10000[bw[16]] = bw[3];
                  ct = var10000;
                  "".length();
                  if (-" ".length() >= " ".length()) {
                     return;
                  }
                  break label315;
               }

               if (!k(var0, 16 ^ 0)) {
                  break label314;
               }

               "".length();
               if ((45 ^ 9 ^ 74 ^ 106) == 0) {
                  return;
               }
            }

            "".length();
            if ((148 + 92 - 95 + 31 ^ 152 + 27 - 30 + 31) < " ".length()) {
               return;
            }
            break label315;
         }

         var10000 = new int[bw[3]];
         var10000[bw[0]] = bw[1];
         var10000[bw[1]] = bw[5];
         var10000[bw[5]] = bw[16];
         var10000[bw[16]] = bw[3];
         ct = var10000;
      }

      cz = Class_eq.h[aq];

      int var4;
      label277: {
         try {
            if (e(f)) {
               cd = new Image[bw[3]];
               cw = new int[bw[3]];
               var4 = bw[0];
               "".length();
               if ("   ".length() > "   ".length()) {
                  return;
               }

               while(true) {
                  if (f(var4, bw[3])) {
                     if (h(aq, bw[27])) {
                        cd[bw[1]] = a("/bg/bg09.png");
                        cd[bw[5]] = a("/bg/bg09.png");
                        cw[bw[1]] = Class_er.a(cd[bw[1]]);
                        cw[bw[5]] = Class_er.a(cd[bw[5]]);
                     }

                     if (h(aq, bw[31])) {
                        cd[bw[16]] = a("/bg/bg39.png");
                        cw[bw[16]] = Class_er.a(cd[bw[16]]);
                     }

                     if (h(aq, bw[2])) {
                        if (i(ay)) {
                           cc = (db = an - Class_er.b(cd[bw[0]])) - Class_er.b(cd[bw[1]]);
                           "".length();
                           if ("   ".length() <= 0) {
                              return;
                           }
                        } else {
                           cc = (db = an - Class_er.b(cd[bw[0]]) - bw[45]) - Class_er.b(cd[bw[1]]);
                        }
                     }

                     if (h(aq, bw[10]) && i(ay)) {
                        cc = (db = an - Class_er.b(cd[bw[0]])) - Class_er.b(cd[bw[1]]) + bw[38];
                     }

                     if (h(aq, bw[12])) {
                        if (i(ay)) {
                           cc = (db = an - Class_er.b(cd[bw[0]])) - Class_er.b(cd[bw[1]]) + bw[38];
                           "".length();
                           if (null != null) {
                              return;
                           }
                        } else {
                           cc = (db = an - Class_er.b(cd[bw[0]]) - bw[39]) - Class_er.b(cd[bw[1]]) + bw[38];
                        }
                     }
                     break;
                  }

                  label252: {
                     try {
                        if (!k(Class_eq.c[aq][var4], bw[6])) {
                           break label252;
                        }

                        cd[var4] = a(String.valueOf((new StringBuilder("/bg/bg")).append(var4).append(Class_eq.c[aq][var4]).append(".png")));
                     } catch (Exception var7) {
                        var7.printStackTrace();
                        break label252;
                     }

                     "".length();
                     if (null != null) {
                        return;
                     }
                  }

                  if (b((Object)cd[var4])) {
                     cw[var4] = Class_er.a(cd[var4]);
                  }

                  ++var4;
               }
            }

            if (d(aq) && i(aq, bw[1])) {
               bv = a("/bg/cl0.png");
               bx = a("/bg/sun0.png");
               "".length();
               if (-" ".length() > 0) {
                  return;
               }
            } else {
               bv = null;
               bx = null;
            }

            if (h(aq, bw[5])) {
               bv = a("/bg/cl1.png");
               bx = a("/bg/sun1.png");
            }

            if (!k(aq, bw[22]) || !k(aq, bw[29]) || h(aq, bw[31])) {
               if (h(Class_eo.ah, bw[49])) {
                  bv = null;
                  "".length();
                  if ("   ".length() < 0) {
                     return;
                  }
               } else {
                  bv = a("/bg/cl0.png");
               }
            }

            if (k(var0, bw[33]) && !h(var0, bw[10])) {
               break label277;
            }

            bv = a("/bg/cl2.png");
         } catch (Exception var8) {
            var8.printStackTrace();
            break label277;
         }

         "".length();
         if ((84 ^ 80) <= "   ".length()) {
            return;
         }
      }

      br = (boolean)bw[0];
      if (e(f)) {
         br = (boolean)bw[1];
         if (b((Object)cd[bw[0]]) && b((Object)cd[bw[1]]) && b((Object)cd[bw[5]])) {
            da = Class_dx.bt - (Class_er.b(cd[bw[0]]) + Class_er.b(cd[bw[1]]) + Class_er.b(cd[bw[5]])) + bw[29];
         }

         if (b((Object)cd[bw[0]])) {
            ca = Class_dx.bt - Class_er.b(cd[bw[0]]);
         }

         if (b((Object)cd[bw[1]])) {
            cl = ca - Class_er.b(cd[bw[1]]);
         }

         if (b((Object)cd[bw[5]])) {
            cq = cl - Class_er.b(cd[bw[5]]);
         }

         if (b((Object)cd[bw[16]])) {
            bu = cl - Class_er.b(cd[bw[16]]) - bw[27];
         }

         if (f(aq, bw[5]) && i(aq, bw[33])) {
            db = var4 = Class_dx.bt - Class_er.b(cd[bw[0]]);
            if (b((Object)cd[bw[1]])) {
               var4 = var4 - Class_er.b(cd[bw[1]]) + var1;
            }

            cc = var4;
            if (b((Object)cd[bw[16]])) {
               var4 = var4 - Class_er.b(cd[bw[16]]) + var3;
            }

            bu = var4;
            da = var4;
            if (b((Object)cd[bw[5]])) {
               cq = cc - Class_er.b(cd[bw[5]]) + var2;
            }

            if (h(aq, bw[5])) {
               da = an;
            }
         }
      }

      int var5 = bw[0];
      if (f(aq, bw[5]) && i(aq, bw[31])) {
         var4 = bw[5] * Class_dx.bt / bw[16] - cc;
         "".length();
         if ((26 ^ 30) < 0) {
            return;
         }
      } else {
         var4 = bw[5] * Class_dx.bt / bw[16] - cl;
      }

      if (h(var4)) {
         var4 = bw[0];
      }

      if (h(Class_eo.ah, bw[52]) && h(Class_eo.ah, bw[53])) {
         db += var4;
      }

      if (f(aq, bw[5]) && i(aq, bw[20])) {
         cc += var4;
      }

      da += var4;
      ca += var4;
      cl += var4;
      cq += var4;
      bu += var4;
      bq = bw[16] * Class_dx.dy / bw[3];
      bt = da / bw[16];
      cf = new int[bw[5]];
      cb = new int[bw[5]];
      cf[bw[0]] = Class_dx.dy / bw[16];
      cb[bw[0]] = da / bw[5] - bw[24];
      cf[bw[1]] = bw[5] * Class_dx.dy / bw[16];
      cb[bw[1]] = da / bw[5] + bw[24];
      if (h(aq, bw[5])) {
         bt = da / bw[4];
         cf = new int[bw[4]];
         cb = new int[bw[4]];
         cf[bw[0]] = Class_dx.dy / bw[16];
         cb[bw[0]] = da / bw[16] - bw[54];
         cf[bw[1]] = bw[16] * Class_dx.dy / bw[3];
         cb[bw[1]] = da / bw[16] + bw[31];
         cf[bw[5]] = Class_dx.dy / bw[16] - bw[10];
         cb[bw[5]] = da / bw[16] + bw[31];
         cf[bw[16]] = Class_dx.dy / bw[10];
         cb[bw[16]] = da / bw[5] + bw[31];
         cf[bw[3]] = bw[5] * Class_dx.dy / bw[16] + bw[55];
         cb[bw[3]] = da / bw[16] + bw[31];
      }

      if (e(f)) {
         if (h(aq, bw[24])) {
            db = cc = Class_dx.dd - bw[56];
         }

         if (h(aq, bw[27]) && b((Object)cd[bw[16]])) {
            bu = cq - Class_er.b(cd[bw[16]]);
         }

         if (!k(aq, bw[29]) || h(aq, bw[31])) {
            bu = bw[0];
         }
      }

   }

   public static boolean b(int var0, int var1, int var2, int var3) {
      return (boolean)(i(ba) && f(ah, var0) && i(ah, var0 + var2) && f(e, var1) && i(e, var1 + var3) ? bw[1] : bw[0]);
   }

   public static void a(String var0, Class_cw var1) {
      bf.e = bw[6];
      bf.a(var0, (Class_cw)null, var1, (Class_cw)null);
      ap = bf;
      bf.a = (boolean)bw[1];
   }

   public static void c(String var0) {
      bf.e = bw[6];
      bf.a(var0, (Class_cw)null, (Class_cw)null, (Class_cw)null);
      ap = bf;
      bf.a = (boolean)bw[1];
   }

   public static void g() {
      g = Class_el.a.a();
      an = Class_el.a.b();
      y = g / bw[5];
      bn = an / bw[5];
      ak = new Class_dn();
      ar = new Class_fq();
      aw = new Class_ah();
      am = new Class_bf();
      az = new Class_fx();
   }

   public static void h() {
      if (b((Object)am)) {
         am.a.a(bw[61]);
      }

      if (b((Object)az)) {
         az.a.a(bw[61]);
         az.e.a(bw[61]);
      }

      ap = null;
   }

   public static boolean c(int var0, int var1, int var2, int var3) {
      int var4 = ah + Class_dx.ae;
      int var5 = Class_dx.du + e;
      if (e(ba) && e(c)) {
         return (boolean)bw[0];
      } else {
         return (boolean)(f(var4, var0) && i(var4, var0 + var2) && f(var5, var1) && i(var5, var1 + var3) ? bw[1] : bw[0]);
      }
   }

   protected final void a(Graphics var1) {
      this.cg.a = var1;

      try {
         if (b((Object)h) && e(q)) {
            h.a(this.cg);
            this.cg.c(bw[0], bw[0], g, an);
         }

         this.cg.a(-this.cg.b(), -this.cg.a());
         this.cg.c(bw[0], bw[0], g, an);
         Class_gc.a(this.cg);
         if (b((Object)ap)) {
            ap.a(this.cg);
            "".length();
            if (-" ".length() >= "   ".length()) {
               return;
            }
         } else if (i(i.c)) {
            i.a(this.cg);
         }

         Class_dx.b(this.cg);
         Class_er var2 = this.cg;
         if (!i(bc)) {
            return;
         }

         if (g(Class_ft.s.a(Class_cv.nr), g) && j(cy -= bw[1], bw[60])) {
            cy = g;
         }

         var2.a(bw[0]);
         var2.b(bw[0], bw[0], g, bw[12]);
         Class_ft.s.a(var2, Class_cv.nr, cy + bw[49], bw[16], bw[0]);
         var2.a(bl, bw[0], bw[0], bw[0]);
      } catch (Exception var3) {
         var3.printStackTrace();
         return;
      }

      "".length();
      if (((57 ^ 31 ^ 145 ^ 188) & (8 ^ 68 ^ 227 ^ 164 ^ -" ".length())) <= 0) {
         ;
      }
   }

   private static boolean i(int var0, int var1) {
      return var0 <= var1;
   }

   public static void i() {
      int var0 = bw[0];
      "".length();
      if ((183 ^ 179) >= "   ".length()) {
         while(!f(var0, bw[2])) {
            bh[var0] = (boolean)bw[0];
            ++var0;
         }

         c = (boolean)bw[0];
      }
   }

   protected final void c(int var1, int var2) {
      if (!j(Class_bh.d(var1 - k), bw[27]) || f(Class_bh.d(var2 - ag), bw[27])) {
         ae = (boolean)bw[0];
      }

      ah = var1;
      e = var2;
      if (g(bs += bw[1], bw[16])) {
         bs = bw[0];
      }

      cp[bs] = new Class_ab(var1, var2);
   }

   public static void a(Vector var0, long var1) {
      d = (boolean)bw[1];
      j = System.currentTimeMillis();
      (new Thread(new Class_dx(var0, var1))).start();
   }

   public static boolean j() {
      return (boolean)(d(a(System.currentTimeMillis() - cj, 800L)) ? bw[1] : bw[0]);
   }

   public static void k() {
      h();
      if (i(r)) {
         if (i(Class_ez.c().b)) {
            Class_ez.c().b();
         }

         ar.a();
         a(u, new Class_cw(Class_cv.ac, bi, bw[37], (Object)null));
      } else if (i(aj)) {
         a(ax, new Class_cw(Class_cv.ac, bi, bw[37], (Object)null));
      } else if (i(bp)) {
         a(l, new Class_cw(Class_cv.ac, bi, bw[37], (Object)null));
      } else {
         if (e(a)) {
            a = (boolean)bw[1];
            ao = (boolean)bw[0];
            bj = System.currentTimeMillis();
            e("Ninjatruyenky.com");
         }

      }
   }

   public final void a(int var1, Object var2) {
      if (!k(var1, -28824 & 30431)) {
         Class_ao.a().a((String)az.a.a(), (String)az.e.a(), (byte)bw[0]);
         h();
      } else {
         if (k(var1, -10508 & 12207)) {
            if (!k(var1, -17489 & 26367)) {
               h();
               return;
            }

            if (!k(var1, -5123 & 14002)) {
               h();
               av.a();
               return;
            }

            String var3;
            if (!k(var1, -7431 & 16311)) {
               Class_dq.a(var3 = (String)var2);
               ap = null;
               return;
            }

            if (!k(var1, -23621 & 32502)) {
               ap = null;
               return;
            }

            short var4;
            if (!k(var1, -4165 & 13047)) {
               var4 = (Short)((Class_ge)var2).elementAt(bw[0]);
               Class_dq.a((String)((Class_ge)var2).elementAt(bw[0]), var4);
               ap = null;
               return;
            }

            if (!k(var1, -1099 & 9982)) {
               h();
               ar.a();
               return;
            }

            if (!k(var1, -67 & 8951)) {
               Class_cr.e.notifyDestroyed();
               return;
            }

            if (!k(var1, -7241 & 16126)) {
               a(Class_cv.hj, new Class_cw(Class_cv.ak, bi, bw[66], (Object)null), new Class_cw(Class_cv.se, bi, bw[62], (Object)null));
               return;
            }

            int var7;
            if (!k(var1, -3393 & 12279)) {
               h();
               var7 = (Integer)var2;
               Class_ao.a().ak(var7);
               return;
            }

            if (!k(var1, -5128 & 14015)) {
               var7 = (Integer)var2;
               Class_ao.a().k(var7);
               h();
               return;
            }

            if (!k(var1, -3073 & 11961)) {
               var3 = (String)var2;
               h();
               Class_ao.a().h(var3);
               if (b((Object)Class_cl.ad) && i(Class_cl.ad.equals(Class_bk.e().eb))) {
                  Class_cl.ay.addElement(var3);
                  Class_cu.b().a(Class_cl.ay);
               }

               return;
            }

            if (!k(var1, -5442 & 14331)) {
               h();
               Class_ao.a().am((Integer)var2);
               return;
            }

            if (!k(var1, -20801 & 29691)) {
               Class_ao.a().am(bw[0]);
               ap = null;
               return;
            }

            if (!k(var1, -131 & 10130)) {
               Class_cr.e.c();
               return;
            }

            if (!k(var1, -16393 & 32473)) {
               Class_ao.a().a((String)az.a.a(), (String)az.e.a(), (byte)bw[1]);
               h();
               return;
            }

            if (!k(var1, -9489 & 98298)) {
               var7 = (Integer)var2;
               h();
               Class_ao.a().ah(var7);
               return;
            }

            if (!k(var1, -5 & 88815)) {
               h();
               Class_ao.a().o();
               return;
            }

            Class_bk var5;
            if (!k(var1, -2 & 88813)) {
               var5 = (Class_bk)var2;
               h();
               Class_ao.a().ab(var5.dg);
               return;
            }

            Class_dt[] var8;
            if (!k(var1, -259 & 89071)) {
               h();
               var8 = (Class_dt[])var2;
               Class_ao.a().b(var8);
               return;
            }

            if (!k(var1, -8193 & 97006)) {
               var8 = (Class_dt[])var2;
               h();
               Class_ao.a().a(var8);
               return;
            }

            if (!k(var1, -1297 & 90111)) {
               Class_dx.ac();
               "".length();
               Class_dx.t();
               return;
            }

            if (!k(var1, -8195 & 97010)) {
               Class_ao.a().b(az.a.a(), az.e.a());
               h();
               return;
            }

            if (!k(var1, -1289 & 90105)) {
               if (b((Object)Class_bk.e().fy)) {
                  Class_ao.a().a((byte)bw[0], Class_bk.e().fy.gs.d, i.a, bw[0]);
                  return;
               }

               Class_ao.a().a((byte)bw[0], bw[0], i.a, bw[0]);
               return;
            }

            if (!k(var1, -1294 & 90111)) {
               var4 = (Short)var2;
               Class_ao.a().a(var4, am.a.a());
               h();
               return;
            }

            if (!k(var1, -1 & 88819)) {
               var4 = (Short)var2;
               Class_ao.a().a(var4);
               Class_dx.ac().af();
               return;
            }

            int var12;
            if (!k(var1, -8193 & 97012)) {
               String[] var9 = (String[])var2;
               if (a((Object)Class_bk.e().fy)) {
                  return;
               }

               Integer var10 = new Integer(i.a);
               if (i(var9.length, bw[1])) {
                  Class_cp.b("", bw[1], Class_bk.e().fy);
                  "".length();
                  Class_ao.a().a((byte)bw[0], Class_bk.e().fy.gs.d, var10, bw[0]);
                  return;
               }

               Class_ge var11 = new Class_ge();
               var12 = bw[0];
               "".length();
               if (" ".length() < 0) {
                  return;
               }

               while(!f(var12, var9.length - bw[1])) {
                  var11.addElement(new Class_cw(var9[var12 + bw[1]], bi, bw[67], var10));
                  ++var12;
               }

               i.a(var11);
               return;
            }

            if (!k(var1, -1 & 88821)) {
               var12 = (Integer)var2;
               Class_cp.b("", bw[1], Class_bk.e().fy);
               "".length();
               Class_ao.a().a((byte)bw[0], Class_bk.e().fy.gs.d, var12, i.a);
               return;
            }

            if (!k(var1, -9218 & 98039)) {
               Class_cp.b("", bw[1], Class_bk.e().fy);
               "".length();
               Class_ao.a().a((byte)bw[0], Class_bk.e().fy.gs.d, i.a, bw[0]);
               return;
            }

            if (!k(var1, -257 & 89079)) {
               d(Class_cv.ea);
               return;
            }

            if (!k(var1, -261 & 89084)) {
               d(Class_cv.dc);
               return;
            }

            if (!k(var1, -5 & 88829)) {
               d(Class_cv.fx);
               return;
            }

            if (!k(var1, -8453 & 97278)) {
               d(Class_cv.ms);
               return;
            }

            if (!k(var1, -8193 & 97019)) {
               d(Class_cv.my);
               return;
            }

            if (!k(var1, -9473 & 98300)) {
               d(Class_cv.jf);
               return;
            }

            if (!k(var1, -9473 & 98301)) {
               String var13;
               if (i((var13 = am.a.a()).equals(""))) {
                  return;
               }

               Class_ao.a().b(var13, (Integer)var2);
               b(Class_cv.mq);
               return;
            }

            if (!k(var1, -257 & 89086)) {
               var7 = (Integer)var2;
               h();
               Class_ao.a().ac(var7);
               return;
            }

            if (!k(var1, -1025 & 89855)) {
               var7 = (Integer)var2;
               h();
               Class_ao.a().g(var7);
               return;
            }

            if (k(var1, -9350 & 98181)) {
               if (k(var1, -8215 & 97047)) {
                  if (k(var1, -8269 & 97102)) {
                     if (!k(var1, -29 & 88863)) {
                        var7 = Integer.parseInt((String)var2);
                        var1 = Integer.parseInt(am.a.a());
                        ap = null;
                        if (f(var1, bw[1]) && j(var1, Class_bk.e().ee[var7].r)) {
                           Class_ao.a().g(var7, var1);
                           return;
                        }

                        d(Class_cv.aa);
                        return;
                     }

                     if (!k(var1, -8388 & 97223)) {
                        am.a.a(bw[20]);
                        am.a(Class_cv.bm, new Class_cw(Class_cv.ac, bi, bw[68], (Object)null), bw[1]);
                        return;
                     }

                     if (!k(var1, -9227 & 98063)) {
                        var3 = am.a.a();
                        h();

                        try {
                           Class_ao.a().an(Integer.parseInt(var3.trim()));
                           return;
                        } catch (Exception var20) {
                           return;
                        }
                     }

                     String var6;
                     if (!k(var1, -1153 & 89990)) {
                        var3 = az.a.a().trim();
                        var6 = az.e.a().trim();
                        h();
                        if (f(var3.length(), bw[20]) && f(var6.length(), bw[20])) {
                           try {
                              var7 = Integer.parseInt(var3);
                              var1 = Integer.parseInt(var6);
                              if (f(var7, bw[69]) && f(var1, bw[69])) {
                                 Class_ao.a().f(var7, var1);
                                 return;
                              }

                              d(Class_cv.ld);
                              return;
                           } catch (Exception var19) {
                              d(Class_cv.eq);
                              return;
                           }
                        }

                        d(Class_cv.gk);
                        return;
                     }

                     if (!k(var1, -17 & 88855)) {
                        var3 = am.a.a();
                        h();

                        try {
                           Integer.parseInt(var3);
                           "".length();
                           a(Class_cv.rg, bw[70], var3, bw[62], (Object)null);
                           return;
                        } catch (Exception var18) {
                           Class_gg.a(Class_cv.lu, bw[49], Class_ft.c);
                           return;
                        }
                     }

                     if (!k(var1, -229 & 89068)) {
                        var5 = (Class_bk)var2;
                        h();
                        Class_ao.a().aa(var5.dg);
                        return;
                     }

                     if (!k(var1, -8261 & 97101)) {
                        var5 = (Class_bk)var2;
                        h();
                        Class_ao.a().af(var5.dg);
                        return;
                     }

                     if (!k(var1, -9430 & 98271)) {
                        Class_ao.a().p();
                        return;
                     }

                     if (!k(var1, -133 & 88975)) {
                        var6 = am.a.a();
                        h();
                        if (i(var6.equals(""))) {
                           d(Class_cv.lp);
                           return;
                        }

                        Class_ao.a().c(var6);
                        return;
                     }

                     if (!k(var1, -28675 & 916855)) {
                        var4 = (Short)var2;
                        Class_ao.a().b(var4, am.a.a());
                        bd = null;
                        h();
                        return;
                     }

                     if (!k(var1, -16853 & 905213)) {
                        var3 = am.a.a();
                        h();
                        if (f(var3.length(), bw[20]) && e(var3.equals(""))) {
                           try {
                              Class_ao.a().n(Integer.parseInt(var3));
                              return;
                           } catch (Exception var17) {
                              d(Class_cv.eq);
                              return;
                           }
                        }

                        d(Class_cv.gk);
                        return;
                     }

                     if (!k(var1, -4137 & 892527)) {
                        try {
                           h();
                           var1 = Integer.parseInt((String)var2);
                           Class_ao.a().t(var1);
                           return;
                        } catch (Exception var16) {
                           return;
                        }
                     }

                     "".length();
                     if ((64 ^ 68) == "  ".length()) {
                        return;
                     }
                  } else {
                     var3 = am.a.a();
                     h();
                     if (e(var3.equals(""))) {
                        try {
                           if (g(var7 = Integer.parseInt(var3))) {
                              return;
                           }

                           Class_ao.a().ar(var7);
                           return;
                        } catch (Exception var21) {
                           return;
                        }
                     }
                  }
               } else {
                  var3 = am.a.a();
                  h();
                  if (e(var3.equals(""))) {
                     try {
                        var7 = Integer.parseInt(var3);
                        if (f(Class_bk.e().aw, var7) && d(var7)) {
                           Class_ao.a().w(var7);
                           return;
                        }

                        Class_gg.a(Class_cv.hz, bw[49], Class_ft.c);
                        return;
                     } catch (Exception var22) {
                        return;
                     }
                  }
               }
            } else {
               var3 = am.a.a();
               h();
               if (e(var3.equals(""))) {
                  Class_ao.a().g(var3);
                  return;
               }
            }
         } else {
            Class_ao.a().a((short)bw[38], am.a.a(), Class_dx.dk);
            h();
            "".length();
            if (null != null) {
               return;
            }
         }

      }
   }

   private static boolean j(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean e(int var0) {
      return var0 == 0;
   }

   private static boolean f(int var0) {
      return var0 > 0;
   }

   public final void b(Class_er var1) {
      if (e(f)) {
         int var2 = bw[0];
         "".length();
         if (" ".length() > "  ".length()) {
            return;
         }

         for(; !f(var2, bw[5]); ++var2) {
            if (k(this.cu[var2], bw[6]) && i(e(this.ck[var2], this.ce[var2]))) {
               var1.a(ch[var2][this.cu[var2]], this.ck[var2], this.ce[var2], bw[16]);
            }
         }
      }

   }

   public static void l() {
      if (e(f) && b((Object)bv)) {
         int var0 = bw[0];
         "".length();
         if ((197 ^ 128 ^ 96 ^ 33) != (95 ^ 44 ^ 117 ^ 2)) {
            return;
         }

         for(; !f(var0, cf.length); ++var0) {
            if (e(n % (var0 + bw[5] << bw[16]))) {
               int[] var10000 = cf;
               var10000[var0] += bw[1];
               if (g(cf[var0], Class_dx.dy + (Class_er.a(bv) >> bw[1]))) {
                  cf[var0] = -(Class_er.a(bv) >> bw[1]);
               }
            }
         }
      }

   }

   private static boolean g(int var0) {
      return var0 <= 0;
   }

   public static void m() {
      b("Ninjatruyenky.com");
   }

   protected final void c(int var1) {
      cj = System.currentTimeMillis();
      if (f(var1, bw[52]) && !g(var1, bw[57]) || f(var1, bw[58]) && !g(var1, bw[59]) || !k(var1, bw[27]) || !k(var1, bw[24]) || !k(var1, bw[33]) || h(var1, bw[17])) {
         ad = var1;
      }

      if (b((Object)ap)) {
         ap.a(var1);
         ad = bw[0];
         "".length();
         if (" ".length() <= " ".length()) {
            ;
         }
      } else {
         label231: {
            label244: {
               h.a(var1);
               if (k(var1, -(136 ^ 175))) {
                  label245: {
                     if (!k(var1, -(106 ^ 76))) {
                        break label244;
                     }

                     if (k(var1, -(183 ^ 161))) {
                        label242: {
                           if (k(var1, -(7 ^ 18))) {
                              if (!k(var1, -(74 ^ 77))) {
                                 break label242;
                              }

                              if (k(var1, -(105 ^ 111))) {
                                 if (!k(var1, -(46 ^ 43))) {
                                    break label231;
                                 }

                                 if (!k(var1, -(161 ^ 165))) {
                                    if (i(h instanceof Class_dx)) {
                                       Class_bk.e();
                                       "".length();
                                    }

                                    au[bw[20]] = (boolean)bw[1];
                                    bh[bw[20]] = (boolean)bw[1];
                                    return;
                                 }

                                 if (!k(var1, -"   ".length())) {
                                    if (i(h instanceof Class_dx)) {
                                       Class_bk.e();
                                       "".length();
                                    }

                                    au[bw[3]] = (boolean)bw[1];
                                    bh[bw[3]] = (boolean)bw[1];
                                    return;
                                 }

                                 if (k(var1, -"  ".length())) {
                                    if (k(var1, -" ".length())) {
                                       if (k(var1, 105 ^ 99)) {
                                          if (!k(var1, 92 ^ 127)) {
                                             au[bw[29]] = (boolean)bw[1];
                                             bh[bw[29]] = (boolean)bw[1];
                                             return;
                                          }

                                          if (k(var1, 136 ^ 162)) {
                                             if (!k(var1, 61 ^ 13)) {
                                                au[bw[0]] = (boolean)bw[1];
                                                bh[bw[0]] = (boolean)bw[1];
                                                return;
                                             }

                                             if (k(var1, 242 ^ 195)) {
                                                if (!k(var1, 93 ^ 111)) {
                                                   if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e) && e(Class_dx.bp)) {
                                                      au[bw[5]] = (boolean)bw[1];
                                                      bh[bw[5]] = (boolean)bw[1];
                                                   }

                                                   return;
                                                }

                                                if (!k(var1, 158 ^ 173)) {
                                                   if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e)) {
                                                      au[bw[16]] = (boolean)bw[1];
                                                      bh[bw[16]] = (boolean)bw[1];
                                                   }

                                                   return;
                                                }

                                                if (!k(var1, 124 ^ 72)) {
                                                   if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e) && e(Class_dx.bp)) {
                                                      au[bw[3]] = (boolean)bw[1];
                                                      bh[bw[3]] = (boolean)bw[1];
                                                   }

                                                   return;
                                                }

                                                if (k(var1, 25 ^ 44)) {
                                                   if (!k(var1, 1 ^ 55)) {
                                                      if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e) && e(Class_dx.bp)) {
                                                         au[bw[20]] = (boolean)bw[1];
                                                         bh[bw[20]] = (boolean)bw[1];
                                                      }

                                                      return;
                                                   }

                                                   if (!k(var1, 91 ^ 108)) {
                                                      au[bw[22]] = (boolean)bw[1];
                                                      bh[bw[22]] = (boolean)bw[1];
                                                      return;
                                                   }

                                                   if (!k(var1, 44 ^ 20)) {
                                                      if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e) && e(Class_dx.bp)) {
                                                         au[bw[24]] = (boolean)bw[1];
                                                         bh[bw[24]] = (boolean)bw[1];
                                                      }

                                                      return;
                                                   }

                                                   if (!k(var1, 100 ^ 93)) {
                                                      au[bw[26]] = (boolean)bw[1];
                                                      bh[bw[26]] = (boolean)bw[1];
                                                      return;
                                                   }

                                                   "".length();
                                                   if (" ".length() <= 0) {
                                                      return;
                                                   }
                                                } else if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e) && e(Class_dx.bp)) {
                                                   au[bw[4]] = (boolean)bw[1];
                                                   bh[bw[4]] = (boolean)bw[1];
                                                }

                                                return;
                                             }

                                             if (a((Object)h, (Object)Class_dx.t) && i(p) && e(Class_dl.a().e)) {
                                                au[bw[1]] = (boolean)bw[1];
                                                bh[bw[1]] = (boolean)bw[1];
                                             }

                                             return;
                                          }

                                          au[bw[27]] = (boolean)bw[1];
                                          bh[bw[27]] = (boolean)bw[1];
                                          return;
                                       }
                                       break label231;
                                    }
                                    break label244;
                                 }
                                 break label245;
                              }
                           }

                           au[bw[31]] = (boolean)bw[1];
                           bh[bw[31]] = (boolean)bw[1];
                           return;
                        }
                     }

                     au[bw[33]] = (boolean)bw[1];
                     bh[bw[33]] = (boolean)bw[1];
                     return;
                  }
               }

               if (i(h instanceof Class_dx)) {
                  Class_bk.e();
                  "".length();
               }

               au[bw[24]] = (boolean)bw[1];
               bh[bw[24]] = (boolean)bw[1];
               return;
            }

            if (i(h instanceof Class_dx)) {
               Class_bk.e();
               "".length();
            }

            au[bw[5]] = (boolean)bw[1];
            bh[bw[5]] = (boolean)bw[1];
            return;
         }

         if (i(h instanceof Class_dx)) {
            Class_bk.e();
            "".length();
         }

         au[bw[4]] = (boolean)bw[1];
         bh[bw[4]] = (boolean)bw[1];
      }
   }

   public static void n() {
      cd = null;
      bv = null;
      bx = null;
   }

   public static void d(String var0) {
      bf.a(var0, (Class_cw)null, new Class_cw(Class_cv.rk, bi, bw[62], (Object)null), (Class_cw)null);
      ap = bf;
   }

   public static void e(String var0) {
      bf.e = bw[61];
      bf.a(var0, (Class_cw)null, (Class_cw)null, (Class_cw)null);
      ap = bf;
      bf.a = (boolean)bw[1];
   }

   public static void a(int var0, int var1, Class_er var2, boolean var3) {
      int var4 = n % bw[16];
      var2.a(cx, bw[0], var4 << bw[3], bw[12], bw[12], bw[0], var0, var1, bw[16]);
   }

   public static void o() {
      if (i(as) && h(bk -= bw[1])) {
         as = (boolean)bw[0];
      }

   }

   private static boolean k(int var0, int var1) {
      return var0 != var1;
   }

   public static boolean d(int var0, int var1, int var2, int var3) {
      if (e(ba) && e(c)) {
         return (boolean)bw[0];
      } else {
         return (boolean)(f(ah, var0) && i(ah, var0 + var2) && f(e, var1) && i(e, var1 + var3) ? bw[1] : bw[0]);
      }
   }

   public final boolean a(int var1, int var2, int var3) {
      if (i(f)) {
         return (boolean)bw[0];
      } else {
         int var10000;
         if (h(var1, bw[1])) {
            var10000 = bw[0];
            "".length();
            if (null != null) {
               return (boolean)((62 ^ 6) & ~(153 ^ 161));
            }
         } else {
            var10000 = bw[1];
         }

         var1 = var10000;
         if (k(this.cu[var1], bw[6])) {
            return (boolean)bw[0];
         } else {
            this.cu[var1] = bw[0];
            this.ck[var1] = var2;
            this.ce[var1] = var3;
            return (boolean)bw[1];
         }
      }
   }

   public static Vector a(Byte... var0) {
      Vector var1 = new Vector();
      int var2 = bw[0];
      "".length();
      if ("  ".length() <= ((211 ^ 193) & ~(43 ^ 57))) {
         return null;
      } else {
         while(!f(var2, var0.length)) {
            var1.addElement(var0[var2]);
            ++var2;
         }

         return var1;
      }
   }

   public static void p() {
      bi.cn = (boolean)bw[0];
      ar.a();

      try {
         Class_bk.ac();
         Class_dx.v();
         Class_dx.aa();
         h();
         Class_gc.b();
         Class_dx.a((boolean)bw[1]);
         Class_dx.ae = bw[38];
         b(Class_eo.f);
         Class_dx.bw.removeAllElements();
         Class_dx.bq.removeAllElements();
         Class_dx.x.removeAllElements();
         Class_dx.ew.removeAllElements();
         Class_bk.au = null;
      } catch (Exception var1) {
         var1.printStackTrace();
         return;
      }

      "".length();
      if (-(46 ^ 42) < 0) {
         ;
      }
   }

   public final void a(String var1, String var2, short var3, String var4, String var5) {
      Class_ge var6;
      (var6 = new Class_ge()).addElement(new Short(var3));
      var6.addElement(var4);
      bf.a(var5, new Class_cw(var1, this, bw[64], var6), (Class_cw)null, new Class_cw(var2, this, bw[62], (Object)null));
      ap = bf;
   }

   protected final void d(int var1, int var2) {
      ba = (boolean)bw[0];
      c = (boolean)bw[1];
      Class_ew.fy = bw[6];
      ah = var1;
      e = var2;
   }

   public Class_bc() {
      Class_el.a.setFullScreenMode((boolean)bw[1]);
      Class_el.a.a(this);
      g = Class_el.a.a();
      an = Class_el.a.b();
      y = g / bw[5];
      bn = an / bw[5];
      if (i(Class_el.a.hasPointerEvents())) {
         ay = (boolean)bw[1];
         if (f(g, bw[7])) {
            ab = (boolean)bw[1];
         }

         if (j(g, bw[8])) {
            t = (boolean)bw[1];
         }
      }

      bf = new Class_dc();
      if (i(an, bw[9])) {
         Class_ai.e = bw[10];
         Class_ew.fv = bw[11];
      }

      bo = new Class_eh();
      bi = this;
      System.gc();
      aa = new Class_ai();
      int var1;
      if (e(f)) {
         if (a((Object)ch)) {
            ch = new Image[bw[5]][bw[4]];
            var1 = bw[0];
            "".length();
            if ("  ".length() == 0) {
               throw null;
            }

            while(!f(var1, bw[5])) {
               int var2 = bw[0];
               "".length();
               if (((123 ^ 37 ^ 3 ^ 79) & (35 + 95 - 60 + 65 ^ 70 + 42 - 9 + 46 ^ -" ".length())) != 0) {
                  throw null;
               }

               while(!f(var2, bw[4])) {
                  ch[var1][var2] = a(String.valueOf((new StringBuilder("/e/d")).append(var1).append(var2).append(".png")));
                  ++var2;
               }

               ++var1;
            }
         }

         this.ck = new int[bw[5]];
         this.ce = new int[bw[5]];
         this.cu = new int[bw[5]];
         this.cu[bw[0]] = this.cu[bw[1]] = bw[6];
      }

      r();
      Class_cr.e();
      cx = a("/u/f.png");
      if (i(ay)) {
         var1 = bw[0];
         "".length();
         if (null != null) {
            throw null;
         }

         while(!f(var1, bw[5])) {
            al[var1] = a(String.valueOf((new StringBuilder("/hd/bd")).append(var1).append(".png")));
            ++var1;
         }

         z = Class_er.a(al[bw[0]]);
         at = Class_er.b(al[bw[0]]);
         Class_er.a(al[bw[1]]);
         "".length();
         Class_er.b(al[bw[1]]);
         "".length();
         "".length();
         if (-(9 ^ 55 ^ 41 ^ 18) >= 0) {
            throw null;
         }
      } else if (h(Class_eb.b("lowGraphic"), bw[1])) {
         f = (boolean)bw[1];
      }

      Class_by.a();
      Class_ew.ap();
      av = new Class_et();
      byte[] var10000 = new byte[bw[12]];
      var10000[bw[0]] = (byte)bw[13];
      var10000[bw[1]] = (byte)bw[14];
      var10000[bw[5]] = (byte)bw[15];
      var10000[bw[16]] = (byte)bw[17];
      var10000[bw[3]] = (byte)bw[18];
      var10000[bw[4]] = (byte)bw[19];
      var10000[bw[20]] = (byte)bw[21];
      var10000[bw[22]] = (byte)bw[23];
      var10000[bw[24]] = (byte)bw[25];
      var10000[bw[26]] = (byte)bw[17];
      var10000[bw[27]] = (byte)bw[28];
      var10000[bw[29]] = (byte)bw[30];
      var10000[bw[31]] = (byte)bw[32];
      var10000[bw[33]] = (byte)bw[34];
      var10000[bw[2]] = (byte)bw[35];
      var10000[bw[10]] = (byte)bw[36];
      Byte[] var10001 = new Byte[bw[16]];
      var10001[bw[0]] = Byte.valueOf((byte)bw[0]);
      var10001[bw[1]] = Byte.valueOf((byte)bw[1]);
      var10001[bw[5]] = Byte.valueOf((byte)bw[5]);
      Class_ff var3 = new Class_ff();
      var3.b = Class_ed.d;
      var3.c = Class_ed.c;
      var3.d = 14444;
      var3.f = 0;
      var3.e = false;
      var3.a = 0;
      Class_fq.d.addElement(var3);
   }

   private static boolean h(int var0) {
      return var0 < 0;
   }

   private static int b(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static boolean b(Object var0) {
      return var0 != null;
   }

   private static boolean i(int var0) {
      return var0 != 0;
   }

   public static boolean a(int var0, int var1, int var2, int var3, Class_gb var4) {
      int var5 = ah + var4.b;
      int var6 = var4.g + e;
      if (e(ba) && e(c)) {
         return (boolean)bw[0];
      } else {
         return (boolean)(f(var5, var0) && i(var5, var0 + var2) && f(var6, var1) && i(var6, var1 + var3) ? bw[1] : bw[0]);
      }
   }

   public static Class_bc q() {
      if (a((Object)bi)) {
         bi = new Class_bc();
      }

      return bi;
   }

   public static boolean e(int var0, int var1) {
      if (j(var0, Class_dx.ae)) {
         return (boolean)bw[0];
      } else if (g(var0, Class_dx.ae + Class_dx.dy)) {
         return (boolean)bw[0];
      } else if (j(var1, Class_dx.du)) {
         return (boolean)bw[0];
      } else {
         return (boolean)(i(var1, Class_dx.du + Class_dx.bt + bw[65]) ? bw[1] : bw[0]);
      }
   }
}
