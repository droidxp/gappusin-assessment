public class com.ansca.corona.ViewManager {
	 /* .source "ViewManager.java" */
	 /* # static fields */
	 private static com.ansca.corona.ViewManager ourViewManager;
	 /* # instance fields */
	 private android.widget.AbsoluteLayout myAbsoluteLayout;
	 private com.ansca.corona.CoronaActivity myActivity;
	 private android.view.ViewGroup myContentView;
	 private java.util.HashMap myObjectViews;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Landroid/view/View;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private android.widget.FrameLayout myOverlayView;
private com.ansca.corona.CoronaVideoView myVideoView;
private com.ansca.corona.CoronaWebView myWebView;
/* # direct methods */
private com.ansca.corona.ViewManager ( ) {
/* .locals 2 */
/* .param p1, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 30 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 31 */
this.myActivity = p1;
/* .line 32 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.myObjectViews = v0;
/* .line 33 */
this.myContentView = v1;
/* .line 34 */
this.myOverlayView = v1;
/* .line 35 */
this.myAbsoluteLayout = v1;
/* .line 36 */
this.myVideoView = v1;
/* .line 37 */
this.myWebView = v1;
/* .line 38 */
return;
} // .end method
static android.widget.AbsoluteLayout access$000 ( com.ansca.corona.ViewManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/ViewManager; */
/* .prologue */
/* .line 18 */
v0 = this.myAbsoluteLayout;
} // .end method
static com.ansca.corona.CoronaActivity access$100 ( com.ansca.corona.ViewManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/ViewManager; */
/* .prologue */
/* .line 18 */
v0 = this.myActivity;
} // .end method
static java.util.HashMap access$200 ( com.ansca.corona.ViewManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/ViewManager; */
/* .prologue */
/* .line 18 */
v0 = this.myObjectViews;
} // .end method
static com.ansca.corona.CoronaEditText access$300 ( com.ansca.corona.ViewManager p0, Integer p1 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/ViewManager; */
/* .param p1, "x1" # I */
/* .prologue */
/* .line 18 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
} // .end method
static android.view.ViewGroup access$400 ( com.ansca.corona.ViewManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/ViewManager; */
/* .prologue */
/* .line 18 */
v0 = this.myContentView;
} // .end method
static com.ansca.corona.CoronaVideoView access$500 ( com.ansca.corona.ViewManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/ViewManager; */
/* .prologue */
/* .line 18 */
v0 = this.myVideoView;
} // .end method
static com.ansca.corona.CoronaVideoView access$502 ( com.ansca.corona.ViewManager p0, com.ansca.corona.CoronaVideoView p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/ViewManager; */
/* .param p1, "x1" # Lcom/ansca/corona/CoronaVideoView; */
/* .prologue */
/* .line 18 */
this.myVideoView = p1;
} // .end method
static com.ansca.corona.CoronaWebView access$600 ( com.ansca.corona.ViewManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/ViewManager; */
/* .prologue */
/* .line 18 */
v0 = this.myWebView;
} // .end method
static com.ansca.corona.CoronaWebView access$602 ( com.ansca.corona.ViewManager p0, com.ansca.corona.CoronaWebView p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/ViewManager; */
/* .param p1, "x1" # Lcom/ansca/corona/CoronaWebView; */
/* .prologue */
/* .line 18 */
this.myWebView = p1;
} // .end method
public static void destroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 80 */
v0 = com.ansca.corona.ViewManager.ourViewManager;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 82 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 84 */
} // :cond_0
return;
} // .end method
private com.ansca.corona.CoronaEditText getTextView ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 93 */
v1 = this.myObjectViews;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 94 */
/* .local v0, "view":Landroid/view/View; */
/* instance-of v1, v0, Lcom/ansca/corona/CoronaEditText; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 95 */
	 /* check-cast v0, Lcom/ansca/corona/CoronaEditText; */
	 /* .line 97 */
} // .end local v0 # "view":Landroid/view/View;
} // :goto_0
/* .restart local v0 # "view":Landroid/view/View; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static com.ansca.corona.ViewManager getViewManager ( ) {
/* .locals 1 */
/* .prologue */
/* .line 88 */
v0 = com.ansca.corona.ViewManager.ourViewManager;
} // .end method
public static void initialize ( com.ansca.corona.CoronaActivity p0 ) {
/* .locals 1 */
/* .param p0, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 72 */
v0 = com.ansca.corona.ViewManager.ourViewManager;
/* if-nez v0, :cond_0 */
/* .line 74 */
/* new-instance v0, Lcom/ansca/corona/ViewManager; */
/* invoke-direct {v0, p0}, Lcom/ansca/corona/ViewManager;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
/* .line 76 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void addTextView ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Boolean p5 ) {
/* .locals 9 */
/* .param p1, "id" # I */
/* .param p2, "left" # I */
/* .param p3, "top" # I */
/* .param p4, "width" # I */
/* .param p5, "height" # I */
/* .param p6, "isSingleLine" # Z */
/* .prologue */
/* .line 123 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v0, Lcom/ansca/corona/ViewManager$1; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p2 */
/* move v6, p3 */
/* move v7, p6 */
/* invoke-direct/range {v0 ..v7}, Lcom/ansca/corona/ViewManager$1;-><init>(Lcom/ansca/corona/ViewManager;IIIIIZ)V */
(( android.os.Handler ) v8 ).post ( v0 ); // invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 156 */
return;
} // .end method
public void addWebView ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Boolean p5, Boolean p6 ) {
/* .locals 10 */
/* .param p1, "id" # I */
/* .param p2, "left" # I */
/* .param p3, "top" # I */
/* .param p4, "width" # I */
/* .param p5, "height" # I */
/* .param p6, "background" # Z */
/* .param p7, "autoCloseEnabled" # Z */
/* .prologue */
/* .line 528 */
v0 = this.myWebView;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 558 */
} // :goto_0
return;
/* .line 532 */
} // :cond_0
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v0, Lcom/ansca/corona/ViewManager$17; */
/* move-object v1, p0 */
/* move v2, p4 */
/* move v3, p5 */
/* move v4, p2 */
/* move v5, p3 */
/* move v6, p1 */
/* move/from16 v7, p6 */
/* move/from16 v8, p7 */
/* invoke-direct/range {v0 ..v8}, Lcom/ansca/corona/ViewManager$17;-><init>(Lcom/ansca/corona/ViewManager;IIIIIZZ)V */
(( android.os.Handler ) v9 ).post ( v0 ); // invoke-virtual {v9, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // .end method
public Boolean closeWebView ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 637 */
v0 = this.myWebView;
/* if-nez v0, :cond_0 */
/* .line 638 */
int v0 = 0; // const/4 v0, 0x0
/* .line 642 */
} // :goto_0
/* .line 640 */
} // :cond_0
(( com.ansca.corona.ViewManager ) p0 ).destroyWebView ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/ViewManager;->destroyWebView(I)V
/* .line 642 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public com.ansca.corona.CoronaVideoView createVideoView ( ) {
/* .locals 4 */
/* .prologue */
int v3 = -1; // const/4 v3, -0x1
/* .line 491 */
v1 = this.myActivity;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.myAbsoluteLayout;
/* if-nez v1, :cond_1 */
/* .line 492 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 502 */
} // :goto_0
/* .line 496 */
} // :cond_1
/* new-instance v1, Lcom/ansca/corona/CoronaVideoView; */
v2 = this.myActivity;
/* invoke-direct {v1, v2}, Lcom/ansca/corona/CoronaVideoView;-><init>(Landroid/content/Context;)V */
this.myVideoView = v1;
/* .line 497 */
/* new-instance v0, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 498 */
/* .local v0, "relativeParams":Landroid/widget/RelativeLayout$LayoutParams; */
/* const/16 v1, 0xd */
(( android.widget.RelativeLayout$LayoutParams ) v0 ).addRule ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
/* .line 499 */
v1 = this.myAbsoluteLayout;
v2 = this.myVideoView;
(( android.widget.AbsoluteLayout ) v1 ).addView ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/widget/AbsoluteLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 500 */
v1 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v1 ).getGLView ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getGLView()Landroid/view/View;
int v2 = 4; // const/4 v2, 0x4
(( android.view.View ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V
/* .line 502 */
v1 = this.myVideoView;
} // .end method
public void destroyTextView ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 161 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
/* .line 162 */
/* .local v0, "textView":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 183 */
} // :goto_0
return;
/* .line 169 */
} // :cond_0
v1 = this.myObjectViews;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 172 */
v1 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v1 ).getHandler ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v2, Lcom/ansca/corona/ViewManager$2; */
/* invoke-direct {v2, p0, v0}, Lcom/ansca/corona/ViewManager$2;-><init>(Lcom/ansca/corona/ViewManager;Lcom/ansca/corona/CoronaEditText;)V */
(( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // .end method
public void destroyVideoView ( ) {
/* .locals 2 */
/* .prologue */
/* .line 507 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$16; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/ViewManager$16;-><init>(Lcom/ansca/corona/ViewManager;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 524 */
return;
} // .end method
public void destroyWebView ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 563 */
v1 = this.myWebView;
/* if-nez v1, :cond_0 */
/* .line 584 */
} // :goto_0
return;
/* .line 570 */
} // :cond_0
v1 = this.myObjectViews;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 571 */
v0 = this.myWebView;
/* .line 572 */
/* .local v0, "webView":Lcom/ansca/corona/CoronaWebView; */
int v1 = 0; // const/4 v1, 0x0
this.myWebView = v1;
/* .line 575 */
v1 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v1 ).getHandler ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v2, Lcom/ansca/corona/ViewManager$18; */
/* invoke-direct {v2, p0, v0}, Lcom/ansca/corona/ViewManager$18;-><init>(Lcom/ansca/corona/ViewManager;Lcom/ansca/corona/CoronaWebView;)V */
(( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // .end method
public void displayObjectUpdateScreenBounds ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 8 */
/* .param p1, "id" # I */
/* .param p2, "left" # I */
/* .param p3, "top" # I */
/* .param p4, "width" # I */
/* .param p5, "height" # I */
/* .prologue */
/* .line 434 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v0, Lcom/ansca/corona/ViewManager$14; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p2 */
/* move v6, p3 */
/* invoke-direct/range {v0 ..v6}, Lcom/ansca/corona/ViewManager$14;-><init>(Lcom/ansca/corona/ViewManager;IIIII)V */
(( android.os.Handler ) v7 ).post ( v0 ); // invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 443 */
return;
} // .end method
public android.widget.AbsoluteLayout getAbsoluteLayout ( ) {
/* .locals 1 */
/* .prologue */
/* .line 67 */
v0 = this.myAbsoluteLayout;
} // .end method
public android.view.ViewGroup getContentView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 47 */
v0 = this.myContentView;
} // .end method
public Boolean getDisplayObjectBackground ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 475 */
v1 = this.myObjectViews;
/* new-instance v2, Ljava/lang/Integer; */
/* invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 476 */
/* .local v0, "view":Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 478 */
(( android.view.View ) v0 ).getBackground ( ); // invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 479 */
int v1 = 1; // const/4 v1, 0x1
/* .line 481 */
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
public Boolean getDisplayObjectVisible ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 447 */
int v0 = 0; // const/4 v0, 0x0
/* .line 449 */
/* .local v0, "result":Z */
v2 = this.myObjectViews;
/* new-instance v3, Ljava/lang/Integer; */
/* invoke-direct {v3, p1}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/View; */
/* .line 450 */
/* .local v1, "view":Landroid/view/View; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 452 */
v2 = (( android.view.View ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/view/View;->getVisibility()I
/* if-nez v2, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 454 */
} // :cond_0
} // :goto_0
/* .line 452 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public android.widget.FrameLayout getOverlayView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 57 */
v0 = this.myOverlayView;
} // .end method
public java.lang.String getTextViewAlign ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 285 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
/* .line 286 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 287 */
final String v1 = ""; // const-string v1, ""
/* .line 289 */
} // :goto_0
} // :cond_0
(( com.ansca.corona.CoronaEditText ) v0 ).getTextViewAlign ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getTextViewAlign()Ljava/lang/String;
} // .end method
public Integer getTextViewColor ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 306 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
/* .line 307 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 308 */
int v1 = 0; // const/4 v1, 0x0
/* .line 309 */
} // :goto_0
} // :cond_0
v1 = (( com.ansca.corona.CoronaEditText ) v0 ).getTextViewColor ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getTextViewColor()I
} // .end method
public java.lang.String getTextViewInputType ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 200 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
/* .line 201 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 202 */
final String v1 = "error"; // const-string v1, "error"
/* .line 204 */
} // :goto_0
} // :cond_0
(( com.ansca.corona.CoronaEditText ) v0 ).getTextViewInputType ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getTextViewInputType()Ljava/lang/String;
} // .end method
public Boolean getTextViewPassword ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 263 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
/* .line 264 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 265 */
int v1 = 0; // const/4 v1, 0x0
/* .line 267 */
} // :goto_0
} // :cond_0
v1 = (( com.ansca.corona.CoronaEditText ) v0 ).getTextViewPassword ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getTextViewPassword()Z
} // .end method
public Float getTextViewSize ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 326 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
/* .line 327 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 328 */
int v1 = 0; // const/4 v1, 0x0
/* .line 329 */
} // :goto_0
} // :cond_0
v1 = (( com.ansca.corona.CoronaEditText ) v0 ).getTextViewSize ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getTextViewSize()F
} // .end method
public java.lang.String getTextViewText ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 392 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
/* .line 393 */
/* .local v1, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v1, :cond_0 */
/* .line 394 */
final String v2 = ""; // const-string v2, ""
/* .line 397 */
} // :goto_0
/* .line 396 */
} // :cond_0
(( com.ansca.corona.CoronaEditText ) v1 ).getText ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaEditText;->getText()Landroid/text/Editable;
/* .line 397 */
/* .local v0, "text":Ljava/lang/CharSequence; */
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
public Boolean goBack ( ) {
/* .locals 2 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 107 */
v1 = this.myWebView;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 108 */
v1 = this.myWebView;
v1 = (( com.ansca.corona.CoronaWebView ) v1 ).canGoBack ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaWebView;->canGoBack()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 109 */
v1 = this.myWebView;
(( com.ansca.corona.CoronaWebView ) v1 ).goBack ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaWebView;->goBack()V
/* .line 117 */
} // :goto_0
/* .line 113 */
} // :cond_0
v1 = this.myVideoView;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 114 */
(( com.ansca.corona.ViewManager ) p0 ).destroyVideoView ( ); // invoke-virtual {p0}, Lcom/ansca/corona/ViewManager;->destroyVideoView()V
/* .line 117 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean hasTextView ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 102 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isTextViewEditable ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 241 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
/* .line 242 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 243 */
int v1 = 1; // const/4 v1, 0x1
/* .line 245 */
} // :goto_0
} // :cond_0
v1 = (( com.ansca.corona.CoronaEditText ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->isEnabled()Z
} // .end method
public Boolean isTextViewSingleLine ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "id" # I */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 220 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/ViewManager;->getTextView(I)Lcom/ansca/corona/CoronaEditText; */
/* .line 221 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_1 */
/* .line 224 */
} // :cond_0
} // :goto_0
} // :cond_1
v2 = (( com.ansca.corona.CoronaEditText ) v0 ).getInputType ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getInputType()I
/* const/high16 v3, 0x20000 */
/* and-int/2addr v2, v3 */
if ( v2 != null) { // if-eqz v2, :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
public Boolean isWebViewShown ( ) {
/* .locals 1 */
/* .prologue */
/* .line 632 */
v0 = this.myWebView;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setDisplayObjectBackground ( Integer p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "bg" # Z */
/* .prologue */
/* .line 459 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$15; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$15;-><init>(Lcom/ansca/corona/ViewManager;IZ)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 471 */
return;
} // .end method
public void setDisplayObjectVisible ( Integer p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "visible" # Z */
/* .prologue */
/* .line 424 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$13; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$13;-><init>(Lcom/ansca/corona/ViewManager;IZ)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 431 */
return;
} // .end method
public void setGLView ( android.view.View p0 ) {
/* .locals 3 */
/* .param p1, "glView" # Landroid/view/View; */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 405 */
/* new-instance v0, Landroid/widget/FrameLayout; */
v1 = this.myActivity;
/* invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
this.myContentView = v0;
/* .line 406 */
v0 = this.myContentView;
(( android.view.ViewGroup ) v0 ).setFocusable ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setFocusable(Z)V
/* .line 407 */
v0 = this.myContentView;
(( android.view.ViewGroup ) v0 ).setFocusableInTouchMode ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V
/* .line 411 */
v0 = this.myContentView;
(( android.view.ViewGroup ) v0 ).addView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 416 */
/* new-instance v0, Landroid/widget/FrameLayout; */
v1 = this.myActivity;
/* invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
this.myOverlayView = v0;
/* .line 417 */
/* new-instance v0, Landroid/widget/AbsoluteLayout; */
v1 = this.myActivity;
/* invoke-direct {v0, v1}, Landroid/widget/AbsoluteLayout;-><init>(Landroid/content/Context;)V */
this.myAbsoluteLayout = v0;
/* .line 418 */
v0 = this.myOverlayView;
v1 = this.myAbsoluteLayout;
(( android.widget.FrameLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 419 */
v0 = this.myContentView;
v1 = this.myOverlayView;
(( android.view.ViewGroup ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 420 */
return;
} // .end method
public void setTextViewAlign ( Integer p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "align" # Ljava/lang/String; */
/* .prologue */
/* .line 272 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$7; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$7;-><init>(Lcom/ansca/corona/ViewManager;ILjava/lang/String;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 281 */
return;
} // .end method
public void setTextViewColor ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "color" # I */
/* .prologue */
/* .line 294 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$8; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$8;-><init>(Lcom/ansca/corona/ViewManager;II)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 302 */
return;
} // .end method
public void setTextViewEditable ( Integer p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "isEditable" # Z */
/* .prologue */
/* .line 228 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$5; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$5;-><init>(Lcom/ansca/corona/ViewManager;IZ)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 238 */
return;
} // .end method
public void setTextViewFocus ( Integer p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "focus" # Z */
/* .prologue */
/* .line 334 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$10; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$10;-><init>(Lcom/ansca/corona/ViewManager;IZ)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 362 */
return;
} // .end method
public void setTextViewFont ( Integer p0, java.lang.String p1, Float p2, com.ansca.corona.CoronaActivity p3 ) {
/* .locals 7 */
/* .param p1, "id" # I */
/* .param p2, "fontName" # Ljava/lang/String; */
/* .param p3, "fontSize" # F */
/* .param p4, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 379 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v0, Lcom/ansca/corona/ViewManager$12; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move-object v3, p2 */
/* move v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/ansca/corona/ViewManager$12;-><init>(Lcom/ansca/corona/ViewManager;ILjava/lang/String;FLcom/ansca/corona/CoronaActivity;)V */
(( android.os.Handler ) v6 ).post ( v0 ); // invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 388 */
return;
} // .end method
public void setTextViewInputType ( Integer p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "inputType" # Ljava/lang/String; */
/* .prologue */
/* .line 187 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$3; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$3;-><init>(Lcom/ansca/corona/ViewManager;ILjava/lang/String;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 196 */
return;
} // .end method
public void setTextViewPassword ( Integer p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "isPassword" # Z */
/* .prologue */
/* .line 250 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$6; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$6;-><init>(Lcom/ansca/corona/ViewManager;IZ)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 259 */
return;
} // .end method
public void setTextViewSingleLine ( Integer p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "isSingleLine" # Z */
/* .prologue */
/* .line 209 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$4; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$4;-><init>(Lcom/ansca/corona/ViewManager;IZ)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 217 */
return;
} // .end method
public void setTextViewSize ( Integer p0, Float p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "size" # F */
/* .prologue */
/* .line 314 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$9; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$9;-><init>(Lcom/ansca/corona/ViewManager;IF)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 322 */
return;
} // .end method
public void setTextViewText ( Integer p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 366 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$11; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/ansca/corona/ViewManager$11;-><init>(Lcom/ansca/corona/ViewManager;ILjava/lang/String;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 375 */
return;
} // .end method
public void showWebView ( Integer p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 589 */
v0 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/ViewManager$19; */
/* invoke-direct {v1, p0, p2}, Lcom/ansca/corona/ViewManager$19;-><init>(Lcom/ansca/corona/ViewManager;Ljava/lang/String;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 628 */
return;
} // .end method
