class com.wiyun.engine.nodes.TextBox$1$1 implements android.text.TextWatcher {
	 /* .source "TextBox.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/TextBox$1;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.wiyun.engine.nodes.TextBox$1 this$1; //synthetic
private final com.wiyun.engine.nodes.TextBox val$box; //synthetic
private final android.widget.EditText val$et; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.TextBox$1$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
this.val$box = p2;
this.val$et = p3;
/* .line 206 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void afterTextChanged ( android.text.Editable p0 ) {
/* .locals 0 */
/* .param p1, "arg0" # Landroid/text/Editable; */
/* .prologue */
/* .line 219 */
return;
} // .end method
public void beforeTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .param p1, "arg0" # Ljava/lang/CharSequence; */
/* .param p2, "arg1" # I */
/* .param p3, "arg2" # I */
/* .param p4, "arg3" # I */
/* .prologue */
/* .line 215 */
return;
} // .end method
public void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .param p1, "arg0" # Ljava/lang/CharSequence; */
/* .param p2, "arg1" # I */
/* .param p3, "arg2" # I */
/* .param p4, "arg3" # I */
/* .prologue */
/* .line 209 */
v0 = this.val$box;
v1 = this.val$et;
(( android.widget.EditText ) v1 ).getText ( ); // invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
(( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
com.wiyun.engine.nodes.TextBox .access$1 ( v0,v1 );
/* .line 210 */
return;
} // .end method
