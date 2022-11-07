public class net.chobin.android.psdxylz.app.ak {
	 /* # static fields */
	 private static android.content.Context a;
	 public static Boolean a;
	 /* # instance fields */
	 public Integer a;
	 private android.media.SoundPool a;
	 private net.chobin.android.psdxylz.app.l a;
	 public a;
	 private a;
	 private Integer b;
	 public Boolean b;
	 private b;
	 private Integer c;
	 private Boolean c;
	 private c;
	 private Integer d;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.ak ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 net.chobin.android.psdxylz.app.ak.a = (v0!= 0);
		 return;
	 } // .end method
	 public net.chobin.android.psdxylz.app.ak ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = -1; // const/4 v1, -0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, p2, [I */
		 this.a = v0;
		 /* iput p2, p0, Lnet/chobin/android/psdxylz/app/ak;->b:I */
		 /* new-array v0, p2, [I */
		 this.b = v0;
		 /* new-array v0, p2, [I */
		 this.c = v0;
		 /* const/16 v0, 0x64 */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/ak;->a:I */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ak;->c:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ak;->b:Z */
		 /* iput v1, p0, Lnet/chobin/android/psdxylz/app/ak;->c:I */
		 /* iput v1, p0, Lnet/chobin/android/psdxylz/app/ak;->d:I */
		 this.a = v2;
		 this.a = v2;
		 /* new-array v0, p2, [Z */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( net.chobin.android.psdxylz.app.ak ) p0 ).e ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/ak;->e()V
			 v0 = this.a;
			 (( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
			 int v0 = 0; // const/4 v0, 0x0
			 this.a = v0;
		 } // :cond_0
		 return;
	 } // .end method
	 public void a ( Integer p0 ) {
		 /* .locals 4 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* move v0, v1 */
	 } // :goto_0
	 v2 = this.a;
	 /* array-length v2, v2 */
	 /* if-lt v0, v2, :cond_0 */
	 return;
} // :cond_0
v2 = this.a;
/* aget v2, v2, v0 */
/* if-lez v2, :cond_1 */
v2 = this.a;
/* aget v3, v2, v0 */
/* sub-int/2addr v3, p1 */
/* aput v3, v2, v0 */
v2 = this.a;
/* aget v2, v2, v0 */
/* if-gtz v2, :cond_1 */
v2 = this.a;
/* aput v1, v2, v0 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 1 */
v0 = this.a;
/* aget v0, v0, p1 */
/* if-nez v0, :cond_0 */
v0 = this.a;
/* aput p2, v0, p1 */
(( net.chobin.android.psdxylz.app.ak ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lnet/chobin/android/psdxylz/app/ak;->b(I)V
} // :cond_0
return;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
v0 = this.a;
/* aget v0, v0, p1 */
/* if-nez v0, :cond_0 */
v0 = this.a;
/* aput p2, v0, p1 */
(( net.chobin.android.psdxylz.app.ak ) p0 ).b ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Lnet/chobin/android/psdxylz/app/ak;->b(II)V
} // :cond_0
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lnet/chobin/android/psdxylz/app/ak;->c:Z */
return;
} // .end method
public void b ( ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* new-instance v1, Landroid/media/SoundPool; */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/ak;->b:I */
int v3 = 3; // const/4 v3, 0x3
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {v1, v2, v3, v4}, Landroid/media/SoundPool;-><init>(III)V */
this.a = v1;
} // :goto_0
v1 = this.b;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_0 */
return;
} // :cond_0
v1 = this.b;
v2 = this.a;
v3 = net.chobin.android.psdxylz.app.ak.a;
/* const v4, 0x7f040003 */
/* add-int/2addr v4, v0 */
int v5 = 1; // const/4 v5, 0x1
v2 = (( android.media.SoundPool ) v2 ).load ( v3, v4, v5 ); // invoke-virtual {v2, v3, v4, v5}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
/* aput v2, v1, v0 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* add-int/lit8 v0, v0, 0x1 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Lnet/chobin/android/psdxylz/app/ah; */
int v2 = 6; // const/4 v2, 0x6
/* invoke-direct {v1, v0, v2}, Lnet/chobin/android/psdxylz/app/ah;-><init>(Ljava/lang/Throwable;I)V */
final String v0 = "loadAll()"; // const-string v0, "loadAll()"
(( net.chobin.android.psdxylz.app.ah ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lnet/chobin/android/psdxylz/app/ah;->a(Ljava/lang/String;)V
/* throw v1 */
} // .end method
public void b ( Integer p0 ) {
/* .locals 8 */
/* const/high16 v4, 0x42c80000 # 100.0f */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ak;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ak;->b:Z */
/* if-nez v0, :cond_0 */
/* sget-boolean v0, Lnet/chobin/android/psdxylz/app/ak;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
} // :goto_0
return;
} // :cond_1
v7 = this.c;
v0 = this.a;
v1 = this.b;
/* aget v1, v1, p1 */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/ak;->a:I */
/* int-to-float v2, v2 */
/* div-float/2addr v2, v4 */
/* iget v3, p0, Lnet/chobin/android/psdxylz/app/ak;->a:I */
/* int-to-float v3, v3 */
/* div-float/2addr v3, v4 */
int v4 = 3; // const/4 v4, 0x3
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v6, 0x3f800000 # 1.0f */
v0 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* aput v0, v7, p1 */
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 8 */
/* const/high16 v4, 0x42c80000 # 100.0f */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ak;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ak;->b:Z */
/* if-nez v0, :cond_0 */
/* sget-boolean v0, Lnet/chobin/android/psdxylz/app/ak;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
} // :goto_0
return;
} // :cond_1
v7 = this.c;
v0 = this.a;
v1 = this.b;
/* aget v1, v1, p1 */
/* int-to-float v2, p2 */
/* div-float/2addr v2, v4 */
/* int-to-float v3, p2 */
/* div-float/2addr v3, v4 */
int v4 = 3; // const/4 v4, 0x3
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v6, 0x3f800000 # 1.0f */
v0 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* aput v0, v7, p1 */
} // .end method
public void c ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/ak;->b:I */
/* if-lt v0, v1, :cond_0 */
return;
} // :cond_0
v1 = this.a;
v2 = this.c;
/* aget v2, v2, v0 */
(( android.media.SoundPool ) v1 ).stop ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/SoundPool;->stop(I)V
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void c ( Integer p0 ) {
/* .locals 6 */
/* const/high16 v5, 0x42c80000 # 100.0f */
/* iput p1, p0, Lnet/chobin/android/psdxylz/app/ak;->a:I */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = this.c;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_0 */
return;
} // :cond_0
v1 = this.c;
/* aget v1, v1, v0 */
int v2 = 1; // const/4 v2, 0x1
/* if-lt v1, v2, :cond_1 */
v1 = this.a;
v2 = this.c;
/* aget v2, v2, v0 */
/* int-to-float v3, p1 */
/* div-float/2addr v3, v5 */
/* int-to-float v4, p1 */
/* div-float/2addr v4, v5 */
(( android.media.SoundPool ) v1 ).setVolume ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/media/SoundPool;->setVolume(IFF)V
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void d ( ) {
/* .locals 3 */
int v1 = 0; // const/4 v1, 0x0
/* move v0, v1 */
} // :goto_0
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/ak;->b:I */
/* if-lt v0, v2, :cond_0 */
return;
} // :cond_0
v2 = this.a;
/* aput v1, v2, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void e ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.media.SoundPool ) v0 ).autoPause ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->autoPause()V
} // :cond_0
return;
} // .end method
public void f ( ) {
/* .locals 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ak;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.media.SoundPool ) v0 ).autoResume ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->autoResume()V
} // :cond_0
return;
} // .end method
