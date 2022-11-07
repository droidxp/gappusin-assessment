public class com.Ina.Notegre.AboutActivity extends android.app.Activity {
	 /* .source "AboutActivity.java" */
	 /* # instance fields */
	 private android.widget.Button mBackButton;
	 private android.widget.Button mRButton;
	 private android.widget.TextView mTitleTextView;
	 private android.view.View$OnClickListener onClickListener;
	 /* # direct methods */
	 public com.Ina.Notegre.AboutActivity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 37 */
		 /* new-instance v0, Lcom/Ina/Notegre/AboutActivity$1; */
		 /* invoke-direct {v0, p0}, Lcom/Ina/Notegre/AboutActivity$1;-><init>(Lcom/Ina/Notegre/AboutActivity;)V */
		 this.onClickListener = v0;
		 /* .line 14 */
		 return;
	 } // .end method
	 static void access$0 ( com.Ina.Notegre.AboutActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 66 */
		 /* invoke-direct {p0}, Lcom/Ina/Notegre/AboutActivity;->quit()V */
		 return;
	 } // .end method
	 private void quit ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 68 */
		 (( com.Ina.Notegre.AboutActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/Ina/Notegre/AboutActivity;->finish()V
		 /* .line 69 */
		 /* const/high16 v0, 0x7f040000 */
		 /* const v1, 0x7f040004 */
		 (( com.Ina.Notegre.AboutActivity ) p0 ).overridePendingTransition ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/Ina/Notegre/AboutActivity;->overridePendingTransition(II)V
		 /* .line 70 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 23 */
		 int v0 = 1; // const/4 v0, 0x1
		 (( com.Ina.Notegre.AboutActivity ) p0 ).requestWindowFeature ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/AboutActivity;->requestWindowFeature(I)Z
		 /* .line 24 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 com.games.a .a ( p0 );
		 /* .line 25 */
		 /* const/high16 v0, 0x7f030000 */
		 (( com.Ina.Notegre.AboutActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/AboutActivity;->setContentView(I)V
		 /* .line 27 */
		 /* const/high16 v0, 0x7f090000 */
		 (( com.Ina.Notegre.AboutActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/AboutActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/Button; */
		 this.mBackButton = v0;
		 /* .line 28 */
		 /* const v0, 0x7f090002 */
		 (( com.Ina.Notegre.AboutActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/AboutActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/Button; */
		 this.mRButton = v0;
		 /* .line 29 */
		 /* const v0, 0x7f090001 */
		 (( com.Ina.Notegre.AboutActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/Ina/Notegre/AboutActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/TextView; */
		 this.mTitleTextView = v0;
		 /* .line 31 */
		 v0 = this.mTitleTextView;
		 /* const v1, 0x7f07001e */
		 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
		 /* .line 32 */
		 v0 = this.mRButton;
		 /* const/16 v1, 0x8 */
		 (( android.widget.Button ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
		 /* .line 33 */
		 v0 = this.mBackButton;
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.widget.Button ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
		 /* .line 34 */
		 v0 = this.mBackButton;
		 v1 = this.onClickListener;
		 (( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 35 */
		 return;
	 } // .end method
	 public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 1 */
		 /* .param p1, "keyCode" # I */
		 /* .param p2, "event" # Landroid/view/KeyEvent; */
		 /* .prologue */
		 /* .line 57 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* if-ne p1, v0, :cond_0 */
		 /* .line 59 */
		 /* invoke-direct {p0}, Lcom/Ina/Notegre/AboutActivity;->quit()V */
		 /* .line 60 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 63 */
	 } // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
