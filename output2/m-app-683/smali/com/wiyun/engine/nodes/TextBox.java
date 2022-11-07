public class com.wiyun.engine.nodes.TextBox extends com.wiyun.engine.nodes.Node {
	 /* .source "TextBox.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/nodes/TextBox$ITextBoxCallback; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.nodes.TextBox ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 81 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
	 /* .line 82 */
	 return;
} // .end method
protected com.wiyun.engine.nodes.TextBox ( ) {
	 /* .locals 0 */
	 /* .param p1, "normalSprite" # Lcom/wiyun/engine/nodes/Node; */
	 /* .param p2, "selectedSprite" # Lcom/wiyun/engine/nodes/Node; */
	 /* .param p3, "disabledSprite" # Lcom/wiyun/engine/nodes/Node; */
	 /* .param p4, "focusedSprite" # Lcom/wiyun/engine/nodes/Node; */
	 /* .param p5, "label" # Lcom/wiyun/engine/nodes/Node; */
	 /* .prologue */
	 /* .line 74 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
	 /* .line 75 */
	 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/nodes/TextBox;->nativeInit(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;)V */
	 /* .line 76 */
	 return;
} // .end method
static void access$1 ( com.wiyun.engine.nodes.TextBox p0, java.lang.String p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 182 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TextBox;->onTextChanged(Ljava/lang/String;)V */
	 return;
} // .end method
static void access$2 ( com.wiyun.engine.nodes.TextBox p0, java.lang.String p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 178 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TextBox;->onOKButtonClicked(Ljava/lang/String;)V */
	 return;
} // .end method
static void access$3 ( com.wiyun.engine.nodes.TextBox p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 180 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextBox;->onCancelButtonClicked()V */
	 return;
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 com.wiyun.engine.nodes.TextBox .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.TextBox from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 71 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/TextBox; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/TextBox;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.TextBox make ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "pointer" # I */
/* .prologue */
/* .line 67 */
/* new-instance v0, Lcom/wiyun/engine/nodes/TextBox; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/TextBox;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.TextBox make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.nodes.Node p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.nodes.Node p4 ) {
/* .locals 6 */
/* .param p0, "normalSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p1, "selectedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "disabledSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p3, "focusedSprite" # Lcom/wiyun/engine/nodes/Node; */
/* .param p4, "label" # Lcom/wiyun/engine/nodes/Node; */
/* .prologue */
/* .line 63 */
/* new-instance v0, Lcom/wiyun/engine/nodes/TextBox; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/TextBox;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.nodes.Node p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.nodes.Node p4 ) {
} // .end method
private native void onCancelButtonClicked ( ) {
} // .end method
private native void onOKButtonClicked ( java.lang.String p0 ) {
} // .end method
private native void onTextChanged ( java.lang.String p0 ) {
} // .end method
static void showInputDialog ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "pointer" # I */
/* .prologue */
/* .line 186 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 187 */
/* .local v0, "context":Landroid/content/Context; */
/* if-nez v0, :cond_0 */
/* instance-of v1, v0, Landroid/app/Activity; */
/* if-nez v1, :cond_0 */
/* .line 281 */
} // :goto_0
return;
} // :cond_0
/* move-object v1, v0 */
/* .line 190 */
/* check-cast v1, Landroid/app/Activity; */
/* new-instance v2, Lcom/wiyun/engine/nodes/TextBox$1; */
/* invoke-direct {v2, p0, v0}, Lcom/wiyun/engine/nodes/TextBox$1;-><init>(ILandroid/content/Context;)V */
(( android.app.Activity ) v1 ).runOnUiThread ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 86 */
return;
} // .end method
public native java.lang.String getMessage ( ) {
} // .end method
public native java.lang.String getNegativeButton ( ) {
} // .end method
public native java.lang.String getPositiveButton ( ) {
} // .end method
public native java.lang.String getText ( ) {
} // .end method
public native java.lang.String getTitle ( ) {
} // .end method
public native Boolean isPassword ( ) {
} // .end method
public native void setCallback ( com.wiyun.engine.nodes.TextBox$ITextBoxCallback p0 ) {
} // .end method
public native void setMessage ( java.lang.String p0 ) {
} // .end method
public native void setNegativeButton ( java.lang.String p0 ) {
} // .end method
public native void setPadding ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
public native void setPassword ( Boolean p0 ) {
} // .end method
public native void setPositiveButton ( java.lang.String p0 ) {
} // .end method
public native void setText ( java.lang.String p0 ) {
} // .end method
public native void setTitle ( java.lang.String p0 ) {
} // .end method
