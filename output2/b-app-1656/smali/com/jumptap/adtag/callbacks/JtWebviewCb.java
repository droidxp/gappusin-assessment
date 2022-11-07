public class com.jumptap.adtag.callbacks.JtWebviewCb {
	 /* .source "JtWebviewCb.java" */
	 /* # instance fields */
	 private com.jumptap.adtag.listeners.JtAdViewInnerListener adView;
	 private android.content.Context context;
	 /* # direct methods */
	 public com.jumptap.adtag.callbacks.JtWebviewCb ( ) {
		 /* .locals 0 */
		 /* .param p1, "ctx" # Landroid/content/Context; */
		 /* .param p2, "adView" # Lcom/jumptap/adtag/listeners/JtAdViewInnerListener; */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 17 */
		 this.context = p1;
		 /* .line 18 */
		 this.adView = p2;
		 /* .line 20 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void expandTo ( Integer p0, Integer p1, java.lang.String p2, Integer p3, java.lang.String p4 ) {
		 /* .locals 8 */
		 /* .param p1, "width" # I */
		 /* .param p2, "height" # I */
		 /* .param p3, "callback" # Ljava/lang/String; */
		 /* .param p4, "transition" # I */
		 /* .param p5, "options" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 40 */
		 final String v0 = "JtAd"; // const-string v0, "JtAd"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v4 = "JtWebViewCB::expandTo ("; // const-string v4, "JtWebViewCB::expandTo ("
		 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v4 = ")"; // const-string v4, ")"
		 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 /* .line 41 */
		 v0 = this.context;
		 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v7, v0, Landroid/util/DisplayMetrics;->density:F */
		 /* .line 42 */
		 /* .local v7, "density":F */
		 /* int-to-float v0, p2 */
		 /* mul-float/2addr v0, v7 */
		 /* float-to-int v3, v0 */
		 /* .line 43 */
		 /* .local v3, "h":I */
		 /* int-to-float v0, p1 */
		 /* mul-float/2addr v0, v7 */
		 /* float-to-int v2, v0 */
		 /* .line 44 */
		 /* .local v2, "w":I */
		 v0 = this.adView;
		 int v1 = 1; // const/4 v1, 0x1
		 /* move-object v4, p3 */
		 /* move v5, p4 */
		 /* move-object v6, p5 */
		 /* invoke-interface/range {v0 ..v6}, Lcom/jumptap/adtag/listeners/JtAdViewInnerListener;->resizeWithCallback(ZIILjava/lang/String;ILjava/lang/String;)V */
		 /* .line 45 */
		 return;
	 } // .end method
	 public java.lang.String getDeviceId ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 34 */
		 v1 = this.context;
		 com.jumptap.adtag.utils.JtAdManager .getHID ( v1 );
		 /* .line 35 */
		 /* .local v0, "andId":Ljava/lang/String; */
		 final String v1 = "JtAd"; // const-string v1, "JtAd"
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "JtWebViewCB::getDeviceId andId="; // const-string v3, "JtWebViewCB::getDeviceId andId="
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v1,v2 );
		 /* .line 36 */
	 } // .end method
	 public java.lang.String getLocation ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 /* .param p1, "callback" # Ljava/lang/String; */
		 /* .param p2, "options" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 76 */
		 final String v0 = "Kuku"; // const-string v0, "Kuku"
		 /* .line 77 */
		 /* .local v0, "locString":Ljava/lang/String; */
		 final String v1 = "JtAd"; // const-string v1, "JtAd"
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "JtWebViewCB::getLocation options: "; // const-string v3, "JtWebViewCB::getLocation options: "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v3 = " callback: "; // const-string v3, " callback: "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v3 = " location="; // const-string v3, " location="
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v1,v2 );
		 /* .line 79 */
	 } // .end method
	 public java.lang.String getScreenSize ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 /* .line 57 */
		 v5 = this.context;
		 (( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v5 ).getDisplayMetrics ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v0, v5, Landroid/util/DisplayMetrics;->density:F */
		 /* .line 58 */
		 /* .local v0, "density":F */
		 v5 = this.context;
		 (( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v5 ).getDisplayMetrics ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v2, v5, Landroid/util/DisplayMetrics;->heightPixels:I */
		 /* .line 59 */
		 /* .local v2, "heightPixels":I */
		 v5 = this.context;
		 (( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v5 ).getDisplayMetrics ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v4, v5, Landroid/util/DisplayMetrics;->widthPixels:I */
		 /* .line 60 */
		 /* .local v4, "widthPixels":I */
		 /* int-to-float v5, v2 */
		 /* div-float/2addr v5, v0 */
		 /* float-to-int v1, v5 */
		 /* .line 61 */
		 /* .local v1, "height":I */
		 /* int-to-float v5, v4 */
		 /* div-float/2addr v5, v0 */
		 /* float-to-int v3, v5 */
		 /* .line 63 */
		 /* .local v3, "width":I */
		 /* new-instance v5, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v6 = "{\"width\": "; // const-string v6, "{\"width\": "
		 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v6 = ",\"height\":"; // const-string v6, ",\"height\":"
		 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v6 = "}"; // const-string v6, "}"
		 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
	 public void hideWidget ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 83 */
		 v0 = this.adView;
		 /* .line 84 */
		 return;
	 } // .end method
	 public void openURI ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 3 */
		 /* .param p1, "URI" # Ljava/lang/String; */
		 /* .param p2, "contentType" # Ljava/lang/String; */
		 /* .param p3, "options" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 68 */
		 final String v0 = "JtAd"; // const-string v0, "JtAd"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "JtWebViewCB::openURI URI: "; // const-string v2, "JtWebViewCB::openURI URI: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " contentType:"; // const-string v2, " contentType:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " options: "; // const-string v2, " options: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 /* .line 72 */
		 v0 = this.adView;
		 /* .line 73 */
		 return;
	 } // .end method
	 public void resizeViewer ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, java.lang.String p5, java.lang.String p6 ) {
		 /* .locals 3 */
		 /* .param p1, "left" # I */
		 /* .param p2, "top" # I */
		 /* .param p3, "right" # I */
		 /* .param p4, "bottom" # I */
		 /* .param p5, "transition" # I */
		 /* .param p6, "options" # Ljava/lang/String; */
		 /* .param p7, "callback" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 30 */
		 final String v0 = "JtAd"; // const-string v0, "JtAd"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "JtWebViewCB::resizeViewer left: "; // const-string v2, "JtWebViewCB::resizeViewer left: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = " top:"; // const-string v2, " top:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = " right: "; // const-string v2, " right: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = " bottom: "; // const-string v2, " bottom: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p4 ); // invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = " transition: "; // const-string v2, " transition: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p5 ); // invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = " options: "; // const-string v2, " options: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p6 ); // invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " callback: "; // const-string v2, " callback: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p7 ); // invoke-virtual {v1, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 /* .line 31 */
		 return;
	 } // .end method
	 public void restoreToBanner ( java.lang.String p0, Integer p1, java.lang.String p2 ) {
		 /* .locals 7 */
		 /* .param p1, "callback" # Ljava/lang/String; */
		 /* .param p2, "transition" # I */
		 /* .param p3, "options" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 50 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 51 */
		 /* .local v2, "w":I */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 52 */
		 /* .local v3, "h":I */
		 v0 = this.adView;
		 int v1 = 0; // const/4 v1, 0x0
		 /* move-object v4, p1 */
		 /* move v5, p2 */
		 /* move-object v6, p3 */
		 /* invoke-interface/range {v0 ..v6}, Lcom/jumptap/adtag/listeners/JtAdViewInnerListener;->resizeWithCallback(ZIILjava/lang/String;ILjava/lang/String;)V */
		 /* .line 53 */
		 return;
	 } // .end method
	 public void setSize ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4 ) {
		 /* .locals 6 */
		 /* .param p1, "a" # I */
		 /* .param p2, "b" # I */
		 /* .param p3, "c" # I */
		 /* .param p4, "d" # I */
		 /* .param p5, "shouldExpand" # Z */
		 /* .prologue */
		 /* .line 22 */
		 final String v3 = "JtAd"; // const-string v3, "JtAd"
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v5 = "JtWebViewCB::setSize a:"; // const-string v5, "JtWebViewCB::setSize a:"
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v5 = " b:"; // const-string v5, " b:"
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( p2 ); // invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v5 = " c:"; // const-string v5, " c:"
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( p3 ); // invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v5 = " d:"; // const-string v5, " d:"
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( p4 ); // invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v5 = " shouldExpand:"; // const-string v5, " shouldExpand:"
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).append ( p5 ); // invoke-virtual {v4, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v3,v4 );
		 /* .line 23 */
		 v3 = this.context;
		 (( android.content.Context ) v3 ).getResources ( ); // invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v3 ).getDisplayMetrics ( ); // invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v0, v3, Landroid/util/DisplayMetrics;->density:F */
		 /* .line 24 */
		 /* .local v0, "density":F */
		 /* int-to-float v3, p3 */
		 /* mul-float/2addr v3, v0 */
		 /* float-to-int v2, v3 */
		 /* .line 25 */
		 /* .local v2, "width":I */
		 /* int-to-float v3, p4 */
		 /* mul-float/2addr v3, v0 */
		 /* float-to-int v1, v3 */
		 /* .line 26 */
		 /* .local v1, "height":I */
		 v3 = this.adView;
		 /* .line 27 */
		 return;
	 } // .end method
