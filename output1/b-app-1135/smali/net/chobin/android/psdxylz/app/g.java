public class net.chobin.android.psdxylz.app.g {
	 /* # static fields */
	 private static final a;
	 public static final java.lang.String a;
	 public static final java.lang.String b;
	 public static final java.lang.String c;
	 public static final java.lang.String d;
	 public static final java.lang.String e;
	 /* # instance fields */
	 private android.app.ProgressDialog a;
	 private net.chobin.android.a.k a;
	 private net.chobin.android.psdxylz.app.a a;
	 private net.chobin.android.psdxylz.app.i a;
	 private net.chobin.android.psdxylz.app.u a;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.g ( ) {
		 /* .locals 5 */
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-array v0, v4, [Ljava/lang/String; */
		 final String v1 = "ERROR"; // const-string v1, "ERROR"
		 /* aput-object v1, v0, v2 */
		 final String v1 = "\u901a\u4fe1\u30a8\u30e9\u30fc"; // const-string v1, "\u901a\u4fe1\u30a8\u30e9\u30fc"
		 /* aput-object v1, v0, v3 */
		 /* new-array v0, v4, [Ljava/lang/String; */
		 final String v1 = "CONNECTION FAILED..."; // const-string v1, "CONNECTION FAILED..."
		 /* aput-object v1, v0, v2 */
		 final String v1 = "\u901a\u4fe1\u306b\u5931\u6557\u3057\u307e\u3057\u305f.."; // const-string v1, "\u901a\u4fe1\u306b\u5931\u6557\u3057\u307e\u3057\u305f.."
		 /* aput-object v1, v0, v3 */
		 /* new-array v0, v4, [Ljava/lang/String; */
		 final String v1 = "CLOSE"; // const-string v1, "CLOSE"
		 /* aput-object v1, v0, v2 */
		 final String v1 = "\u9589\u3058\u308b"; // const-string v1, "\u9589\u3058\u308b"
		 /* aput-object v1, v0, v3 */
		 /* new-array v0, v4, [Ljava/lang/String; */
		 final String v1 = ""; // const-string v1, ""
		 /* aput-object v1, v0, v2 */
		 final String v1 = ""; // const-string v1, ""
		 /* aput-object v1, v0, v3 */
		 /* new-array v0, v4, [Ljava/lang/String; */
		 final String v1 = "Now Checking.."; // const-string v1, "Now Checking.."
		 /* aput-object v1, v0, v2 */
		 final String v1 = "\u30c1\u30a7\u30c3\u30af\u4e2d\u3067\u3059.."; // const-string v1, "\u30c1\u30a7\u30c3\u30af\u4e2d\u3067\u3059.."
		 /* aput-object v1, v0, v3 */
		 /* const/16 v0, 0x14 */
		 /* new-array v0, v0, [B */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 1 */
		 /* -0x39t */
		 /* 0x14t */
		 /* 0x1et */
		 /* 0x66t */
		 /* -0x6et */
		 /* 0x7t */
		 /* -0x48t */
		 /* -0x36t */
		 /* 0x1ft */
		 /* 0x51t */
		 /* -0x2dt */
		 /* 0x5ft */
		 /* 0x48t */
		 /* -0x6et */
		 /* -0x42t */
		 /* -0xdt */
		 /* -0x79t */
		 /* 0x70t */
		 /* -0x22t */
		 /* 0x3bt */
	 } // .end array-data
} // .end method
public net.chobin.android.psdxylz.app.g ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 this.a = p1;
	 this.a = v0;
	 this.a = v0;
	 this.a = v0;
	 this.a = v0;
	 return;
} // .end method
private Integer a ( ) {
	 /* .locals 3 */
	 int v0 = 0; // const/4 v0, 0x0
	 java.util.Locale .getDefault ( );
	 v2 = java.util.Locale.JAPAN;
	 v2 = 	 (( java.util.Locale ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z
	 /* if-nez v2, :cond_0 */
	 v2 = java.util.Locale.JAPANESE;
	 v1 = 	 (( java.util.Locale ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_1
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_1
} // .end method
static net.chobin.android.psdxylz.app.a a ( Object p0 ) { //synthethic
/* .locals 1 */
v0 = this.a;
} // .end method
private void d ( ) {
/* .locals 3 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/app/ProgressDialog; */
v1 = this.a;
/* invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V */
this.a = v0;
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.app.ProgressDialog ) v0 ).setProgressStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgressStyle(I)V
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( android.app.ProgressDialog ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V
v0 = /* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/g;->a()I */
v1 = this.a;
v2 = net.chobin.android.psdxylz.app.g.d;
/* aget-object v2, v2, v0 */
(( android.app.ProgressDialog ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V
v1 = this.a;
v2 = net.chobin.android.psdxylz.app.g.e;
/* aget-object v0, v2, v0 */
(( android.app.ProgressDialog ) v1 ).setMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
v0 = this.a;
/* new-instance v1, Lnet/chobin/android/psdxylz/app/h; */
/* invoke-direct {v1, p0}, Lnet/chobin/android/psdxylz/app/h;-><init>(Lnet/chobin/android/psdxylz/app/g;)V */
(( android.app.ProgressDialog ) v0 ).setOnCancelListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
} // :cond_0
v0 = this.a;
v0 = (( android.app.ProgressDialog ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
/* if-nez v0, :cond_1 */
v0 = this.a;
(( android.app.ProgressDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
} // :cond_1
return;
} // .end method
private void e ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
v0 = (( android.app.ProgressDialog ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
} // :cond_1
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 8 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lnet/chobin/android/psdxylz/app/i; */
v1 = this.a;
/* invoke-direct {v0, v1}, Lnet/chobin/android/psdxylz/app/i;-><init>(Lnet/chobin/android/psdxylz/app/a;)V */
this.a = v0;
} // :cond_0
v0 = this.a;
/* if-nez v0, :cond_1 */
v0 = this.a;
(( net.chobin.android.psdxylz.app.a ) v0 ).getContentResolver ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->getContentResolver()Landroid/content/ContentResolver;
final String v1 = "android_id"; // const-string v1, "android_id"
android.provider.Settings$Secure .getString ( v0,v1 );
/* new-instance v1, Lnet/chobin/android/a/k; */
v2 = this.a;
/* new-instance v3, Lnet/chobin/android/a/w; */
v4 = this.a;
/* new-instance v5, Lnet/chobin/android/a/a; */
v6 = net.chobin.android.psdxylz.app.g.a;
v7 = this.a;
(( net.chobin.android.psdxylz.app.a ) v7 ).getPackageName ( ); // invoke-virtual {v7}, Lnet/chobin/android/psdxylz/app/a;->getPackageName()Ljava/lang/String;
/* invoke-direct {v5, v6, v7, v0}, Lnet/chobin/android/a/a;-><init>([BLjava/lang/String;Ljava/lang/String;)V */
/* invoke-direct {v3, v4, v5}, Lnet/chobin/android/a/w;-><init>(Landroid/content/Context;Lnet/chobin/android/a/s;)V */
final String v0 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjxDBwfO25PBMwGKS/cMnQ2XWcipmOnwfiUJnkU4DFeRRTfrpq+v4i93V728HEYZ4ErMMEDGs4NXHqfzcZrVXKjvqooV2ilYZQkRqi1R2uRnEZuFU0Mx5UVfSMcVth0s2QzmpFHjCn/zxt5D3yqmjRoMgV0ybBz9stx8++ssXt0gsKqAmRhakJd2ISgqM/V/fxkLzmmDUyVRP3PUEibmXJ0wf5p5PpOSmfh3W0AddymLTc1DrfWPv6fDH8U0xDo3gItZ9qEGTyCZJEEd9EKCJ6kiQStlb5At6LFMhqRcg+F3kQJ0HBkQ7s7P0xs59uVZ4p++ANfQawcs3HiqoObK1QQIDAQAB"; // const-string v0, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjxDBwfO25PBMwGKS/cMnQ2XWcipmOnwfiUJnkU4DFeRRTfrpq+v4i93V728HEYZ4ErMMEDGs4NXHqfzcZrVXKjvqooV2ilYZQkRqi1R2uRnEZuFU0Mx5UVfSMcVth0s2QzmpFHjCn/zxt5D3yqmjRoMgV0ybBz9stx8++ssXt0gsKqAmRhakJd2ISgqM/V/fxkLzmmDUyVRP3PUEibmXJ0wf5p5PpOSmfh3W0AddymLTc1DrfWPv6fDH8U0xDo3gItZ9qEGTyCZJEEd9EKCJ6kiQStlb5At6LFMhqRcg+F3kQJ0HBkQ7s7P0xs59uVZ4p++ANfQawcs3HiqoObK1QQIDAQAB"
/* invoke-direct {v1, v2, v3, v0}, Lnet/chobin/android/a/k;-><init>(Landroid/content/Context;Lnet/chobin/android/a/t;Ljava/lang/String;)V */
this.a = v1;
} // :cond_1
v0 = this.a;
v0 = (( net.chobin.android.a.k ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/a/k;->a()Z
/* if-nez v0, :cond_2 */
/* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/g;->d()V */
} // :cond_2
v0 = this.a;
v1 = this.a;
(( net.chobin.android.a.k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/a/k;->a(Lnet/chobin/android/a/o;)V
return;
} // .end method
public Boolean a ( ) {
/* .locals 3 */
int v1 = 0; // const/4 v1, 0x0
/* move v0, v1 */
} // :goto_0
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = this.a;
v2 = (( net.chobin.android.psdxylz.app.i ) v2 ).a ( ); // invoke-virtual {v2}, Lnet/chobin/android/psdxylz/app/i;->a()Z
/* if-nez v2, :cond_0 */
/* const/16 v2, 0x1388 */
/* if-lt v0, v2, :cond_1 */
} // :cond_0
v0 = this.a;
/* if-nez v0, :cond_2 */
} // :goto_1
} // :cond_1
/* const/16 v2, 0x1f4 */
net.chobin.android.psdxylz.app.ar .a ( v2 );
/* add-int/lit16 v0, v0, 0x1f4 */
} // :cond_2
/* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/g;->e()V */
v0 = this.a;
v1 = (( net.chobin.android.psdxylz.app.i ) v0 ).b ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/i;->b()Z
} // .end method
public void b ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( net.chobin.android.a.k ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/a/k;->a()V
this.a = v1;
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
this.a = v1;
} // :cond_1
/* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/g;->e()V */
return;
} // .end method
public void c ( ) {
/* .locals 6 */
v0 = this.a;
/* if-nez v0, :cond_0 */
v0 = /* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/g;->a()I */
/* new-instance v1, Lnet/chobin/android/psdxylz/app/u; */
v2 = net.chobin.android.psdxylz.app.a.a;
/* invoke-direct {v1, v2}, Lnet/chobin/android/psdxylz/app/u;-><init>(Lnet/chobin/android/psdxylz/app/w;)V */
this.a = v1;
v1 = this.a;
/* const v2, 0x1080027 */
v3 = net.chobin.android.psdxylz.app.g.a;
/* aget-object v3, v3, v0 */
v4 = net.chobin.android.psdxylz.app.g.b;
/* aget-object v4, v4, v0 */
v5 = net.chobin.android.psdxylz.app.g.c;
/* aget-object v0, v5, v0 */
(( net.chobin.android.psdxylz.app.u ) v1 ).a ( v2, v3, v4, v0 ); // invoke-virtual {v1, v2, v3, v4, v0}, Lnet/chobin/android/psdxylz/app/u;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
} // :cond_0
return;
} // .end method
