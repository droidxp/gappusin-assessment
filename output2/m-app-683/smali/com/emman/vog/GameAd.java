public class com.emman.vog.GameAd {
	 /* .source "GameAd.java" */
	 /* # instance fields */
	 android.widget.LinearLayout _ScoreBottom;
	 public android.app.Activity _activity;
	 android.widget.RelativeLayout _layout;
	 android.widget.RelativeLayout$LayoutParams _lp;
	 android.widget.RelativeLayout$LayoutParams _lp1;
	 Integer a;
	 java.lang.String s;
	 /* # direct methods */
	 public com.emman.vog.GameAd ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 16 */
		 final String v0 = "a1528a3190052f9"; // const-string v0, "a1528a3190052f9"
		 this.s = v0;
		 /* .line 20 */
		 /* const/16 v0, 0x4b */
		 /* iput v0, p0, Lcom/emman/vog/GameAd;->a:I */
		 /* .line 14 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void Advertise ( android.app.Activity p0 ) {
		 /* .locals 5 */
		 /* .param p1, "activity" # Landroid/app/Activity; */
		 /* .prologue */
		 return;
	 } // .end method
	 public Integer getStaue ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 66 */
		 v0 = this._ScoreBottom;
		 v0 = 		 (( android.widget.LinearLayout ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I
	 } // .end method
	 public android.view.View inflate ( Integer p0 ) {
		 /* .locals 2 */
		 /* .param p1, "layoutID" # I */
		 /* .prologue */
		 /* .line 71 */
		 v1 = this._activity;
		 android.view.LayoutInflater .from ( v1 );
		 /* .line 72 */
		 /* .local v0, "inflater":Landroid/view/LayoutInflater; */
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.view.LayoutInflater ) v0 ).inflate ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
	 } // .end method
	 public void initializeAdPosition ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = -2; // const/4 v1, -0x2
		 /* .line 57 */
		 /* new-instance v0, Landroid/widget/RelativeLayout$LayoutParams; */
		 /* .line 59 */
		 /* invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
		 /* .line 57 */
		 this._lp1 = v0;
		 /* .line 60 */
		 v0 = this._lp1;
		 /* const/16 v1, 0xc */
		 (( android.widget.RelativeLayout$LayoutParams ) v0 ).addRule ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
		 /* .line 61 */
		 v0 = this._lp1;
		 /* const/16 v1, 0xe */
		 (( android.widget.RelativeLayout$LayoutParams ) v0 ).addRule ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
		 /* .line 62 */
		 v0 = this._ScoreBottom;
		 v1 = this._lp1;
		 (( android.widget.LinearLayout ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 63 */
		 return;
	 } // .end method
	 public void setAdPosition ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = -2; // const/4 v1, -0x2
		 /* .line 48 */
		 /* new-instance v0, Landroid/widget/RelativeLayout$LayoutParams; */
		 /* .line 50 */
		 /* invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
		 /* .line 48 */
		 this._lp = v0;
		 /* .line 51 */
		 v0 = this._lp;
		 /* const/16 v1, 0xa */
		 (( android.widget.RelativeLayout$LayoutParams ) v0 ).addRule ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
		 /* .line 52 */
		 v0 = this._lp;
		 /* const/16 v1, 0xe */
		 (( android.widget.RelativeLayout$LayoutParams ) v0 ).addRule ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
		 /* .line 53 */
		 v0 = this._ScoreBottom;
		 v1 = this._lp;
		 (( android.widget.LinearLayout ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 54 */
		 return;
	 } // .end method
	 public void setVisibilityBottom ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 44 */
		 v0 = this._ScoreBottom;
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.widget.LinearLayout ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
		 /* .line 45 */
		 return;
	 } // .end method
	 public void setVisibilityGoneBottom ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 40 */
		 v0 = this._ScoreBottom;
		 int v1 = 4; // const/4 v1, 0x4
		 (( android.widget.LinearLayout ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
		 /* .line 41 */
		 return;
	 } // .end method
