class com.jumptap.adtag.JtAdView$2 implements java.lang.Runnable {
	 /* .source "JtAdView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/JtAdView;->resize(IIZ)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.JtAdView this$0; //synthetic
final Integer val$height; //synthetic
final Boolean val$shouldExpand; //synthetic
final Integer val$width; //synthetic
/* # direct methods */
 com.jumptap.adtag.JtAdView$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 238 */
this.this$0 = p1;
/* iput-boolean p2, p0, Lcom/jumptap/adtag/JtAdView$2;->val$shouldExpand:Z */
/* iput p3, p0, Lcom/jumptap/adtag/JtAdView$2;->val$width:I */
/* iput p4, p0, Lcom/jumptap/adtag/JtAdView$2;->val$height:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 6 */
/* .prologue */
/* .line 243 */
/* iget-boolean v4, p0, Lcom/jumptap/adtag/JtAdView$2;->val$shouldExpand:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
	 /* iget v3, p0, Lcom/jumptap/adtag/JtAdView$2;->val$width:I */
	 /* .line 244 */
	 /* .local v3, "newWidth":I */
} // :goto_0
/* iget-boolean v4, p0, Lcom/jumptap/adtag/JtAdView$2;->val$shouldExpand:Z */
if ( v4 != null) { // if-eqz v4, :cond_1
	 /* iget v2, p0, Lcom/jumptap/adtag/JtAdView$2;->val$height:I */
	 /* .line 246 */
	 /* .local v2, "newHeight":I */
} // :goto_1
v4 = this.this$0;
(( com.jumptap.adtag.JtAdView ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* iget v1, v4, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* .line 247 */
/* .local v1, "existingWidth":I */
v4 = this.this$0;
(( com.jumptap.adtag.JtAdView ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* iget v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* .line 249 */
/* .local v0, "existingHeight":I */
/* if-ne v1, v3, :cond_2 */
/* if-ne v0, v2, :cond_2 */
/* .line 268 */
} // :goto_2
return;
/* .line 243 */
} // .end local v0 # "existingHeight":I
} // .end local v1 # "existingWidth":I
} // .end local v2 # "newHeight":I
} // .end local v3 # "newWidth":I
} // :cond_0
v4 = this.this$0;
v3 = (( com.jumptap.adtag.JtAdView ) v4 ).getWidthSize ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdView;->getWidthSize()I
/* .line 244 */
/* .restart local v3 # "newWidth":I */
} // :cond_1
v4 = this.this$0;
v2 = (( com.jumptap.adtag.JtAdView ) v4 ).getHeightSize ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdView;->getHeightSize()I
/* .line 253 */
/* .restart local v0 # "existingHeight":I */
/* .restart local v1 # "existingWidth":I */
/* .restart local v2 # "newHeight":I */
} // :cond_2
/* iget-boolean v4, p0, Lcom/jumptap/adtag/JtAdView$2;->val$shouldExpand:Z */
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 254 */
v4 = this.this$0;
(( com.jumptap.adtag.JtAdView ) v4 ).notifyExpand ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdView;->notifyExpand()V
/* .line 260 */
} // :goto_3
v4 = this.this$0;
(( com.jumptap.adtag.JtAdView ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* iput v3, v4, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* .line 261 */
v4 = this.this$0;
(( com.jumptap.adtag.JtAdView ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* iput v2, v4, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* .line 263 */
v4 = this.this$0;
v4 = this.webViewArr;
v5 = this.this$0;
/* iget v5, v5, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v4, v4, v5 */
(( android.webkit.WebView ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* iput v3, v4, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* .line 264 */
v4 = this.this$0;
v4 = this.webViewArr;
v5 = this.this$0;
/* iget v5, v5, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v4, v4, v5 */
(( android.webkit.WebView ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/webkit/WebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* iput v2, v4, Landroid/view/ViewGroup$LayoutParams;->height:I */
/* .line 266 */
v4 = this.this$0;
(( com.jumptap.adtag.JtAdView ) v4 ).requestLayout ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdView;->requestLayout()V
/* .line 256 */
} // :cond_3
v4 = this.this$0;
(( com.jumptap.adtag.JtAdView ) v4 ).notifyContract ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdView;->notifyContract()V
} // .end method
