public class de.nurogames.android.ticb.base.core._Display {
	 /* .source "_Display.java" */
	 /* # static fields */
	 public static Integer RES_1024x600;
	 public static Integer RES_1024x720;
	 public static Integer RES_1280x720;
	 public static Integer RES_1280x768;
	 public static Integer RES_1280x800;
	 public static Integer RES_1366x768;
	 public static Integer RES_1920x1080;
	 public static Integer RES_1920x1200;
	 public static Integer RES_2540x1600;
	 public static Integer RES_320x240;
	 public static Integer RES_400x240;
	 public static Integer RES_480x320;
	 public static Integer RES_800x480;
	 public static Integer RES_800x600;
	 public static Integer RES_854x480;
	 public static Integer RES_960x540;
	 public static Integer dX;
	 public static Integer dXM;
	 public static Integer dY;
	 public static Integer dYM;
	 public static Boolean isHardwareAccelerated;
	 public static Integer res_id;
	 public static Boolean useHighRes;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.core._Display ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 17 */
		 de.nurogames.android.ticb.base.core._Display.useHighRes = (v1!= 0);
		 /* .line 18 */
		 de.nurogames.android.ticb.base.core._Display.isHardwareAccelerated = (v1!= 0);
		 /* .line 20 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 23 */
		 /* const/16 v0, 0xf */
		 /* .line 24 */
		 /* const/16 v0, 0xe */
		 /* .line 25 */
		 /* const/16 v0, 0xd */
		 /* .line 26 */
		 /* const/16 v0, 0xc */
		 /* .line 27 */
		 /* const/16 v0, 0xb */
		 /* .line 28 */
		 /* const/16 v0, 0xa */
		 /* .line 29 */
		 /* const/16 v0, 0x9 */
		 /* .line 30 */
		 /* const/16 v0, 0x8 */
		 /* .line 31 */
		 int v0 = 7; // const/4 v0, 0x7
		 /* .line 32 */
		 int v0 = 6; // const/4 v0, 0x6
		 /* .line 33 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* .line 34 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* .line 35 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* .line 36 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* .line 37 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 38 */
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.core._Display ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void detectHardwareAcceleration ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* const/high16 v2, 0x1000000 */
		 /* .line 49 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.INFO_OS_VERSION;
		 final String v1 = "3"; // const-string v1, "3"
		 v0 = 		 (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 /* if-nez v0, :cond_0 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.INFO_OS_VERSION;
		 final String v1 = "4"; // const-string v1, "4"
		 v0 = 		 (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 50 */
		 } // :cond_0
		 int v0 = 1; // const/4 v0, 0x1
		 de.nurogames.android.ticb.base.core._Display.isHardwareAccelerated = (v0!= 0);
		 /* .line 51 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.win;
		 (( android.view.Window ) v0 ).setFlags ( v2, v2 ); // invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V
		 /* .line 58 */
	 } // :cond_1
	 return;
} // .end method
public static void setDisplay ( Integer p0, Integer p1 ) {
	 /* .locals 8 */
	 /* .param p0, "dx" # I */
	 /* .param p1, "dy" # I */
	 /* .prologue */
	 /* const/16 v7, 0x1e0 */
	 /* const/16 v6, 0x190 */
	 /* const/16 v5, 0x140 */
	 int v4 = 1; // const/4 v4, 0x1
	 /* const/16 v3, 0x2d0 */
	 /* .line 67 */
	 /* .line 68 */
	 /* .line 69 */
	 /* div-int/lit8 v0, v0, 0x2 */
	 /* .line 70 */
	 /* div-int/lit8 v0, v0, 0x2 */
	 /* .line 71 */
	 v0 = java.lang.System.out;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "DISPLAY RESOLUTION: "; // const-string v2, "DISPLAY RESOLUTION: "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v2 = "x"; // const-string v2, "x"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 74 */
	 de.nurogames.android.ticb.base.core._Display .detectHardwareAcceleration ( );
	 /* .line 79 */
	 /* const/16 v0, 0x1ab */
	 /* if-ne p0, v0, :cond_0 */
	 /* if-eq p1, v5, :cond_3 */
} // :cond_0
/* if-ne p0, v5, :cond_1 */
/* const/16 v0, 0x1ab */
/* if-eq p1, v0, :cond_3 */
/* .line 81 */
} // :cond_1
/* if-ne p0, v5, :cond_2 */
/* const/16 v0, 0xf0 */
/* if-eq p1, v0, :cond_3 */
} // :cond_2
/* const/16 v0, 0xf0 */
/* if-ne p0, v0, :cond_4 */
/* if-ne p1, v5, :cond_4 */
/* .line 84 */
} // :cond_3
/* .line 85 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core._Display.useHighRes = (v0!= 0);
/* .line 288 */
} // :goto_0
return;
/* .line 90 */
} // :cond_4
/* if-ne p0, v6, :cond_5 */
/* const/16 v0, 0xf0 */
/* if-eq p1, v0, :cond_6 */
} // :cond_5
/* if-ne p0, v6, :cond_7 */
/* const/16 v0, 0xf0 */
/* if-ne p1, v0, :cond_7 */
/* .line 93 */
} // :cond_6
/* .line 94 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core._Display.useHighRes = (v0!= 0);
/* .line 98 */
} // :cond_7
/* if-ne p0, v7, :cond_8 */
/* if-eq p1, v5, :cond_9 */
} // :cond_8
/* if-ne p0, v5, :cond_a */
/* if-ne p1, v7, :cond_a */
/* .line 99 */
} // :cond_9
/* .line 100 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core._Display.useHighRes = (v0!= 0);
/* .line 104 */
} // :cond_a
/* const/16 v0, 0x215 */
/* if-ne p0, v0, :cond_b */
/* if-eq p1, v5, :cond_12 */
} // :cond_b
/* if-ne p0, v5, :cond_c */
/* const/16 v0, 0x215 */
/* if-eq p1, v0, :cond_12 */
/* .line 106 */
} // :cond_c
/* const/16 v0, 0x320 */
/* if-ne p0, v0, :cond_d */
/* if-eq p1, v7, :cond_12 */
} // :cond_d
/* if-ne p0, v7, :cond_e */
/* const/16 v0, 0x320 */
/* if-eq p1, v0, :cond_12 */
/* .line 108 */
} // :cond_e
/* const/16 v0, 0x320 */
/* if-ne p0, v0, :cond_f */
/* const/16 v0, 0x1bc */
/* if-eq p1, v0, :cond_12 */
} // :cond_f
/* const/16 v0, 0x1bc */
/* if-ne p0, v0, :cond_10 */
/* const/16 v0, 0x320 */
/* if-eq p1, v0, :cond_12 */
/* .line 110 */
} // :cond_10
/* const/16 v0, 0x2e1 */
/* if-ne p0, v0, :cond_11 */
/* if-eq p1, v7, :cond_12 */
} // :cond_11
/* if-ne p0, v7, :cond_13 */
/* const/16 v0, 0x2e1 */
/* if-ne p1, v0, :cond_13 */
/* .line 113 */
} // :cond_12
/* .line 114 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core._Display.useHighRes = (v0!= 0);
/* .line 118 */
} // :cond_13
/* const/16 v0, 0x239 */
/* if-ne p0, v0, :cond_14 */
/* if-eq p1, v5, :cond_19 */
} // :cond_14
/* if-ne p0, v5, :cond_15 */
/* const/16 v0, 0x239 */
/* if-eq p1, v0, :cond_19 */
/* .line 120 */
} // :cond_15
/* const/16 v0, 0x356 */
/* if-ne p0, v0, :cond_16 */
/* if-eq p1, v7, :cond_19 */
} // :cond_16
/* if-ne p0, v7, :cond_17 */
/* const/16 v0, 0x356 */
/* if-eq p1, v0, :cond_19 */
/* .line 122 */
} // :cond_17
/* const/16 v0, 0x358 */
/* if-ne p0, v0, :cond_18 */
/* if-eq p1, v7, :cond_19 */
} // :cond_18
/* if-ne p0, v7, :cond_1a */
/* const/16 v0, 0x358 */
/* if-ne p1, v0, :cond_1a */
/* .line 125 */
} // :cond_19
/* .line 126 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core._Display.useHighRes = (v0!= 0);
/* goto/16 :goto_0 */
/* .line 130 */
} // :cond_1a
/* const/16 v0, 0x320 */
/* if-ne p0, v0, :cond_1b */
/* const/16 v0, 0x228 */
/* if-eq p1, v0, :cond_1e */
} // :cond_1b
/* const/16 v0, 0x228 */
/* if-ne p0, v0, :cond_1c */
/* const/16 v0, 0x320 */
/* if-eq p1, v0, :cond_1e */
/* .line 132 */
} // :cond_1c
/* const/16 v0, 0x320 */
/* if-ne p0, v0, :cond_1d */
/* const/16 v0, 0x258 */
/* if-eq p1, v0, :cond_1e */
} // :cond_1d
/* const/16 v0, 0x258 */
/* if-ne p0, v0, :cond_1f */
/* const/16 v0, 0x320 */
/* if-ne p1, v0, :cond_1f */
/* .line 135 */
} // :cond_1e
/* .line 136 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core._Display.useHighRes = (v0!= 0);
/* goto/16 :goto_0 */
/* .line 141 */
} // :cond_1f
/* const/16 v0, 0x2ab */
/* if-ne p0, v0, :cond_20 */
/* if-eq p1, v6, :cond_27 */
} // :cond_20
/* if-ne p0, v6, :cond_21 */
/* const/16 v0, 0x2ab */
/* if-eq p1, v0, :cond_27 */
/* .line 143 */
} // :cond_21
/* const/16 v0, 0x3c0 */
/* if-ne p0, v0, :cond_22 */
/* const/16 v0, 0x21c */
/* if-eq p1, v0, :cond_27 */
} // :cond_22
/* const/16 v0, 0x21c */
/* if-ne p0, v0, :cond_23 */
/* const/16 v0, 0x3c0 */
/* if-eq p1, v0, :cond_27 */
/* .line 145 */
} // :cond_23
/* const/16 v0, 0x380 */
/* if-ne p0, v0, :cond_24 */
/* const/16 v0, 0x21c */
/* if-eq p1, v0, :cond_27 */
} // :cond_24
/* const/16 v0, 0x21c */
/* if-ne p0, v0, :cond_25 */
/* const/16 v0, 0x380 */
/* if-eq p1, v0, :cond_27 */
/* .line 147 */
} // :cond_25
/* const/16 v0, 0x3c0 */
/* if-ne p0, v0, :cond_26 */
/* const/16 v0, 0x258 */
/* if-eq p1, v0, :cond_27 */
} // :cond_26
/* const/16 v0, 0x258 */
/* if-ne p0, v0, :cond_28 */
/* const/16 v0, 0x3c0 */
/* if-ne p1, v0, :cond_28 */
/* .line 150 */
} // :cond_27
/* .line 151 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core._Display.useHighRes = (v0!= 0);
/* goto/16 :goto_0 */
/* .line 156 */
} // :cond_28
/* const/16 v0, 0x2ab */
/* if-ne p0, v0, :cond_29 */
/* if-eq p1, v6, :cond_30 */
} // :cond_29
/* if-ne p0, v6, :cond_2a */
/* const/16 v0, 0x2ab */
/* if-eq p1, v0, :cond_30 */
/* .line 158 */
} // :cond_2a
/* const/16 v0, 0x400 */
/* if-ne p0, v0, :cond_2b */
/* const/16 v0, 0x258 */
/* if-eq p1, v0, :cond_30 */
} // :cond_2b
/* const/16 v0, 0x258 */
/* if-ne p0, v0, :cond_2c */
/* const/16 v0, 0x400 */
/* if-eq p1, v0, :cond_30 */
/* .line 160 */
} // :cond_2c
/* const/16 v0, 0x400 */
/* if-ne p0, v0, :cond_2d */
/* const/16 v0, 0x228 */
/* if-eq p1, v0, :cond_30 */
} // :cond_2d
/* const/16 v0, 0x228 */
/* if-ne p0, v0, :cond_2e */
/* const/16 v0, 0x400 */
/* if-eq p1, v0, :cond_30 */
/* .line 162 */
} // :cond_2e
/* const/16 v0, 0x3d0 */
/* if-ne p0, v0, :cond_2f */
/* const/16 v0, 0x258 */
/* if-eq p1, v0, :cond_30 */
} // :cond_2f
/* const/16 v0, 0x258 */
/* if-ne p0, v0, :cond_31 */
/* const/16 v0, 0x3d0 */
/* if-ne p1, v0, :cond_31 */
/* .line 165 */
} // :cond_30
/* .line 166 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 171 */
} // :cond_31
/* const/16 v0, 0x400 */
/* if-ne p0, v0, :cond_32 */
/* if-eq p1, v3, :cond_33 */
} // :cond_32
/* if-ne p0, v3, :cond_34 */
/* const/16 v0, 0x400 */
/* if-ne p1, v0, :cond_34 */
/* .line 174 */
} // :cond_33
/* .line 175 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 180 */
} // :cond_34
/* const/16 v0, 0x2f0 */
/* if-ne p0, v0, :cond_35 */
/* const/16 v0, 0x500 */
/* if-eq p1, v0, :cond_38 */
} // :cond_35
/* const/16 v0, 0x500 */
/* if-ne p0, v0, :cond_36 */
/* const/16 v0, 0x2f0 */
/* if-eq p1, v0, :cond_38 */
/* .line 182 */
} // :cond_36
/* const/16 v0, 0x500 */
/* if-ne p0, v0, :cond_37 */
/* const/16 v0, 0x2e0 */
/* if-eq p1, v0, :cond_38 */
} // :cond_37
/* const/16 v0, 0x2e0 */
/* if-ne p0, v0, :cond_39 */
/* const/16 v0, 0x500 */
/* if-ne p1, v0, :cond_39 */
/* .line 185 */
} // :cond_38
/* .line 186 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 191 */
} // :cond_39
/* const/16 v0, 0x2ab */
/* if-ne p0, v0, :cond_3a */
/* if-eq p1, v6, :cond_3d */
} // :cond_3a
/* if-ne p0, v6, :cond_3b */
/* const/16 v0, 0x2ab */
/* if-eq p1, v0, :cond_3d */
/* .line 193 */
} // :cond_3b
/* const/16 v0, 0x500 */
/* if-ne p0, v0, :cond_3c */
/* const/16 v0, 0x320 */
/* if-eq p1, v0, :cond_3d */
} // :cond_3c
/* const/16 v0, 0x320 */
/* if-ne p0, v0, :cond_40 */
/* const/16 v0, 0x500 */
/* if-ne p1, v0, :cond_40 */
/* .line 196 */
} // :cond_3d
v0 = de.nurogames.android.ticb.base.tinysanta.INFO_OS_VERSION;
final String v1 = "3"; // const-string v1, "3"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_3e */
v0 = de.nurogames.android.ticb.base.tinysanta.INFO_OS_VERSION;
final String v1 = "4"; // const-string v1, "4"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_3f
/* .line 197 */
} // :cond_3e
/* add-int/lit8 v0, v0, -0x30 */
/* .line 199 */
} // :cond_3f
/* .line 200 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 205 */
} // :cond_40
/* const/16 v0, 0x4a0 */
/* if-ne p0, v0, :cond_41 */
/* if-eq p1, v3, :cond_46 */
} // :cond_41
/* if-ne p0, v3, :cond_42 */
/* const/16 v0, 0x4a0 */
/* if-eq p1, v0, :cond_46 */
/* .line 207 */
} // :cond_42
/* const/16 v0, 0x4ac */
/* if-ne p0, v0, :cond_43 */
/* if-eq p1, v3, :cond_46 */
} // :cond_43
/* if-ne p0, v3, :cond_44 */
/* const/16 v0, 0x4ac */
/* if-eq p1, v0, :cond_46 */
/* .line 209 */
} // :cond_44
/* const/16 v0, 0x500 */
/* if-ne p0, v0, :cond_45 */
/* if-eq p1, v3, :cond_46 */
} // :cond_45
/* if-ne p0, v3, :cond_47 */
/* const/16 v0, 0x500 */
/* if-ne p1, v0, :cond_47 */
/* .line 212 */
} // :cond_46
/* .line 213 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 218 */
} // :cond_47
/* const/16 v0, 0x4ac */
/* if-ne p0, v0, :cond_48 */
/* const/16 v0, 0x300 */
/* if-eq p1, v0, :cond_4b */
} // :cond_48
/* const/16 v0, 0x300 */
/* if-ne p0, v0, :cond_49 */
/* const/16 v0, 0x4ac */
/* if-eq p1, v0, :cond_4b */
/* .line 220 */
} // :cond_49
/* const/16 v0, 0x4a0 */
/* if-ne p0, v0, :cond_4a */
/* const/16 v0, 0x300 */
/* if-eq p1, v0, :cond_4b */
} // :cond_4a
/* const/16 v0, 0x300 */
/* if-ne p0, v0, :cond_4c */
/* const/16 v0, 0x4a0 */
/* if-ne p1, v0, :cond_4c */
/* .line 223 */
} // :cond_4b
/* .line 224 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 229 */
} // :cond_4c
/* const/16 v0, 0x2ab */
/* if-ne p0, v0, :cond_4d */
/* if-eq p1, v6, :cond_56 */
} // :cond_4d
/* if-ne p0, v6, :cond_4e */
/* const/16 v0, 0x2ab */
/* if-eq p1, v0, :cond_56 */
/* .line 231 */
} // :cond_4e
/* const/16 v0, 0x556 */
/* if-ne p0, v0, :cond_4f */
/* const/16 v0, 0x300 */
/* if-eq p1, v0, :cond_56 */
} // :cond_4f
/* const/16 v0, 0x300 */
/* if-ne p0, v0, :cond_50 */
/* const/16 v0, 0x556 */
/* if-eq p1, v0, :cond_56 */
/* .line 233 */
} // :cond_50
/* const/16 v0, 0x556 */
/* if-ne p0, v0, :cond_51 */
/* if-eq p1, v3, :cond_56 */
} // :cond_51
/* if-ne p0, v3, :cond_52 */
/* const/16 v0, 0x556 */
/* if-eq p1, v0, :cond_56 */
/* .line 235 */
} // :cond_52
/* const/16 v0, 0x558 */
/* if-ne p0, v0, :cond_53 */
/* if-eq p1, v3, :cond_56 */
} // :cond_53
/* if-ne p0, v3, :cond_54 */
/* const/16 v0, 0x558 */
/* if-eq p1, v0, :cond_56 */
/* .line 237 */
} // :cond_54
/* const/16 v0, 0x558 */
/* if-ne p0, v0, :cond_55 */
/* const/16 v0, 0x300 */
/* if-eq p1, v0, :cond_56 */
} // :cond_55
/* const/16 v0, 0x300 */
/* if-ne p0, v0, :cond_57 */
/* const/16 v0, 0x558 */
/* if-ne p1, v0, :cond_57 */
/* .line 240 */
} // :cond_56
/* .line 241 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 246 */
} // :cond_57
/* const/16 v0, 0xa00 */
/* if-ne p0, v0, :cond_58 */
/* const/16 v0, 0x5e0 */
/* if-eq p1, v0, :cond_5b */
} // :cond_58
/* const/16 v0, 0x5e0 */
/* if-ne p0, v0, :cond_59 */
/* const/16 v0, 0xa00 */
/* if-eq p1, v0, :cond_5b */
/* .line 248 */
} // :cond_59
/* const/16 v0, 0xa00 */
/* if-ne p0, v0, :cond_5a */
/* const/16 v0, 0x5e0 */
/* if-eq p1, v0, :cond_5b */
} // :cond_5a
/* const/16 v0, 0x5e0 */
/* if-ne p0, v0, :cond_5c */
/* const/16 v0, 0xa00 */
/* if-ne p1, v0, :cond_5c */
/* .line 251 */
} // :cond_5b
/* .line 252 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 257 */
} // :cond_5c
/* const/16 v0, 0x780 */
/* if-ne p0, v0, :cond_5d */
/* const/16 v0, 0x450 */
/* if-eq p1, v0, :cond_60 */
} // :cond_5d
/* const/16 v0, 0x450 */
/* if-ne p0, v0, :cond_5e */
/* const/16 v0, 0x780 */
/* if-eq p1, v0, :cond_60 */
/* .line 259 */
} // :cond_5e
/* const/16 v0, 0x780 */
/* if-ne p0, v0, :cond_5f */
/* const/16 v0, 0x450 */
/* if-eq p1, v0, :cond_60 */
} // :cond_5f
/* const/16 v0, 0x450 */
/* if-ne p0, v0, :cond_61 */
/* const/16 v0, 0x780 */
/* if-ne p1, v0, :cond_61 */
/* .line 262 */
} // :cond_60
/* .line 263 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 269 */
} // :cond_61
/* const/16 v0, 0x72c */
/* if-ne p0, v0, :cond_62 */
/* const/16 v0, 0x438 */
/* if-eq p1, v0, :cond_69 */
} // :cond_62
/* const/16 v0, 0x438 */
/* if-ne p0, v0, :cond_63 */
/* const/16 v0, 0x72c */
/* if-eq p1, v0, :cond_69 */
/* .line 271 */
} // :cond_63
/* const/16 v0, 0x72c */
/* if-ne p0, v0, :cond_64 */
/* const/16 v0, 0x438 */
/* if-eq p1, v0, :cond_69 */
} // :cond_64
/* const/16 v0, 0x438 */
/* if-ne p0, v0, :cond_65 */
/* const/16 v0, 0x72c */
/* if-eq p1, v0, :cond_69 */
/* .line 273 */
} // :cond_65
/* const/16 v0, 0x720 */
/* if-ne p0, v0, :cond_66 */
/* const/16 v0, 0x438 */
/* if-eq p1, v0, :cond_69 */
} // :cond_66
/* const/16 v0, 0x438 */
/* if-ne p0, v0, :cond_67 */
/* const/16 v0, 0x720 */
/* if-eq p1, v0, :cond_69 */
/* .line 275 */
} // :cond_67
/* const/16 v0, 0x702 */
/* if-ne p0, v0, :cond_68 */
/* const/16 v0, 0x438 */
/* if-eq p1, v0, :cond_69 */
} // :cond_68
/* const/16 v0, 0x438 */
/* if-ne p0, v0, :cond_6a */
/* const/16 v0, 0x702 */
/* if-ne p1, v0, :cond_6a */
/* .line 278 */
} // :cond_69
/* .line 279 */
de.nurogames.android.ticb.base.core._Display.useHighRes = (v4!= 0);
/* goto/16 :goto_0 */
/* .line 284 */
} // :cond_6a
/* .line 285 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core._Display.useHighRes = (v0!= 0);
/* goto/16 :goto_0 */
} // .end method
