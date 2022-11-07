public class com.jumptap.adtag.JtAdView$JtAdListener implements android.view.View$OnTouchListener implements android.view.View$OnFocusChangeListener implements android.view.View$OnClickListener implements android.view.View$OnLongClickListener {
	 /* .source "JtAdView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/jumptap/adtag/JtAdView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4 */
/* name = "JtAdListener" */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.JtAdView this$0; //synthetic
private com.jumptap.adtag.JtAdView widget;
private Integer widgetId;
/* # direct methods */
public com.jumptap.adtag.JtAdView$JtAdListener ( ) {
/* .locals 1 */
/* .param p2, "widget" # Lcom/jumptap/adtag/JtAdView; */
/* .param p3, "widgetId" # I */
/* .prologue */
/* .line 729 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 726 */
int v0 = 0; // const/4 v0, 0x0
this.widget = v0;
/* .line 727 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/jumptap/adtag/JtAdView$JtAdListener;->widgetId:I */
/* .line 730 */
this.widget = p2;
/* .line 731 */
/* iput p3, p0, Lcom/jumptap/adtag/JtAdView$JtAdListener;->widgetId:I */
/* .line 732 */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 0 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 766 */
return;
} // .end method
public void onFocusChange ( android.view.View p0, Boolean p1 ) {
/* .locals 4 */
/* .param p1, "v" # Landroid/view/View; */
/* .param p2, "hasFocus" # Z */
/* .prologue */
/* .line 747 */
v1 = this.this$0;
v1 = this.adViewListener;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 748 */
	 v1 = this.this$0;
	 v1 = this.adViewListener;
	 v2 = this.widget;
	 /* iget v3, p0, Lcom/jumptap/adtag/JtAdView$JtAdListener;->widgetId:I */
	 /* .line 751 */
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_2
	 /* .line 753 */
	 v1 = this.this$0;
	 v2 = this.this$0;
	 com.jumptap.adtag.JtAdView .access$300 ( v2 );
	 (( com.jumptap.adtag.JtAdView ) v1 ).removeCallbacks ( v2 ); // invoke-virtual {v1, v2}, Lcom/jumptap/adtag/JtAdView;->removeCallbacks(Ljava/lang/Runnable;)Z
	 /* .line 762 */
} // :cond_1
} // :goto_0
return;
/* .line 757 */
} // :cond_2
v1 = this.widget;
(( com.jumptap.adtag.JtAdView ) v1 ).getWidgetSettings ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdView;->getWidgetSettings()Lcom/jumptap/adtag/JtAdWidgetSettings;
v0 = (( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).getRefreshPeriod ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getRefreshPeriod()I
/* .line 758 */
/* .local v0, "refreshPeriod":I */
/* if-lez v0, :cond_1 */
/* .line 759 */
v1 = this.this$0;
/* const/16 v2, 0x3c */
com.jumptap.adtag.JtAdView .access$200 ( v1,v2 );
} // .end method
public Boolean onLongClick ( android.view.View p0 ) {
/* .locals 1 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 770 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 3 */
/* .param p1, "v" # Landroid/view/View; */
/* .param p2, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 737 */
v1 = this.widget;
(( com.jumptap.adtag.JtAdView ) v1 ).getWidgetSettings ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdView;->getWidgetSettings()Lcom/jumptap/adtag/JtAdWidgetSettings;
v0 = (( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).getRefreshPeriod ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getRefreshPeriod()I
/* .line 738 */
/* .local v0, "refreshPeriod":I */
/* if-lez v0, :cond_0 */
/* .line 739 */
v1 = this.this$0;
/* const/16 v2, 0x3c */
com.jumptap.adtag.JtAdView .access$200 ( v1,v2 );
/* .line 741 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
