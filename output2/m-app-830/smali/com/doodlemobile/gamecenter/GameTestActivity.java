public class com.doodlemobile.gamecenter.GameTestActivity extends android.app.Activity {
	 /* # instance fields */
	 private final android.os.Handler a;
	 /* # direct methods */
	 public com.doodlemobile.gamecenter.GameTestActivity ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/ar; */
		 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/ar;-><init>(Lcom/doodlemobile/gamecenter/GameTestActivity;)V */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* const v0, 0x7f030020 */
		 (( com.doodlemobile.gamecenter.GameTestActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameTestActivity;->setContentView(I)V
		 /* const v0, 0x7f070022 */
		 (( com.doodlemobile.gamecenter.GameTestActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameTestActivity;->findViewById(I)Landroid/view/View;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/au; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/au;-><init>(Lcom/doodlemobile/gamecenter/GameTestActivity;)V */
		 (( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* const v0, 0x7f070064 */
		 (( com.doodlemobile.gamecenter.GameTestActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameTestActivity;->findViewById(I)Landroid/view/View;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/aw; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/aw;-><init>(Lcom/doodlemobile/gamecenter/GameTestActivity;)V */
		 (( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* const v0, 0x7f070023 */
		 (( com.doodlemobile.gamecenter.GameTestActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameTestActivity;->findViewById(I)Landroid/view/View;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/as; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/as;-><init>(Lcom/doodlemobile/gamecenter/GameTestActivity;)V */
		 (( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* const v0, 0x7f070065 */
		 (( com.doodlemobile.gamecenter.GameTestActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameTestActivity;->findViewById(I)Landroid/view/View;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/at; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/at;-><init>(Lcom/doodlemobile/gamecenter/GameTestActivity;)V */
		 (( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* const v0, 0x7f070066 */
		 (( com.doodlemobile.gamecenter.GameTestActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameTestActivity;->findViewById(I)Landroid/view/View;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/aq; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/aq;-><init>(Lcom/doodlemobile/gamecenter/GameTestActivity;)V */
		 (( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 return;
	 } // .end method
	 protected android.app.Dialog onCreateDialog ( Integer p0 ) {
		 /* .locals 2 */
		 /* const v0, 0x186a1 */
		 /* if-ne p1, v0, :cond_0 */
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/bi; */
		 /* const v1, 0x7f060002 */
		 /* invoke-direct {v0, p0, v1}, Lcom/doodlemobile/gamecenter/bi;-><init>(Landroid/content/Context;I)V */
	 } // :goto_0
} // :cond_0
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreateDialog(I)Landroid/app/Dialog; */
} // .end method
protected void onStart ( ) {
/* .locals 0 */
/* invoke-super {p0}, Landroid/app/Activity;->onStart()V */
com.doodlemobile.gamecenter.cn .a ( p0 );
return;
} // .end method
protected void onStop ( ) {
/* .locals 0 */
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
com.doodlemobile.gamecenter.z .e ( );
return;
} // .end method
