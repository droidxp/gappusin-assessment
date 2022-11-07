class com.ansca.corona.ViewManager$1 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->addTextView(IIIIIZ)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Integer val$height; //synthetic
final Integer val$id; //synthetic
final Boolean val$isSingleLine; //synthetic
final Integer val$left; //synthetic
final Integer val$top; //synthetic
final Integer val$width; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 123 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$1;->val$id:I */
/* iput p3, p0, Lcom/ansca/corona/ViewManager$1;->val$width:I */
/* iput p4, p0, Lcom/ansca/corona/ViewManager$1;->val$height:I */
/* iput p5, p0, Lcom/ansca/corona/ViewManager$1;->val$left:I */
/* iput p6, p0, Lcom/ansca/corona/ViewManager$1;->val$top:I */
/* iput-boolean p7, p0, Lcom/ansca/corona/ViewManager$1;->val$isSingleLine:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 7 */
/* .prologue */
/* .line 126 */
v3 = this.this$0;
com.ansca.corona.ViewManager .access$000 ( v3 );
/* if-nez v3, :cond_0 */
/* .line 154 */
} // :goto_0
return;
/* .line 131 */
} // :cond_0
/* new-instance v0, Lcom/ansca/corona/CoronaEditText; */
v3 = this.this$0;
com.ansca.corona.ViewManager .access$100 ( v3 );
/* iget v4, p0, Lcom/ansca/corona/ViewManager$1;->val$id:I */
/* invoke-direct {v0, v3, v4}, Lcom/ansca/corona/CoronaEditText;-><init>(Landroid/content/Context;I)V */
/* .line 132 */
/* .local v0, "editText":Lcom/ansca/corona/CoronaEditText; */
/* new-instance v1, Landroid/widget/AbsoluteLayout$LayoutParams; */
/* iget v3, p0, Lcom/ansca/corona/ViewManager$1;->val$width:I */
/* iget v4, p0, Lcom/ansca/corona/ViewManager$1;->val$height:I */
/* iget v5, p0, Lcom/ansca/corona/ViewManager$1;->val$left:I */
/* iget v6, p0, Lcom/ansca/corona/ViewManager$1;->val$top:I */
/* invoke-direct {v1, v3, v4, v5, v6}, Landroid/widget/AbsoluteLayout$LayoutParams;-><init>(IIII)V */
/* .line 133 */
/* .local v1, "params":Landroid/view/ViewGroup$LayoutParams; */
v3 = this.this$0;
com.ansca.corona.ViewManager .access$000 ( v3 );
(( android.widget.AbsoluteLayout ) v3 ).addView ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Landroid/widget/AbsoluteLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 134 */
/* const/high16 v3, -0x1000000 */
(( com.ansca.corona.CoronaEditText ) v0 ).setTextColor ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaEditText;->setTextColor(I)V
/* .line 135 */
/* iget-boolean v3, p0, Lcom/ansca/corona/ViewManager$1;->val$isSingleLine:Z */
(( com.ansca.corona.CoronaEditText ) v0 ).setSingleLine ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaEditText;->setSingleLine(Z)V
/* .line 136 */
/* iget-boolean v3, p0, Lcom/ansca/corona/ViewManager$1;->val$isSingleLine:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 137 */
int v3 = 1; // const/4 v3, 0x1
(( com.ansca.corona.CoronaEditText ) v0 ).setImeOptions ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaEditText;->setImeOptions(I)V
/* .line 144 */
} // :goto_1
/* iget v3, p0, Lcom/ansca/corona/ViewManager$1;->val$id:I */
(( com.ansca.corona.CoronaEditText ) v0 ).setId ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaEditText;->setId(I)V
/* .line 145 */
v3 = (( com.ansca.corona.CoronaEditText ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getId()I
(( com.ansca.corona.CoronaEditText ) v0 ).setNextFocusDownId ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaEditText;->setNextFocusDownId(I)V
/* .line 146 */
v3 = (( com.ansca.corona.CoronaEditText ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getId()I
(( com.ansca.corona.CoronaEditText ) v0 ).setNextFocusUpId ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaEditText;->setNextFocusUpId(I)V
/* .line 147 */
v3 = (( com.ansca.corona.CoronaEditText ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getId()I
(( com.ansca.corona.CoronaEditText ) v0 ).setNextFocusLeftId ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaEditText;->setNextFocusLeftId(I)V
/* .line 148 */
v3 = (( com.ansca.corona.CoronaEditText ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaEditText;->getId()I
(( com.ansca.corona.CoronaEditText ) v0 ).setNextFocusRightId ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaEditText;->setNextFocusRightId(I)V
/* .line 151 */
/* move-object v2, v0 */
/* .line 152 */
/* .local v2, "view":Landroid/view/View; */
(( android.view.View ) v2 ).bringToFront ( ); // invoke-virtual {v2}, Landroid/view/View;->bringToFront()V
/* .line 153 */
v3 = this.this$0;
com.ansca.corona.ViewManager .access$200 ( v3 );
/* new-instance v4, Ljava/lang/Integer; */
/* iget v5, p0, Lcom/ansca/corona/ViewManager$1;->val$id:I */
/* invoke-direct {v4, v5}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.HashMap ) v3 ).put ( v4, v2 ); // invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 140 */
} // .end local v2 # "view":Landroid/view/View;
} // :cond_1
int v3 = 6; // const/4 v3, 0x6
(( com.ansca.corona.CoronaEditText ) v0 ).setImeOptions ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaEditText;->setImeOptions(I)V
} // .end method
