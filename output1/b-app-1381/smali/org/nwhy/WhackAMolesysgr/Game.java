public class org.nwhy.WhackAMolesysgr.Game extends android.app.Activity {
	 /* .source "Game.java" */
	 /* # instance fields */
	 private final Integer MENU_HELP;
	 private final Integer MENU_MUTE;
	 private final Integer MENU_PAUSE;
	 private final Integer MENU_RESUME;
	 private final Integer MENU_UNMUTE;
	 private org.nwhy.WhackAMolesysgr.GameView gameView;
	 private android.content.SharedPreferences settings;
	 /* # direct methods */
	 public org.nwhy.WhackAMolesysgr.Game ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 13 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/Game;->MENU_PAUSE:I */
		 /* .line 14 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/Game;->MENU_RESUME:I */
		 /* .line 15 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/Game;->MENU_HELP:I */
		 /* .line 16 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/Game;->MENU_MUTE:I */
		 /* .line 17 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/Game;->MENU_UNMUTE:I */
		 /* .line 11 */
		 return;
	 } // .end method
	 private void putValue ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 1 */
		 /* .param p1, "str" # Ljava/lang/String; */
		 /* .param p2, "value" # Z */
		 /* .prologue */
		 /* .line 77 */
		 v0 = this.settings;
		 /* .line 78 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 4 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 com.games.a .a ( p0 );
		 /* .line 24 */
		 org.nwhy.WhackAMolesysgr.ImageManager .init ( p0 );
		 /* .line 25 */
		 org.nwhy.WhackAMolesysgr.ActivityUtil .noNotificationBar ( p0 );
		 /* .line 26 */
		 org.nwhy.WhackAMolesysgr.ActivityUtil .noTitleBar ( p0 );
		 /* .line 27 */
		 /* const v1, 0x7f030002 */
		 (( org.nwhy.WhackAMolesysgr.Game ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lorg/nwhy/WhackAMolesysgr/Game;->setContentView(I)V
		 /* .line 29 */
		 final String v1 = "org.nwhy.WhackAMole"; // const-string v1, "org.nwhy.WhackAMole"
		 int v2 = 0; // const/4 v2, 0x0
		 (( org.nwhy.WhackAMolesysgr.Game ) p0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/nwhy/WhackAMolesysgr/Game;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 this.settings = v1;
		 /* .line 30 */
		 /* const/high16 v1, 0x7f0b0000 */
		 (( org.nwhy.WhackAMolesysgr.Game ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lorg/nwhy/WhackAMolesysgr/Game;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/RelativeLayout; */
		 /* .line 31 */
		 /* .local v0, "wrapper":Landroid/widget/RelativeLayout; */
		 /* new-instance v1, Lorg/nwhy/WhackAMolesysgr/GameView; */
		 /* invoke-direct {v1, p0}, Lorg/nwhy/WhackAMolesysgr/GameView;-><init>(Landroid/content/Context;)V */
		 this.gameView = v1;
		 /* .line 32 */
		 v1 = this.gameView;
		 /* const/16 v2, 0x1e0 */
		 /* const/16 v3, 0x140 */
		 (( android.widget.RelativeLayout ) v0 ).addView ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V
		 /* .line 33 */
		 return;
	 } // .end method
	 public Boolean onCreateOptionsMenu ( android.view.Menu p0 ) {
		 /* .locals 7 */
		 /* .param p1, "menu" # Landroid/view/Menu; */
		 /* .prologue */
		 int v6 = 4; // const/4 v6, 0x4
		 int v5 = 3; // const/4 v5, 0x3
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 38 */
		 /* const v0, 0x7f06000a */
		 /* .line 39 */
		 /* const v1, 0x1080023 */
		 /* .line 38 */
		 /* .line 40 */
		 /* const v0, 0x7f06000b */
		 /* .line 41 */
		 /* const v1, 0x1080024 */
		 /* .line 40 */
		 /* .line 42 */
		 /* const v0, 0x7f060002 */
		 /* .line 43 */
		 /* const v1, 0x1080040 */
		 /* .line 42 */
		 /* .line 44 */
		 /* const v0, 0x7f06000c */
		 /* .line 45 */
		 /* const v1, 0x1080031 */
		 /* .line 44 */
		 /* .line 46 */
		 /* const v0, 0x7f06000d */
		 /* .line 47 */
		 /* const v1, 0x1080032 */
		 /* .line 46 */
		 /* .line 48 */
		 v0 = 		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z */
	 } // .end method
	 public Boolean onOptionsItemSelected ( android.view.MenuItem p0 ) {
		 /* .locals 3 */
		 /* .param p1, "item" # Landroid/view/MenuItem; */
		 /* .prologue */
		 final String v2 = "soundFlag"; // const-string v2, "soundFlag"
		 v1 = 		 /* .line 54 */
		 /* packed-switch v1, :pswitch_data_0 */
		 /* .line 73 */
	 } // :goto_0
	 v1 = 	 /* invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z */
	 /* .line 56 */
	 /* :pswitch_0 */
	 v1 = this.gameView;
	 (( org.nwhy.WhackAMolesysgr.GameView ) v1 ).pause ( ); // invoke-virtual {v1}, Lorg/nwhy/WhackAMolesysgr/GameView;->pause()V
	 /* .line 59 */
	 /* :pswitch_1 */
	 v1 = this.gameView;
	 (( org.nwhy.WhackAMolesysgr.GameView ) v1 ).resume ( ); // invoke-virtual {v1}, Lorg/nwhy/WhackAMolesysgr/GameView;->resume()V
	 /* .line 62 */
	 /* :pswitch_2 */
	 final String v1 = "soundFlag"; // const-string v1, "soundFlag"
	 int v1 = 1; // const/4 v1, 0x1
	 /* invoke-direct {p0, v2, v1}, Lorg/nwhy/WhackAMolesysgr/Game;->putValue(Ljava/lang/String;Z)V */
	 /* .line 65 */
	 /* :pswitch_3 */
	 final String v1 = "soundFlag"; // const-string v1, "soundFlag"
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {p0, v2, v1}, Lorg/nwhy/WhackAMolesysgr/Game;->putValue(Ljava/lang/String;Z)V */
	 /* .line 68 */
	 /* :pswitch_4 */
	 /* new-instance v0, Landroid/content/Intent; */
	 /* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
	 /* .line 69 */
	 /* .local v0, "intent":Landroid/content/Intent; */
	 /* const-class v1, Lorg/nwhy/WhackAMolesysgr/About; */
	 (( android.content.Intent ) v0 ).setClass ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
	 /* .line 70 */
	 (( org.nwhy.WhackAMolesysgr.Game ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/WhackAMolesysgr/Game;->startActivity(Landroid/content/Intent;)V
	 /* .line 54 */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_4 */
	 /* :pswitch_2 */
	 /* :pswitch_3 */
} // .end packed-switch
} // .end method
