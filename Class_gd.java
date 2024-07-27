import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class Class_gd {
   // $FF: synthetic field
   public byte[] a;
   // $FF: synthetic field
   private Class_ge t;
   // $FF: synthetic field
   private static final int[] u;
   // $FF: synthetic field
   public byte[] b;
   // $FF: synthetic field
   public Class_ge c = new Class_ge();
   // $FF: synthetic field
   private Class_ge v;
   // $FF: synthetic field
   public byte[] d;
   // $FF: synthetic field
   private byte w;
   // $FF: synthetic field
   private boolean x;
   // $FF: synthetic field
   private Class_ge y;
   // $FF: synthetic field
   public byte e;
   // $FF: synthetic field
   private byte[] z;
   // $FF: synthetic field
   public byte[] f;
   // $FF: synthetic field
   public boolean g;
   // $FF: synthetic field
   public byte h;
   // $FF: synthetic field
   private Class_ge aa;
   // $FF: synthetic field
   public byte[] i;
   // $FF: synthetic field
   private Class_ge ab;
   // $FF: synthetic field
   public byte[] j;
   // $FF: synthetic field
   public byte[] k;
   // $FF: synthetic field
   public boolean l;
   // $FF: synthetic field
   public boolean m;
   // $FF: synthetic field
   private byte[][] ac;
   // $FF: synthetic field
   public short n;
   // $FF: synthetic field
   private long ad;
   // $FF: synthetic field
   public byte[] o;
   // $FF: synthetic field
   private byte ae;
   // $FF: synthetic field
   private Class_ge af;
   // $FF: synthetic field
   private Class_ge ag;
   // $FF: synthetic field
   public byte p;
   // $FF: synthetic field
   public int q;
   // $FF: synthetic field
   private boolean ah;
   // $FF: synthetic field
   private Class_by[] ai;
   // $FF: synthetic field
   public long r;
   // $FF: synthetic field
   private byte aj;
   // $FF: synthetic field
   public long s;

   private boolean b() {
      if (a(this.g)) {
         return (boolean)u[9];
      } else {
         this.a((byte[])null);
         return (boolean)u[1];
      }
   }

   private static boolean a(int var0, int var1) {
      return var0 < var1;
   }

   public Class_gd(short var1, boolean var2) {
      new Class_ge();
      this.ac = new byte[u[0]][];
      new Class_ge();
      this.n = (short)u[1];
      this.w = (byte)u[1];
      this.z = new byte[u[0]];
      this.l = (boolean)u[1];
      this.v = new Class_ge();
      this.y = new Class_ge();
      this.ag = new Class_ge();
      this.aa = new Class_ge();
      this.ab = new Class_ge();
      this.t = new Class_ge();
      this.af = new Class_ge();
      new Class_ge();
      this.n = var1;
      this.x = var2;
      this.a((byte[])null);
   }

   private static byte[] a(Class_ge var0) {
      Object var1 = null;
      byte[] var2 = new byte[var0.size()];
      int var3 = u[1];
      "".length();
      if (-" ".length() >= (66 ^ 108 ^ 136 ^ 162)) {
         return null;
      } else {
         while(!c(var3, var2.length)) {
            var2[var3] = Byte.parseByte((String)var0.elementAt(var3));
            ++var3;
         }

         return var2;
      }
   }

   private static int a(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static boolean b(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean c(int var0, int var1) {
      return var0 >= var1;
   }

   static {
      c();
      new Class_fk();
   }

   private static boolean a(int var0) {
      return var0 != 0;
   }

   public final void a(Class_er var1, int var2, int var3) {
      try {
         if (!a(this.b()) || a(this.ah)) {
            return;
         }

         if (a(this.ae, this.c.size())) {
            Class_ge var4 = ((Class_em)this.c.elementAt(this.ae)).b;
            int var5 = u[1];
            "".length();
            if (" ".length() <= 0) {
               return;
            }

            for(; !c(var5, var4.size()); ++var5) {
               Class_bq var6 = (Class_bq)var4.elementAt(var5);
               Class_by var7 = this.ai[var6.a];
               Class_bj var8;
               if (a((Object)(var8 = Class_bx.a(this.n))) && a((Object)var8.a)) {
                  short var9 = var6.d;
                  int var10 = var7.d;
                  int var11 = var7.b;
                  int var12 = var7.c;
                  int var13 = var7.e;
                  if (e(var12, var8.a.getWidth())) {
                     var12 = u[1];
                  }

                  if (e(var13, var8.a.getHeight())) {
                     var13 = u[1];
                  }

                  if (e(var12 + var10, var8.a.getWidth())) {
                     var10 = var8.a.getWidth() - var12;
                  }

                  if (e(var13 + var11, var8.a.getHeight())) {
                     var11 = var8.a.getHeight() - var13;
                  }

                  Image var10001 = var8.a;
                  int var10006;
                  if (b(var6.c, u[9])) {
                     var10006 = u[2];
                     "".length();
                     if (" ".length() <= 0) {
                        return;
                     }
                  } else {
                     var10006 = u[1];
                  }

                  var1.a(var10001, var12, var13, var10, var11, var10006, var2 + var9, var3 + var6.b, u[1]);
               }
            }

            return;
         }
      } catch (Exception var14) {
         var14.printStackTrace();
         System.err.println(String.valueOf((new StringBuilder("Err DataSkillEff  paintBottomEff:")).append(this.n)));
      }

   }

   public Class_gd(short var1, long var2, int var4, boolean var5) {
      new Class_ge();
      this.ac = new byte[u[0]][];
      new Class_ge();
      this.n = (short)u[1];
      this.w = (byte)u[1];
      this.z = new byte[u[0]];
      this.l = (boolean)u[1];
      this.v = new Class_ge();
      this.y = new Class_ge();
      this.ag = new Class_ge();
      this.aa = new Class_ge();
      this.ab = new Class_ge();
      this.t = new Class_ge();
      this.af = new Class_ge();
      new Class_ge();
      this.n = var1;
      this.r = var2;
      this.q = var4;
      this.l = var5;
      this.a((byte[])null);
      if (b(b(var2, -1L))) {
         this.w = (byte)u[4];
         "".length();
         if (null != null) {
            throw null;
         }
      } else if (b(b(var2, 0L))) {
         this.w = (byte)u[9];
         "".length();
         if (((115 + 187 - 238 + 169 ^ 27 + 4 - -148 + 15) & (91 + 99 - 130 + 94 ^ 157 + 55 - 43 + 8 ^ -" ".length())) != ((187 ^ 130 ^ 95 ^ 85) & (202 ^ 163 ^ 82 ^ 8 ^ -" ".length()))) {
            throw null;
         }
      } else {
         this.r += System.currentTimeMillis();
         this.w = (byte)u[2];
      }

   }

   public final void a(Class_er var1, int var2, int var3, int var4, int var5) {
      if (a(this.b()) && a(var4, this.c.size())) {
         Class_em var6 = (Class_em)this.c.elementAt(var4);

         try {
            Class_ge var7 = var6.b;
            int var8 = u[1];
            "".length();
            if (-" ".length() == (190 ^ 186)) {
               return;
            }

            for(; !c(var8, var7.size()); ++var8) {
               Class_bq var9 = (Class_bq)var7.elementAt(var8);
               Class_by var10 = this.ai[var9.a];
               Class_bj var11;
               if (a((Object)(var11 = Class_bx.a(this.n))) && a((Object)var11.a)) {
                  int var12 = var9.d;
                  int var13 = var10.d;
                  int var14 = var10.b;
                  int var15 = var10.c;
                  int var16 = var10.e;
                  int var17 = var11.a.getWidth();
                  int var18 = var11.a.getHeight();
                  if (e(var15, var17)) {
                     var15 = u[1];
                  }

                  if (e(var16, var18)) {
                     var16 = u[1];
                  }

                  if (e(var15 + var13, var17)) {
                     var13 = var17 - var15;
                  }

                  if (e(var16 + var14, var18)) {
                     var14 = var18 - var16;
                  }

                  int var10000;
                  if (b(var9.c, u[9])) {
                     var10000 = u[2];
                     "".length();
                     if (-"   ".length() > 0) {
                        return;
                     }
                  } else {
                     var10000 = u[1];
                  }

                  var17 = var10000;
                  if (!d(var5, u[2]) || b(var5, u[6])) {
                     if (b(var17, u[2])) {
                        var17 = u[1];
                        "".length();
                        if (-(92 ^ 88) >= 0) {
                           return;
                        }
                     } else {
                        var17 = u[2];
                     }

                     var12 = -(var12 + var13);
                  }

                  var1.a(var11.a, var15, var16, var13, var14, var17, var2 + var12, var3 + var9.b, u[1]);
               }
            }

            return;
         } catch (Exception var19) {
            var19.printStackTrace();
         }
      }

   }

   private static boolean d(int var0, int var1) {
      return var0 != var1;
   }

   private void a(boolean var1) {
      if (c(this.q)) {
         this.ah = var1;
         if (a(this.ah)) {
            this.ad = System.currentTimeMillis() + (long)this.q;
            return;
         }
      } else {
         this.ah = (boolean)u[1];
      }

   }

   public final void a(long var1) {
      if (b(a(var1, -1L))) {
         this.w = (byte)u[4];
         "".length();
         if ((26 ^ 30) == -" ".length()) {
            return;
         }
      } else if (b(a(var1, 0L))) {
         this.w = (byte)u[9];
         "".length();
         if (((53 + 1 - 27 + 107 ^ 96 + 60 - 124 + 153) & (72 + 37 - 83 + 104 ^ 58 + 157 - 84 + 58 ^ -" ".length())) >= "   ".length()) {
            return;
         }
      } else {
         this.w = (byte)u[2];
      }

   }

   private static boolean b(int var0) {
      return var0 == 0;
   }

   private static boolean a(Object var0) {
      return var0 != null;
   }

   public final void a() {
      if (c(this.c.size())) {
         try {
            if (b(this.ah)) {
               byte var2 = this.w;
               if (d(var2, (15 ^ 23) & ~(218 ^ 194))) {
                  if (d(var2, " ".length())) {
                     if (d(var2, "  ".length())) {
                        if (d(var2, "   ".length())) {
                           "".length();
                           if (" ".length() < 0) {
                              return;
                           }

                           return;
                        }

                        this.aj = (byte)(this.aj + u[9]);
                        if (e(this.aj, this.j.length)) {
                           this.aj = (byte)u[1];
                           this.a((boolean)u[9]);
                        }

                        this.ae = this.j[this.aj];
                        return;
                     }

                     this.aj = (byte)(this.aj + u[9]);
                     if (d(c(this.r - System.currentTimeMillis(), 0L))) {
                        this.m = (boolean)u[9];
                     }

                     if (e(this.aj, this.j.length)) {
                        this.aj = (byte)u[1];
                     }

                     this.ae = this.j[this.aj];
                     return;
                  }

                  this.aj = (byte)(this.aj + u[9]);
                  if (e(this.aj, this.j.length)) {
                     this.aj = (byte)u[1];
                     this.m = (boolean)u[9];
                  }

                  this.ae = this.j[this.aj];
                  return;
               }

               this.aj = (byte)(this.aj + u[9]);
               if (e(this.aj, this.j.length)) {
                  this.m = (boolean)u[9];
                  this.aj = (byte)u[1];
               }

               this.ae = this.j[this.aj];
               return;
            }

            if (d(c(this.ad - System.currentTimeMillis(), 0L))) {
               this.a((boolean)u[1]);
               return;
            }
         } catch (Exception var3) {
         }
      }

   }

   public final void b(Class_er var1, int var2, int var3, int var4, int var5) {
      if (a(this.b()) && a(var4, this.c.size())) {
         Class_em var6 = (Class_em)this.c.elementAt(var4);

         try {
            Class_ge var7 = var6.a;
            int var8 = u[1];
            "".length();
            if (null != null) {
               return;
            }

            for(; !c(var8, var7.size()); ++var8) {
               Class_bq var9 = (Class_bq)var7.elementAt(var8);
               Class_by var10 = this.ai[var9.a];
               Class_bj var11;
               if (a((Object)(var11 = Class_bx.a(this.n))) && a((Object)var11.a)) {
                  int var12 = var9.d;
                  int var13 = var10.d;
                  int var14 = var10.b;
                  int var15 = var10.c;
                  int var16 = var10.e;
                  int var17 = var11.a.getWidth();
                  int var18 = var11.a.getHeight();
                  if (e(var15, var17)) {
                     var15 = u[1];
                  }

                  if (e(var16, var18)) {
                     var16 = u[1];
                  }

                  if (e(var15 + var13, var17)) {
                     var13 = var17 - var15;
                  }

                  if (e(var16 + var14, var18)) {
                     var14 = var18 - var16;
                  }

                  int var10000;
                  if (b(var9.c, u[9])) {
                     var10000 = u[2];
                     "".length();
                     if ("  ".length() < 0) {
                        return;
                     }
                  } else {
                     var10000 = u[1];
                  }

                  var17 = var10000;
                  if (!d(var5, u[2]) || b(var5, u[6])) {
                     if (b(var17, u[2])) {
                        var17 = u[1];
                        "".length();
                        if ("  ".length() < " ".length()) {
                           return;
                        }
                     } else {
                        var17 = u[2];
                     }

                     var12 = -(var12 + var13);
                  }

                  var1.a(var11.a, var15, var16, var13, var14, var17, var2 + var12, var3 + var9.b, u[1]);
               }
            }

            return;
         } catch (Exception var19) {
            var19.printStackTrace();
         }
      }

   }

   private static int b(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static int c(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private void a(byte[] var1) {
      try {
         Class_ar var2;
         if (a((Object)(var2 = (Class_ar)Class_bx.a.a(String.valueOf((new StringBuilder()).append(this.n))))) && a((Object)var2.a)) {
            var1 = var2.a;
         }

         if (b((Object)var2)) {
            var2 = new Class_ar();
            Class_bx.a.a(String.valueOf((new StringBuilder()).append(this.n)), var2);
            Class_ao.a().u(this.n);
            System.currentTimeMillis();
         }

         if (a((Object)var1) && c(var1.length)) {
            this.b(var1);
            return;
         }
      } catch (Exception var3) {
      }

   }

   private static boolean b(Object var0) {
      return var0 == null;
   }

   private static boolean c(int var0) {
      return var0 > 0;
   }

   private void b(byte[] var1) {
      if (a((Object)var1)) {
         DataInputStream var2 = null;
         boolean var19 = false;

         label491: {
            try {
               try {
                  var19 = true;
                  this.c.removeAllElements();
                  this.ai = null;
                  byte var3 = (var2 = new DataInputStream(new ByteArrayInputStream(var1))).readByte();
                  this.ai = new Class_by[var3];
                  int var4 = u[1];
                  "".length();
                  if (" ".length() <= 0) {
                     return;
                  }

                  while(!c(var4, var3)) {
                     this.ai[var4] = new Class_by(var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte());
                     ++var4;
                  }

                  short var5 = var2.readShort();
                  var4 = u[1];
                  "".length();
                  if ((59 ^ 64 ^ 15 + 109 - 103 + 106) < "  ".length()) {
                     return;
                  }

                  while(!c(var4, var5)) {
                     byte var6 = var2.readByte();
                     Class_ge var7 = new Class_ge();
                     Class_ge var8 = new Class_ge();
                     int var9 = u[1];
                     "".length();
                     if (null != null) {
                        return;
                     }

                     for(; !c(var9, var6); ++var9) {
                        Class_bq var10;
                        (var10 = new Class_bq(var2.readShort(), var2.readShort(), var2.readByte())).c = var2.readByte();
                        var10.e = var2.readByte();
                        if (b(var10.e)) {
                           var7.addElement(var10);
                           "".length();
                           if ((76 ^ 72) <= "   ".length()) {
                              return;
                           }
                        } else {
                           var8.addElement(var10);
                        }
                     }

                     this.c.addElement(new Class_em(var7, var8));
                     ++var4;
                  }

                  short var26 = (short)var2.readUnsignedByte();
                  this.j = new byte[var26];
                  int var27 = u[1];
                  int var28 = u[1];
                  "".length();
                  if (((118 ^ 97 ^ 237 ^ 177) & (36 + 69 - 45 + 165 ^ 162 + 140 - 288 + 156 ^ -" ".length())) < 0) {
                     return;
                  }

                  for(; !c(var28, var26); ++var28) {
                     this.j[var28] = (byte)var2.readShort();
                     if (a(this.x)) {
                        if (b(var27, u[2]) && d(this.j[var28], u[3])) {
                           this.v.addElement(String.valueOf(this.j[var28]));
                        }

                        if (b(var27, u[4]) && d(this.j[var28], u[3])) {
                           this.y.addElement(String.valueOf(this.j[var28]));
                        }

                        if (b(var27, u[0]) && d(this.j[var28], u[3])) {
                           this.ag.addElement(String.valueOf(this.j[var28]));
                        }

                        if (b(var27, u[5]) && d(this.j[var28], u[3])) {
                           this.aa.addElement(String.valueOf(this.j[var28]));
                        }

                        if (b(var27, u[6]) && d(this.j[var28], u[3])) {
                           this.ab.addElement(String.valueOf(this.j[var28]));
                        }

                        if (b(var27, u[7]) && d(this.j[var28], u[3])) {
                           this.t.addElement(String.valueOf(this.j[var28]));
                        }

                        if (b(var27, u[8]) && d(this.j[var28], u[3])) {
                           this.af.addElement(String.valueOf(this.j[var28]));
                        }

                        if (b(this.j[var28], u[3])) {
                           ++var27;
                        }
                     }
                  }

                  if (a(this.x)) {
                     this.e = this.j[u[1]];
                     this.h = this.j[u[2]];
                     this.p = this.j[u[4]];
                     this.d = a(this.v);
                     this.b = a(this.y);
                     this.i = a(this.ag);
                     this.k = a(this.aa);
                     this.a = a(this.ab);
                     this.f = a(this.t);
                     if (!a((Object)this.f) || b(this.f.length)) {
                        this.f = new byte[this.e];
                     }

                     this.o = a(this.af);
                     if (!a((Object)this.o) || b(this.o.length)) {
                        this.o = new byte[this.e];
                     }

                     this.v.removeAllElements();
                     this.y.removeAllElements();
                     this.ag.removeAllElements();
                     this.aa.removeAllElements();
                     this.ab.removeAllElements();
                     this.t.removeAllElements();
                     this.af.removeAllElements();
                  }

                  var2.readByte();
                  "".length();
                  byte var29 = var2.readByte();
                  this.ac[u[1]] = new byte[var29];
                  var28 = u[1];
                  "".length();
                  if (-"  ".length() >= 0) {
                     return;
                  }

                  while(!c(var28, var29)) {
                     this.ac[u[1]][var28] = var2.readByte();
                     ++var28;
                  }

                  var29 = var2.readByte();
                  this.ac[u[9]] = new byte[var29];
                  var28 = u[1];
                  "".length();
                  if (null != null) {
                     return;
                  }

                  while(!c(var28, var29)) {
                     this.ac[u[9]][var28] = var2.readByte();
                     ++var28;
                  }

                  var29 = var2.readByte();
                  this.ac[u[4]] = new byte[var29];
                  var28 = u[1];
                  "".length();
                  if ((105 ^ 108) == 0) {
                     return;
                  }

                  while(!c(var28, var29)) {
                     this.ac[u[4]][var28] = var2.readByte();
                     ++var28;
                  }

                  this.g = (boolean)u[9];

                  label446: {
                     try {
                        this.z[u[1]] = (byte)(this.ac[u[1]].length - u[7]);
                        this.z[u[9]] = (byte)(this.ac[u[9]].length - u[7]);
                        this.z[u[2]] = (byte)(this.ac[u[4]].length - u[7]);
                        this.z[u[4]] = (byte)(this.ac[u[4]].length - u[7]);
                     } catch (Exception var23) {
                        break label446;
                     }

                     "".length();
                     if ((60 ^ 56) <= "  ".length()) {
                        return;
                     }
                  }

                  this.z[u[1]] = var2.readByte();
                  this.z[u[9]] = var2.readByte();
                  this.z[u[2]] = var2.readByte();
                  this.z[u[4]] = this.z[u[2]];
               } catch (Exception var24) {
                  var19 = false;
                  break label491;
               }

               "".length();
               if (null != null) {
                  return;
               }

               var19 = false;
            } finally {
               if (var19) {
                  label374: {
                     try {
                        var2.close();
                     } catch (Exception var20) {
                        break label374;
                     }

                     "".length();
                     if (null != null) {
                        return;
                     }
                  }

               }
            }

            try {
               var2.close();
            } catch (Exception var21) {
               return;
            }

            "".length();
            if (((12 + 59 - -16 + 84 ^ 37 + 135 - 19 + 2) & (254 ^ 191 ^ 12 ^ 125 ^ -" ".length())) > 0) {
               return;
            }

            return;
         }

         try {
            var2.close();
         } catch (Exception var22) {
            "".length();
            if ((83 + 58 - 13 + 67 ^ 8 + 39 - -79 + 73) != (107 ^ 102 ^ 202 ^ 195)) {
               return;
            }

            return;
         }

         "".length();
         if ("   ".length() <= 0) {
            return;
         }
      }

   }

   private static boolean d(int var0) {
      return var0 < 0;
   }

   private static void c() {
      u = new int[10];
      u[0] = 94 ^ 26 ^ 209 ^ 145;
      u[1] = (210 ^ 144) & ~(234 ^ 168);
      u[2] = "  ".length();
      u[3] = -" ".length();
      u[4] = "   ".length();
      u[5] = 127 + 77 - 76 + 47 ^ 127 + 109 - 160 + 94;
      u[6] = 104 + 107 - 113 + 31 ^ 65 + 78 - 10 + 2;
      u[7] = 77 + 57 - 49 + 82 ^ 25 + 81 - -43 + 11;
      u[8] = 206 ^ 198;
      u[9] = " ".length();
   }

   private static boolean e(int var0, int var1) {
      return var0 > var1;
   }

   public final void b(Class_er var1, int var2, int var3) {
      try {
         if (!a(this.b()) || a(this.ah)) {
            return;
         }

         if (a(this.ae, this.c.size())) {
            Class_ge var4 = ((Class_em)this.c.elementAt(this.ae)).a;
            int var5 = u[1];
            "".length();
            if ("   ".length() == ((81 ^ 28 ^ 9 ^ 108) & (38 + 15 - -96 + 83 ^ 100 + 10 - 79 + 161 ^ -" ".length()))) {
               return;
            }

            for(; !c(var5, var4.size()); ++var5) {
               Class_bq var6 = (Class_bq)var4.elementAt(var5);
               Class_by var7 = this.ai[var6.a];
               Class_bj var8;
               if (a((Object)(var8 = Class_bx.a(this.n))) && a((Object)var8.a)) {
                  short var9 = var6.d;
                  int var10 = var7.d;
                  int var11 = var7.b;
                  int var12 = var7.c;
                  int var13 = var7.e;
                  if (e(var12, var8.a.getWidth())) {
                     var12 = u[1];
                  }

                  if (e(var13, var8.a.getHeight())) {
                     var13 = u[1];
                  }

                  if (e(var12 + var10, var8.a.getWidth())) {
                     var10 = var8.a.getWidth() - var12;
                  }

                  if (e(var13 + var11, var8.a.getHeight())) {
                     var11 = var8.a.getHeight() - var13;
                  }

                  Image var10001 = var8.a;
                  int var10006;
                  if (b(var6.c, u[9])) {
                     var10006 = u[2];
                     "".length();
                     if (" ".length() < 0) {
                        return;
                     }
                  } else {
                     var10006 = u[1];
                  }

                  var1.a(var10001, var12, var13, var10, var11, var10006, var2 + var9, var3 + var6.b, u[1]);
               }
            }

            return;
         }
      } catch (Exception var14) {
         var14.printStackTrace();
         System.err.println(String.valueOf((new StringBuilder("Err DataSkillEff  paintBottomEff:")).append(this.n)));
      }

   }

   public Class_gd() {
      new Class_ge();
      this.ac = new byte[u[0]][];
      new Class_ge();
      this.n = (short)u[1];
      this.w = (byte)u[1];
      this.z = new byte[u[0]];
      this.l = (boolean)u[1];
      this.v = new Class_ge();
      this.y = new Class_ge();
      this.ag = new Class_ge();
      this.aa = new Class_ge();
      this.ab = new Class_ge();
      this.t = new Class_ge();
      this.af = new Class_ge();
      new Class_ge();
   }
}
