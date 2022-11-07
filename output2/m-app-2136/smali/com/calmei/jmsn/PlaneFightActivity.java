public class com.calmei.jmsn.PlaneFightActivity extends android.app.Activity {
	 /* # static fields */
	 public static com.calmei.jmsn.PlaneFightActivity a;
	 public static android.content.Context g;
	 public static Boolean i;
	 public static Boolean j;
	 public static Boolean k;
	 public static Integer l;
	 public static com.a.g.a.a m;
	 public static android.os.Handler n;
	 private static o; //synthetic
	 /* # instance fields */
	 com.a.e.i b;
	 com.a.a.b c;
	 public com.a.b.a d;
	 Integer e;
	 Integer f;
	 public Boolean h;
	 /* # direct methods */
	 static com.calmei.jmsn.PlaneFightActivity ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.calmei.jmsn.PlaneFightActivity.i = (v0!= 0);
		 com.calmei.jmsn.PlaneFightActivity.j = (v0!= 0);
		 com.calmei.jmsn.PlaneFightActivity.k = (v0!= 0);
		 /* new-instance v0, Lcom/calmei/jmsn/a; */
		 /* invoke-direct {v0}, Lcom/calmei/jmsn/a;-><init>()V */
		 return;
	 } // .end method
	 public com.calmei.jmsn.PlaneFightActivity ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/calmei/jmsn/PlaneFightActivity;->h:Z */
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 v0 = 		 com.calmei.jmsn.PlaneFightActivity .b ( );
		 /* if-nez v0, :cond_0 */
		 v0 = java.lang.System.out;
		 final String v1 = "bad network!!"; // const-string v1, "bad network!!"
		 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 } // :goto_0
	 return;
} // :cond_0
v0 = java.lang.System.out;
final String v1 = "\u5f00\u59cb\u53d1\u9001"; // const-string v1, "\u5f00\u59cb\u53d1\u9001"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* new-instance v0, Lcom/a/f/w; */
/* invoke-direct {v0}, Lcom/a/f/w;-><init>()V */
(( com.a.f.w ) v0 ).t ( p0 ); // invoke-virtual {v0, p0}, Lcom/a/f/w;->t(Ljava/lang/String;)V
} // .end method
public static void a ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
v0 = com.calmei.jmsn.PlaneFightActivity.m;
(( com.a.g.a.a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/a/g/a/a;->a(Ljava/lang/String;)V
/* sget-boolean v0, Lcom/a/e/i;->C:Z */
return;
} // .end method
public static void b ( java.lang.String p0 ) {
/* .locals 2 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
android.net.Uri .parse ( p0 );
(( android.content.Intent ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
v1 = com.calmei.jmsn.PlaneFightActivity.a;
(( com.calmei.jmsn.PlaneFightActivity ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Lcom/calmei/jmsn/PlaneFightActivity;->startActivity(Landroid/content/Intent;)V
return;
} // .end method
public static Boolean b ( ) {
/* .locals 3 */
int v1 = 0; // const/4 v1, 0x0
v0 = com.calmei.jmsn.PlaneFightActivity.a;
final String v2 = "connectivity"; // const-string v2, "connectivity"
(( com.calmei.jmsn.PlaneFightActivity ) v0 ).getSystemService ( v2 ); // invoke-virtual {v0, v2}, Lcom/calmei/jmsn/PlaneFightActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/ConnectivityManager; */
(( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 (( android.net.NetworkInfo ) v0 ).isConnected ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
/* move v0, v1 */
} // .end method
static e ( ) { //synthethic
/* .locals 3 */
v0 = com.calmei.jmsn.PlaneFightActivity.o;
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
/* # virtual methods */
public void a ( ) {
/* .locals 0 */
(( com.calmei.jmsn.PlaneFightActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/calmei/jmsn/PlaneFightActivity;->finish()V
return;
} // .end method
public void c ( ) {
/* .locals 3 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = com.calmei.jmsn.PlaneFightActivity.a;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
final String v1 = "\u7f51\u7edc\u6709\u95ee\u9898"; // const-string v1, "\u7f51\u7edc\u6709\u95ee\u9898"
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "\u8bf7\u68c0\u67e5\u4f60\u7684\u7f51\u7edc\u8bbe\u7f6e"; // const-string v1, "\u8bf7\u68c0\u67e5\u4f60\u7684\u7f51\u7edc\u8bbe\u7f6e"
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
final String v1 = "\u786e\u5b9a"; // const-string v1, "\u786e\u5b9a"
/* new-instance v2, Lcom/calmei/jmsn/b; */
/* invoke-direct {v2, p0}, Lcom/calmei/jmsn/b;-><init>(Lcom/calmei/jmsn/PlaneFightActivity;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
return;
} // .end method
public void d ( ) {
/* .locals 1 */
v0 = com.calmei.jmsn.PlaneFightActivity .b ( );
/* if-nez v0, :cond_0 */
(( com.calmei.jmsn.PlaneFightActivity ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/calmei/jmsn/PlaneFightActivity;->c()V
} // :goto_0
return;
} // :cond_0
com.a.f.o .c ( );
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 3 */
/* const/16 v1, 0x400 */
int v2 = 1; // const/4 v2, 0x1
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
(( com.calmei.jmsn.PlaneFightActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/calmei/jmsn/PlaneFightActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).setFlags ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V
(( com.calmei.jmsn.PlaneFightActivity ) p0 ).requestWindowFeature ( v2 ); // invoke-virtual {p0, v2}, Lcom/calmei/jmsn/PlaneFightActivity;->requestWindowFeature(I)Z
(( com.calmei.jmsn.PlaneFightActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/calmei/jmsn/PlaneFightActivity;->getWindow()Landroid/view/Window;
/* const/16 v1, 0x80 */
(( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
/* new-instance v0, Landroid/util/DisplayMetrics; */
/* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
(( com.calmei.jmsn.PlaneFightActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/calmei/jmsn/PlaneFightActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* iput v1, p0, Lcom/calmei/jmsn/PlaneFightActivity;->e:I */
/* iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
/* iput v0, p0, Lcom/calmei/jmsn/PlaneFightActivity;->f:I */
int v0 = 0; // const/4 v0, 0x0
com.calmei.jmsn.PlaneFightActivity.j = (v0!= 0);
/* iput-boolean v2, p0, Lcom/calmei/jmsn/PlaneFightActivity;->h:Z */
v0 = com.calmei.jmsn.PlaneFightActivity.a;
com.a.f.w .a ( v0 );
/* new-instance v0, Lcom/a/a/b; */
/* iget v1, p0, Lcom/calmei/jmsn/PlaneFightActivity;->e:I */
/* iget v2, p0, Lcom/calmei/jmsn/PlaneFightActivity;->f:I */
/* invoke-direct {v0, v1, v2}, Lcom/a/a/b;-><init>(II)V */
this.c = v0;
/* new-instance v0, Lcom/a/e/i; */
/* invoke-direct {v0, p0}, Lcom/a/e/i;-><init>(Landroid/content/Context;)V */
this.b = v0;
v0 = this.b;
(( com.calmei.jmsn.PlaneFightActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/calmei/jmsn/PlaneFightActivity;->setContentView(Landroid/view/View;)V
/* new-instance v0, Lcom/a/g/a/a; */
v1 = com.calmei.jmsn.PlaneFightActivity.a;
/* invoke-direct {v0, v1}, Lcom/a/g/a/a;-><init>(Lcom/calmei/jmsn/PlaneFightActivity;)V */
return;
} // .end method
protected void onDestroy ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* iget-boolean v0, p0, Lcom/calmei/jmsn/PlaneFightActivity;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "|"; // const-string v0, "|"
com.a.f.w .a ( v0,v1 );
final String v0 = "second"; // const-string v0, "second"
com.calmei.jmsn.PlaneFightActivity .a ( v0 );
/* iput-boolean v1, p0, Lcom/calmei/jmsn/PlaneFightActivity;->h:Z */
} // :cond_0
v0 = this.b;
(( com.a.e.i ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/a/e/i;->b()V
com.calmei.jmsn.PlaneFightActivity.i = (v1!= 0);
com.a.d.a.a = (v1!= 0);
com.a.e.n.f = (v1!= 0);
v0 = this.b;
v0 = this.s;
(( com.a.d.d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/d/d;->a()V
com.a.d.a .c ( );
v0 = java.lang.System.out;
final String v1 = "\u6e38\u620f\u7ed3\u675f"; // const-string v1, "\u6e38\u620f\u7ed3\u675f"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
com.kkkwan.billing.f.a .a ( );
v1 = com.calmei.jmsn.PlaneFightActivity.a;
(( com.kkkwan.billing.f.a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/f/a;->a(Landroid/content/Context;)V
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
v1 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
int v2 = 4; // const/4 v2, 0x4
/* if-ne v1, v2, :cond_0 */
com.calmei.jmsn.PlaneFightActivity .e ( );
v2 = com.a.e.i.a;
v2 = this.A;
v2 = (( com.a.b.a ) v2 ).ordinal ( ); // invoke-virtual {v2}, Lcom/a/b/a;->ordinal()I
/* aget v1, v1, v2 */
/* packed-switch v1, :pswitch_data_0 */
} // :goto_0
/* :pswitch_0 */
/* :pswitch_1 */
v1 = this.b;
(( com.a.e.i ) v1 ).a ( p0 ); // invoke-virtual {v1, p0}, Lcom/a/e/i;->a(Lcom/calmei/jmsn/PlaneFightActivity;)V
/* :pswitch_2 */
v1 = com.a.e.i.a;
v2 = com.a.b.a.b;
this.A = v2;
/* :pswitch_3 */
com.a.d.a .c ( );
v1 = this.b;
/* new-instance v2, Lcom/a/d/a; */
v3 = com.calmei.jmsn.PlaneFightActivity.g;
/* const v4, 0x7f04000d */
/* invoke-direct {v2, v3, v4, v0}, Lcom/a/d/a;-><init>(Landroid/content/Context;IZ)V */
this.t = v2;
v1 = this.b;
v1 = this.t;
(( com.a.d.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/d/a;->a()V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/a/a;->a()V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/a/a;->c()V
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).n ( ); // invoke-virtual {v1}, Lcom/a/a/a;->n()V
/* :pswitch_4 */
v1 = com.a.e.i.a;
v2 = com.a.b.a.h;
this.A = v2;
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/a/a/a;->m()V
/* :pswitch_5 */
v1 = com.a.e.i.a;
v2 = com.a.b.a.h;
this.A = v2;
v1 = com.a.e.i.a;
(( com.a.a.a ) v1 ).s ( ); // invoke-virtual {v1}, Lcom/a/a/a;->s()V
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_3 */
/* :pswitch_0 */
/* :pswitch_5 */
/* :pswitch_0 */
/* :pswitch_4 */
} // .end packed-switch
} // .end method
protected void onPause ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
v0 = java.lang.System.out;
final String v1 = "\u6e38\u620f\u6682\u505c"; // const-string v1, "\u6e38\u620f\u6682\u505c"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
v0 = this.b;
v0 = this.s;
/* iget-boolean v0, v0, Lcom/a/d/d;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
v0 = this.s;
/* iget-boolean v0, v0, Lcom/a/d/d;->a:Z */
com.a.e.n.f = (v0!= 0);
v0 = this.b;
v0 = this.s;
/* iput-boolean v2, v0, Lcom/a/d/d;->a:Z */
} // :goto_0
/* sget-boolean v0, Lcom/a/d/a;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
com.a.d.a .b ( );
/* sget-boolean v0, Lcom/a/d/a;->a:Z */
com.a.e.n.e = (v0!= 0);
com.a.d.a.a = (v2!= 0);
} // :goto_1
v0 = com.a.e.i.a;
v0 = this.A;
this.d = v0;
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
return;
} // :cond_0
com.a.e.n.f = (v2!= 0);
} // :cond_1
com.a.e.n.e = (v2!= 0);
} // .end method
protected void onRestart ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onRestart()V */
v0 = com.a.e.i.a;
v1 = this.d;
this.A = v1;
v0 = this.b;
(( com.a.e.i ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/a/e/i;->c()V
v0 = java.lang.System.out;
final String v1 = "\u6e38\u620f\u5f00\u59cb"; // const-string v1, "\u6e38\u620f\u5f00\u59cb"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
return;
} // .end method
protected void onResume ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* sget-boolean v0, Lcom/a/f/o;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.calmei.jmsn.PlaneFightActivity ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/calmei/jmsn/PlaneFightActivity;->d()V
} // :cond_0
final String v0 = "|"; // const-string v0, "|"
int v1 = 0; // const/4 v1, 0x0
com.a.f.w .a ( v0,v1 );
final String v0 = "first"; // const-string v0, "first"
com.calmei.jmsn.PlaneFightActivity .a ( v0 );
v0 = java.lang.System.out;
final String v1 = "\u6e38\u620f\u4ece\u65b0\u5f00\u59cb"; // const-string v1, "\u6e38\u620f\u4ece\u65b0\u5f00\u59cb"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
return;
} // .end method
