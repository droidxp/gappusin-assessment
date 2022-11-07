public class com.google.ads.internal.AdVideoView extends android.widget.FrameLayout implements android.media.MediaPlayer$OnCompletionListener implements android.media.MediaPlayer$OnErrorListener implements android.media.MediaPlayer$OnPreparedListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/internal/AdVideoView$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final com.google.ads.internal.a b;
/* # instance fields */
public android.widget.MediaController a;
private java.lang.ref.WeakReference c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference", */
/* "<", */
/* "Landroid/app/Activity;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private com.google.ads.internal.AdWebView d;
private Long e;
private android.widget.VideoView f;
private java.lang.String g;
/* # direct methods */
static com.google.ads.internal.AdVideoView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 32 */
v0 = com.google.ads.internal.a.a;
/* check-cast v0, Lcom/google/ads/internal/a; */
return;
} // .end method
public com.google.ads.internal.AdVideoView ( ) {
/* .locals 4 */
/* .param p1, "adActivity" # Landroid/app/Activity; */
/* .param p2, "adWebView" # Lcom/google/ads/internal/AdWebView; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
int v2 = -1; // const/4 v2, -0x1
/* .line 96 */
/* invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
/* .line 98 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.c = v0;
/* .line 99 */
this.d = p2;
/* .line 102 */
/* new-instance v0, Landroid/widget/VideoView; */
/* invoke-direct {v0, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V */
this.f = v0;
/* .line 103 */
/* new-instance v0, Landroid/widget/FrameLayout$LayoutParams; */
/* const/16 v1, 0x11 */
/* invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 107 */
v1 = this.f;
(( com.google.ads.internal.AdVideoView ) p0 ).addView ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/google/ads/internal/AdVideoView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 111 */
this.a = v3;
/* .line 114 */
this.g = v3;
/* .line 117 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/google/ads/internal/AdVideoView;->e:J */
/* .line 118 */
(( com.google.ads.internal.AdVideoView ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/AdVideoView;->a()V
/* .line 120 */
v0 = this.f;
(( android.widget.VideoView ) v0 ).setOnCompletionListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
/* .line 121 */
v0 = this.f;
(( android.widget.VideoView ) v0 ).setOnPreparedListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
/* .line 122 */
v0 = this.f;
(( android.widget.VideoView ) v0 ).setOnErrorListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
/* .line 123 */
return;
} // .end method
/* # virtual methods */
protected void a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 129 */
/* new-instance v0, Lcom/google/ads/internal/AdVideoView$a; */
/* invoke-direct {v0, p0}, Lcom/google/ads/internal/AdVideoView$a;-><init>(Lcom/google/ads/internal/AdVideoView;)V */
/* .line 130 */
(( com.google.ads.internal.AdVideoView$a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdVideoView$a;->a()V
/* .line 131 */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 234 */
v0 = this.f;
(( android.widget.VideoView ) v0 ).seekTo ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/VideoView;->seekTo(I)V
/* .line 235 */
return;
} // .end method
public void a ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 241 */
v0 = this.f;
(( android.widget.VideoView ) v0 ).onTouchEvent ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/VideoView;->onTouchEvent(Landroid/view/MotionEvent;)Z
/* .line 242 */
return;
} // .end method
public void b ( ) {
/* .locals 4 */
/* .prologue */
/* .line 147 */
v0 = this.g;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_0 */
/* .line 148 */
v0 = this.f;
v1 = this.g;
(( android.widget.VideoView ) v0 ).setVideoPath ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V
/* .line 153 */
} // :goto_0
return;
/* .line 150 */
} // :cond_0
v0 = com.google.ads.internal.AdVideoView.b;
v1 = this.d;
final String v2 = "onVideoEvent"; // const-string v2, "onVideoEvent"
final String v3 = "{\'event\': \'error\', \'what\': \'no_src\'}"; // const-string v3, "{\'event\': \'error\', \'what\': \'no_src\'}"
(( com.google.ads.internal.a ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
} // .end method
public void c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 219 */
v0 = this.f;
(( android.widget.VideoView ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/widget/VideoView;->pause()V
/* .line 220 */
return;
} // .end method
public void d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 226 */
v0 = this.f;
(( android.widget.VideoView ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/widget/VideoView;->start()V
/* .line 227 */
return;
} // .end method
public void e ( ) {
/* .locals 1 */
/* .prologue */
/* .line 248 */
v0 = this.f;
(( android.widget.VideoView ) v0 ).stopPlayback ( ); // invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V
/* .line 249 */
return;
} // .end method
void f ( ) {
/* .locals 8 */
/* .prologue */
/* .line 255 */
v0 = this.f;
v0 = (( android.widget.VideoView ) v0 ).getCurrentPosition ( ); // invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I
/* int-to-long v0, v0 */
/* .line 256 */
/* iget-wide v2, p0, Lcom/google/ads/internal/AdVideoView;->e:J */
/* cmp-long v2, v2, v0 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 257 */
/* long-to-float v2, v0 */
/* const/high16 v3, 0x447a0000 # 1000.0f */
/* div-float/2addr v2, v3 */
/* .line 258 */
v3 = com.google.ads.internal.AdVideoView.b;
v4 = this.d;
final String v5 = "onVideoEvent"; // const-string v5, "onVideoEvent"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "{\'event\': \'timeupdate\', \'time\': "; // const-string v7, "{\'event\': \'timeupdate\', \'time\': "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v6 = "}"; // const-string v6, "}"
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.google.ads.internal.a ) v3 ).a ( v4, v5, v2 ); // invoke-virtual {v3, v4, v5, v2}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
/* .line 261 */
/* iput-wide v0, p0, Lcom/google/ads/internal/AdVideoView;->e:J */
/* .line 263 */
} // :cond_0
return;
} // .end method
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 4 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 190 */
v0 = com.google.ads.internal.AdVideoView.b;
v1 = this.d;
final String v2 = "onVideoEvent"; // const-string v2, "onVideoEvent"
final String v3 = "{\'event\': \'ended\'}"; // const-string v3, "{\'event\': \'ended\'}"
(( com.google.ads.internal.a ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
/* .line 191 */
return;
} // .end method
public Boolean onError ( android.media.MediaPlayer p0, Integer p1, Integer p2 ) {
/* .locals 5 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .param p2, "what" # I */
/* .param p3, "extra" # I */
/* .prologue */
/* .line 198 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Video threw error! <what:"; // const-string v1, "Video threw error! <what:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", extra:"; // const-string v1, ", extra:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ">"; // const-string v1, ">"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
/* .line 199 */
v0 = com.google.ads.internal.AdVideoView.b;
v1 = this.d;
final String v2 = "onVideoEvent"; // const-string v2, "onVideoEvent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "{\'event\': \'error\', \'what\': \'"; // const-string v4, "{\'event\': \'error\', \'what\': \'"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p2 ); // invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = "\', \'extra\': \'"; // const-string v4, "\', \'extra\': \'"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p3 ); // invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = "\'}"; // const-string v4, "\'}"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.google.ads.internal.a ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
/* .line 201 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void onPrepared ( android.media.MediaPlayer p0 ) {
/* .locals 6 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 209 */
v0 = this.f;
v0 = (( android.widget.VideoView ) v0 ).getDuration ( ); // invoke-virtual {v0}, Landroid/widget/VideoView;->getDuration()I
/* int-to-float v0, v0 */
/* const/high16 v1, 0x447a0000 # 1000.0f */
/* div-float/2addr v0, v1 */
/* .line 210 */
v1 = com.google.ads.internal.AdVideoView.b;
v2 = this.d;
final String v3 = "onVideoEvent"; // const-string v3, "onVideoEvent"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "{\'event\': \'canplaythrough\', \'duration\': \'"; // const-string v5, "{\'event\': \'canplaythrough\', \'duration\': \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v4 = "\'}"; // const-string v4, "\'}"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.google.ads.internal.a ) v1 ).a ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
/* .line 213 */
return;
} // .end method
public void setMediaControllerEnabled ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "enabled" # Z */
/* .prologue */
/* .line 159 */
v0 = this.c;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/app/Activity; */
/* .line 160 */
/* if-nez v0, :cond_0 */
/* .line 161 */
final String v0 = "adActivity was null while trying to enable controls on a video."; // const-string v0, "adActivity was null while trying to enable controls on a video."
com.google.ads.util.b .e ( v0 );
/* .line 176 */
} // :goto_0
return;
/* .line 165 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 166 */
v1 = this.a;
/* if-nez v1, :cond_1 */
/* .line 167 */
/* new-instance v1, Landroid/widget/MediaController; */
/* invoke-direct {v1, v0}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;)V */
this.a = v1;
/* .line 169 */
} // :cond_1
v0 = this.f;
v1 = this.a;
(( android.widget.VideoView ) v0 ).setMediaController ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setMediaController(Landroid/widget/MediaController;)V
/* .line 171 */
} // :cond_2
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 172 */
v0 = this.a;
(( android.widget.MediaController ) v0 ).hide ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V
/* .line 174 */
} // :cond_3
v0 = this.f;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.VideoView ) v0 ).setMediaController ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setMediaController(Landroid/widget/MediaController;)V
} // .end method
public void setSrc ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "src" # Ljava/lang/String; */
/* .prologue */
/* .line 182 */
this.g = p1;
/* .line 183 */
return;
} // .end method
