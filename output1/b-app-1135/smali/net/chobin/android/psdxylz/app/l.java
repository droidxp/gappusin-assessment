public class net.chobin.android.psdxylz.app.l implements android.media.MediaPlayer$OnCompletionListener implements android.media.MediaPlayer$OnPreparedListener {
	 /* # interfaces */
	 /* # static fields */
	 private static android.content.Context a;
	 private static android.media.MediaPlayer a;
	 /* # instance fields */
	 public Integer a;
	 public Boolean a;
	 public Integer b;
	 public Boolean b;
	 public Integer c;
	 private Boolean c;
	 public Integer d;
	 private Boolean d;
	 private Integer e;
	 private Integer f;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.l ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = -1; // const/4 v2, -0x1
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/16 v0, 0x64 */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->a:I */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->a:I */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
		 /* iput v2, p0, Lnet/chobin/android/psdxylz/app/l;->c:I */
		 /* iput v2, p0, Lnet/chobin/android/psdxylz/app/l;->d:I */
		 /* iput-boolean v1, p0, Lnet/chobin/android/psdxylz/app/l;->a:Z */
		 /* iput-boolean v3, p0, Lnet/chobin/android/psdxylz/app/l;->b:Z */
		 /* iput-boolean v1, p0, Lnet/chobin/android/psdxylz/app/l;->c:Z */
		 /* iput-boolean v1, p0, Lnet/chobin/android/psdxylz/app/l;->d:Z */
		 /* iput v3, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
		 /* new-instance v0, Landroid/media/MediaPlayer; */
		 /* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
		 v0 = net.chobin.android.psdxylz.app.l.a;
		 (( android.media.MediaPlayer ) v0 ).setOnPreparedListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
		 v0 = net.chobin.android.psdxylz.app.l.a;
		 (( android.media.MediaPlayer ) v0 ).setOnCompletionListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
		 return;
	 } // .end method
	 private void b ( Boolean p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
		 } // :cond_0
		 /* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/l;->d:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 try { // :try_start_0
				 v0 = net.chobin.android.psdxylz.app.l.a;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->a:I */
					 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
					 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
					 (( net.chobin.android.psdxylz.app.l ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/l;->b(I)V
					 v0 = net.chobin.android.psdxylz.app.l.a;
					 (( android.media.MediaPlayer ) v0 ).prepare ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
				 } // :cond_1
			 } // :goto_0
			 /* iput-boolean p1, p0, Lnet/chobin/android/psdxylz/app/l;->c:Z */
			 return;
			 /* :catch_0 */
			 /* move-exception v0 */
			 net.chobin.android.psdxylz.app.r .a ( v0 );
			 final String v0 = "play()"; // const-string v0, "play()"
			 net.chobin.android.psdxylz.app.r .a ( v0 );
		 } // .end method
		 /* # virtual methods */
		 public void a ( ) {
			 /* .locals 1 */
			 v0 = net.chobin.android.psdxylz.app.l.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = net.chobin.android.psdxylz.app.l.a;
				 (( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
				 v0 = net.chobin.android.psdxylz.app.l.a;
				 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
				 int v0 = 0; // const/4 v0, 0x0
			 } // :cond_0
			 return;
		 } // .end method
		 public void a ( Integer p0 ) {
			 /* .locals 4 */
			 /* const/high16 v3, 0x42c80000 # 100.0f */
			 /* iput p1, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
			 /* iput p1, p0, Lnet/chobin/android/psdxylz/app/l;->a:I */
			 v0 = net.chobin.android.psdxylz.app.l.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = net.chobin.android.psdxylz.app.l.a;
				 /* int-to-float v1, p1 */
				 /* div-float/2addr v1, v3 */
				 /* int-to-float v2, p1 */
				 /* div-float/2addr v2, v3 */
				 (( android.media.MediaPlayer ) v0 ).setVolume ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
			 } // :cond_0
			 return;
		 } // .end method
		 public void a ( Integer p0, Integer p1 ) {
			 /* .locals 3 */
			 int v2 = 2; // const/4 v2, 0x2
			 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
			 /* if-ne v0, v2, :cond_1 */
		 } // :cond_0
	 } // :goto_0
	 return;
} // :cond_1
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
/* if-ge v0, p2, :cond_0 */
v0 = net.chobin.android.psdxylz.app.l.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = net.chobin.android.psdxylz.app.l.a;
	 v0 = 	 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
	 /* if-nez v0, :cond_2 */
	 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->a:I */
	 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
	 /* iput v1, p0, Lnet/chobin/android/psdxylz/app/l;->a:I */
	 /* iget-boolean v1, p0, Lnet/chobin/android/psdxylz/app/l;->c:Z */
	 /* invoke-direct {p0, v1}, Lnet/chobin/android/psdxylz/app/l;->b(Z)V */
	 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->a:I */
} // :cond_2
/* iput p1, p0, Lnet/chobin/android/psdxylz/app/l;->f:I */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->f:I */
/* if-gtz v0, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->f:I */
} // :cond_3
/* iput v2, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
} // .end method
public void a ( Integer p0, Boolean p1 ) {
/* .locals 3 */
try { // :try_start_0
v0 = net.chobin.android.psdxylz.app.l.a;
(( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
} // :goto_0
try { // :try_start_1
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "android.resource://"; // const-string v1, "android.resource://"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = net.chobin.android.psdxylz.app.l.a;
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "/"; // const-string v1, "/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/high16 v1, 0x7f040000 */
/* add-int/2addr v1, p1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v2 = net.chobin.android.psdxylz.app.l.a;
v0 = net.chobin.android.psdxylz.app.l.a;
/* check-cast v0, Landroid/app/Activity; */
android.net.Uri .parse ( v1 );
(( android.media.MediaPlayer ) v2 ).setDataSource ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
v0 = net.chobin.android.psdxylz.app.l.a;
(( android.media.MediaPlayer ) v0 ).setLooping ( p2 ); // invoke-virtual {v0, p2}, Landroid/media/MediaPlayer;->setLooping(Z)V
/* iput p1, p0, Lnet/chobin/android/psdxylz/app/l;->c:I */
} // :goto_1
return;
/* :catch_0 */
/* move-exception v0 */
net.chobin.android.psdxylz.app.r .a ( v0 );
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "load:"; // const-string v1, "load:"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
net.chobin.android.psdxylz.app.r .a ( v0 );
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
net.chobin.android.psdxylz.app.r .a ( v0 );
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "load:"; // const-string v1, "load:"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
net.chobin.android.psdxylz.app.r .a ( v0 );
} // .end method
public void a ( Integer p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->d:I */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:Z */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->c:I */
/* if-ne v0, p1, :cond_0 */
/* if-nez p3, :cond_0 */
} // :goto_0
return;
} // :cond_0
(( net.chobin.android.psdxylz.app.l ) p0 ).c ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/l;->c()V
(( net.chobin.android.psdxylz.app.l ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lnet/chobin/android/psdxylz/app/l;->a(IZ)V
/* invoke-direct {p0, p2}, Lnet/chobin/android/psdxylz/app/l;->b(Z)V */
} // .end method
public void a ( Integer p0, Boolean p1, Boolean p2, Integer p3 ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->d:I */
/* iput-boolean v1, p0, Lnet/chobin/android/psdxylz/app/l;->b:Z */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->c:I */
/* if-ne v0, p1, :cond_0 */
/* if-nez p3, :cond_0 */
} // :goto_0
return;
} // :cond_0
(( net.chobin.android.psdxylz.app.l ) p0 ).c ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/l;->c()V
(( net.chobin.android.psdxylz.app.l ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lnet/chobin/android/psdxylz/app/l;->a(IZ)V
(( net.chobin.android.psdxylz.app.l ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lnet/chobin/android/psdxylz/app/l;->b(I)V
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->a:I */
(( net.chobin.android.psdxylz.app.l ) p0 ).a ( p4, v0 ); // invoke-virtual {p0, p4, v0}, Lnet/chobin/android/psdxylz/app/l;->a(II)V
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* iput-boolean p1, p0, Lnet/chobin/android/psdxylz/app/l;->d:Z */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->c:I */
/* if-gez v0, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/l;->d:Z */
/* if-nez v0, :cond_0 */
(( net.chobin.android.psdxylz.app.l ) p0 ).d ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/l;->d()V
} // .end method
public Boolean a ( ) {
/* .locals 1 */
v0 = net.chobin.android.psdxylz.app.l.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = net.chobin.android.psdxylz.app.l.a;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
} // .end method
public void b ( ) {
/* .locals 2 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->c:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/l;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( net.chobin.android.psdxylz.app.l ) p0 ).e ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/l;->e()V
} // :cond_0
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 4 */
/* const/high16 v3, 0x42c80000 # 100.0f */
/* iput p1, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
v0 = net.chobin.android.psdxylz.app.l.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = net.chobin.android.psdxylz.app.l.a;
/* int-to-float v1, p1 */
/* div-float/2addr v1, v3 */
/* int-to-float v2, p1 */
/* div-float/2addr v2, v3 */
(( android.media.MediaPlayer ) v0 ).setVolume ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
} // :cond_0
return;
} // .end method
public void c ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
try { // :try_start_0
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->c:I */
v0 = net.chobin.android.psdxylz.app.l.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = net.chobin.android.psdxylz.app.l.a;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = net.chobin.android.psdxylz.app.l.a;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
net.chobin.android.psdxylz.app.r .a ( v0 );
final String v0 = "stop()"; // const-string v0, "stop()"
net.chobin.android.psdxylz.app.r .a ( v0 );
} // .end method
public void c ( Integer p0 ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
/* if-ne v0, v1, :cond_0 */
} // :goto_0
return;
} // :cond_0
/* neg-int v0, p1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->f:I */
/* iput v1, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
} // .end method
public void d ( ) {
/* .locals 1 */
try { // :try_start_0
v0 = net.chobin.android.psdxylz.app.l.a;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = net.chobin.android.psdxylz.app.l.a;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
net.chobin.android.psdxylz.app.r .a ( v0 );
final String v0 = "pause()"; // const-string v0, "pause()"
net.chobin.android.psdxylz.app.r .a ( v0 );
} // .end method
public void d ( Integer p0 ) {
/* .locals 3 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/l;->f:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
/* packed-switch v0, :pswitch_data_0 */
} // :cond_0
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
(( net.chobin.android.psdxylz.app.l ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/l;->b(I)V
} // :cond_1
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:Z */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->d:I */
/* iget-boolean v1, p0, Lnet/chobin/android/psdxylz/app/l;->a:Z */
int v2 = 1; // const/4 v2, 0x1
(( net.chobin.android.psdxylz.app.l ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lnet/chobin/android/psdxylz/app/l;->a(IZZ)V
} // :cond_2
} // :goto_0
return;
/* :pswitch_0 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
/* if-gtz v0, :cond_0 */
(( net.chobin.android.psdxylz.app.l ) p0 ).f ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/l;->f()V
/* :pswitch_1 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:I */
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/l;->a:I */
/* if-lt v0, v1, :cond_0 */
(( net.chobin.android.psdxylz.app.l ) p0 ).g ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/l;->g()V
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void e ( ) {
/* .locals 1 */
try { // :try_start_0
v0 = net.chobin.android.psdxylz.app.l.a;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
net.chobin.android.psdxylz.app.r .a ( v0 );
final String v0 = "cancelPause()"; // const-string v0, "cancelPause()"
net.chobin.android.psdxylz.app.r .a ( v0 );
} // .end method
public void f ( ) {
/* .locals 2 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_0 */
} // :goto_0
return;
} // :cond_0
(( net.chobin.android.psdxylz.app.l ) p0 ).c ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/l;->c()V
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
} // .end method
public void g ( ) {
/* .locals 2 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_0 */
} // :goto_0
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/l;->e:I */
} // .end method
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 1 */
try { // :try_start_0
/* iget v0, p0, Lnet/chobin/android/psdxylz/app/l;->d:I */
/* if-ltz v0, :cond_0 */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/l;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/l;->b:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void onPrepared ( android.media.MediaPlayer p0 ) {
/* .locals 0 */
(( android.media.MediaPlayer ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V
return;
} // .end method
