public class com.funbox.game.ang.OptionActivity extends android.app.Activity {
	 /* .source "OptionActivity.java" */
	 /* # instance fields */
	 private android.widget.CheckBox cbMusic;
	 private android.widget.CheckBox cbSound;
	 private android.widget.CheckBox cbVibrate;
	 private android.content.Intent mIntent;
	 /* # direct methods */
	 public com.funbox.game.ang.OptionActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 static android.content.Intent access$0 ( com.funbox.game.ang.OptionActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 21 */
		 v0 = this.mIntent;
	 } // .end method
	 static android.widget.CheckBox access$1 ( com.funbox.game.ang.OptionActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 17 */
		 v0 = this.cbMusic;
	 } // .end method
	 static android.widget.CheckBox access$2 ( com.funbox.game.ang.OptionActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 18 */
		 v0 = this.cbSound;
	 } // .end method
	 static android.widget.CheckBox access$3 ( com.funbox.game.ang.OptionActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 19 */
		 v0 = this.cbVibrate;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 7 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 27 */
		 /* const v6, 0x7f030005 */
		 (( com.funbox.game.ang.OptionActivity ) p0 ).setContentView ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/OptionActivity;->setContentView(I)V
		 /* .line 28 */
		 final String v6 = "Game Option"; // const-string v6, "Game Option"
		 (( com.funbox.game.ang.OptionActivity ) p0 ).setTitle ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/OptionActivity;->setTitle(Ljava/lang/CharSequence;)V
		 /* .line 30 */
		 (( com.funbox.game.ang.OptionActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/OptionActivity;->getIntent()Landroid/content/Intent;
		 this.mIntent = v6;
		 /* .line 33 */
		 (( com.funbox.game.ang.OptionActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/OptionActivity;->getIntent()Landroid/content/Intent;
		 (( android.content.Intent ) v6 ).getExtras ( ); // invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
		 /* .line 34 */
		 /* .local v0, "b":Landroid/os/Bundle; */
		 final String v6 = "isMusic"; // const-string v6, "isMusic"
		 v3 = 		 (( android.os.Bundle ) v0 ).getBoolean ( v6 ); // invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
		 /* .line 35 */
		 /* .local v3, "isMusic":Z */
		 final String v6 = "isSound"; // const-string v6, "isSound"
		 v4 = 		 (( android.os.Bundle ) v0 ).getBoolean ( v6 ); // invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
		 /* .line 36 */
		 /* .local v4, "isSound":Z */
		 final String v6 = "isVibrate"; // const-string v6, "isVibrate"
		 v5 = 		 (( android.os.Bundle ) v0 ).getBoolean ( v6 ); // invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
		 /* .line 39 */
		 /* .local v5, "isVibrate":Z */
		 /* const v6, 0x7f060014 */
		 (( com.funbox.game.ang.OptionActivity ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/OptionActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v6, Landroid/widget/CheckBox; */
		 this.cbMusic = v6;
		 /* .line 40 */
		 v6 = this.cbMusic;
		 (( android.widget.CheckBox ) v6 ).setChecked ( v3 ); // invoke-virtual {v6, v3}, Landroid/widget/CheckBox;->setChecked(Z)V
		 /* .line 42 */
		 /* const v6, 0x7f060015 */
		 (( com.funbox.game.ang.OptionActivity ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/OptionActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v6, Landroid/widget/CheckBox; */
		 this.cbSound = v6;
		 /* .line 43 */
		 v6 = this.cbSound;
		 (( android.widget.CheckBox ) v6 ).setChecked ( v4 ); // invoke-virtual {v6, v4}, Landroid/widget/CheckBox;->setChecked(Z)V
		 /* .line 45 */
		 /* const v6, 0x7f060016 */
		 (( com.funbox.game.ang.OptionActivity ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/OptionActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v6, Landroid/widget/CheckBox; */
		 this.cbVibrate = v6;
		 /* .line 46 */
		 v6 = this.cbVibrate;
		 (( android.widget.CheckBox ) v6 ).setChecked ( v5 ); // invoke-virtual {v6, v5}, Landroid/widget/CheckBox;->setChecked(Z)V
		 /* .line 49 */
		 /* const v6, 0x7f060018 */
		 (( com.funbox.game.ang.OptionActivity ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/OptionActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v2, Landroid/widget/Button; */
		 /* .line 50 */
		 /* .local v2, "btnSave":Landroid/widget/Button; */
		 /* new-instance v6, Lcom/funbox/game/ang/OptionActivity$1; */
		 /* invoke-direct {v6, p0}, Lcom/funbox/game/ang/OptionActivity$1;-><init>(Lcom/funbox/game/ang/OptionActivity;)V */
		 (( android.widget.Button ) v2 ).setOnClickListener ( v6 ); // invoke-virtual {v2, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 64 */
		 /* const v6, 0x7f060017 */
		 (( com.funbox.game.ang.OptionActivity ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/OptionActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v1, Landroid/widget/Button; */
		 /* .line 65 */
		 /* .local v1, "btnCancel":Landroid/widget/Button; */
		 /* new-instance v6, Lcom/funbox/game/ang/OptionActivity$2; */
		 /* invoke-direct {v6, p0}, Lcom/funbox/game/ang/OptionActivity$2;-><init>(Lcom/funbox/game/ang/OptionActivity;)V */
		 (( android.widget.Button ) v1 ).setOnClickListener ( v6 ); // invoke-virtual {v1, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 71 */
		 return;
	 } // .end method
