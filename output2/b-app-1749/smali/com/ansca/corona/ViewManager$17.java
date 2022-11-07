class com.ansca.corona.ViewManager$17 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->addWebView(IIIIIZZ)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final Boolean val$autoCloseEnabled; //synthetic
final Boolean val$background; //synthetic
final Integer val$height; //synthetic
final Integer val$id; //synthetic
final Integer val$left; //synthetic
final Integer val$top; //synthetic
final Integer val$width; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$17 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 532 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/ViewManager$17;->val$width:I */
/* iput p3, p0, Lcom/ansca/corona/ViewManager$17;->val$height:I */
/* iput p4, p0, Lcom/ansca/corona/ViewManager$17;->val$left:I */
/* iput p5, p0, Lcom/ansca/corona/ViewManager$17;->val$top:I */
/* iput p6, p0, Lcom/ansca/corona/ViewManager$17;->val$id:I */
/* iput-boolean p7, p0, Lcom/ansca/corona/ViewManager$17;->val$background:Z */
/* iput-boolean p8, p0, Lcom/ansca/corona/ViewManager$17;->val$autoCloseEnabled:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 7 */
/* .prologue */
int v3 = -1; // const/4 v3, -0x1
/* .line 535 */
v2 = this.this$0;
com.ansca.corona.ViewManager .access$100 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 v2 = this.this$0;
	 com.ansca.corona.ViewManager .access$000 ( v2 );
	 /* if-nez v2, :cond_1 */
	 /* .line 555 */
} // :cond_0
} // :goto_0
return;
/* .line 540 */
} // :cond_1
/* iget v2, p0, Lcom/ansca/corona/ViewManager$17;->val$width:I */
/* if-nez v2, :cond_2 */
/* iget v2, p0, Lcom/ansca/corona/ViewManager$17;->val$height:I */
/* if-nez v2, :cond_2 */
/* .line 541 */
/* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 542 */
/* .local v1, "relativeParams":Landroid/widget/RelativeLayout$LayoutParams; */
/* const/16 v2, 0xd */
(( android.widget.RelativeLayout$LayoutParams ) v1 ).addRule ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
/* .line 543 */
/* move-object v0, v1 */
/* .line 549 */
} // .end local v1 # "relativeParams":Landroid/widget/RelativeLayout$LayoutParams;
/* .local v0, "params":Landroid/view/ViewGroup$LayoutParams; */
} // :goto_1
v2 = this.this$0;
/* new-instance v3, Lcom/ansca/corona/CoronaWebView; */
v4 = this.this$0;
com.ansca.corona.ViewManager .access$100 ( v4 );
/* iget v5, p0, Lcom/ansca/corona/ViewManager$17;->val$id:I */
/* iget-boolean v6, p0, Lcom/ansca/corona/ViewManager$17;->val$background:Z */
/* invoke-direct {v3, v4, v5, v6}, Lcom/ansca/corona/CoronaWebView;-><init>(Landroid/content/Context;IZ)V */
com.ansca.corona.ViewManager .access$602 ( v2,v3 );
/* .line 550 */
v2 = this.this$0;
com.ansca.corona.ViewManager .access$600 ( v2 );
/* iget-boolean v3, p0, Lcom/ansca/corona/ViewManager$17;->val$autoCloseEnabled:Z */
(( com.ansca.corona.CoronaWebView ) v2 ).setAutoCloseEnabled ( v3 ); // invoke-virtual {v2, v3}, Lcom/ansca/corona/CoronaWebView;->setAutoCloseEnabled(Z)V
/* .line 552 */
v2 = this.this$0;
com.ansca.corona.ViewManager .access$000 ( v2 );
v3 = this.this$0;
com.ansca.corona.ViewManager .access$600 ( v3 );
(( android.widget.AbsoluteLayout ) v2 ).addView ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/widget/AbsoluteLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 554 */
v2 = this.this$0;
com.ansca.corona.ViewManager .access$600 ( v2 );
(( com.ansca.corona.CoronaWebView ) v2 ).bringToFront ( ); // invoke-virtual {v2}, Lcom/ansca/corona/CoronaWebView;->bringToFront()V
/* .line 546 */
} // .end local v0 # "params":Landroid/view/ViewGroup$LayoutParams;
} // :cond_2
/* new-instance v0, Landroid/widget/AbsoluteLayout$LayoutParams; */
/* iget v2, p0, Lcom/ansca/corona/ViewManager$17;->val$width:I */
/* iget v3, p0, Lcom/ansca/corona/ViewManager$17;->val$height:I */
/* iget v4, p0, Lcom/ansca/corona/ViewManager$17;->val$left:I */
/* iget v5, p0, Lcom/ansca/corona/ViewManager$17;->val$top:I */
/* invoke-direct {v0, v2, v3, v4, v5}, Landroid/widget/AbsoluteLayout$LayoutParams;-><init>(IIII)V */
/* .restart local v0 # "params":Landroid/view/ViewGroup$LayoutParams; */
} // .end method
