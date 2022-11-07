class com.ansca.corona.ViewManager$12 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->setTextViewFont(ILjava/lang/String;FLcom/ansca/corona/CoronaActivity;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final com.ansca.corona.CoronaActivity val$activity; //synthetic
final java.lang.String val$fontName; //synthetic
final Float val$fontSize; //synthetic
final Integer val$id; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$12 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 379 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$12;->val$id:I */
this.val$fontName = p3;
/* iput p4, p0, Lcom/ansca/corona/ViewManager$12;->val$fontSize:F */
this.val$activity = p5;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 381 */
v1 = this.this$0;
/* iget v2, p0, Lcom/ansca/corona/ViewManager$12;->val$id:I */
com.ansca.corona.ViewManager .access$300 ( v1,v2 );
/* .line 382 */
/* .local v0, "view":Lcom/ansca/corona/CoronaEditText; */
/* if-nez v0, :cond_0 */
/* .line 386 */
} // :goto_0
return;
/* .line 385 */
} // :cond_0
v1 = this.val$fontName;
/* iget v2, p0, Lcom/ansca/corona/ViewManager$12;->val$fontSize:F */
v3 = this.val$activity;
(( com.ansca.corona.CoronaEditText ) v0 ).setTextViewFont ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/ansca/corona/CoronaEditText;->setTextViewFont(Ljava/lang/String;FLcom/ansca/corona/CoronaActivity;)V
} // .end method
