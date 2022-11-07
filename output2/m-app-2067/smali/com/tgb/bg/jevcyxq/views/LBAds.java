public class com.tgb.bg.jevcyxq.views.LBAds extends com.tgb.bg.jevcyxq.refurbished.TGBActivity implements android.view.View$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 private android.widget.Button a;
	 private android.widget.LinearLayout b;
	 /* # direct methods */
	 public com.tgb.bg.jevcyxq.views.LBAds ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBActivity;-><init>()V */
		 this.a = v0;
		 this.b = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected final android.view.View a ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x7f070000 */
		 (( com.tgb.bg.jevcyxq.views.LBAds ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/LBAds;->findViewById(I)Landroid/view/View;
	 } // .end method
	 public void onClick ( android.view.View p0 ) {
		 /* .locals 3 */
		 v0 = 		 (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
		 /* packed-switch v0, :pswitch_data_0 */
	 } // :goto_0
	 return;
	 /* :pswitch_0 */
	 /* new-instance v0, Landroid/content/Intent; */
	 final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
	 final String v2 = "http://ad.leadboltads.net/show_app_wall?section_id=614480125"; // const-string v2, "http://ad.leadboltads.net/show_app_wall?section_id=614480125"
	 android.net.Uri .parse ( v2 );
	 /* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
	 (( com.tgb.bg.jevcyxq.views.LBAds ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/LBAds;->startActivity(Landroid/content/Intent;)V
	 /* :pswitch_1 */
	 (( com.tgb.bg.jevcyxq.views.LBAds ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/LBAds;->finish()V
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x7f070054 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
} // .end packed-switch
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* invoke-super {p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/TGBActivity;->onCreate(Landroid/os/Bundle;)V */
/* const v0, 0x7f030005 */
(( com.tgb.bg.jevcyxq.views.LBAds ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/LBAds;->setContentView(I)V
/* const v0, 0x7f070055 */
(( com.tgb.bg.jevcyxq.views.LBAds ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/LBAds;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
this.a = v0;
v0 = this.a;
(( android.widget.Button ) v0 ).setOnClickListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* const v0, 0x7f070054 */
(( com.tgb.bg.jevcyxq.views.LBAds ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/LBAds;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/LinearLayout; */
this.b = v0;
v0 = this.b;
(( android.widget.LinearLayout ) v0 ).setOnClickListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
(( com.tgb.bg.jevcyxq.views.LBAds ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/LBAds;->getResources()Landroid/content/res/Resources;
/* const v1, 0x7f020002 */
(( android.content.res.Resources ) v0 ).getDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
v1 = this.a;
(( android.widget.Button ) v1 ).setBackgroundDrawable ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
