public class org.nwhy.Whackczkm.WhackAMole extends android.app.Activity {
	 /* .source "WhackAMole.java" */
	 /* # instance fields */
	 private android.view.View$OnClickListener btnClkListener;
	 private android.widget.Button btn_about;
	 private android.widget.Button btn_exit;
	 private android.widget.Button btn_highscores;
	 private android.widget.Button btn_moreGames;
	 private android.widget.Button btn_start;
	 private android.widget.Button btn_vs_mode;
	 /* # direct methods */
	 public org.nwhy.Whackczkm.WhackAMole ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 52 */
		 /* new-instance v0, Lorg/nwhy/Whackczkm/WhackAMole$1; */
		 /* invoke-direct {v0, p0}, Lorg/nwhy/Whackczkm/WhackAMole$1;-><init>(Lorg/nwhy/Whackczkm/WhackAMole;)V */
		 this.btnClkListener = v0;
		 /* .line 13 */
		 return;
	 } // .end method
	 private void findViews ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 35 */
		 /* const v0, 0x7f0b0002 */
		 (( org.nwhy.Whackczkm.WhackAMole ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/Button; */
		 this.btn_start = v0;
		 /* .line 36 */
		 /* const v0, 0x7f0b0005 */
		 (( org.nwhy.Whackczkm.WhackAMole ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/Button; */
		 this.btn_about = v0;
		 /* .line 37 */
		 /* const v0, 0x7f0b0004 */
		 (( org.nwhy.Whackczkm.WhackAMole ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/Button; */
		 this.btn_highscores = v0;
		 /* .line 38 */
		 /* const v0, 0x7f0b0006 */
		 (( org.nwhy.Whackczkm.WhackAMole ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/Button; */
		 this.btn_moreGames = v0;
		 /* .line 39 */
		 /* const v0, 0x7f0b0003 */
		 (( org.nwhy.Whackczkm.WhackAMole ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/Button; */
		 this.btn_vs_mode = v0;
		 /* .line 40 */
		 /* const v0, 0x7f0b0007 */
		 (( org.nwhy.Whackczkm.WhackAMole ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/Button; */
		 this.btn_exit = v0;
		 /* .line 41 */
		 return;
	 } // .end method
	 private void setListeners ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 44 */
		 v0 = this.btn_start;
		 v1 = this.btnClkListener;
		 (( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 45 */
		 v0 = this.btn_about;
		 v1 = this.btnClkListener;
		 (( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 46 */
		 v0 = this.btn_highscores;
		 v1 = this.btnClkListener;
		 (( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 47 */
		 v0 = this.btn_moreGames;
		 v1 = this.btnClkListener;
		 (( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 48 */
		 v0 = this.btn_vs_mode;
		 v1 = this.btnClkListener;
		 (( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 49 */
		 v0 = this.btn_exit;
		 v1 = this.btnClkListener;
		 (( android.widget.Button ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 50 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 25 */
		 /* .line 27 */
		 org.nwhy.Whackczkm.ActivityUtil .noNotificationBar ( p0 );
		 /* .line 28 */
		 org.nwhy.Whackczkm.ActivityUtil .noTitleBar ( p0 );
		 /* .line 29 */
		 /* const v0, 0x7f030003 */
		 (( org.nwhy.Whackczkm.WhackAMole ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->setContentView(I)V
		 /* .line 30 */
		 /* invoke-direct {p0}, Lorg/nwhy/Whackczkm/WhackAMole;->findViews()V */
		 /* .line 31 */
		 /* invoke-direct {p0}, Lorg/nwhy/Whackczkm/WhackAMole;->setListeners()V */
		 /* .line 32 */
		 return;
	 } // .end method
	 protected void onDestroy ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 86 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
		 /* .line 89 */
		 /* .line 90 */
		 return;
	 } // .end method
