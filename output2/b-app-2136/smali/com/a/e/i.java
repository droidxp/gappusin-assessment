public class com.a.e.i extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback implements java.lang.Runnable {
	 /* # interfaces */
	 /* # static fields */
	 public static Integer A;
	 public static Integer B;
	 public static Boolean C;
	 public static java.lang.String D;
	 public static Integer E;
	 public static java.lang.String F;
	 public static java.lang.String G;
	 public static java.lang.String H;
	 public static java.lang.String I;
	 public static Integer L;
	 public static com.a.a.a a;
	 private static ad; //synthetic
	 public static com.a.e.f j;
	 public static Integer k;
	 public static Boolean l;
	 public static Boolean m;
	 static android.content.Context u;
	 public static com.a.f.m v;
	 public static Boolean x;
	 public static Integer y;
	 public static Integer z;
	 /* # instance fields */
	 public Boolean J;
	 public Boolean K;
	 public Integer M;
	 public java.lang.String N;
	 public java.lang.String O;
	 android.graphics.Paint P;
	 private android.view.SurfaceHolder Q;
	 private android.graphics.Paint R;
	 private android.graphics.Paint S;
	 private Boolean T;
	 private Float U;
	 private Float V;
	 private Float W;
	 private Float Z;
	 private Float aa;
	 private android.graphics.Canvas ab;
	 private Long ac;
	 public com.a.c.g b;
	 public com.a.e.e c;
	 public com.a.e.l d;
	 public com.a.e.h e;
	 public com.a.e.g f;
	 public com.a.e.b g;
	 public com.a.e.a h;
	 public com.a.e.d i;
	 public com.a.e.m n;
	 public com.a.e.c o;
	 public com.a.f.l p;
	 java.lang.Thread q;
	 public com.a.e.n r;
	 public com.a.d.d s;
	 public com.a.d.a t;
	 public Boolean w;
	 /* # direct methods */
	 static com.a.e.i ( ) {
		 /* .locals 2 */
		 int v1 = 1; // const/4 v1, 0x1
		 int v0 = 0; // const/4 v0, 0x0
		 com.a.e.i.l = (v0!= 0);
		 com.a.e.i.m = (v0!= 0);
		 com.a.e.i.x = (v1!= 0);
		 int v0 = 2; // const/4 v0, 0x2
		 int v0 = 3; // const/4 v0, 0x3
		 int v0 = 4; // const/4 v0, 0x4
		 com.a.e.i.C = (v1!= 0);
		 final String v0 = "checkpoint"; // const-string v0, "checkpoint"
		 final String v0 = "buygoldone"; // const-string v0, "buygoldone"
		 final String v0 = "buygoldtwo"; // const-string v0, "buygoldtwo"
		 final String v0 = "buygoldthree"; // const-string v0, "buygoldthree"
		 return;
	 } // .end method
	 public com.a.e.i ( ) {
		 /* .locals 3 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/a/e/i;->w:Z */
		 /* iput-boolean v2, p0, Lcom/a/e/i;->J:Z */
		 /* iput-boolean v2, p0, Lcom/a/e/i;->K:Z */
		 /* iput v2, p0, Lcom/a/e/i;->M:I */
		 final String v0 = "app_wp"; // const-string v0, "app_wp"
		 this.N = v0;
		 final String v0 = "app_13"; // const-string v0, "app_13"
		 this.O = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 this.P = v0;
		 (( com.a.e.i ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/a/e/i;->getHolder()Landroid/view/SurfaceHolder;
		 this.Q = v0;
		 v0 = this.Q;
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.R = v0;
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.S = v0;
		 v0 = this.S;
		 /* const/high16 v1, -0x1000000 */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.S;
		 /* const/16 v1, 0x64 */
		 (( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
		 com.a.d.a.a = (v2!= 0);
		 com.a.e.n.f = (v2!= 0);
		 /* new-instance v0, Lcom/a/a/a; */
		 v1 = com.a.e.i.u;
		 /* invoke-direct {v0, v1, p0}, Lcom/a/a/a;-><init>(Landroid/content/Context;Lcom/a/e/i;)V */
		 /* new-instance v0, Lcom/a/d/d; */
		 v1 = com.a.e.i.a;
		 v1 = this.a;
		 /* invoke-direct {v0, v1, p0}, Lcom/a/d/d;-><init>(Landroid/content/Context;Lcom/a/e/i;)V */
		 this.s = v0;
		 /* new-instance v0, Lcom/a/e/n; */
		 v1 = com.a.e.i.a;
		 /* invoke-direct {v0, v1, p0}, Lcom/a/e/n;-><init>(Lcom/a/a/a;Lcom/a/e/i;)V */
		 this.r = v0;
		 /* new-instance v0, Lcom/a/e/m; */
		 v1 = com.a.e.i.a;
		 /* invoke-direct {v0, v1, p0}, Lcom/a/e/m;-><init>(Lcom/a/a/a;Lcom/a/e/i;)V */
		 this.n = v0;
		 /* new-instance v0, Lcom/a/f/l; */
		 v1 = com.a.e.i.a;
		 v1 = this.a;
		 /* invoke-direct {v0, v1, p0}, Lcom/a/f/l;-><init>(Landroid/content/Context;Lcom/a/e/i;)V */
		 this.p = v0;
		 /* new-instance v0, Lcom/a/f/m; */
		 v1 = com.a.e.i.a;
		 v1 = this.a;
		 /* invoke-direct {v0, v1, p0}, Lcom/a/f/m;-><init>(Landroid/content/Context;Lcom/a/e/i;)V */
		 /* new-instance v0, Lcom/a/e/c; */
		 v1 = com.a.e.i.a;
		 /* invoke-direct {v0, p0, v1}, Lcom/a/e/c;-><init>(Lcom/a/e/i;Lcom/a/a/a;)V */
		 this.o = v0;
		 v0 = this.o;
		 (( com.a.e.c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/e/c;->a()V
		 v0 = com.a.e.i.a;
		 (( com.a.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/a/a;->a()V
		 (( com.a.e.i ) p0 ).setFocusable ( v2 ); // invoke-virtual {p0, v2}, Lcom/a/e/i;->setFocusable(Z)V
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, Integer p1, Integer p2 ) {
		 /* .locals 7 */
		 /* const/16 v6, 0x14 */
		 int v5 = 3; // const/4 v5, 0x3
		 int v4 = 2; // const/4 v4, 0x2
		 int v2 = 1; // const/4 v2, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 final String v0 = "1"; // const-string v0, "1"
		 com.a.f.w .a ( v0,v2 );
		 /* if-ne p1, v2, :cond_8 */
		 v0 = com.a.e.i.F;
		 v0 = 		 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 /* if-ne p2, v2, :cond_3 */
			 com.a.e.i.m = (v3!= 0);
		 } // :cond_0
	 } // :goto_0
	 v0 = com.a.e.i.v;
	 /* const/16 v1, 0x38 */
	 (( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :cond_1
} // :goto_1
final String v0 = "|"; // const-string v0, "|"
com.a.f.w .a ( v0,v3 );
/* if-nez p2, :cond_7 */
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0xa */
com.a.f.w .a ( v0,v1 );
final String v0 = "1"; // const-string v0, "1"
com.a.f.w .a ( v0,v4 );
} // :goto_2
final String v0 = "second"; // const-string v0, "second"
com.calmei.jmsn.PlaneFightActivity .a ( v0 );
} // :cond_2
} // :goto_3
return;
} // :cond_3
/* if-ne p2, v4, :cond_0 */
com.a.c.l.D = (v2!= 0);
com.a.e.i.l = (v3!= 0);
com.a.e.i.m = (v3!= 0);
} // :cond_4
v0 = com.a.e.i.G;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* add-int/lit16 v0, v0, 0x7d0 */
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v6, v1 ); // invoke-virtual {v0, v6, v1}, Lcom/a/f/m;->a(II)V
} // :cond_5
v0 = com.a.e.i.H;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* add-int/lit16 v0, v0, 0x1770 */
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v6, v1 ); // invoke-virtual {v0, v6, v1}, Lcom/a/f/m;->a(II)V
} // :cond_6
v0 = com.a.e.i.I;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* add-int/lit16 v0, v0, 0x4e20 */
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v6, v1 ); // invoke-virtual {v0, v6, v1}, Lcom/a/f/m;->a(II)V
} // :cond_7
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.a.f.w .a ( v0,v5 );
final String v0 = "1"; // const-string v0, "1"
com.a.f.w .a ( v0,v4 );
} // :cond_8
/* if-nez p1, :cond_2 */
v0 = com.a.e.i.F;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_b
/* if-ne p2, v2, :cond_a */
com.a.e.i.m = (v3!= 0);
} // :cond_9
} // :goto_4
final String v0 = "|"; // const-string v0, "|"
com.a.f.w .a ( v0,v3 );
/* if-nez p2, :cond_e */
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0xa */
com.a.f.w .a ( v0,v1 );
final String v0 = "0"; // const-string v0, "0"
com.a.f.w .a ( v0,v4 );
} // :goto_5
final String v0 = "second"; // const-string v0, "second"
com.calmei.jmsn.PlaneFightActivity .a ( v0 );
/* goto/16 :goto_3 */
} // :cond_a
/* if-ne p2, v4, :cond_9 */
com.a.e.i.m = (v3!= 0);
com.a.e.d.Y = (v3!= 0);
com.a.c.l.D = (v2!= 0);
com.a.e.i.l = (v3!= 0);
/* new-instance v0, Lcom/a/e/f; */
v1 = com.a.e.i.a;
/* invoke-direct {v0, v1}, Lcom/a/e/f;-><init>(Lcom/a/a/a;)V */
com.a.c.g.o = (v2!= 0);
com.a.c.l.D = (v3!= 0);
com.a.c.j.T = (v3!= 0);
com.a.c.j.x = (v3!= 0);
} // :cond_b
v0 = com.a.e.i.G;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_c
int v0 = -1; // const/4 v0, -0x1
} // :cond_c
v0 = com.a.e.i.H;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_d
int v0 = -2; // const/4 v0, -0x2
} // :cond_d
v0 = com.a.e.i.I;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_9
int v0 = -3; // const/4 v0, -0x3
} // :cond_e
/* new-instance v0, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.a.f.w .a ( v0,v5 );
final String v0 = "0"; // const-string v0, "0"
com.a.f.w .a ( v0,v4 );
} // .end method
static d ( ) { //synthethic
/* .locals 3 */
v0 = com.a.e.i.ad;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
} // :cond_0
com.a.b.a .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
v1 = com.a.b.a.f;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
int v2 = 6; // const/4 v2, 0x6
/* aput v2, v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_b */
} // :goto_1
try { // :try_start_1
v1 = com.a.b.a.k;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
/* const/16 v2, 0xb */
/* aput v2, v0, v1 */
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_a */
} // :goto_2
try { // :try_start_2
v1 = com.a.b.a.g;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
int v2 = 7; // const/4 v2, 0x7
/* aput v2, v0, v1 */
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_9 */
} // :goto_3
try { // :try_start_3
v1 = com.a.b.a.c;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
int v2 = 3; // const/4 v2, 0x3
/* aput v2, v0, v1 */
/* :try_end_3 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_8 */
} // :goto_4
try { // :try_start_4
v1 = com.a.b.a.h;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
/* const/16 v2, 0x8 */
/* aput v2, v0, v1 */
/* :try_end_4 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_4 ..:try_end_4} :catch_7 */
} // :goto_5
try { // :try_start_5
v1 = com.a.b.a.a;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
int v2 = 1; // const/4 v2, 0x1
/* aput v2, v0, v1 */
/* :try_end_5 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_5 ..:try_end_5} :catch_6 */
} // :goto_6
try { // :try_start_6
v1 = com.a.b.a.b;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
int v2 = 2; // const/4 v2, 0x2
/* aput v2, v0, v1 */
/* :try_end_6 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_6 ..:try_end_6} :catch_5 */
} // :goto_7
try { // :try_start_7
v1 = com.a.b.a.d;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
int v2 = 4; // const/4 v2, 0x4
/* aput v2, v0, v1 */
/* :try_end_7 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_7 ..:try_end_7} :catch_4 */
} // :goto_8
try { // :try_start_8
v1 = com.a.b.a.l;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
/* const/16 v2, 0xc */
/* aput v2, v0, v1 */
/* :try_end_8 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_8 ..:try_end_8} :catch_3 */
} // :goto_9
try { // :try_start_9
v1 = com.a.b.a.i;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
/* const/16 v2, 0x9 */
/* aput v2, v0, v1 */
/* :try_end_9 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_9 ..:try_end_9} :catch_2 */
} // :goto_a
try { // :try_start_a
v1 = com.a.b.a.j;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
/* const/16 v2, 0xa */
/* aput v2, v0, v1 */
/* :try_end_a */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_a ..:try_end_a} :catch_1 */
} // :goto_b
try { // :try_start_b
v1 = com.a.b.a.e;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
int v2 = 5; // const/4 v2, 0x5
/* aput v2, v0, v1 */
/* :try_end_b */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_b ..:try_end_b} :catch_0 */
} // :goto_c
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
/* :catch_2 */
/* move-exception v1 */
/* :catch_3 */
/* move-exception v1 */
/* :catch_4 */
/* move-exception v1 */
/* :catch_5 */
/* move-exception v1 */
/* :catch_6 */
/* move-exception v1 */
/* :catch_7 */
/* move-exception v1 */
/* :catch_8 */
/* move-exception v1 */
/* :catch_9 */
/* move-exception v1 */
/* :catch_a */
/* move-exception v1 */
/* :catch_b */
/* move-exception v1 */
/* goto/16 :goto_1 */
} // .end method
private void h ( Float p0, Float p1 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.c;
v0 = this.e;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.c;
/* iget v0, v0, Lcom/a/e/e;->p:I */
/* if-nez v0, :cond_1 */
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/a/a/a;->g()V
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.c;
v0 = this.d;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/a/a/a;->m()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/a/a/a;->b()V
} // :cond_2
v0 = this.c;
v0 = this.h;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = this.r;
v1 = com.a.e.i.a;
v1 = this.A;
this.i = v1;
v0 = this.r;
/* iput-boolean v3, v0, Lcom/a/e/n;->k:Z */
} // :cond_3
v0 = this.c;
v0 = this.i;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
int v0 = 2; // const/4 v0, 0x2
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/a/a/a;->g()V
} // :cond_4
v0 = this.c;
v0 = this.f;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c;
/* iget-boolean v0, v0, Lcom/a/e/e;->w:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c;
v0 = this.x;
com.calmei.jmsn.PlaneFightActivity .b ( v0 );
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 0 */
return;
} // .end method
public void a ( Float p0, Float p1 ) {
/* .locals 7 */
int v2 = 4; // const/4 v2, 0x4
int v6 = 2; // const/4 v6, 0x2
int v5 = 5; // const/4 v5, 0x5
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
v0 = this.h;
v0 = this.d;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_6
com.a.c.j.Z = (v3!= 0);
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = this.b;
(( com.a.c.g ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/c/g;->a()V
/* iput-boolean v3, p0, Lcom/a/e/i;->w:Z */
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).y ( ); // invoke-virtual {v0}, Lcom/a/a/a;->y()V
v0 = this.b;
v0 = this.b;
(( com.a.c.j ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/a/c/j;->e()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/a/a/a;->o()V
} // :cond_0
} // :goto_0
/* sget-boolean v0, Lcom/a/c/j;->ac:Z */
if ( v0 != null) { // if-eqz v0, :cond_8
v0 = this.h;
v0 = this.f;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->D:I */
/* if-ne v0, v2, :cond_1 */
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->D:I */
/* if-ne v0, v2, :cond_5 */
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->E:I */
/* if-eq v0, v5, :cond_5 */
} // :cond_1
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
com.a.c.j.Z = (v3!= 0);
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->E:I */
/* if-ge v0, v5, :cond_7 */
v0 = com.a.e.i.a;
/* iget v1, v0, Lcom/a/a/a;->E:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/a/a/a;->E:I */
v0 = com.a.e.g.e;
/* aget v0, v0, v1 */
v1 = com.a.e.i.a;
/* iget v1, v1, Lcom/a/a/a;->E:I */
/* add-int/lit8 v1, v1, 0x1 */
/* if-ge v0, v1, :cond_2 */
v0 = com.a.e.g.e;
/* aget v2, v0, v1 */
/* add-int/lit8 v2, v2, 0x1 */
/* aput v2, v0, v1 */
} // :cond_2
} // :goto_1
v0 = this.o;
(( com.a.e.c ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/a/e/c;->g()V
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->E:I */
/* if-ne v0, v5, :cond_3 */
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->D:I */
/* add-int/lit8 v0, v0, 0x1 */
v1 = com.a.f.m.b;
/* aget v1, v1, v4 */
/* if-lt v0, v1, :cond_3 */
v0 = com.a.e.i.a;
v0 = this.b;
v0 = com.a.e.i.v;
v1 = com.a.e.i.a;
/* iget v1, v1, Lcom/a/a/a;->D:I */
/* add-int/lit8 v1, v1, 0x1 */
(( com.a.f.m ) v0 ).a ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Lcom/a/f/m;->a(II)V
} // :cond_3
v0 = this.c;
/* iput-boolean v4, v0, Lcom/a/e/e;->t:Z */
v0 = com.a.e.i.v;
/* const/16 v1, 0x36 */
v2 = com.a.e.i.a;
/* iget v2, v2, Lcom/a/a/a;->D:I */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
v0 = com.a.e.i.v;
/* const/16 v1, 0x37 */
v2 = com.a.e.i.a;
/* iget v2, v2, Lcom/a/a/a;->E:I */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
v0 = this.b;
v0 = this.b;
(( com.a.c.j ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/a/c/j;->e()V
/* iput-boolean v3, p0, Lcom/a/e/i;->w:Z */
/* new-instance v0, Lcom/a/c/g; */
v1 = com.a.e.i.a;
/* invoke-direct {v0, v1}, Lcom/a/c/g;-><init>(Lcom/a/a/a;)V */
this.b = v0;
v0 = com.a.e.i.a;
v1 = com.a.b.a.d;
this.A = v1;
v0 = this.b;
v0 = this.a;
/* iput-boolean v4, v0, Lcom/a/c/f;->h:Z */
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->D:I */
/* if-nez v0, :cond_4 */
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->E:I */
/* if-ne v0, v6, :cond_4 */
/* iget-boolean v0, p0, Lcom/a/e/i;->J:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* if-eq v0, v4, :cond_4 */
com.a.c.l.D = (v3!= 0);
com.a.c.j.T = (v3!= 0);
com.a.e.i.l = (v4!= 0);
com.a.c.j.x = (v3!= 0);
v0 = com.a.e.i.F;
com.calmei.jmsn.PlaneFightActivity .a ( v0,v6 );
} // :cond_4
com.a.c.j.Z = (v3!= 0);
} // :cond_5
} // :goto_2
return;
} // :cond_6
v0 = this.h;
v0 = this.e;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* iput-boolean v3, p0, Lcom/a/e/i;->w:Z */
com.a.c.j.Z = (v3!= 0);
v0 = this.b;
v0 = this.b;
(( com.a.c.j ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/a/c/j;->e()V
/* new-instance v0, Lcom/a/c/g; */
v1 = com.a.e.i.a;
/* invoke-direct {v0, v1}, Lcom/a/c/g;-><init>(Lcom/a/a/a;)V */
this.b = v0;
v0 = com.a.e.i.a;
v1 = com.a.b.a.d;
this.A = v1;
v0 = this.b;
v0 = this.a;
/* iput-boolean v4, v0, Lcom/a/c/f;->h:Z */
/* goto/16 :goto_0 */
} // :cond_7
v0 = com.a.e.i.a;
/* iput v3, v0, Lcom/a/a/a;->E:I */
v0 = com.a.e.i.a;
/* iget v1, v0, Lcom/a/a/a;->D:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/a/a/a;->D:I */
/* add-int/lit8 v0, v0, 0x1 */
v0 = com.a.e.g.e;
v1 = com.a.e.i.a;
/* iget v1, v1, Lcom/a/a/a;->D:I */
/* aput v4, v0, v1 */
v0 = com.a.e.g.g;
v1 = com.a.e.i.a;
/* iget v1, v1, Lcom/a/a/a;->D:I */
/* aget-object v0, v0, v1 */
v1 = com.a.e.i.a;
/* iget v1, v1, Lcom/a/a/a;->E:I */
/* aput v3, v0, v1 */
/* goto/16 :goto_1 */
} // :cond_8
v0 = this.h;
v0 = this.g;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
com.a.c.j.Z = (v3!= 0);
v0 = this.b;
v0 = this.b;
(( com.a.c.j ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/c/j;->a()V
v0 = this.b;
v0 = this.b;
(( com.a.c.j ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/a/c/j;->e()V
/* iput-boolean v3, p0, Lcom/a/e/i;->w:Z */
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/a/a/a;->o()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).y ( ); // invoke-virtual {v0}, Lcom/a/a/a;->y()V
/* new-instance v0, Lcom/a/e/d; */
v1 = com.a.e.i.a;
/* invoke-direct {v0, v1}, Lcom/a/e/d;-><init>(Lcom/a/a/a;)V */
this.i = v0;
/* goto/16 :goto_2 */
} // .end method
public void a ( Integer p0 ) {
/* .locals 8 */
/* const/16 v7, 0xf */
int v6 = 6; // const/4 v6, 0x6
int v5 = 4; // const/4 v5, 0x4
int v3 = 1; // const/4 v3, 0x1
int v4 = 3; // const/4 v4, 0x3
final String v0 = "|"; // const-string v0, "|"
int v1 = 0; // const/4 v1, 0x0
com.a.f.w .a ( v0,v1 );
/* if-ne p1, v3, :cond_3 */
/* const/16 v1, 0xbb8 */
/* if-lt v0, v1, :cond_2 */
v0 = this.s;
final String v1 = "buy"; // const-string v1, "buy"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* add-int/lit16 v0, v0, -0xbb8 */
v0 = com.a.e.d.i;
/* aput v3, v0, v3 */
v0 = com.a.e.i.v;
int v1 = 7; // const/4 v1, 0x7
v2 = com.a.e.d.i;
/* aget v2, v2, v3 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
final String v0 = "3000"; // const-string v0, "3000"
com.a.f.w .a ( v0,v7 );
v0 = com.a.e.i.v;
/* const/16 v1, 0x14 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :goto_0
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.i;
/* aget v1, v1, v3 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.a.f.w .a ( v0,v5 );
v0 = com.a.e.i.v;
int v1 = 7; // const/4 v1, 0x7
v2 = com.a.e.d.i;
/* aget v2, v2, v3 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :cond_0
} // :goto_1
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_1 */
final String v0 = "second"; // const-string v0, "second"
com.calmei.jmsn.PlaneFightActivity .a ( v0 );
v0 = com.a.e.i.v;
/* const/16 v1, 0x35 */
v2 = com.a.e.d.i;
/* aget v2, v2, v6 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :cond_1
v0 = this.i;
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Lcom/a/e/d;->X:Z */
return;
} // :cond_2
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_3
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_5 */
/* const/16 v1, 0x1482 */
/* if-lt v0, v1, :cond_4 */
v0 = this.s;
final String v1 = "buy"; // const-string v1, "buy"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* add-int/lit16 v0, v0, -0x1482 */
v0 = com.a.e.d.i;
int v1 = 2; // const/4 v1, 0x2
/* aput v3, v0, v1 */
v0 = com.a.e.i.v;
/* const/16 v1, 0x8 */
v2 = com.a.e.d.i;
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
final String v0 = "5250"; // const-string v0, "5250"
com.a.f.w .a ( v0,v7 );
v0 = com.a.e.i.v;
/* const/16 v1, 0x14 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :goto_2
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.i;
int v2 = 2; // const/4 v2, 0x2
/* aget v1, v1, v2 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 5; // const/4 v1, 0x5
com.a.f.w .a ( v0,v1 );
v0 = com.a.e.i.v;
/* const/16 v1, 0x8 */
v2 = com.a.e.d.i;
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :cond_4
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_5
/* if-ne p1, v4, :cond_7 */
/* const/16 v1, 0x1f40 */
/* if-lt v0, v1, :cond_6 */
v0 = this.s;
final String v1 = "buy"; // const-string v1, "buy"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* add-int/lit16 v0, v0, -0x1f40 */
v0 = com.a.e.d.i;
/* aput v3, v0, v4 */
v0 = com.a.e.i.v;
/* const/16 v1, 0x9 */
v2 = com.a.e.d.i;
/* aget v2, v2, v4 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
final String v0 = "8000"; // const-string v0, "8000"
com.a.f.w .a ( v0,v7 );
v0 = com.a.e.i.v;
/* const/16 v1, 0x14 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :goto_3
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.i;
/* aget v1, v1, v4 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.a.f.w .a ( v0,v6 );
v0 = com.a.e.i.v;
/* const/16 v1, 0x9 */
v2 = com.a.e.d.i;
/* aget v2, v2, v4 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_1 */
} // :cond_6
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_7
/* if-ne p1, v5, :cond_9 */
/* const/16 v1, 0x2bf2 */
/* if-lt v0, v1, :cond_8 */
v0 = this.s;
final String v1 = "buy"; // const-string v1, "buy"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* add-int/lit16 v0, v0, -0x2bf2 */
v0 = com.a.e.d.i;
/* aput v3, v0, v5 */
v0 = com.a.e.i.v;
/* const/16 v1, 0xa */
v2 = com.a.e.d.i;
/* aget v2, v2, v5 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
final String v0 = "11250"; // const-string v0, "11250"
com.a.f.w .a ( v0,v7 );
v0 = com.a.e.i.v;
/* const/16 v1, 0x14 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :goto_4
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.i;
/* aget v1, v1, v5 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 7; // const/4 v1, 0x7
com.a.f.w .a ( v0,v1 );
v0 = com.a.e.i.v;
/* const/16 v1, 0xa */
v2 = com.a.e.d.i;
/* aget v2, v2, v5 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_1 */
} // :cond_8
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_9
int v0 = 5; // const/4 v0, 0x5
/* if-ne p1, v0, :cond_b */
/* const/16 v1, 0x4e20 */
/* if-lt v0, v1, :cond_a */
v0 = this.s;
final String v1 = "buy"; // const-string v1, "buy"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* add-int/lit16 v0, v0, -0x4e20 */
v0 = com.a.e.d.i;
int v1 = 5; // const/4 v1, 0x5
/* aput v3, v0, v1 */
v0 = com.a.e.i.v;
/* const/16 v1, 0xb */
v2 = com.a.e.d.i;
int v3 = 5; // const/4 v3, 0x5
/* aget v2, v2, v3 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
final String v0 = "18000"; // const-string v0, "18000"
com.a.f.w .a ( v0,v7 );
v0 = com.a.e.i.v;
/* const/16 v1, 0x14 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :goto_5
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.i;
int v2 = 5; // const/4 v2, 0x5
/* aget v1, v1, v2 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0x8 */
com.a.f.w .a ( v0,v1 );
/* goto/16 :goto_1 */
} // :cond_a
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_b
/* if-ne p1, v6, :cond_0 */
/* const/16 v1, 0x6d60 */
/* if-lt v0, v1, :cond_c */
v0 = this.s;
final String v1 = "buy"; // const-string v1, "buy"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* add-int/lit16 v0, v0, -0x6d60 */
v0 = com.a.e.d.i;
/* aput v3, v0, v6 */
v0 = com.a.e.i.v;
/* const/16 v1, 0x35 */
v2 = com.a.e.d.i;
/* aget v2, v2, v6 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
final String v0 = "28000"; // const-string v0, "28000"
com.a.f.w .a ( v0,v7 );
v0 = com.a.e.i.v;
/* const/16 v1, 0x14 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :goto_6
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.i;
/* aget v1, v1, v6 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0x8 */
com.a.f.w .a ( v0,v1 );
/* goto/16 :goto_1 */
} // :cond_c
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // .end method
public void a ( android.graphics.Canvas p0 ) {
/* .locals 10 */
int v9 = 3; // const/4 v9, 0x3
int v8 = 2; // const/4 v8, 0x2
int v1 = 0; // const/4 v1, 0x0
int v7 = 1; // const/4 v7, 0x1
int v6 = 0; // const/4 v6, 0x0
/* new-instance v0, Landroid/graphics/PaintFlagsDrawFilter; */
/* invoke-direct {v0, v6, v9}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V */
(( android.graphics.Canvas ) p1 ).setDrawFilter ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V
v0 = (( com.a.e.i ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/a/e/i;->getWidth()I
/* int-to-float v3, v0 */
v0 = (( com.a.e.i ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lcom/a/e/i;->getHeight()I
/* int-to-float v4, v0 */
v5 = this.R;
/* move-object v0, p1 */
/* move v2, v1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
com.a.e.i .d ( );
v2 = com.a.e.i.a;
v2 = this.A;
v2 = (( com.a.b.a ) v2 ).ordinal ( ); // invoke-virtual {v2}, Lcom/a/b/a;->ordinal()I
/* aget v0, v0, v2 */
/* packed-switch v0, :pswitch_data_0 */
} // :cond_0
} // :goto_0
return;
/* :pswitch_0 */
java.lang.System .currentTimeMillis ( );
v0 = this.c;
v1 = this.R;
(( com.a.e.e ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/e;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
java.lang.System .currentTimeMillis ( );
v0 = this.r;
/* iget-boolean v0, v0, Lcom/a/e/n;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.r;
v1 = this.R;
(( com.a.e.n ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/n;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
} // :cond_1
v0 = this.c;
/* iget-boolean v0, v0, Lcom/a/e/e;->y:Z */
/* if-nez v0, :cond_0 */
v0 = this.c;
(( com.a.e.e ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/e/e;->a()V
/* :pswitch_1 */
v0 = this.r;
v1 = this.R;
(( com.a.e.n ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/n;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* :pswitch_2 */
/* if-ne v0, v7, :cond_2 */
v0 = this.d;
v1 = this.R;
(( com.a.e.l ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/l;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
} // :cond_2
v0 = this.d;
v1 = this.R;
(( com.a.e.l ) v0 ).b ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/l;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* :pswitch_3 */
v0 = this.e;
v1 = this.R;
(( com.a.e.h ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/h;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
v0 = this.r;
/* iget-boolean v0, v0, Lcom/a/e/n;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.r;
v1 = this.R;
(( com.a.e.n ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/n;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* :pswitch_4 */
v0 = this.f;
v1 = this.R;
(( com.a.e.g ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/g;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
v0 = this.r;
/* iget-boolean v0, v0, Lcom/a/e/n;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.r;
v1 = this.R;
(( com.a.e.n ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/n;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* :pswitch_5 */
v0 = this.n;
v1 = this.P;
(( com.a.e.m ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/m;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* :pswitch_6 */
v0 = this.g;
v1 = this.R;
(( com.a.e.b ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/b;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.g;
v1 = this.R;
(( com.a.e.b ) v0 ).a ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Lcom/a/e/b;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;I)V
/* goto/16 :goto_0 */
/* :pswitch_7 */
/* sget-boolean v0, Lcom/a/c/j;->Z:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* if-nez v0, :cond_3 */
/* new-instance v0, Lcom/a/e/a; */
v2 = com.a.e.i.a;
v4 = this.b;
v4 = this.b;
v4 = this.V;
v4 = (( com.a.d.b ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/a/d/b;->b()I
/* invoke-direct {v0, v2, v3, v4, p0}, Lcom/a/e/a;-><init>(Lcom/a/a/a;IILcom/a/e/i;)V */
this.h = v0;
/* iput-boolean v7, p0, Lcom/a/e/i;->w:Z */
v0 = this.b;
v0 = this.b;
/* iput-boolean v6, v0, Lcom/a/c/j;->ap:Z */
com.a.c.l.D = (v6!= 0);
com.a.c.j.T = (v6!= 0);
v0 = this.b;
v0 = this.b;
com.a.c.j.x = (v6!= 0);
v0 = this.b;
v0 = this.a;
/* iput-boolean v6, v0, Lcom/a/c/f;->h:Z */
} // :cond_3
v0 = this.b;
v1 = this.R;
(( com.a.c.g ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/c/g;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* sget-boolean v0, Lcom/a/c/g;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = com.a.e.i.j;
v1 = this.R;
(( com.a.e.f ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/f;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
} // :cond_4
/* iget-boolean v0, p0, Lcom/a/e/i;->w:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* sget-boolean v0, Lcom/a/c/j;->ac:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = this.h;
v1 = this.R;
(( com.a.e.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/a;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
} // :cond_5
} // :goto_1
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->D:I */
/* if-nez v0, :cond_0 */
v0 = com.a.e.i.a;
/* iget v0, v0, Lcom/a/a/a;->E:I */
/* if-ne v0, v8, :cond_0 */
/* if-eq v0, v7, :cond_0 */
/* sget-boolean v0, Lcom/a/c/j;->aG:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/a/e/i;->J:Z */
/* if-nez v0, :cond_0 */
com.a.c.l.D = (v6!= 0);
com.a.c.j.T = (v6!= 0);
com.a.e.i.l = (v7!= 0);
v0 = this.b;
v0 = this.b;
v0 = this.aw;
v1 = this.P;
(( com.a.c.h ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/c/h;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* goto/16 :goto_0 */
} // :cond_6
v0 = this.h;
v1 = this.R;
(( com.a.e.a ) v0 ).b ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/a;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* :pswitch_8 */
v0 = com.a.e.i.j;
v1 = this.R;
(( com.a.e.f ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/f;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* goto/16 :goto_0 */
/* :pswitch_9 */
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-ne v0, v7, :cond_8 */
v0 = this.i;
v1 = this.R;
(( com.a.e.d ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/d;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
v0 = this.i;
/* iget-boolean v0, v0, Lcom/a/e/d;->X:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = this.i;
v1 = this.R;
(( com.a.e.d ) v0 ).i ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/d;->i(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
} // :cond_7
} // :goto_2
/* if-ne v0, v8, :cond_0 */
v0 = this.i;
v1 = this.R;
(( com.a.e.d ) v0 ).k ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/d;->k(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* goto/16 :goto_0 */
} // :cond_8
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-ne v0, v8, :cond_9 */
v0 = this.i;
v1 = this.R;
(( com.a.e.d ) v0 ).g ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/d;->g(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* sget-boolean v0, Lcom/a/e/d;->Y:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = this.i;
v1 = this.R;
(( com.a.e.d ) v0 ).j ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/d;->j(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
} // :cond_9
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-ne v0, v9, :cond_7 */
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).u ( ); // invoke-virtual {v0}, Lcom/a/a/a;->u()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).y ( ); // invoke-virtual {v0}, Lcom/a/a/a;->y()V
v0 = this.i;
/* iput v7, v0, Lcom/a/e/d;->F:I */
/* :pswitch_a */
/* sget-boolean v0, Lcom/a/c/j;->ac:Z */
if ( v0 != null) { // if-eqz v0, :cond_a
v0 = this.h;
v1 = this.R;
(( com.a.e.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/a;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* goto/16 :goto_0 */
} // :cond_a
v0 = this.h;
v1 = this.R;
(( com.a.e.a ) v0 ).b ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/e/a;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_7 */
/* :pswitch_3 */
/* :pswitch_a */
/* :pswitch_9 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_1 */
/* :pswitch_6 */
/* :pswitch_8 */
} // .end packed-switch
} // .end method
public void a ( com.calmei.jmsn.PlaneFightActivity p0 ) {
/* .locals 3 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
final String v1 = "\u786e\u8ba4\u9000\u51fa"; // const-string v1, "\u786e\u8ba4\u9000\u51fa"
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "\u786e\u5b9a\u9000\u51fa\u6e38\u620f?"; // const-string v1, "\u786e\u5b9a\u9000\u51fa\u6e38\u620f?"
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
final String v1 = "\u786e\u5b9a"; // const-string v1, "\u786e\u5b9a"
/* new-instance v2, Lcom/a/e/j; */
/* invoke-direct {v2, p0, p1}, Lcom/a/e/j;-><init>(Lcom/a/e/i;Lcom/calmei/jmsn/PlaneFightActivity;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
final String v1 = "\u8fd4\u56de"; // const-string v1, "\u8fd4\u56de"
/* new-instance v2, Lcom/a/e/k; */
/* invoke-direct {v2, p0}, Lcom/a/e/k;-><init>(Lcom/a/e/i;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
return;
} // .end method
public void b ( ) {
/* .locals 2 */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/a/a/a;->l()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/a/a/a;->d()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/a/a/a;->f()V
com.a.e.i .d ( );
v1 = com.a.e.i.a;
v1 = this.A;
v1 = (( com.a.b.a ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/a/b/a;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
} // :goto_0
/* :pswitch_0 */
return;
/* :pswitch_1 */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/a/a/a;->b()V
/* :pswitch_2 */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/a/a/a;->h()V
/* :pswitch_3 */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/a/a/a;->n()V
/* :pswitch_4 */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).t ( ); // invoke-virtual {v0}, Lcom/a/a/a;->t()V
/* :pswitch_5 */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).p ( ); // invoke-virtual {v0}, Lcom/a/a/a;->p()V
v0 = this.i;
(( com.a.e.d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/e/d;->a()V
/* :pswitch_6 */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).v ( ); // invoke-virtual {v0}, Lcom/a/a/a;->v()V
/* :pswitch_7 */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).r ( ); // invoke-virtual {v0}, Lcom/a/a/a;->r()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).y ( ); // invoke-virtual {v0}, Lcom/a/a/a;->y()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/a/a/a;->j()V
v0 = this.b;
(( com.a.c.g ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/c/g;->a()V
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_7 */
/* :pswitch_3 */
/* :pswitch_0 */
/* :pswitch_5 */
/* :pswitch_0 */
/* :pswitch_4 */
/* :pswitch_0 */
/* :pswitch_6 */
} // .end packed-switch
} // .end method
public void b ( Float p0, Float p1 ) {
/* .locals 7 */
int v6 = 4; // const/4 v6, 0x4
int v3 = 3; // const/4 v3, 0x3
int v0 = 0; // const/4 v0, 0x0
int v5 = 1; // const/4 v5, 0x1
int v4 = 2; // const/4 v4, 0x2
v1 = this.i;
v1 = this.j;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* if-eq v1, v4, :cond_3 */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.i;
/* iput v0, v1, Lcom/a/e/d;->U:I */
v1 = com.a.e.i.a;
v2 = com.a.b.a.h;
this.A = v2;
v1 = com.a.e.d.i;
v2 = this.i;
/* iget v2, v2, Lcom/a/e/d;->v:I */
/* add-int/lit8 v2, v2, -0x1 */
/* aget v1, v1, v2 */
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.i;
/* iget v1, v1, Lcom/a/e/d;->v:I */
/* add-int/lit8 v1, v1, -0x1 */
} // :goto_0
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.b;
v1 = this.b;
v2 = com.a.e.i.a;
(( com.a.a.a ) v2 ).p ( ); // invoke-virtual {v2}, Lcom/a/a/a;->p()V
v2 = com.a.e.i.a;
(( com.a.a.a ) v2 ).x ( ); // invoke-virtual {v2}, Lcom/a/a/a;->x()V
v2 = this.b;
v2 = this.b;
/* iget v3, v1, Lcom/a/c/j;->q:I */
/* iput v3, v2, Lcom/a/c/j;->q:I */
v2 = this.b;
v2 = this.b;
v1 = this.al;
this.al = v1;
} // :goto_1
v1 = com.a.e.i.v;
/* const/16 v2, 0x39 */
(( com.a.f.m ) v1 ).a ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Lcom/a/f/m;->a(II)V
v1 = com.a.e.i.v;
/* const/16 v2, 0x36 */
v3 = com.a.e.i.a;
/* iget v3, v3, Lcom/a/a/a;->D:I */
(( com.a.f.m ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/m;->a(II)V
v1 = com.a.e.i.v;
/* const/16 v2, 0x37 */
v3 = com.a.e.i.a;
/* iget v3, v3, Lcom/a/a/a;->E:I */
(( com.a.f.m ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/m;->a(II)V
v1 = this.b;
v1 = this.a;
/* iput-boolean v5, v1, Lcom/a/c/f;->h:Z */
v1 = com.a.e.i.a;
/* iget v1, v1, Lcom/a/a/a;->D:I */
/* if-nez v1, :cond_0 */
v1 = com.a.e.i.a;
/* iget v1, v1, Lcom/a/a/a;->E:I */
/* if-ne v1, v4, :cond_0 */
/* iget-boolean v1, p0, Lcom/a/e/i;->J:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-eq v1, v5, :cond_0 */
com.a.e.i.l = (v5!= 0);
com.a.c.l.D = (v0!= 0);
com.a.c.j.T = (v0!= 0);
v1 = com.a.e.i.F;
com.calmei.jmsn.PlaneFightActivity .a ( v1,v4 );
} // :cond_0
} // :goto_2
/* move v1, v0 */
} // :goto_3
int v0 = 6; // const/4 v0, 0x6
/* if-lt v1, v0, :cond_14 */
return;
} // :cond_1
} // :cond_2
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).p ( ); // invoke-virtual {v1}, Lcom/a/a/a;->p()V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).x ( ); // invoke-virtual {v1}, Lcom/a/a/a;->x()V
} // :cond_3
v1 = this.i;
v1 = this.k;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* if-eq v1, v4, :cond_4 */
v1 = com.a.e.i.a;
v2 = com.a.b.a.h;
this.A = v2;
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).p ( ); // invoke-virtual {v1}, Lcom/a/a/a;->p()V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).s ( ); // invoke-virtual {v1}, Lcom/a/a/a;->s()V
} // :cond_4
v1 = this.i;
v1 = this.D;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* if-eq v1, v4, :cond_5 */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.i;
/* iput v5, v1, Lcom/a/e/d;->F:I */
/* iput v5, p0, Lcom/a/e/i;->M:I */
} // :cond_5
v1 = this.i;
v1 = this.E;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* if-eq v1, v4, :cond_6 */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.i;
/* iput v4, v1, Lcom/a/e/d;->F:I */
/* iput v4, p0, Lcom/a/e/i;->M:I */
} // :cond_6
v1 = this.i;
v1 = this.n;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_7
v1 = this.i;
/* iget v1, v1, Lcom/a/e/d;->F:I */
/* if-ne v1, v4, :cond_7 */
/* sget-boolean v1, Lcom/a/e/d;->Y:Z */
/* if-nez v1, :cond_7 */
/* if-eq v1, v4, :cond_7 */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.i;
/* iput v5, v1, Lcom/a/e/d;->H:I */
/* goto/16 :goto_2 */
} // :cond_7
v1 = this.i;
v1 = this.o;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_8
v1 = this.i;
/* iget v1, v1, Lcom/a/e/d;->F:I */
/* if-ne v1, v4, :cond_8 */
/* sget-boolean v1, Lcom/a/e/d;->Y:Z */
/* if-nez v1, :cond_8 */
/* if-eq v1, v4, :cond_8 */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.i;
/* iput v4, v1, Lcom/a/e/d;->H:I */
/* goto/16 :goto_2 */
} // :cond_8
v1 = this.i;
v1 = this.p;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_9
v1 = this.i;
/* iget v1, v1, Lcom/a/e/d;->F:I */
/* if-ne v1, v4, :cond_9 */
/* sget-boolean v1, Lcom/a/e/d;->Y:Z */
/* if-nez v1, :cond_9 */
/* if-eq v1, v4, :cond_9 */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.i;
/* iput v3, v1, Lcom/a/e/d;->H:I */
/* goto/16 :goto_2 */
} // :cond_9
v1 = this.i;
v1 = this.q;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_a
v1 = this.i;
/* iget v1, v1, Lcom/a/e/d;->F:I */
/* if-ne v1, v4, :cond_a */
/* sget-boolean v1, Lcom/a/e/d;->Y:Z */
/* if-nez v1, :cond_a */
/* if-eq v1, v4, :cond_a */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.i;
/* iput v6, v1, Lcom/a/e/d;->H:I */
/* goto/16 :goto_2 */
} // :cond_a
v1 = this.i;
v1 = this.r;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_b
/* if-eq v1, v4, :cond_b */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = com.a.e.i.a;
v2 = com.a.b.a.h;
this.A = v2;
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).u ( ); // invoke-virtual {v1}, Lcom/a/a/a;->u()V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).p ( ); // invoke-virtual {v1}, Lcom/a/a/a;->p()V
v1 = this.i;
/* iput v3, v1, Lcom/a/e/d;->F:I */
/* goto/16 :goto_2 */
} // :cond_b
v1 = this.i;
v1 = this.s;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_c
v1 = this.i;
/* iget v1, v1, Lcom/a/e/d;->F:I */
/* if-ne v1, v5, :cond_c */
/* if-eq v1, v4, :cond_c */
v1 = com.a.e.d.i;
v2 = this.i;
/* iget v2, v2, Lcom/a/e/d;->v:I */
/* add-int/lit8 v2, v2, -0x1 */
/* aget v1, v1, v2 */
/* if-eq v1, v5, :cond_0 */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.i;
/* iput-boolean v5, v1, Lcom/a/e/d;->X:Z */
com.a.e.d.Y = (v0!= 0);
/* goto/16 :goto_2 */
} // :cond_c
v1 = this.i;
v1 = this.s;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_d
v1 = this.i;
/* iget v1, v1, Lcom/a/e/d;->F:I */
/* if-ne v1, v4, :cond_d */
v1 = com.a.e.d.M;
v2 = this.i;
/* iget v2, v2, Lcom/a/e/d;->H:I */
/* add-int/lit8 v2, v2, -0x1 */
/* aget v1, v1, v2 */
/* if-eq v1, v6, :cond_d */
/* if-eq v1, v4, :cond_d */
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
com.a.e.d.Y = (v5!= 0);
v1 = this.i;
/* iput-boolean v0, v1, Lcom/a/e/d;->X:Z */
/* goto/16 :goto_2 */
} // :cond_d
v1 = this.i;
v1 = this.t;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_e
v1 = this.i;
/* iget-boolean v1, v1, Lcom/a/e/d;->X:Z */
if ( v1 != null) { // if-eqz v1, :cond_e
/* if-eq v1, v4, :cond_e */
v1 = this.i;
/* iget v1, v1, Lcom/a/e/d;->v:I */
/* add-int/lit8 v1, v1, -0x1 */
(( com.a.e.i ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lcom/a/e/i;->a(I)V
/* goto/16 :goto_2 */
} // :cond_e
v1 = this.i;
v1 = this.u;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_f
v1 = this.i;
/* iget-boolean v1, v1, Lcom/a/e/d;->X:Z */
if ( v1 != null) { // if-eqz v1, :cond_f
/* if-eq v1, v4, :cond_f */
v1 = this.i;
/* iput-boolean v0, v1, Lcom/a/e/d;->X:Z */
/* goto/16 :goto_2 */
} // :cond_f
v1 = this.i;
v1 = this.t;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_10
/* sget-boolean v1, Lcom/a/e/d;->Y:Z */
if ( v1 != null) { // if-eqz v1, :cond_10
/* if-eq v1, v4, :cond_10 */
v1 = this.i;
/* iget v1, v1, Lcom/a/e/d;->H:I */
(( com.a.e.i ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lcom/a/e/i;->b(I)V
/* goto/16 :goto_2 */
} // :cond_10
v1 = this.i;
v1 = this.u;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_11
/* sget-boolean v1, Lcom/a/e/d;->Y:Z */
if ( v1 != null) { // if-eqz v1, :cond_11
/* if-eq v1, v4, :cond_11 */
com.a.e.d.Y = (v0!= 0);
/* goto/16 :goto_2 */
} // :cond_11
v1 = this.i;
v1 = this.t;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_13
/* if-ne v1, v4, :cond_13 */
/* iget-boolean v1, p0, Lcom/a/e/i;->K:Z */
/* if-nez v1, :cond_12 */
v1 = com.a.e.i.F;
com.a.e.i .a ( v1,v5,v5 );
/* goto/16 :goto_2 */
} // :cond_12
v1 = com.a.e.i.F;
com.calmei.jmsn.PlaneFightActivity .a ( v1,v5 );
/* goto/16 :goto_2 */
} // :cond_13
v1 = this.i;
v1 = this.u;
v1 = (( com.a.c.d ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-ne v1, v4, :cond_0 */
v1 = com.a.e.i.F;
com.a.e.i .a ( v1,v0,v5 );
/* goto/16 :goto_2 */
} // :cond_14
v0 = this.i;
v0 = this.l;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/a/c/d; */
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_15
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-ne v0, v5, :cond_15 */
/* if-eq v0, v4, :cond_15 */
v0 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = this.i;
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, v0, Lcom/a/e/d;->v:I */
} // :cond_15
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* goto/16 :goto_3 */
} // .end method
public void b ( Integer p0 ) {
/* .locals 8 */
int v7 = 2; // const/4 v7, 0x2
int v6 = 1; // const/4 v6, 0x1
/* const/16 v5, 0x14 */
/* const/16 v3, 0xf */
int v4 = 3; // const/4 v4, 0x3
final String v0 = "|"; // const-string v0, "|"
int v1 = 0; // const/4 v1, 0x0
com.a.f.w .a ( v0,v1 );
/* if-ne p1, v6, :cond_a */
v0 = com.a.e.d.M;
int v1 = 0; // const/4 v1, 0x0
/* aget v0, v0, v1 */
/* if-nez v0, :cond_4 */
/* const/16 v1, 0x8c0 */
/* if-lt v0, v1, :cond_3 */
/* add-int/lit16 v0, v0, -0x8c0 */
v0 = com.a.e.d.M;
int v1 = 0; // const/4 v1, 0x0
/* aget v2, v0, v1 */
/* add-int/lit8 v2, v2, 0x1 */
/* aput v2, v0, v1 */
final String v0 = "2240"; // const-string v0, "2240"
com.a.f.w .a ( v0,v3 );
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.M;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
/* add-int/lit8 v1, v1, 0x1 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0xb */
com.a.f.w .a ( v0,v1 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
} // :cond_0
} // :goto_0
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_1 */
v0 = com.a.e.i.v;
/* const/16 v1, 0xc */
v2 = com.a.e.d.M;
int v3 = 0; // const/4 v3, 0x0
/* aget v2, v2, v3 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
} // :cond_1
} // :goto_1
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_2 */
final String v0 = "second"; // const-string v0, "second"
com.calmei.jmsn.PlaneFightActivity .a ( v0 );
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
com.a.e.d.Y = (v0!= 0);
return;
} // :cond_3
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_4
v0 = com.a.e.d.M;
int v1 = 0; // const/4 v1, 0x0
/* aget v0, v0, v1 */
/* if-ne v0, v6, :cond_6 */
/* const/16 v1, 0x1932 */
/* if-lt v0, v1, :cond_5 */
/* add-int/lit16 v0, v0, -0x1932 */
v0 = com.a.e.d.M;
int v1 = 0; // const/4 v1, 0x0
/* aget v2, v0, v1 */
/* add-int/lit8 v2, v2, 0x1 */
/* aput v2, v0, v1 */
final String v0 = "6450"; // const-string v0, "6450"
com.a.f.w .a ( v0,v3 );
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.M;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
/* add-int/lit8 v1, v1, 0x1 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0xb */
com.a.f.w .a ( v0,v1 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
} // :cond_5
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_6
v0 = com.a.e.d.M;
int v1 = 0; // const/4 v1, 0x0
/* aget v0, v0, v1 */
/* if-ne v0, v7, :cond_8 */
/* const/16 v1, 0x27e2 */
/* if-lt v0, v1, :cond_7 */
/* add-int/lit16 v0, v0, -0x27e2 */
v0 = com.a.e.d.M;
int v1 = 0; // const/4 v1, 0x0
/* aget v2, v0, v1 */
/* add-int/lit8 v2, v2, 0x1 */
/* aput v2, v0, v1 */
final String v0 = "10210"; // const-string v0, "10210"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_0 */
} // :cond_7
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
/* goto/16 :goto_0 */
} // :cond_8
v0 = com.a.e.d.M;
int v1 = 0; // const/4 v1, 0x0
/* aget v0, v0, v1 */
/* if-ne v0, v4, :cond_0 */
/* const/16 v1, 0x41dc */
/* if-lt v0, v1, :cond_9 */
/* add-int/lit16 v0, v0, -0x41dc */
v0 = com.a.e.d.M;
int v1 = 0; // const/4 v1, 0x0
/* aget v2, v0, v1 */
/* add-int/lit8 v2, v2, 0x1 */
/* aput v2, v0, v1 */
final String v0 = "16860"; // const-string v0, "16860"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_0 */
} // :cond_9
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
/* goto/16 :goto_0 */
} // :cond_a
/* if-ne p1, v7, :cond_13 */
v0 = com.a.e.d.M;
/* aget v0, v0, v6 */
/* if-nez v0, :cond_d */
/* const/16 v1, 0x99c */
/* if-lt v0, v1, :cond_c */
/* add-int/lit16 v0, v0, -0x99c */
v0 = com.a.e.d.M;
/* aget v1, v0, v6 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v6 */
final String v0 = "2460"; // const-string v0, "2460"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
} // :cond_b
} // :goto_2
v0 = com.a.e.i.v;
/* const/16 v1, 0xd */
v2 = com.a.e.d.M;
/* aget v2, v2, v6 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.M;
/* aget v1, v1, v6 */
/* add-int/lit8 v1, v1, 0x1 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0xc */
com.a.f.w .a ( v0,v1 );
/* goto/16 :goto_1 */
} // :cond_c
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_d
v0 = com.a.e.d.M;
/* aget v0, v0, v6 */
/* if-ne v0, v6, :cond_f */
/* const/16 v1, 0x161c */
/* if-lt v0, v1, :cond_e */
/* add-int/lit16 v0, v0, -0x161c */
v0 = com.a.e.d.M;
/* aget v1, v0, v6 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v6 */
final String v0 = "5660"; // const-string v0, "5660"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
} // :cond_e
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_f
v0 = com.a.e.d.M;
/* aget v0, v0, v6 */
/* if-ne v0, v7, :cond_11 */
/* const/16 v1, 0x1fb8 */
/* if-lt v0, v1, :cond_10 */
/* add-int/lit16 v0, v0, -0x1fb8 */
v0 = com.a.e.d.M;
/* aget v1, v0, v6 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v6 */
final String v0 = "8120"; // const-string v0, "8120"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_2 */
} // :cond_10
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
/* goto/16 :goto_2 */
} // :cond_11
v0 = com.a.e.d.M;
/* aget v0, v0, v6 */
/* if-ne v0, v4, :cond_b */
/* const/16 v1, 0x3cf0 */
/* if-lt v0, v1, :cond_12 */
/* add-int/lit16 v0, v0, -0x3cf0 */
v0 = com.a.e.d.M;
/* aget v1, v0, v6 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v6 */
final String v0 = "15600"; // const-string v0, "15600"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_2 */
} // :cond_12
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
/* goto/16 :goto_2 */
} // :cond_13
/* if-ne p1, v4, :cond_1c */
v0 = com.a.e.d.M;
/* aget v0, v0, v7 */
/* if-nez v0, :cond_16 */
/* const/16 v1, 0x8e8 */
/* if-lt v0, v1, :cond_15 */
/* add-int/lit16 v0, v0, -0x8e8 */
v0 = com.a.e.d.M;
/* aget v1, v0, v7 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v7 */
final String v0 = "2280"; // const-string v0, "2280"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
} // :cond_14
} // :goto_3
v0 = com.a.e.i.v;
/* const/16 v1, 0xe */
v2 = com.a.e.d.M;
/* aget v2, v2, v7 */
(( com.a.f.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/f/m;->a(II)V
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.M;
/* aget v1, v1, v7 */
/* add-int/lit8 v1, v1, 0x1 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0xd */
com.a.f.w .a ( v0,v1 );
/* goto/16 :goto_1 */
} // :cond_15
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_16
v0 = com.a.e.d.M;
/* aget v0, v0, v7 */
/* if-ne v0, v6, :cond_18 */
/* const/16 v1, 0x1932 */
/* if-lt v0, v1, :cond_17 */
/* add-int/lit16 v0, v0, -0x1932 */
v0 = com.a.e.d.M;
/* aget v1, v0, v7 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v7 */
final String v0 = "6450"; // const-string v0, "6450"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
} // :cond_17
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_18
v0 = com.a.e.d.M;
/* aget v0, v0, v7 */
/* if-ne v0, v7, :cond_1a */
/* const/16 v1, 0x3732 */
/* if-lt v0, v1, :cond_19 */
/* add-int/lit16 v0, v0, -0x3732 */
v0 = com.a.e.d.M;
/* aget v1, v0, v7 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v7 */
final String v0 = "14130"; // const-string v0, "14130"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_3 */
} // :cond_19
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
/* goto/16 :goto_3 */
} // :cond_1a
v0 = com.a.e.d.M;
/* aget v0, v0, v7 */
/* if-ne v0, v4, :cond_14 */
/* const/16 v1, 0x6b58 */
/* if-lt v0, v1, :cond_1b */
/* add-int/lit16 v0, v0, -0x6b58 */
v0 = com.a.e.d.M;
/* aget v1, v0, v7 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v7 */
final String v0 = "27480"; // const-string v0, "27480"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_3 */
} // :cond_1b
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
/* goto/16 :goto_3 */
} // :cond_1c
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_1 */
v0 = com.a.e.d.M;
/* aget v0, v0, v4 */
/* if-nez v0, :cond_1f */
/* const/16 v1, 0x80c */
/* if-lt v0, v1, :cond_1e */
/* add-int/lit16 v0, v0, -0x80c */
v0 = com.a.e.d.M;
/* aget v1, v0, v4 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v4 */
int v0 = 4; // const/4 v0, 0x4
final String v0 = "2060"; // const-string v0, "2060"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
} // :cond_1d
} // :goto_4
v0 = com.a.e.i.v;
v1 = com.a.e.d.M;
/* aget v1, v1, v4 */
(( com.a.f.m ) v0 ).a ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Lcom/a/f/m;->a(II)V
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-eq v0, v4, :cond_1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.e.d.M;
/* aget v1, v1, v4 */
/* add-int/lit8 v1, v1, 0x1 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0xe */
com.a.f.w .a ( v0,v1 );
/* goto/16 :goto_1 */
} // :cond_1e
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_1f
v0 = com.a.e.d.M;
/* aget v0, v0, v4 */
/* if-ne v0, v6, :cond_21 */
/* const/16 v1, 0x13ec */
/* if-lt v0, v1, :cond_20 */
/* add-int/lit16 v0, v0, -0x13ec */
v0 = com.a.e.d.M;
/* aget v1, v0, v4 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v4 */
int v0 = 5; // const/4 v0, 0x5
final String v0 = "5100"; // const-string v0, "5100"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
} // :cond_20
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
} // :cond_21
v0 = com.a.e.d.M;
/* aget v0, v0, v4 */
/* if-ne v0, v7, :cond_23 */
/* const/16 v1, 0x23f0 */
/* if-lt v0, v1, :cond_22 */
/* add-int/lit16 v0, v0, -0x23f0 */
v0 = com.a.e.d.M;
/* aget v1, v0, v4 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v4 */
int v0 = 6; // const/4 v0, 0x6
final String v0 = "9200"; // const-string v0, "9200"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_4 */
} // :cond_22
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
/* goto/16 :goto_4 */
} // :cond_23
v0 = com.a.e.d.M;
/* aget v0, v0, v4 */
/* if-ne v0, v4, :cond_1d */
/* const/16 v1, 0x4010 */
/* if-lt v0, v1, :cond_24 */
/* add-int/lit16 v0, v0, -0x4010 */
v0 = com.a.e.d.M;
/* aget v1, v0, v4 */
/* add-int/lit8 v1, v1, 0x1 */
/* aput v1, v0, v4 */
int v0 = 7; // const/4 v0, 0x7
final String v0 = "16400"; // const-string v0, "16400"
com.a.f.w .a ( v0,v3 );
v0 = com.a.e.i.v;
(( com.a.f.m ) v0 ).a ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lcom/a/f/m;->a(II)V
/* goto/16 :goto_4 */
} // :cond_24
v0 = this.i;
/* iput v4, v0, Lcom/a/e/d;->F:I */
/* goto/16 :goto_4 */
} // .end method
public void c ( ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* sget-boolean v0, Lcom/a/e/n;->f:Z */
/* if-nez v0, :cond_2 */
v0 = this.s;
/* iput-boolean v1, v0, Lcom/a/d/d;->a:Z */
} // :cond_0
} // :goto_0
/* sget-boolean v0, Lcom/a/e/n;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
com.a.d.a.a = (v2!= 0);
} // :goto_1
/* sget-boolean v0, Lcom/a/d/a;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.t;
(( com.a.d.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/d/a;->a()V
} // :cond_1
return;
} // :cond_2
/* sget-boolean v0, Lcom/a/e/n;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.s;
/* iput-boolean v2, v0, Lcom/a/d/d;->a:Z */
} // :cond_3
com.a.d.a.a = (v1!= 0);
} // .end method
public void c ( Float p0, Float p1 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
v0 = this.r;
v0 = this.d;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_2
int v0 = 2; // const/4 v0, 0x2
/* sget-boolean v0, Lcom/a/d/a;->a:Z */
/* if-nez v0, :cond_1 */
com.a.d.a.a = (v2!= 0);
v0 = this.t;
(( com.a.d.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/d/a;->a()V
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* sget-boolean v0, Lcom/a/d/a;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
com.a.d.a.a = (v1!= 0);
com.a.d.a .b ( );
} // :cond_2
v0 = this.r;
v0 = this.c;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_4
int v0 = 3; // const/4 v0, 0x3
v0 = this.s;
/* iget-boolean v0, v0, Lcom/a/d/d;->a:Z */
/* if-nez v0, :cond_3 */
v0 = this.s;
/* iput-boolean v2, v0, Lcom/a/d/d;->a:Z */
} // :cond_3
v0 = this.s;
/* iget-boolean v0, v0, Lcom/a/d/d;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.s;
/* iput-boolean v1, v0, Lcom/a/d/d;->a:Z */
} // :cond_4
v0 = this.r;
v0 = this.g;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.r;
/* iput-boolean v1, v0, Lcom/a/e/n;->k:Z */
} // .end method
public void d ( Float p0, Float p1 ) {
/* .locals 7 */
int v6 = 3; // const/4 v6, 0x3
int v2 = 0; // const/4 v2, 0x0
int v5 = 2; // const/4 v5, 0x2
v0 = this.d;
v0 = this.h;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
} // :goto_0
/* if-ne v0, v5, :cond_1 */
/* move v3, v2 */
} // :goto_1
/* if-lt v3, v6, :cond_4 */
} // :cond_1
return;
} // :cond_2
v0 = this.d;
v0 = this.i;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
} // :cond_3
v0 = this.d;
v0 = this.j;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = com.a.e.i.a;
v1 = com.a.b.a.b;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/a/a/a;->h()V
v0 = this.d;
(( com.a.e.l ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/e/l;->a()V
} // :cond_4
/* move v1, v2 */
} // :goto_2
/* if-lt v1, v6, :cond_5 */
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // :cond_5
/* if-ne v3, v5, :cond_6 */
/* if-ne v3, v5, :cond_7 */
/* if-eq v1, v5, :cond_7 */
} // :cond_6
v0 = this.d;
v0 = this.k;
/* mul-int/lit8 v4, v3, 0x3 */
/* add-int/2addr v4, v1 */
(( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/a/c/d; */
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = this.d;
/* mul-int/lit8 v4, v3, 0x3 */
/* add-int/2addr v4, v1 */
/* iput v4, v0, Lcom/a/e/l;->l:I */
} // :cond_7
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // .end method
public void e ( Float p0, Float p1 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
int v3 = 1; // const/4 v3, 0x1
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, v0, Lcom/a/e/e;->p:I */
v0 = this.e;
/* iget v1, p0, Lcom/a/e/i;->W:F */
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* sub-float/2addr v1, v2 */
(( com.a.e.h ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/e/h;->a(F)V
v0 = this.e;
v0 = this.j;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.e;
/* iget v0, v0, Lcom/a/e/h;->h:I */
/* if-nez v0, :cond_1 */
/* if-gt v0, v1, :cond_1 */
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/a/a/a;->s()V
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.e;
v0 = this.l;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.e;
/* iget v0, v0, Lcom/a/e/h;->i:I */
int v1 = 3; // const/4 v1, 0x3
/* if-ge v0, v1, :cond_2 */
v0 = this.e;
/* iget v0, v0, Lcom/a/e/h;->h:I */
/* if-nez v0, :cond_2 */
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = this.e;
/* iget v1, v0, Lcom/a/e/h;->i:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, v0, Lcom/a/e/h;->i:I */
v0 = this.e;
/* iput-boolean v3, v0, Lcom/a/e/h;->u:Z */
v0 = this.e;
int v1 = 2; // const/4 v1, 0x2
/* iput v1, v0, Lcom/a/e/h;->h:I */
v0 = this.e;
/* iput v4, v0, Lcom/a/e/h;->f:F */
v0 = this.e;
/* iget v1, v0, Lcom/a/e/h;->i:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/a/e/h;->i:I */
} // :cond_2
v0 = this.e;
v0 = this.k;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.e;
/* iget v0, v0, Lcom/a/e/h;->i:I */
/* if-lez v0, :cond_3 */
v0 = this.e;
/* iget v0, v0, Lcom/a/e/h;->h:I */
/* if-nez v0, :cond_3 */
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = this.e;
/* iget v1, v0, Lcom/a/e/h;->i:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, v0, Lcom/a/e/h;->i:I */
v0 = this.e;
/* iput-boolean v3, v0, Lcom/a/e/h;->u:Z */
v0 = this.e;
/* iput v3, v0, Lcom/a/e/h;->h:I */
v0 = this.e;
/* iput v4, v0, Lcom/a/e/h;->f:F */
v0 = this.e;
/* iget v1, v0, Lcom/a/e/h;->i:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, v0, Lcom/a/e/h;->i:I */
} // :cond_3
v0 = this.e;
v0 = this.m;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
com.a.d.a .c ( );
/* new-instance v0, Lcom/a/d/a; */
v1 = com.a.e.i.u;
/* const v2, 0x7f04000d */
/* invoke-direct {v0, v1, v2, v3}, Lcom/a/d/a;-><init>(Landroid/content/Context;IZ)V */
this.t = v0;
v0 = this.t;
(( com.a.d.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/d/a;->a()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/a/a;->a()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/a/a/a;->n()V
/* goto/16 :goto_0 */
} // :cond_4
v0 = this.e;
v0 = this.w;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = java.lang.System.out;
final String v1 = "\u6e38\u620f\u8bbe\u7f6e"; // const-string v1, "\u6e38\u620f\u8bbe\u7f6e"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
v0 = this.r;
v1 = com.a.e.i.a;
v1 = this.A;
this.i = v1;
v0 = this.r;
/* iput-boolean v3, v0, Lcom/a/e/n;->k:Z */
/* goto/16 :goto_0 */
} // .end method
public void f ( Float p0, Float p1 ) {
/* .locals 5 */
int v4 = 3; // const/4 v4, 0x3
int v3 = 2; // const/4 v3, 0x2
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.g;
v0 = this.b;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = this.i;
/* iget v1, p0, Lcom/a/e/i;->M:I */
/* iput v1, v0, Lcom/a/e/d;->F:I */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).v ( ); // invoke-virtual {v0}, Lcom/a/a/a;->v()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/a/a/a;->o()V
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.g;
v0 = this.d;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* if-nez v0, :cond_3 */
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* iget-boolean v0, p0, Lcom/a/e/i;->J:Z */
/* if-nez v0, :cond_2 */
} // :cond_2
v0 = com.a.e.i.H;
com.calmei.jmsn.PlaneFightActivity .a ( v0,v2 );
} // :cond_3
v0 = this.g;
v0 = this.e;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* if-nez v0, :cond_5 */
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* iget-boolean v0, p0, Lcom/a/e/i;->J:Z */
/* if-nez v0, :cond_4 */
} // :cond_4
v0 = com.a.e.i.I;
com.calmei.jmsn.PlaneFightActivity .a ( v0,v2 );
} // :cond_5
v0 = this.g;
v0 = this.j;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_b
if ( v0 != null) { // if-eqz v0, :cond_b
/* if-ne v0, v1, :cond_7 */
/* iget-boolean v0, p0, Lcom/a/e/i;->K:Z */
/* if-nez v0, :cond_6 */
v0 = com.a.e.i.G;
com.a.e.i .a ( v0,v1,v2 );
} // :cond_6
v0 = com.a.e.i.G;
com.calmei.jmsn.PlaneFightActivity .a ( v0,v2 );
} // :cond_7
/* if-ne v0, v3, :cond_9 */
/* iget-boolean v0, p0, Lcom/a/e/i;->K:Z */
/* if-nez v0, :cond_8 */
v0 = com.a.e.i.H;
com.a.e.i .a ( v0,v1,v2 );
} // :cond_8
v0 = com.a.e.i.H;
com.calmei.jmsn.PlaneFightActivity .a ( v0,v2 );
} // :cond_9
/* if-ne v0, v4, :cond_0 */
/* iget-boolean v0, p0, Lcom/a/e/i;->K:Z */
/* if-nez v0, :cond_a */
v0 = com.a.e.i.I;
com.a.e.i .a ( v0,v1,v2 );
/* goto/16 :goto_0 */
} // :cond_a
v0 = com.a.e.i.I;
com.calmei.jmsn.PlaneFightActivity .a ( v0,v2 );
/* goto/16 :goto_0 */
} // :cond_b
v0 = this.g;
v0 = this.k;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-ne v0, v1, :cond_c */
v0 = com.a.e.i.G;
com.a.e.i .a ( v0,v2,v2 );
/* goto/16 :goto_0 */
} // :cond_c
/* if-ne v0, v3, :cond_d */
v0 = com.a.e.i.H;
com.a.e.i .a ( v0,v2,v2 );
/* goto/16 :goto_0 */
} // :cond_d
/* if-ne v0, v4, :cond_0 */
v0 = com.a.e.i.I;
com.a.e.i .a ( v0,v2,v2 );
/* goto/16 :goto_0 */
} // .end method
public void g ( Float p0, Float p1 ) {
/* .locals 8 */
int v3 = 4; // const/4 v3, 0x4
int v7 = 3; // const/4 v7, 0x3
int v6 = 0; // const/4 v6, 0x0
int v5 = 2; // const/4 v5, 0x2
int v4 = 1; // const/4 v4, 0x1
v0 = this.b;
/* iget v0, v0, Lcom/a/c/g;->h:I */
/* if-ne v0, v4, :cond_0 */
v0 = this.b;
/* iput v5, v0, Lcom/a/c/g;->h:I */
} // :cond_0
v0 = this.b;
v0 = this.d;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
/* if-nez v0, :cond_1 */
v0 = this.b;
v0 = this.e;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* sget-boolean v0, Lcom/a/c/g;->o:Z */
/* if-nez v0, :cond_2 */
/* iget-boolean v0, p0, Lcom/a/e/i;->w:Z */
/* if-nez v0, :cond_2 */
v1 = this.i;
v1 = this.ac;
v2 = com.a.e.d.M;
/* aget v2, v2, v4 */
/* aget v1, v1, v2 */
/* if-lt v0, v1, :cond_2 */
v0 = com.a.c.n.a;
/* aget v0, v0, v5 */
/* if-eq v0, v4, :cond_2 */
v1 = this.i;
v1 = this.ac;
v2 = com.a.e.d.M;
/* aget v2, v2, v4 */
/* aget v1, v1, v2 */
/* sub-int/2addr v0, v1 */
v0 = this.s;
final String v1 = "anger"; // const-string v1, "anger"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = this.b;
v0 = this.a;
/* iput-boolean v6, v0, Lcom/a/c/f;->h:Z */
com.a.c.j.T = (v6!= 0);
com.a.c.l.D = (v6!= 0);
v0 = this.i;
(( com.a.e.d ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/a/e/d;->f()V
v0 = this.b;
/* new-instance v1, Lcom/a/c/n; */
v2 = com.a.e.i.a;
/* invoke-direct {v1, v2, v5, v4}, Lcom/a/c/n;-><init>(Lcom/a/a/a;II)V */
this.c = v1;
} // :cond_1
} // :goto_0
return;
} // :cond_2
v0 = this.b;
v0 = this.f;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* sget-boolean v0, Lcom/a/c/g;->o:Z */
/* if-nez v0, :cond_3 */
/* iget-boolean v0, p0, Lcom/a/e/i;->w:Z */
/* if-nez v0, :cond_3 */
v1 = this.i;
v1 = this.ab;
v2 = com.a.e.d.M;
/* aget v2, v2, v5 */
/* aget v1, v1, v2 */
/* if-lt v0, v1, :cond_3 */
v0 = com.a.c.n.a;
/* aget v0, v0, v7 */
/* if-eq v0, v4, :cond_3 */
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "equip.skillAnger_2[equip.skills_leve[2]]====="; // const-string v2, "equip.skillAnger_2[equip.skills_leve[2]]====="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = this.i;
v2 = this.ab;
v3 = com.a.e.d.M;
/* aget v3, v3, v5 */
/* aget v2, v2, v3 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "equip.skills_leve[2]====="; // const-string v2, "equip.skills_leve[2]====="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = com.a.e.d.M;
/* aget v2, v2, v5 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "equip.skills_leve[0]====="; // const-string v2, "equip.skills_leve[0]====="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = com.a.e.d.M;
/* aget v2, v2, v6 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "equip.skills_leve[1]====="; // const-string v2, "equip.skills_leve[1]====="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = com.a.e.d.M;
/* aget v2, v2, v4 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "equip.skills_leve[3]====="; // const-string v2, "equip.skills_leve[3]====="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = com.a.e.d.M;
/* aget v2, v2, v7 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
v1 = this.i;
v1 = this.ab;
v2 = com.a.e.d.M;
/* aget v2, v2, v5 */
/* aget v1, v1, v2 */
/* sub-int/2addr v0, v1 */
v0 = this.s;
final String v1 = "blessing"; // const-string v1, "blessing"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = this.i;
(( com.a.e.d ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/a/e/d;->d()V
v0 = this.b;
/* new-instance v1, Lcom/a/c/n; */
v2 = com.a.e.i.a;
/* invoke-direct {v1, v2, v7, v4}, Lcom/a/c/n;-><init>(Lcom/a/a/a;II)V */
this.c = v1;
/* goto/16 :goto_0 */
} // :cond_3
v0 = this.b;
v0 = this.k;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* new-instance v0, Lcom/a/e/f; */
v1 = com.a.e.i.a;
/* invoke-direct {v0, v1}, Lcom/a/e/f;-><init>(Lcom/a/a/a;)V */
com.a.c.g.o = (v4!= 0);
com.a.c.l.D = (v6!= 0);
com.a.c.j.T = (v6!= 0);
v0 = this.b;
v0 = this.b;
com.a.c.j.x = (v6!= 0);
/* goto/16 :goto_0 */
} // :cond_4
v0 = this.b;
v0 = this.g;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.s;
final String v1 = "click"; // const-string v1, "click"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).y ( ); // invoke-virtual {v0}, Lcom/a/a/a;->y()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/a/a/a;->o()V
/* goto/16 :goto_0 */
} // :cond_5
v0 = this.b;
v0 = this.i;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_1a
v0 = this.s;
final String v1 = "change"; // const-string v1, "change"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* if-nez v0, :cond_b */
v0 = com.a.e.d.i;
int v1 = 5; // const/4 v1, 0x5
/* aget v0, v0, v1 */
/* if-ne v0, v4, :cond_6 */
int v0 = 5; // const/4 v0, 0x5
/* goto/16 :goto_0 */
} // :cond_6
v0 = com.a.e.d.i;
/* aget v0, v0, v3 */
/* if-ne v0, v4, :cond_7 */
/* goto/16 :goto_0 */
} // :cond_7
v0 = com.a.e.d.i;
/* aget v0, v0, v7 */
/* if-ne v0, v4, :cond_8 */
/* goto/16 :goto_0 */
} // :cond_8
v0 = com.a.e.d.i;
/* aget v0, v0, v5 */
/* if-ne v0, v4, :cond_9 */
/* goto/16 :goto_0 */
} // :cond_9
v0 = com.a.e.d.i;
/* aget v0, v0, v4 */
/* if-ne v0, v4, :cond_a */
/* goto/16 :goto_0 */
} // :cond_a
/* goto/16 :goto_0 */
} // :cond_b
/* if-ne v0, v4, :cond_c */
v0 = com.a.e.d.i;
/* aget v0, v0, v6 */
/* if-ne v0, v4, :cond_1 */
/* goto/16 :goto_0 */
} // :cond_c
/* if-ne v0, v5, :cond_e */
v0 = com.a.e.d.i;
/* aget v0, v0, v4 */
/* if-ne v0, v4, :cond_d */
/* goto/16 :goto_0 */
} // :cond_d
/* goto/16 :goto_0 */
} // :cond_e
/* if-ne v0, v7, :cond_11 */
v0 = com.a.e.d.i;
/* aget v0, v0, v5 */
/* if-ne v0, v4, :cond_f */
/* goto/16 :goto_0 */
} // :cond_f
v0 = com.a.e.d.i;
/* aget v0, v0, v4 */
/* if-ne v0, v4, :cond_10 */
/* goto/16 :goto_0 */
} // :cond_10
/* goto/16 :goto_0 */
} // :cond_11
/* if-ne v0, v3, :cond_15 */
v0 = com.a.e.d.i;
/* aget v0, v0, v7 */
/* if-ne v0, v4, :cond_12 */
/* goto/16 :goto_0 */
} // :cond_12
v0 = com.a.e.d.i;
/* aget v0, v0, v5 */
/* if-ne v0, v4, :cond_13 */
/* goto/16 :goto_0 */
} // :cond_13
v0 = com.a.e.d.i;
/* aget v0, v0, v4 */
/* if-ne v0, v4, :cond_14 */
/* goto/16 :goto_0 */
} // :cond_14
/* goto/16 :goto_0 */
} // :cond_15
int v1 = 5; // const/4 v1, 0x5
/* if-ne v0, v1, :cond_1 */
v0 = com.a.e.d.i;
/* aget v0, v0, v3 */
/* if-ne v0, v4, :cond_16 */
/* goto/16 :goto_0 */
} // :cond_16
v0 = com.a.e.d.i;
/* aget v0, v0, v7 */
/* if-ne v0, v4, :cond_17 */
/* goto/16 :goto_0 */
} // :cond_17
v0 = com.a.e.d.i;
/* aget v0, v0, v5 */
/* if-ne v0, v4, :cond_18 */
/* goto/16 :goto_0 */
} // :cond_18
v0 = com.a.e.d.i;
/* aget v0, v0, v4 */
/* if-ne v0, v4, :cond_19 */
/* goto/16 :goto_0 */
} // :cond_19
/* goto/16 :goto_0 */
} // :cond_1a
v0 = this.b;
v0 = this.j;
v0 = (( com.a.c.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.s;
final String v1 = "change"; // const-string v1, "change"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* if-nez v0, :cond_20 */
v0 = com.a.e.d.i;
/* aget v0, v0, v4 */
/* if-ne v0, v4, :cond_1b */
/* goto/16 :goto_0 */
} // :cond_1b
v0 = com.a.e.d.i;
/* aget v0, v0, v5 */
/* if-ne v0, v4, :cond_1c */
/* goto/16 :goto_0 */
} // :cond_1c
v0 = com.a.e.d.i;
/* aget v0, v0, v7 */
/* if-ne v0, v4, :cond_1d */
/* goto/16 :goto_0 */
} // :cond_1d
v0 = com.a.e.d.i;
/* aget v0, v0, v3 */
/* if-ne v0, v4, :cond_1e */
/* goto/16 :goto_0 */
} // :cond_1e
v0 = com.a.e.d.i;
int v1 = 5; // const/4 v1, 0x5
/* aget v0, v0, v1 */
/* if-ne v0, v4, :cond_1f */
int v0 = 5; // const/4 v0, 0x5
/* goto/16 :goto_0 */
} // :cond_1f
/* goto/16 :goto_0 */
} // :cond_20
/* if-ne v0, v4, :cond_25 */
v0 = com.a.e.d.i;
/* aget v0, v0, v5 */
/* if-ne v0, v4, :cond_21 */
/* goto/16 :goto_0 */
} // :cond_21
v0 = com.a.e.d.i;
/* aget v0, v0, v7 */
/* if-ne v0, v4, :cond_22 */
/* goto/16 :goto_0 */
} // :cond_22
v0 = com.a.e.d.i;
/* aget v0, v0, v3 */
/* if-ne v0, v4, :cond_23 */
/* goto/16 :goto_0 */
} // :cond_23
v0 = com.a.e.d.i;
int v1 = 5; // const/4 v1, 0x5
/* aget v0, v0, v1 */
/* if-ne v0, v4, :cond_24 */
int v0 = 5; // const/4 v0, 0x5
/* goto/16 :goto_0 */
} // :cond_24
/* goto/16 :goto_0 */
} // :cond_25
/* if-ne v0, v5, :cond_29 */
v0 = com.a.e.d.i;
/* aget v0, v0, v7 */
/* if-ne v0, v4, :cond_26 */
/* goto/16 :goto_0 */
} // :cond_26
v0 = com.a.e.d.i;
/* aget v0, v0, v3 */
/* if-ne v0, v4, :cond_27 */
/* goto/16 :goto_0 */
} // :cond_27
v0 = com.a.e.d.i;
int v1 = 5; // const/4 v1, 0x5
/* aget v0, v0, v1 */
/* if-ne v0, v4, :cond_28 */
int v0 = 5; // const/4 v0, 0x5
/* goto/16 :goto_0 */
} // :cond_28
/* goto/16 :goto_0 */
} // :cond_29
/* if-ne v0, v7, :cond_2c */
v0 = com.a.e.d.i;
/* aget v0, v0, v3 */
/* if-ne v0, v4, :cond_2a */
/* goto/16 :goto_0 */
} // :cond_2a
v0 = com.a.e.d.i;
int v1 = 5; // const/4 v1, 0x5
/* aget v0, v0, v1 */
/* if-ne v0, v4, :cond_2b */
int v0 = 5; // const/4 v0, 0x5
/* goto/16 :goto_0 */
} // :cond_2b
/* goto/16 :goto_0 */
} // :cond_2c
/* if-ne v0, v3, :cond_2e */
v0 = com.a.e.d.i;
int v1 = 5; // const/4 v1, 0x5
/* aget v0, v0, v1 */
/* if-ne v0, v4, :cond_2d */
int v0 = 5; // const/4 v0, 0x5
/* goto/16 :goto_0 */
} // :cond_2d
/* goto/16 :goto_0 */
} // :cond_2e
int v1 = 5; // const/4 v1, 0x5
/* if-ne v0, v1, :cond_1 */
/* goto/16 :goto_0 */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 9 */
/* const/high16 v8, 0x40800000 # 4.0f */
int v7 = 3; // const/4 v7, 0x3
int v6 = 2; // const/4 v6, 0x2
int v0 = 0; // const/4 v0, 0x0
int v5 = 1; // const/4 v5, 0x1
v1 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-ne v1, v5, :cond_0 */
v1 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v4 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* iput v4, p0, Lcom/a/e/i;->U:F */
v4 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* iput v4, p0, Lcom/a/e/i;->V:F */
/* packed-switch v1, :pswitch_data_0 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
/* :pswitch_1 */
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iput v1, p0, Lcom/a/e/i;->W:F */
com.a.e.i .d ( );
v2 = com.a.e.i.a;
v2 = this.A;
v2 = (( com.a.b.a ) v2 ).ordinal ( ); // invoke-virtual {v2}, Lcom/a/b/a;->ordinal()I
/* aget v1, v1, v2 */
/* packed-switch v1, :pswitch_data_1 */
/* :pswitch_2 */
/* :pswitch_3 */
v1 = this.r;
/* iget-boolean v1, v1, Lcom/a/e/n;->k:Z */
/* if-nez v1, :cond_0 */
/* sget-boolean v1, Lcom/a/e/e;->s:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
com.a.e.e.s = (v0!= 0);
} // :cond_1
v0 = this.c;
v0 = this.d;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_2
v0 = this.c;
v0 = this.e;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_3
v0 = this.c;
v0 = this.h;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_4
} // :cond_4
v0 = this.c;
v0 = this.i;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_5
int v0 = 4; // const/4 v0, 0x4
} // :cond_5
v0 = this.c;
v0 = this.f;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c;
/* iget-boolean v0, v0, Lcom/a/e/e;->w:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 5; // const/4 v0, 0x5
/* :pswitch_4 */
v0 = this.r;
/* iget-boolean v0, v0, Lcom/a/e/n;->k:Z */
/* if-nez v0, :cond_0 */
v0 = this.e;
v0 = this.m;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* goto/16 :goto_0 */
} // :cond_6
v0 = this.e;
v0 = this.w;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* goto/16 :goto_0 */
/* :pswitch_5 */
v0 = this.r;
/* iget-boolean v0, v0, Lcom/a/e/n;->k:Z */
/* if-nez v0, :cond_0 */
v0 = this.f;
v0 = this.b;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_7
/* goto/16 :goto_0 */
} // :cond_7
v0 = this.f;
v0 = this.d;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* goto/16 :goto_0 */
/* :pswitch_6 */
v0 = this.c;
/* iget-boolean v0, v0, Lcom/a/e/e;->t:Z */
/* if-nez v0, :cond_8 */
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).t ( ); // invoke-virtual {v0}, Lcom/a/a/a;->t()V
} // :cond_8
v0 = this.i;
v0 = this.k;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_9
v0 = this.i;
/* iput v5, v0, Lcom/a/e/d;->U:I */
} // :cond_9
v0 = this.i;
v0 = this.j;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.i;
/* iput v7, v0, Lcom/a/e/d;->U:I */
/* goto/16 :goto_0 */
/* :pswitch_7 */
/* sget-boolean v1, Lcom/a/c/g;->o:Z */
/* if-nez v1, :cond_0 */
/* sget-boolean v1, Lcom/a/c/j;->Z:Z */
/* if-nez v1, :cond_0 */
/* if-nez v1, :cond_0 */
v1 = this.b;
v1 = this.i;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_b
} // :cond_a
} // :goto_1
v0 = this.b;
/* iget v0, v0, Lcom/a/c/g;->h:I */
/* if-eq v0, v5, :cond_0 */
/* if-nez v0, :cond_0 */
/* sget-boolean v0, Lcom/a/c/g;->o:Z */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lcom/a/e/i;->V:F */
/* const/high16 v1, 0x43be0000 # 380.0f */
com.a.a.a .b ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
v0 = this.b;
v0 = this.b;
/* iput-boolean v5, v0, Lcom/a/c/j;->ap:Z */
v0 = this.b;
v0 = this.b;
com.a.c.j.x = (v5!= 0);
v0 = this.b;
v0 = this.b;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
(( com.a.c.j ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/j;->a(FF)V
/* goto/16 :goto_0 */
} // :cond_b
v1 = this.b;
v1 = this.j;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_c
} // :cond_c
v1 = this.b;
v1 = this.d;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_d
/* sget-boolean v1, Lcom/a/c/g;->o:Z */
/* if-nez v1, :cond_d */
/* iget-boolean v1, p0, Lcom/a/e/i;->w:Z */
/* if-nez v1, :cond_d */
v2 = this.i;
v2 = this.aa;
v3 = com.a.e.d.M;
/* aget v3, v3, v0 */
/* aget v2, v2, v3 */
/* if-lt v1, v2, :cond_d */
v1 = com.a.c.n.a;
/* aget v1, v1, v5 */
/* if-eq v1, v5, :cond_d */
v1 = this.i;
(( com.a.e.d ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/e/d;->c()V
v2 = this.i;
v2 = this.aa;
v3 = com.a.e.d.M;
/* aget v0, v3, v0 */
/* aget v0, v2, v0 */
/* sub-int v0, v1, v0 */
/* goto/16 :goto_1 */
} // :cond_d
v0 = this.b;
v0 = this.e;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_e
v1 = this.i;
v1 = this.ac;
v2 = com.a.e.d.M;
/* aget v2, v2, v7 */
/* aget v1, v1, v2 */
/* if-lt v0, v1, :cond_e */
v0 = com.a.c.n.a;
/* aget v0, v0, v7 */
/* if-eq v0, v5, :cond_e */
int v0 = 4; // const/4 v0, 0x4
/* goto/16 :goto_1 */
} // :cond_e
v0 = this.b;
v0 = this.f;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_a
v1 = this.i;
v1 = this.ab;
v2 = com.a.e.d.M;
/* aget v2, v2, v5 */
/* aget v1, v1, v2 */
/* if-lt v0, v1, :cond_a */
v0 = com.a.c.n.a;
/* aget v0, v0, v6 */
/* if-eq v0, v5, :cond_a */
int v0 = 5; // const/4 v0, 0x5
/* goto/16 :goto_1 */
/* :pswitch_8 */
v1 = this.r;
v1 = this.d;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_10
/* sget-boolean v1, Lcom/a/d/a;->a:Z */
/* if-nez v1, :cond_f */
com.a.d.a.a = (v5!= 0);
v0 = this.t;
(( com.a.d.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/d/a;->a()V
/* goto/16 :goto_0 */
} // :cond_f
/* sget-boolean v1, Lcom/a/d/a;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
com.a.d.a.a = (v0!= 0);
com.a.d.a .b ( );
/* goto/16 :goto_0 */
} // :cond_10
v1 = this.r;
v1 = this.c;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_12
v1 = this.s;
/* iget-boolean v1, v1, Lcom/a/d/d;->a:Z */
/* if-nez v1, :cond_11 */
v0 = this.s;
/* iput-boolean v5, v0, Lcom/a/d/d;->a:Z */
/* goto/16 :goto_0 */
} // :cond_11
v1 = this.s;
/* iget-boolean v1, v1, Lcom/a/d/d;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.s;
/* iput-boolean v0, v1, Lcom/a/d/d;->a:Z */
/* goto/16 :goto_0 */
} // :cond_12
v1 = this.r;
v1 = this.g;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.r;
/* iput-boolean v0, v1, Lcom/a/e/n;->k:Z */
/* goto/16 :goto_0 */
/* :pswitch_9 */
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* sub-float/2addr v1, v2 */
/* iput v1, p0, Lcom/a/e/i;->Z:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
/* sub-float/2addr v1, v3 */
/* iput v1, p0, Lcom/a/e/i;->aa:F */
com.a.e.i .d ( );
v2 = com.a.e.i.a;
v2 = this.A;
v2 = (( com.a.b.a ) v2 ).ordinal ( ); // invoke-virtual {v2}, Lcom/a/b/a;->ordinal()I
/* aget v1, v1, v2 */
/* packed-switch v1, :pswitch_data_2 */
/* :pswitch_a */
/* goto/16 :goto_0 */
/* :pswitch_b */
v0 = this.d;
/* iget v1, p0, Lcom/a/e/i;->Z:F */
/* iget v2, p0, Lcom/a/e/i;->aa:F */
(( com.a.e.l ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/e/l;->a(FF)V
/* goto/16 :goto_0 */
/* :pswitch_c */
v0 = this.b;
/* iget v0, v0, Lcom/a/c/g;->h:I */
/* if-eq v0, v5, :cond_13 */
/* sget-boolean v0, Lcom/a/c/g;->o:Z */
/* if-nez v0, :cond_13 */
/* if-nez v0, :cond_13 */
/* iget v0, p0, Lcom/a/e/i;->V:F */
/* const/high16 v1, 0x43be0000 # 380.0f */
com.a.a.a .b ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_13 */
v0 = this.b;
v0 = this.b;
/* iput-boolean v5, v0, Lcom/a/c/j;->ap:Z */
v0 = this.b;
v0 = this.b;
com.a.c.j.x = (v5!= 0);
v0 = this.b;
v0 = this.b;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
(( com.a.c.j ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/j;->a(FF)V
} // :cond_13
v0 = this.b;
/* iget v0, v0, Lcom/a/c/g;->h:I */
/* if-ne v0, v5, :cond_14 */
/* sget-boolean v0, Lcom/a/c/g;->o:Z */
/* if-nez v0, :cond_14 */
v0 = this.b;
/* iget v1, p0, Lcom/a/e/i;->Z:F */
/* iget v2, p0, Lcom/a/e/i;->aa:F */
(( com.a.c.g ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/g;->a(FF)V
} // :cond_14
v0 = this.b;
v0 = this.d;
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* sget-boolean v0, Lcom/a/c/g;->o:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lcom/a/e/i;->w:Z */
/* if-nez v0, :cond_0 */
/* if-ne v0, v7, :cond_0 */
v0 = com.a.c.n.a;
/* aget v0, v0, v5 */
/* if-eq v0, v5, :cond_0 */
v0 = java.lang.System.out;
final String v1 = "\u6309\u4e0b\u5927\u62db\ufffd?\ufffd\ufffd1"; // const-string v1, "\u6309\u4e0b\u5927\u62db\ufffd?\ufffd\ufffd1"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
v0 = this.b;
/* new-instance v1, Lcom/a/c/n; */
v2 = com.a.e.i.a;
/* invoke-direct {v1, v2, v5, v5}, Lcom/a/c/n;-><init>(Lcom/a/a/a;II)V */
this.c = v1;
v0 = this.b;
/* iput v5, v0, Lcom/a/c/g;->h:I */
/* goto/16 :goto_0 */
/* :pswitch_d */
v1 = this.r;
/* iget-boolean v1, v1, Lcom/a/e/n;->k:Z */
/* if-nez v1, :cond_0 */
v0 = this.e;
/* iget v1, p0, Lcom/a/e/i;->Z:F */
/* iget v2, p0, Lcom/a/e/i;->aa:F */
(( com.a.e.h ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/e/h;->a(FF)V
/* goto/16 :goto_0 */
/* :pswitch_e */
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-ne v0, v5, :cond_15 */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* const/high16 v1, 0x42820000 # 65.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* const/high16 v1, 0x43be0000 # 380.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lcom/a/e/i;->V:F */
/* const/high16 v1, 0x42dc0000 # 110.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lcom/a/e/i;->V:F */
/* const/high16 v1, 0x43b40000 # 360.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
v0 = this.i;
/* iget v1, p0, Lcom/a/e/i;->Z:F */
/* iget v2, p0, Lcom/a/e/i;->aa:F */
(( com.a.e.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/e/d;->a(FF)V
/* goto/16 :goto_0 */
} // :cond_15
v0 = this.i;
/* iget v0, v0, Lcom/a/e/d;->F:I */
/* if-ne v0, v6, :cond_0 */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* const/high16 v1, 0x42820000 # 65.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* const/high16 v1, 0x43be0000 # 380.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lcom/a/e/i;->V:F */
/* const/high16 v1, 0x42dc0000 # 110.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lcom/a/e/i;->V:F */
/* const/high16 v1, 0x43b40000 # 360.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
v0 = this.i;
/* iget v1, p0, Lcom/a/e/i;->Z:F */
/* iget v2, p0, Lcom/a/e/i;->aa:F */
(( com.a.e.d ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/a/e/d;->b(FF)V
/* goto/16 :goto_0 */
/* :pswitch_f */
com.a.e.i .d ( );
v2 = com.a.e.i.a;
v2 = this.A;
v2 = (( com.a.b.a ) v2 ).ordinal ( ); // invoke-virtual {v2}, Lcom/a/b/a;->ordinal()I
/* aget v1, v1, v2 */
/* packed-switch v1, :pswitch_data_3 */
/* :pswitch_10 */
/* goto/16 :goto_0 */
/* :pswitch_11 */
v1 = com.a.e.i.a;
/* iput-boolean v0, v1, Lcom/a/a/a;->C:Z */
v0 = this.r;
/* iget-boolean v0, v0, Lcom/a/e/n;->k:Z */
/* if-nez v0, :cond_16 */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
/* invoke-direct {p0, v0, v1}, Lcom/a/e/i;->h(FF)V */
/* goto/16 :goto_0 */
} // :cond_16
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
(( com.a.e.i ) p0 ).c ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/a/e/i;->c(FF)V
/* goto/16 :goto_0 */
/* :pswitch_12 */
v1 = this.r;
v1 = this.g;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.r;
/* iput-boolean v0, v1, Lcom/a/e/n;->k:Z */
v0 = this.r;
v0 = this.i;
v1 = com.a.b.a.l;
/* if-eq v0, v1, :cond_17 */
v0 = com.a.e.i.a;
v1 = this.r;
v1 = this.i;
this.A = v1;
/* goto/16 :goto_0 */
} // :cond_17
v0 = com.a.e.i.a;
v1 = com.a.b.a.d;
this.A = v1;
/* goto/16 :goto_0 */
/* :pswitch_13 */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
(( com.a.e.i ) p0 ).d ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/a/e/i;->d(FF)V
/* goto/16 :goto_0 */
/* :pswitch_14 */
v0 = this.r;
/* iget-boolean v0, v0, Lcom/a/e/n;->k:Z */
/* if-nez v0, :cond_18 */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
(( com.a.e.i ) p0 ).e ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/a/e/i;->e(FF)V
/* goto/16 :goto_0 */
} // :cond_18
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
(( com.a.e.i ) p0 ).c ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/a/e/i;->c(FF)V
/* goto/16 :goto_0 */
/* :pswitch_15 */
v1 = this.r;
/* iget-boolean v1, v1, Lcom/a/e/n;->k:Z */
/* if-nez v1, :cond_1c */
v1 = this.f;
v1 = this.b;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_1b
v1 = com.a.e.i.a;
v2 = com.a.b.a.h;
this.A = v2;
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/a/a/a;->m()V
} // :cond_19
} // :goto_2
/* move v1, v0 */
} // :goto_3
int v0 = 6; // const/4 v0, 0x6
/* if-ge v1, v0, :cond_0 */
v0 = this.f;
v0 = this.c;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/a/c/d; */
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v0 = (( com.a.c.d ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_1a
v0 = com.a.e.g.e;
/* aget v0, v0, v2 */
/* if-ge v1, v0, :cond_1a */
v0 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v0 = com.a.e.i.a;
/* iput v2, v0, Lcom/a/a/a;->D:I */
v0 = com.a.e.i.a;
/* iput v1, v0, Lcom/a/a/a;->E:I */
v0 = com.a.e.i.a;
v2 = com.a.b.a.h;
this.A = v2;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/a/a/a;->o()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).t ( ); // invoke-virtual {v0}, Lcom/a/a/a;->t()V
} // :cond_1a
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_1b
v1 = this.f;
v1 = this.d;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_19
v1 = this.s;
final String v2 = "click"; // const-string v2, "click"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = this.r;
v2 = com.a.e.i.a;
v2 = this.A;
this.i = v2;
v1 = this.r;
/* iput-boolean v5, v1, Lcom/a/e/n;->k:Z */
} // :cond_1c
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
(( com.a.e.i ) p0 ).c ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/a/e/i;->c(FF)V
/* goto/16 :goto_0 */
/* :pswitch_16 */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
(( com.a.e.i ) p0 ).f ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/a/e/i;->f(FF)V
/* goto/16 :goto_0 */
/* :pswitch_17 */
v1 = this.b;
v1 = this.b;
/* iput-boolean v0, v1, Lcom/a/c/j;->ao:Z */
v1 = this.b;
v1 = this.b;
/* iput-boolean v5, v1, Lcom/a/c/j;->m:Z */
v1 = this.b;
v1 = this.b;
int v2 = 0; // const/4 v2, 0x0
/* iput v2, v1, Lcom/a/c/j;->j:F */
v1 = this.b;
v1 = this.b;
/* iput-boolean v0, v1, Lcom/a/c/j;->ap:Z */
v1 = this.b;
v1 = this.b;
com.a.c.j.x = (v0!= 0);
/* iget-boolean v1, p0, Lcom/a/e/i;->w:Z */
if ( v1 != null) { // if-eqz v1, :cond_1d
v1 = this.b;
v1 = this.b;
/* iput v0, v1, Lcom/a/c/j;->y:I */
/* iget v1, p0, Lcom/a/e/i;->U:F */
/* iget v2, p0, Lcom/a/e/i;->V:F */
(( com.a.e.i ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/a/e/i;->a(FF)V
} // :cond_1d
/* sget-boolean v1, Lcom/a/e/i;->l:Z */
if ( v1 != null) { // if-eqz v1, :cond_1e
v1 = com.a.c.h.j;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_20
/* sget-boolean v1, Lcom/a/c/j;->aG:Z */
if ( v1 != null) { // if-eqz v1, :cond_20
/* iget-boolean v1, p0, Lcom/a/e/i;->K:Z */
/* if-nez v1, :cond_1f */
v1 = com.a.e.i.F;
com.a.e.i .a ( v1,v5,v6 );
} // :cond_1e
} // :goto_4
/* sget-boolean v1, Lcom/a/c/g;->o:Z */
/* if-nez v1, :cond_21 */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
(( com.a.e.i ) p0 ).g ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/a/e/i;->g(FF)V
/* goto/16 :goto_0 */
} // :cond_1f
v1 = com.a.e.i.F;
com.calmei.jmsn.PlaneFightActivity .a ( v1,v6 );
} // :cond_20
v1 = com.a.c.h.k;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_1e
/* sget-boolean v1, Lcom/a/c/j;->aG:Z */
if ( v1 != null) { // if-eqz v1, :cond_1e
v1 = com.a.e.i.F;
com.a.e.i .a ( v1,v0,v6 );
} // :cond_21
v1 = com.a.e.i.j;
v1 = this.b;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_22
final String v1 = "|"; // const-string v1, "|"
com.a.f.w .a ( v1,v0 );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* sub-int/2addr v2, v3 */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v2, 0x11 */
com.a.f.w .a ( v1,v2 );
final String v1 = "second"; // const-string v1, "second"
com.calmei.jmsn.PlaneFightActivity .a ( v1 );
v1 = this.s;
final String v2 = "change"; // const-string v2, "change"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = com.a.e.i.j;
/* iput v8, v1, Lcom/a/e/f;->e:F */
v1 = this.b;
v1 = this.b;
/* iput-boolean v0, v1, Lcom/a/c/j;->ap:Z */
com.a.c.g.o = (v0!= 0);
com.a.c.l.D = (v5!= 0);
com.a.c.j.T = (v5!= 0);
v1 = this.b;
v1 = this.b;
com.a.c.j.x = (v0!= 0);
com.a.d.a .c ( );
/* new-instance v0, Lcom/a/d/a; */
v1 = com.a.e.i.u;
/* const v2, 0x7f04000d */
/* invoke-direct {v0, v1, v2, v5}, Lcom/a/d/a;-><init>(Landroid/content/Context;IZ)V */
this.t = v0;
v0 = this.t;
(( com.a.d.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/d/a;->a()V
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).y ( ); // invoke-virtual {v0}, Lcom/a/a/a;->y()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/a/a/a;->c()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/a/a/a;->o()V
/* goto/16 :goto_0 */
} // :cond_22
v1 = com.a.e.i.j;
v1 = this.c;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_24
v1 = com.a.e.i.a;
/* iget v1, v1, Lcom/a/a/a;->D:I */
/* if-nez v1, :cond_23 */
v1 = com.a.e.i.a;
/* iget v1, v1, Lcom/a/a/a;->E:I */
/* if-ne v1, v6, :cond_23 */
/* iget-boolean v1, p0, Lcom/a/e/i;->J:Z */
if ( v1 != null) { // if-eqz v1, :cond_23
/* if-eq v1, v5, :cond_23 */
v1 = com.a.e.i.j;
/* iput v8, v1, Lcom/a/e/f;->e:F */
com.a.c.l.D = (v5!= 0);
com.a.c.j.T = (v5!= 0);
v1 = this.b;
v1 = this.b;
com.a.c.j.x = (v0!= 0);
com.a.c.g.o = (v0!= 0);
v1 = this.b;
v1 = this.b;
/* iput-boolean v0, v1, Lcom/a/c/j;->ap:Z */
v0 = com.a.e.i.a;
v1 = com.a.b.a.h;
this.A = v1;
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/a/a;->a()V
v0 = com.a.e.i.a;
(( com.a.a.a ) v0 ).y ( ); // invoke-virtual {v0}, Lcom/a/a/a;->y()V
/* goto/16 :goto_0 */
} // :cond_23
v1 = this.s;
final String v2 = "change"; // const-string v2, "change"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = com.a.e.i.a;
v2 = com.a.b.a.d;
this.A = v2;
v1 = com.a.e.i.j;
/* iput v8, v1, Lcom/a/e/f;->e:F */
com.a.c.l.D = (v5!= 0);
com.a.c.j.T = (v5!= 0);
v1 = this.b;
v1 = this.b;
com.a.c.j.x = (v0!= 0);
com.a.c.g.o = (v0!= 0);
v1 = this.b;
v1 = this.b;
/* iput-boolean v0, v1, Lcom/a/c/j;->ap:Z */
/* goto/16 :goto_0 */
} // :cond_24
v1 = com.a.e.i.j;
v1 = this.d;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "|"; // const-string v1, "|"
com.a.f.w .a ( v1,v0 );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* sub-int/2addr v2, v3 */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v2, 0x11 */
com.a.f.w .a ( v1,v2 );
final String v1 = "second"; // const-string v1, "second"
com.calmei.jmsn.PlaneFightActivity .a ( v1 );
v1 = this.s;
final String v2 = "change"; // const-string v2, "change"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = com.a.e.i.a;
v2 = com.a.b.a.h;
this.A = v2;
com.a.d.a .c ( );
/* new-instance v1, Lcom/a/d/a; */
v2 = com.a.e.i.u;
/* const v3, 0x7f040010 */
/* invoke-direct {v1, v2, v3, v5}, Lcom/a/d/a;-><init>(Landroid/content/Context;IZ)V */
this.t = v1;
v1 = this.t;
(( com.a.d.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/d/a;->a()V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).y ( ); // invoke-virtual {v1}, Lcom/a/a/a;->y()V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/a/a;->c()V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).u ( ); // invoke-virtual {v1}, Lcom/a/a/a;->u()V
v1 = this.b;
v1 = this.b;
/* iput-boolean v0, v1, Lcom/a/c/j;->ap:Z */
com.a.c.g.o = (v0!= 0);
com.a.c.l.D = (v5!= 0);
com.a.c.j.T = (v5!= 0);
v1 = this.b;
v1 = this.b;
com.a.c.j.x = (v0!= 0);
v0 = com.a.e.i.j;
/* iput v8, v0, Lcom/a/e/f;->e:F */
/* goto/16 :goto_0 */
/* :pswitch_18 */
v1 = com.a.e.i.j;
v1 = this.b;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_25
v1 = this.s;
final String v2 = "change"; // const-string v2, "change"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
com.a.c.g.o = (v0!= 0);
com.a.c.l.D = (v5!= 0);
com.a.d.a .b ( );
v0 = com.a.e.i.a;
v1 = com.a.b.a.b;
this.A = v1;
/* goto/16 :goto_0 */
} // :cond_25
v1 = com.a.e.i.j;
v1 = this.c;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_26
v1 = this.s;
final String v2 = "change"; // const-string v2, "change"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
v1 = com.a.e.i.a;
v2 = com.a.b.a.d;
this.A = v2;
com.a.c.l.D = (v5!= 0);
com.a.c.g.o = (v0!= 0);
/* goto/16 :goto_0 */
} // :cond_26
v1 = com.a.e.i.j;
v1 = this.d;
/* iget v2, p0, Lcom/a/e/i;->U:F */
/* iget v3, p0, Lcom/a/e/i;->V:F */
v1 = (( com.a.c.d ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/c/d;->a(FF)Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.s;
final String v2 = "change"; // const-string v2, "change"
(( com.a.d.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/d/d;->a(Ljava/lang/String;)V
com.a.c.g.o = (v0!= 0);
/* goto/16 :goto_0 */
/* :pswitch_19 */
v1 = this.i;
/* iput v0, v1, Lcom/a/e/d;->U:I */
/* iget v0, p0, Lcom/a/e/i;->U:F */
/* iget v1, p0, Lcom/a/e/i;->V:F */
(( com.a.e.i ) p0 ).b ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/a/e/i;->b(FF)V
/* goto/16 :goto_0 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_f */
/* :pswitch_9 */
} // .end packed-switch
/* :pswitch_data_1 */
/* .packed-switch 0x2 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_7 */
/* :pswitch_4 */
/* :pswitch_2 */
/* :pswitch_6 */
/* :pswitch_2 */
/* :pswitch_5 */
/* :pswitch_8 */
} // .end packed-switch
/* :pswitch_data_2 */
/* .packed-switch 0x3 */
/* :pswitch_b */
/* :pswitch_c */
/* :pswitch_d */
/* :pswitch_a */
/* :pswitch_e */
/* :pswitch_a */
/* :pswitch_a */
/* :pswitch_0 */
} // .end packed-switch
/* :pswitch_data_3 */
/* .packed-switch 0x2 */
/* :pswitch_11 */
/* :pswitch_13 */
/* :pswitch_17 */
/* :pswitch_14 */
/* :pswitch_10 */
/* :pswitch_19 */
/* :pswitch_10 */
/* :pswitch_15 */
/* :pswitch_12 */
/* :pswitch_16 */
/* :pswitch_18 */
} // .end packed-switch
} // .end method
public void run ( ) {
/* .locals 11 */
/* const-wide/16 v9, 0x32 */
} // :cond_0
} // :goto_0
/* iget-boolean v0, p0, Lcom/a/e/i;->T:Z */
/* if-nez v0, :cond_1 */
return;
} // :cond_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
try { // :try_start_0
(( com.a.e.i ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/a/e/i;->getHolder()Landroid/view/SurfaceHolder;
/* new-instance v3, Landroid/graphics/Rect; */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V */
this.ab = v0;
v0 = this.ab;
/* const/high16 v3, -0x1000000 */
(( android.graphics.Canvas ) v0 ).drawColor ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Canvas;->drawColor(I)V
v3 = this.Q;
/* monitor-enter v3 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
try { // :try_start_1
v0 = this.ab;
(( com.a.e.i ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/a/e/i;->a(Landroid/graphics/Canvas;)V
/* monitor-exit v3 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
v0 = this.ab;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.Q;
v3 = this.ab;
} // :cond_2
} // :goto_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* sub-long v5, v3, v1 */
/* cmp-long v0, v5, v9 */
/* if-gez v0, :cond_3 */
/* sub-long v5, v3, v1 */
/* sub-long v5, v9, v5 */
try { // :try_start_2
java.lang.Thread .sleep ( v5,v6 );
/* :try_end_2 */
/* .catch Ljava/lang/InterruptedException; {:try_start_2 ..:try_end_2} :catch_1 */
} // :cond_3
} // :goto_2
/* sub-long v5, v3, v1 */
/* const-wide/16 v7, 0x0 */
/* cmp-long v0, v5, v7 */
/* if-lez v0, :cond_0 */
/* const-wide/16 v5, 0x3e8 */
/* sub-long v0, v3, v1 */
/* div-long v0, v5, v0 */
/* iput-wide v0, p0, Lcom/a/e/i;->ac:J */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_3
/* monitor-exit v3 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
try { // :try_start_4
/* throw v0 */
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* :catch_0 */
/* move-exception v0 */
try { // :try_start_5
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
v0 = this.ab;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.Q;
v3 = this.ab;
/* :catchall_1 */
/* move-exception v0 */
v1 = this.ab;
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.Q;
v2 = this.ab;
} // :cond_4
/* throw v0 */
/* :catch_1 */
/* move-exception v0 */
(( java.lang.InterruptedException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/a/e/i;->T:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/a/e/i;->T:Z */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.q;
v0 = (( java.lang.Thread ) v0 ).isAlive ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z
/* if-nez v0, :cond_1 */
} // :cond_0
/* new-instance v0, Ljava/lang/Thread; */
/* invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.q = v0;
v0 = this.q;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
} // :cond_1
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 0 */
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/a/e/i;->T:Z */
return;
} // .end method
