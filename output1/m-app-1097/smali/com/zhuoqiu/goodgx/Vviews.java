public class com.zhuoqiu.goodgx.Vviews extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback implements java.lang.Runnable implements v.Vdisplay {
	 /* .source "Vviews.java" */
	 /* # interfaces */
	 /* # static fields */
	 static final Integer NSOUNDS;
	 static final Boolean TRACE;
	 /* # instance fields */
	 android.app.Activity m_activity;
	 java.util.Hashtable m_audio;
	 android.graphics.Canvas m_canvas;
	 Integer m_dragx;
	 Integer m_dragy;
	 android.graphics.BitmapFactory$Options m_options;
	 Boolean m_paint;
	 Boolean m_running;
	 android.view.SurfaceHolder m_surfaceHolder;
	 java.lang.Thread m_thread;
	 m_up2;
	 Integer m_upn2;
	 v.Viewport m_viewport;
	 Float m_wheelx;
	 Float m_wheely;
	 /* # direct methods */
	 public com.zhuoqiu.goodgx.Vviews ( ) {
		 /* .locals 3 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 714 */
		 /* invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 44 */
		 /* new-instance v1, Ljava/util/Hashtable; */
		 /* invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V */
		 this.m_audio = v1;
		 /* .line 717 */
		 (( com.zhuoqiu.goodgx.Vviews ) p0 ).setFocusable ( v2 ); // invoke-virtual {p0, v2}, Lcom/zhuoqiu/goodgx/Vviews;->setFocusable(Z)V
		 /* .line 719 */
		 (( com.zhuoqiu.goodgx.Vviews ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/zhuoqiu/goodgx/Vviews;->getHolder()Landroid/view/SurfaceHolder;
		 this.m_surfaceHolder = v1;
		 /* .line 722 */
		 v1 = this.m_surfaceHolder;
		 /* .line 727 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v1 ).getConfiguration ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
		 /* .line 729 */
		 /* .local v0, "c":Landroid/content/res/Configuration; */
		 /* iget v1, v0, Landroid/content/res/Configuration;->touchscreen:I */
		 /* if-eq v1, v2, :cond_0 */
		 v.Vmenu.m_mouse = (v2!= 0);
		 /* .line 731 */
	 } // :cond_0
	 /* check-cast p1, Landroid/app/Activity; */
} // .end local p1 # "context":Landroid/content/Context;
this.m_activity = p1;
/* .line 738 */
return;
} // .end method
public com.zhuoqiu.goodgx.Vviews ( ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "classname" # Ljava/lang/String; */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 685 */
/* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
/* .line 44 */
/* new-instance v1, Ljava/util/Hashtable; */
/* invoke-direct {v1}, Ljava/util/Hashtable;-><init>()V */
this.m_audio = v1;
/* .line 688 */
(( com.zhuoqiu.goodgx.Vviews ) p0 ).setFocusable ( v2 ); // invoke-virtual {p0, v2}, Lcom/zhuoqiu/goodgx/Vviews;->setFocusable(Z)V
/* .line 690 */
(( com.zhuoqiu.goodgx.Vviews ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/zhuoqiu/goodgx/Vviews;->getHolder()Landroid/view/SurfaceHolder;
this.m_surfaceHolder = v1;
/* .line 693 */
v1 = this.m_surfaceHolder;
/* .line 698 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getConfiguration ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* .line 700 */
/* .local v0, "c":Landroid/content/res/Configuration; */
/* iget v1, v0, Landroid/content/res/Configuration;->touchscreen:I */
/* if-eq v1, v2, :cond_0 */
v.Vmenu.m_mouse = (v2!= 0);
/* .line 702 */
} // :cond_0
/* check-cast p1, Landroid/app/Activity; */
} // .end local p1 # "context":Landroid/content/Context;
this.m_activity = p1;
/* .line 703 */
v.Vsprite .create ( p2 );
/* check-cast v1, Lv/Viewport; */
this.m_viewport = v1;
/* .line 704 */
v1 = this.m_viewport;
(( v.Viewport ) v1 ).init ( p0 ); // invoke-virtual {v1, p0}, Lv/Viewport;->init(Lv/Vdisplay;)V
/* .line 706 */
v1 = this.m_viewport;
v1 = this.m_up;
/* array-length v1, v1 */
/* new-array v1, v1, [I */
this.m_up2 = v1;
/* .line 707 */
return;
} // .end method
/* # virtual methods */
public Boolean audio ( java.lang.String p0, Boolean p1 ) {
/* .locals 5 */
/* .param p1, "name" # Ljava/lang/String; */
/* .param p2, "bkg" # Z */
/* .prologue */
/* .line 49 */
try { // :try_start_0
v3 = this.m_audio;
(( java.util.Hashtable ) v3 ).get ( p1 ); // invoke-virtual {v3, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/media/MediaPlayer; */
/* .line 51 */
/* .local v1, "p":Landroid/media/MediaPlayer; */
/* if-nez v1, :cond_1 */
/* .line 52 */
v3 = this.m_activity;
(( android.app.Activity ) v3 ).getResources ( ); // invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
/* .line 53 */
/* .local v2, "rm":Landroid/content/res/Resources; */
final String v3 = "raw"; // const-string v3, "raw"
v4 = this.m_activity;
(( android.app.Activity ) v4 ).getPackageName ( ); // invoke-virtual {v4}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
v0 = (( android.content.res.Resources ) v2 ).getIdentifier ( p1, v3, v4 ); // invoke-virtual {v2, p1, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 54 */
/* .local v0, "id":I */
v3 = this.m_activity;
android.media.MediaPlayer .create ( v3,v0 );
/* .line 55 */
v3 = this.m_audio;
(( java.util.Hashtable ) v3 ).put ( p1, v1 ); // invoke-virtual {v3, p1, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 57 */
(( android.media.MediaPlayer ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
/* .line 69 */
} // .end local v0 # "id":I
} // .end local v1 # "p":Landroid/media/MediaPlayer;
} // .end local v2 # "rm":Landroid/content/res/Resources;
} // :cond_0
} // :goto_0
int v3 = 1; // const/4 v3, 0x1
/* .line 59 */
/* .restart local v1 # "p":Landroid/media/MediaPlayer; */
} // :cond_1
v3 = (( android.media.MediaPlayer ) v1 ).isPlaying ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z
/* if-nez v3, :cond_0 */
/* .line 61 */
(( android.media.MediaPlayer ) v1 ).stop ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V
/* .line 62 */
(( android.media.MediaPlayer ) v1 ).prepare ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepare()V
/* .line 63 */
(( android.media.MediaPlayer ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 66 */
} // .end local v1 # "p":Landroid/media/MediaPlayer;
/* :catch_0 */
/* move-exception v3 */
} // .end method
public void exit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 117 */
(( com.zhuoqiu.goodgx.Vviews ) p0 ).stop ( ); // invoke-virtual {p0}, Lcom/zhuoqiu/goodgx/Vviews;->stop()V
/* .line 118 */
return;
} // .end method
public Boolean getImage ( Object[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer[] p5, Integer p6 ) {
/* .locals 8 */
/* .param p1, "pic" # [B */
/* .param p2, "pici" # I */
/* .param p3, "picn" # I */
/* .param p4, "width" # I */
/* .param p5, "height" # I */
/* .param p6, "rgb" # [I */
/* .param p7, "rgbi" # I */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 126 */
v1 = this.m_options;
/* if-nez v1, :cond_0 */
/* .line 127 */
/* new-instance v1, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
this.m_options = v1;
/* .line 128 */
v1 = this.m_options;
/* iput-boolean v4, v1, Landroid/graphics/BitmapFactory$Options;->inDither:Z */
/* .line 129 */
v1 = this.m_options;
v2 = android.graphics.Bitmap$Config.ARGB_8888;
this.inPreferredConfig = v2;
/* .line 132 */
} // :cond_0
v1 = this.m_options;
android.graphics.BitmapFactory .decodeByteArray ( p1,p2,p3,v1 );
/* .line 134 */
/* .local v0, "bm":Landroid/graphics/Bitmap; */
/* if-nez v0, :cond_1 */
/* move v1, v4 */
/* .line 139 */
} // :goto_0
/* .line 137 */
} // :cond_1
v3 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 138 */
/* .local v3, "w":I */
v7 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* move-object v1, p6 */
/* move v2, p7 */
/* move v5, v4 */
/* move v6, v3 */
/* invoke-virtual/range {v0 ..v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
/* .line 139 */
int v1 = 1; // const/4 v1, 0x1
} // .end method
public java.lang.String getPin ( ) {
/* .locals 1 */
/* .prologue */
/* .line 144 */
final String v0 = "1234"; // const-string v0, "1234"
} // .end method
public java.lang.String getPlatform ( ) {
/* .locals 1 */
/* .prologue */
/* .line 149 */
final String v0 = "android"; // const-string v0, "android"
} // .end method
public void gotoUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 152 */
return;
} // .end method
public Boolean isAudioSupported ( ) {
/* .locals 1 */
/* .prologue */
/* .line 156 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .param p1, "key" # I */
/* .param p2, "e" # Landroid/view/KeyEvent; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 225 */
v1 = this.m_viewport;
/* if-nez v1, :cond_0 */
/* move v1, v2 */
/* .line 233 */
} // :goto_0
/* .line 228 */
} // :cond_0
v0 = (( com.zhuoqiu.goodgx.Vviews ) p0 ).onKeyMap ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/zhuoqiu/goodgx/Vviews;->onKeyMap(ILandroid/view/KeyEvent;)C
/* .line 229 */
/* .local v0, "c":C */
/* if-nez v0, :cond_1 */
/* move v1, v2 */
/* .line 230 */
/* .line 232 */
} // :cond_1
v1 = this.m_viewport;
(( v.Viewport ) v1 ).keyDownSys ( v0 ); // invoke-virtual {v1, v0}, Lv/Viewport;->keyDownSys(C)V
/* .line 233 */
int v1 = 1; // const/4 v1, 0x1
} // .end method
Object onKeyMap ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "key" # I */
/* .param p2, "e" # Landroid/view/KeyEvent; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 184 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 218 */
v0 = (( android.view.KeyEvent ) p2 ).getUnicodeChar ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I
/* int-to-char v0, v0 */
} // :goto_0
/* .line 187 */
/* :sswitch_0 */
/* const/16 v0, 0x8 */
/* .line 190 */
/* :sswitch_1 */
v0 = this.m_viewport;
/* iput v1, v0, Lv/Viewport;->m_mousex:I */
/* .line 191 */
int v0 = 1; // const/4 v0, 0x1
/* .line 194 */
/* :sswitch_2 */
v0 = this.m_viewport;
/* iput v1, v0, Lv/Viewport;->m_mousex:I */
/* .line 195 */
int v0 = 2; // const/4 v0, 0x2
/* .line 198 */
/* :sswitch_3 */
v0 = this.m_viewport;
/* iput v1, v0, Lv/Viewport;->m_mousex:I */
/* .line 199 */
int v0 = 3; // const/4 v0, 0x3
/* .line 202 */
/* :sswitch_4 */
v0 = this.m_viewport;
/* iput v1, v0, Lv/Viewport;->m_mousex:I */
/* .line 203 */
int v0 = 4; // const/4 v0, 0x4
/* .line 206 */
/* :sswitch_5 */
int v0 = 5; // const/4 v0, 0x5
/* .line 209 */
/* :sswitch_6 */
/* const/16 v0, 0xa */
/* .line 213 */
/* :sswitch_7 */
int v0 = 6; // const/4 v0, 0x6
/* .line 184 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x4 -> :sswitch_0 */
/* 0x13 -> :sswitch_3 */
/* 0x14 -> :sswitch_4 */
/* 0x15 -> :sswitch_1 */
/* 0x16 -> :sswitch_2 */
/* 0x17 -> :sswitch_5 */
/* 0x42 -> :sswitch_6 */
/* 0x52 -> :sswitch_7 */
} // .end sparse-switch
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .param p1, "key" # I */
/* .param p2, "e" # Landroid/view/KeyEvent; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 237 */
v1 = this.m_viewport;
/* if-nez v1, :cond_0 */
/* move v1, v2 */
/* .line 249 */
} // :goto_0
/* .line 240 */
} // :cond_0
v0 = (( com.zhuoqiu.goodgx.Vviews ) p0 ).onKeyMap ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/zhuoqiu/goodgx/Vviews;->onKeyMap(ILandroid/view/KeyEvent;)C
/* .line 241 */
/* .local v0, "c":C */
/* if-nez v0, :cond_1 */
/* move v1, v2 */
/* .line 242 */
/* .line 244 */
} // :cond_1
v1 = this.m_viewport;
(( v.Viewport ) v1 ).keyUpSys ( v0 ); // invoke-virtual {v1, v0}, Lv/Viewport;->keyUpSys(C)V
/* .line 249 */
int v1 = 1; // const/4 v1, 0x1
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 6 */
/* .param p1, "e" # Landroid/view/MotionEvent; */
/* .prologue */
int v5 = 5; // const/4 v5, 0x5
int v4 = 0; // const/4 v4, 0x0
/* .line 269 */
v0 = this.m_viewport;
/* .line 270 */
/* .local v0, "vp":Lv/Viewport; */
/* if-nez v0, :cond_0 */
/* move v3, v4 */
/* .line 307 */
} // :goto_0
/* .line 273 */
} // :cond_0
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v1, v3 */
/* .line 274 */
/* .local v1, "x":I */
v3 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v2, v3 */
/* .line 276 */
/* .local v2, "y":I */
/* add-int/lit8 v2, v2, -0x8 */
/* .line 278 */
v3 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* packed-switch v3, :pswitch_data_0 */
/* .line 307 */
} // :goto_1
int v3 = 1; // const/4 v3, 0x1
/* .line 281 */
/* :pswitch_0 */
/* iput v1, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_dragx:I */
/* .line 282 */
/* iput v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_dragy:I */
/* .line 283 */
/* iput v1, v0, Lv/Viewport;->m_mousex:I */
/* .line 284 */
/* iput v2, v0, Lv/Viewport;->m_mousey:I */
/* .line 285 */
(( v.Viewport ) v0 ).keyDownSys ( v5 ); // invoke-virtual {v0, v5}, Lv/Viewport;->keyDownSys(C)V
/* .line 289 */
/* :pswitch_1 */
/* iput v1, v0, Lv/Viewport;->m_mousex:I */
/* .line 290 */
/* iput v2, v0, Lv/Viewport;->m_mousey:I */
/* .line 291 */
/* iget v3, v0, Lv/Viewport;->m_dragx:I */
/* iget v4, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_dragx:I */
/* sub-int v4, v1, v4 */
/* add-int/2addr v3, v4 */
/* iput v3, v0, Lv/Viewport;->m_dragx:I */
/* .line 292 */
/* iget v3, v0, Lv/Viewport;->m_dragy:I */
/* iget v4, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_dragy:I */
/* sub-int v4, v2, v4 */
/* add-int/2addr v3, v4 */
/* iput v3, v0, Lv/Viewport;->m_dragy:I */
/* .line 293 */
/* iput v1, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_dragx:I */
/* .line 294 */
/* iput v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_dragy:I */
/* .line 299 */
/* :pswitch_2 */
/* iput v4, v0, Lv/Viewport;->m_mousex:I */
/* .line 300 */
/* iput v4, v0, Lv/Viewport;->m_mousey:I */
/* .line 301 */
(( v.Viewport ) v0 ).keyUpSys ( v5 ); // invoke-virtual {v0, v5}, Lv/Viewport;->keyUpSys(C)V
/* .line 278 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public Boolean onTrackballEvent ( android.view.MotionEvent p0 ) {
/* .locals 6 */
/* .param p1, "e" # Landroid/view/MotionEvent; */
/* .prologue */
int v3 = 5; // const/4 v3, 0x5
int v5 = 1; // const/4 v5, 0x1
/* const/high16 v4, 0x40000000 # 2.0f */
/* .line 312 */
v2 = this.m_viewport;
/* if-nez v2, :cond_0 */
/* .line 313 */
int v2 = 0; // const/4 v2, 0x0
/* .line 354 */
} // :goto_0
/* .line 315 */
} // :cond_0
v2 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* packed-switch v2, :pswitch_data_0 */
} // :cond_1
} // :goto_1
/* move v2, v5 */
/* .line 354 */
/* .line 318 */
/* :pswitch_0 */
v2 = this.m_viewport;
(( v.Viewport ) v2 ).keyDownSys ( v3 ); // invoke-virtual {v2, v3}, Lv/Viewport;->keyDownSys(C)V
/* .line 323 */
/* :pswitch_1 */
/* iget v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheelx:F */
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iput v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheelx:F */
/* .line 324 */
/* iget v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheely:F */
v3 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iput v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheely:F */
/* .line 326 */
/* iget v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheelx:F */
/* float-to-int v0, v2 */
/* .line 327 */
/* .local v0, "x":I */
/* iget v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheely:F */
/* float-to-int v1, v2 */
/* .line 330 */
/* .local v1, "y":I */
/* iget v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheelx:F */
/* int-to-float v3, v0 */
/* sub-float/2addr v2, v3 */
/* iput v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheelx:F */
/* .line 331 */
/* iget v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheely:F */
/* int-to-float v3, v1 */
/* sub-float/2addr v2, v3 */
/* iput v2, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_wheely:F */
/* .line 333 */
v2 = this.m_viewport;
/* iget v3, v2, Lv/Viewport;->m_wheelx:I */
/* add-int/2addr v3, v0 */
/* iput v3, v2, Lv/Viewport;->m_wheelx:I */
/* .line 334 */
v2 = this.m_viewport;
/* iget v3, v2, Lv/Viewport;->m_wheely:I */
/* add-int/2addr v3, v1 */
/* iput v3, v2, Lv/Viewport;->m_wheely:I */
/* .line 337 */
/* if-gez v0, :cond_3 */
/* .line 338 */
v2 = this.m_viewport;
(( v.Viewport ) v2 ).keyAddSys ( v5 ); // invoke-virtual {v2, v5}, Lv/Viewport;->keyAddSys(C)V
/* .line 342 */
} // :cond_2
} // :goto_2
/* if-gez v1, :cond_4 */
/* .line 343 */
v2 = this.m_viewport;
int v3 = 3; // const/4 v3, 0x3
(( v.Viewport ) v2 ).keyAddSys ( v3 ); // invoke-virtual {v2, v3}, Lv/Viewport;->keyAddSys(C)V
/* .line 339 */
} // :cond_3
/* if-lez v0, :cond_2 */
/* .line 340 */
v2 = this.m_viewport;
int v3 = 2; // const/4 v3, 0x2
(( v.Viewport ) v2 ).keyAddSys ( v3 ); // invoke-virtual {v2, v3}, Lv/Viewport;->keyAddSys(C)V
/* .line 344 */
} // :cond_4
/* if-lez v1, :cond_1 */
/* .line 345 */
v2 = this.m_viewport;
int v3 = 4; // const/4 v3, 0x4
(( v.Viewport ) v2 ).keyAddSys ( v3 ); // invoke-virtual {v2, v3}, Lv/Viewport;->keyAddSys(C)V
/* .line 350 */
} // .end local v0 # "x":I
} // .end local v1 # "y":I
/* :pswitch_2 */
v2 = this.m_viewport;
(( v.Viewport ) v2 ).keyUpSys ( v3 ); // invoke-virtual {v2, v3}, Lv/Viewport;->keyUpSys(C)V
/* .line 315 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public java.io.InputStream open ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 358 */
int v2 = 0; // const/4 v2, 0x0
/* .line 361 */
/* .local v2, "in":Ljava/io/InputStream; */
int v4 = 1; // const/4 v4, 0x1
(( java.lang.String ) p1 ).substring ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 364 */
/* const/16 v4, 0x2e */
v0 = (( java.lang.String ) p1 ).indexOf ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(I)I
/* .line 365 */
/* .local v0, "i":I */
int v4 = -1; // const/4 v4, -0x1
/* if-eq v0, v4, :cond_0 */
/* .line 366 */
int v4 = 0; // const/4 v4, 0x0
(( java.lang.String ) p1 ).substring ( v4, v0 ); // invoke-virtual {p1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 382 */
} // :cond_0
v4 = this.m_activity;
(( android.app.Activity ) v4 ).getResources ( ); // invoke-virtual {v4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
/* .line 383 */
/* .local v3, "rm":Landroid/content/res/Resources; */
final String v4 = "raw"; // const-string v4, "raw"
v5 = this.m_activity;
(( android.app.Activity ) v5 ).getPackageName ( ); // invoke-virtual {v5}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
v1 = (( android.content.res.Resources ) v3 ).getIdentifier ( p1, v4, v5 ); // invoke-virtual {v3, p1, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 384 */
/* .local v1, "id":I */
(( android.content.res.Resources ) v3 ).openRawResource ( v1 ); // invoke-virtual {v3, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
/* .line 386 */
} // .end method
void pause ( Boolean p0 ) {
/* .locals 3 */
/* .param p1, "on" # Z */
/* .prologue */
/* .line 391 */
v0 = java.lang.System.out;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "pause "; // const-string v2, "pause "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 393 */
v0 = this.m_viewport;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 394 */
v0 = this.m_viewport;
/* iput-boolean p1, v0, Lv/Viewport;->m_pause:Z */
/* .line 395 */
} // :cond_0
return;
} // .end method
public Boolean prefsRead ( java.lang.String p0, Object[] p1 ) {
/* .locals 5 */
/* .param p1, "prefname" # Ljava/lang/String; */
/* .param p2, "ba" # [B */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 401 */
try { // :try_start_0
v2 = this.m_activity;
(( android.app.Activity ) v2 ).openFileInput ( p1 ); // invoke-virtual {v2, p1}, Landroid/app/Activity;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
/* .line 402 */
/* .local v1, "in":Ljava/io/InputStream; */
int v2 = 0; // const/4 v2, 0x0
/* array-length v3, p2 */
(( java.io.InputStream ) v1 ).read ( p2, v2, v3 ); // invoke-virtual {v1, p2, v2, v3}, Ljava/io/InputStream;->read([BII)I
/* .line 403 */
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 404 */
int v2 = 1; // const/4 v2, 0x1
/* .line 407 */
} // .end local v1 # "in":Ljava/io/InputStream;
} // :goto_0
/* .line 406 */
/* :catch_0 */
/* move-exception v2 */
/* move-object v0, v2 */
/* .local v0, "e":Ljava/io/IOException; */
/* move v2, v4 */
/* .line 407 */
} // .end method
public Boolean prefsWrite ( java.lang.String p0, Object[] p1 ) {
/* .locals 5 */
/* .param p1, "prefname" # Ljava/lang/String; */
/* .param p2, "ba" # [B */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 414 */
try { // :try_start_0
v2 = this.m_activity;
int v3 = 0; // const/4 v3, 0x0
(( android.app.Activity ) v2 ).openFileOutput ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Landroid/app/Activity;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
/* .line 415 */
/* .local v1, "out":Ljava/io/OutputStream; */
int v2 = 0; // const/4 v2, 0x0
/* array-length v3, p2 */
(( java.io.OutputStream ) v1 ).write ( p2, v2, v3 ); // invoke-virtual {v1, p2, v2, v3}, Ljava/io/OutputStream;->write([BII)V
/* .line 416 */
(( java.io.OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 417 */
int v2 = 1; // const/4 v2, 0x1
/* .line 420 */
} // .end local v1 # "out":Ljava/io/OutputStream;
} // :goto_0
/* .line 419 */
/* :catch_0 */
/* move-exception v2 */
/* move-object v0, v2 */
/* .local v0, "e":Ljava/io/IOException; */
/* move v2, v4 */
/* .line 420 */
} // .end method
public void redraw ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .param p1, "x0" # I */
/* .param p2, "y0" # I */
/* .param p3, "x1" # I */
/* .param p4, "y1" # I */
/* .prologue */
/* .line 425 */
v1 = this.m_viewport;
v0 = this.m_up;
/* .line 426 */
/* .local v0, "up":[I */
int v1 = 0; // const/4 v1, 0x0
/* aput p1, v0, v1 */
/* .line 427 */
int v1 = 1; // const/4 v1, 0x1
/* aput p2, v0, v1 */
/* .line 428 */
int v1 = 2; // const/4 v1, 0x2
/* aput p3, v0, v1 */
/* .line 429 */
int v1 = 3; // const/4 v1, 0x3
/* aput p4, v0, v1 */
/* .line 430 */
v1 = this.m_viewport;
int v2 = 4; // const/4 v2, 0x4
/* iput v2, v1, Lv/Viewport;->m_upn:I */
/* .line 432 */
(( com.zhuoqiu.goodgx.Vviews ) p0 ).redrawAll ( ); // invoke-virtual {p0}, Lcom/zhuoqiu/goodgx/Vviews;->redrawAll()V
/* .line 433 */
return;
} // .end method
public void redrawAll ( ) {
/* .locals 26 */
/* .prologue */
/* .line 437 */
/* move-object/from16 v0, p0 */
v0 = this.m_viewport;
/* move-object/from16 v23, v0 */
/* .line 440 */
/* .local v23, "vp":Lv/Viewport; */
try { // :try_start_0
/* move-object/from16 v0, p0 */
v0 = this.m_surfaceHolder;
/* move-object v6, v0 */
int v7 = 0; // const/4 v7, 0x0
/* .line 441 */
/* .local v5, "c":Landroid/graphics/Canvas; */
/* move-object v0, v5 */
/* move-object/from16 v1, p0 */
this.m_canvas = v0;
/* .line 443 */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 445 */
/* move-object/from16 v0, v23 */
v0 = this.m_up;
/* move-object/from16 v19, v0 */
/* .line 446 */
/* .local v19, "up":[I */
/* move-object/from16 v0, v23 */
/* iget v0, v0, Lv/Viewport;->m_upn:I */
/* move/from16 v21, v0 */
/* .line 448 */
/* .local v21, "upn":I */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/zhuoqiu/goodgx/Vviews;->m_paint:Z */
/* move v6, v0 */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 450 */
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
/* aput v7, v19, v6 */
/* .line 451 */
int v6 = 1; // const/4 v6, 0x1
int v7 = 0; // const/4 v7, 0x0
/* aput v7, v19, v6 */
/* .line 452 */
int v6 = 2; // const/4 v6, 0x2
/* move-object/from16 v0, v23 */
/* iget v0, v0, Lv/Viewport;->m_width:I */
/* move v7, v0 */
/* aput v7, v19, v6 */
/* .line 453 */
int v6 = 3; // const/4 v6, 0x3
/* move-object/from16 v0, v23 */
/* iget v0, v0, Lv/Viewport;->m_height:I */
/* move v7, v0 */
/* aput v7, v19, v6 */
/* .line 454 */
/* const/16 v21, 0x4 */
/* .line 457 */
} // :cond_0
/* move-object/from16 v0, p0 */
v0 = this.m_up2;
/* move-object/from16 v20, v0 */
/* .line 458 */
/* .local v20, "up2":[I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/zhuoqiu/goodgx/Vviews;->m_upn2:I */
/* move/from16 v22, v0 */
/* .line 461 */
/* .local v22, "upn2":I */
/* move-object/from16 v0, v20 */
/* move-object/from16 v1, v23 */
this.m_up = v0;
/* .line 462 */
/* move/from16 v0, v22 */
/* move-object/from16 v1, v23 */
/* iput v0, v1, Lv/Viewport;->m_upn:I */
/* .line 464 */
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, p0 */
this.m_up2 = v0;
/* .line 465 */
/* move/from16 v0, v21 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/zhuoqiu/goodgx/Vviews;->m_upn2:I */
/* .line 470 */
/* const/16 v18, 0x0 */
/* .local v18, "i":I */
} // :goto_0
/* move/from16 v0, v18 */
/* move/from16 v1, v21 */
/* if-lt v0, v1, :cond_3 */
/* .line 473 */
/* move-object/from16 v0, v23 */
/* iget v0, v0, Lv/Viewport;->m_upn:I */
/* move/from16 v22, v0 */
/* .line 475 */
v16 = (( android.graphics.Canvas ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Canvas;->getWidth()I
/* .line 476 */
/* .local v16, "cw":I */
v15 = (( android.graphics.Canvas ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/graphics/Canvas;->getHeight()I
/* .line 478 */
/* .local v15, "ch":I */
/* move-object/from16 v0, v23 */
/* iget v0, v0, Lv/Viewport;->m_width:I */
/* move v8, v0 */
/* .line 479 */
/* .local v8, "stride":I */
/* move-object/from16 v0, v23 */
/* iget v0, v0, Lv/Viewport;->m_height:I */
/* move/from16 v17, v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 482 */
/* .local v17, "ht":I */
/* const/16 v18, 0x0 */
} // :goto_1
/* move/from16 v0, v18 */
/* move/from16 v1, v22 */
/* if-lt v0, v1, :cond_4 */
/* .line 508 */
} // .end local v8 # "stride":I
} // .end local v15 # "ch":I
} // .end local v16 # "cw":I
} // .end local v17 # "ht":I
} // .end local v18 # "i":I
} // .end local v19 # "up":[I
} // .end local v20 # "up2":[I
} // .end local v21 # "upn":I
} // .end local v22 # "upn2":I
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.m_canvas;
/* move-object v6, v0 */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 509 */
/* move-object/from16 v0, p0 */
v0 = this.m_surfaceHolder;
/* move-object v6, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_canvas;
/* move-object v7, v0 */
/* .line 510 */
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, v6 */
/* move-object/from16 v1, p0 */
this.m_canvas = v0;
/* .line 514 */
} // :cond_2
int v6 = 0; // const/4 v6, 0x0
/* move v0, v6 */
/* move-object/from16 v1, v23 */
/* iput v0, v1, Lv/Viewport;->m_upn:I */
/* .line 515 */
return;
/* .line 471 */
/* .restart local v18 # "i":I */
/* .restart local v19 # "up":[I */
/* .restart local v20 # "up2":[I */
/* .restart local v21 # "upn":I */
/* .restart local v22 # "upn2":I */
} // :cond_3
try { // :try_start_1
/* aget v6, v19, v18 */
/* add-int/lit8 v7, v18, 0x1 */
/* aget v7, v19, v7 */
/* add-int/lit8 v8, v18, 0x2 */
/* aget v8, v19, v8 */
/* add-int/lit8 v9, v18, 0x3 */
/* aget v9, v19, v9 */
/* move-object/from16 v0, v23 */
/* move v1, v6 */
/* move v2, v7 */
/* move v3, v8 */
/* move v4, v9 */
(( v.Viewport ) v0 ).redraw ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/Viewport;->redraw(IIII)V
/* .line 470 */
/* add-int/lit8 v18, v18, 0x4 */
/* .line 483 */
/* .restart local v8 # "stride":I */
/* .restart local v15 # "ch":I */
/* .restart local v16 # "cw":I */
/* .restart local v17 # "ht":I */
} // :cond_4
/* aget v9, v20, v18 */
/* .line 484 */
/* .local v9, "x0":I */
/* add-int/lit8 v6, v18, 0x1 */
/* aget v10, v20, v6 */
/* .line 485 */
/* .local v10, "y0":I */
/* add-int/lit8 v6, v18, 0x2 */
/* aget v24, v20, v6 */
/* .line 486 */
/* .local v24, "x1":I */
/* add-int/lit8 v6, v18, 0x3 */
/* aget v25, v20, v6 */
/* .line 488 */
/* .local v25, "y1":I */
/* move/from16 v0, v16 */
/* move v1, v8 */
/* if-ne v0, v1, :cond_5 */
/* move v0, v15 */
/* move/from16 v1, v17 */
/* if-ne v0, v1, :cond_5 */
/* move/from16 v0, v24 */
/* move/from16 v1, v16 */
/* if-gt v0, v1, :cond_5 */
/* move/from16 v0, v24 */
/* move v1, v8 */
/* if-gt v0, v1, :cond_5 */
/* move/from16 v0, v25 */
/* move v1, v15 */
/* if-gt v0, v1, :cond_5 */
/* move/from16 v0, v25 */
/* move/from16 v1, v17 */
/* if-le v0, v1, :cond_7 */
/* .line 490 */
} // :cond_5
int v6 = 1; // const/4 v6, 0x1
/* move v0, v6 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lcom/zhuoqiu/goodgx/Vviews;->m_paint:Z */
/* .line 491 */
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
int v9 = 0; // const/4 v9, 0x0
(( android.graphics.Canvas ) v5 ).drawRGB ( v6, v7, v9 ); // invoke-virtual {v5, v6, v7, v9}, Landroid/graphics/Canvas;->drawRGB(III)V
/* .line 492 */
} // .end local v9 # "x0":I
/* const/16 v22, 0x0 */
/* .line 482 */
} // :cond_6
} // :goto_2
/* add-int/lit8 v18, v18, 0x4 */
/* .line 495 */
/* .restart local v9 # "x0":I */
} // :cond_7
/* move-object/from16 v0, p0 */
v0 = this.m_viewport;
/* move-object v6, v0 */
v6 = this.m_rgb;
/* mul-int v7, v10, v8 */
/* add-int/2addr v7, v9 */
/* sub-int v11, v24, v9 */
/* sub-int v12, v25, v10 */
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
/* invoke-virtual/range {v5 ..v14}, Landroid/graphics/Canvas;->drawBitmap([IIIIIIIZLandroid/graphics/Paint;)V */
/* .line 498 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/zhuoqiu/goodgx/Vviews;->m_paint:Z */
/* move v6, v0 */
if ( v6 != null) { // if-eqz v6, :cond_6
/* if-nez v9, :cond_6 */
/* if-nez v10, :cond_6 */
/* move/from16 v0, v24 */
/* move v1, v8 */
/* if-ne v0, v1, :cond_6 */
/* move/from16 v0, v25 */
/* move/from16 v1, v17 */
/* if-ne v0, v1, :cond_6 */
/* .line 499 */
int v6 = 0; // const/4 v6, 0x0
/* move v0, v6 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lcom/zhuoqiu/goodgx/Vviews;->m_paint:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 504 */
} // .end local v5 # "c":Landroid/graphics/Canvas;
} // .end local v8 # "stride":I
} // .end local v9 # "x0":I
} // .end local v10 # "y0":I
} // .end local v15 # "ch":I
} // .end local v16 # "cw":I
} // .end local v17 # "ht":I
} // .end local v18 # "i":I
} // .end local v19 # "up":[I
} // .end local v20 # "up2":[I
} // .end local v21 # "upn":I
} // .end local v22 # "upn2":I
} // .end local v24 # "x1":I
} // .end local v25 # "y1":I
/* :catchall_0 */
/* move-exception v6 */
/* .line 508 */
/* move-object/from16 v0, p0 */
v0 = this.m_canvas;
/* move-object v7, v0 */
if ( v7 != null) { // if-eqz v7, :cond_8
/* .line 509 */
/* move-object/from16 v0, p0 */
v0 = this.m_surfaceHolder;
/* move-object v7, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_canvas;
/* move-object v8, v0 */
/* .line 510 */
int v7 = 0; // const/4 v7, 0x0
/* move-object v0, v7 */
/* move-object/from16 v1, p0 */
this.m_canvas = v0;
/* .line 512 */
} // :cond_8
/* throw v6 */
} // .end method
public void run ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 614 */
v0 = this.m_viewport;
(( v.Viewport ) v0 ).run ( ); // invoke-virtual {v0}, Lv/Viewport;->run()V
/* .line 615 */
v0 = this.m_viewport;
/* iput-boolean v1, v0, Lv/Viewport;->m_stop:Z */
/* .line 616 */
/* iput-boolean v1, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_running:Z */
/* .line 618 */
v0 = this.m_activity;
(( android.app.Activity ) v0 ).finish ( ); // invoke-virtual {v0}, Landroid/app/Activity;->finish()V
/* .line 619 */
return;
} // .end method
public void showUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 623 */
return;
} // .end method
void start ( ) {
/* .locals 2 */
/* .prologue */
/* .line 661 */
/* iget-boolean v1, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_running:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 667 */
} // :goto_0
return;
/* .line 664 */
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_running:Z */
/* .line 665 */
/* new-instance v0, Ljava/lang/Thread; */
/* invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 666 */
/* .local v0, "thread":Ljava/lang/Thread; */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
} // .end method
void stop ( ) {
/* .locals 2 */
/* .prologue */
/* .line 670 */
/* iget-boolean v0, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_running:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 671 */
v0 = this.m_viewport;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lv/Viewport;->m_stop:Z */
/* .line 672 */
v0 = this.m_viewport;
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Lv/Viewport;->m_pause:Z */
/* .line 674 */
} // :cond_0
return;
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .param p2, "format" # I */
/* .param p3, "width" # I */
/* .param p4, "height" # I */
/* .prologue */
/* .line 628 */
v1 = this.m_viewport;
/* if-nez v1, :cond_1 */
/* .line 642 */
} // :cond_0
} // :goto_0
return;
/* .line 631 */
} // :cond_1
v1 = this.m_viewport;
/* iget v0, v1, Lv/Viewport;->m_width:I */
/* .line 637 */
/* .local v0, "oldw":I */
v1 = this.m_viewport;
(( v.Viewport ) v1 ).setWidthHeight ( p3, p4 ); // invoke-virtual {v1, p3, p4}, Lv/Viewport;->setWidthHeight(II)V
/* .line 640 */
/* if-nez v0, :cond_0 */
/* .line 641 */
(( com.zhuoqiu.goodgx.Vviews ) p0 ).start ( ); // invoke-virtual {p0}, Lcom/zhuoqiu/goodgx/Vviews;->start()V
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 649 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_paint:Z */
/* .line 650 */
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 654 */
} // :goto_0
v0 = this.m_canvas;
/* if-nez v0, :cond_0 */
/* .line 656 */
return;
/* .line 655 */
} // :cond_0
/* const/16 v0, 0xa */
(( com.zhuoqiu.goodgx.Vviews ) p0 ).waitMs ( v0 ); // invoke-virtual {p0, v0}, Lcom/zhuoqiu/goodgx/Vviews;->waitMs(I)V
} // .end method
public Integer time ( ) {
/* .locals 2 */
/* .prologue */
/* .line 679 */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v0 */
/* long-to-int v0, v0 */
} // .end method
public void waitMs ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "ms" # I */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 750 */
/* iget-boolean v0, p0, Lcom/zhuoqiu/goodgx/Vviews;->m_paint:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 751 */
v0 = this.m_viewport;
/* iget v0, v0, Lv/Viewport;->m_width:I */
v1 = this.m_viewport;
/* iget v1, v1, Lv/Viewport;->m_height:I */
(( com.zhuoqiu.goodgx.Vviews ) p0 ).redraw ( v2, v2, v0, v1 ); // invoke-virtual {p0, v2, v2, v0, v1}, Lcom/zhuoqiu/goodgx/Vviews;->redraw(IIII)V
/* .line 754 */
} // :cond_0
/* int-to-long v0, p1 */
android.os.SystemClock .sleep ( v0,v1 );
/* .line 755 */
return;
} // .end method
