public class de.nurogames.android.ticb.base.views.MenuView extends de.nurogames.android.ticb.base.views.ViewPlus implements android.view.View$OnTouchListener {
	 /* .source "MenuView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/views/MenuView$RefreshHandler; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String CHANGELOG_NAME;
private static de.nurogames.android.ticb.base.objects.objAnimMenuBackground background;
private static Boolean clogshown;
public static de.nurogames.android.ticb.base.objects.objDifficultyChooser difficulty_chooser;
/* # instance fields */
private Integer CURVE_AMP;
private Integer CURVE_OFFSET;
private Integer PHASE_SHIFT;
private Integer WAVE_LENGHT;
private android.graphics.Paint alpha;
private Integer animationTimer;
private Integer bee_animID;
private Float bee_vel_x;
private Float bee_x;
private Float bee_x_offset;
private Float bee_y;
Integer chkval;
private android.graphics.Paint font;
private android.graphics.Paint font2;
Float lastTouchX;
Float lastTouchY;
private Integer mMode;
private de.nurogames.android.ticb.base.views.MenuView$RefreshHandler mRedrawHandler;
private main_menu_buttons_x;
private main_menu_buttons_y;
private de.nurogames.android.ticb.base.objects.objMenuButton menuButtons;
Boolean moved;
private Integer pop_delay;
private Integer runtime;
java.lang.String session_text;
private Double twoPI;
java.lang.Thread updateThread;
public Boolean update_checked;
/* # direct methods */
static de.nurogames.android.ticb.base.views.MenuView ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 43 */
	 int v0 = 1; // const/4 v0, 0x1
	 de.nurogames.android.ticb.base.views.MenuView.clogshown = (v0!= 0);
	 /* .line 55 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground; */
	 /* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;-><init>()V */
	 /* .line 85 */
	 return;
} // .end method
public de.nurogames.android.ticb.base.views.MenuView ( ) {
	 /* .locals 5 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 int v4 = 1; // const/4 v4, 0x1
	 int v3 = 0; // const/4 v3, 0x0
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 105 */
	 /* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/ViewPlus;-><init>(Landroid/content/Context;)V */
	 /* .line 46 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/views/MenuView$RefreshHandler; */
	 /* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/views/MenuView$RefreshHandler;-><init>(Lde/nurogames/android/ticb/base/views/MenuView;)V */
	 this.mRedrawHandler = v0;
	 /* .line 49 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->mMode:I */
	 /* .line 52 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->runtime:I */
	 /* .line 58 */
	 /* const/16 v0, 0xe */
	 /* new-array v0, v0, [Lde/nurogames/android/ticb/base/objects/objMenuButton; */
	 this.menuButtons = v0;
	 /* .line 63 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
	 /* .line 66 */
	 /* const/16 v0, 0x1e */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->CURVE_OFFSET:I */
	 /* .line 67 */
	 /* const/16 v0, 0xc */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->CURVE_AMP:I */
	 /* .line 68 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->PHASE_SHIFT:I */
	 /* .line 69 */
	 /* const/16 v0, 0x64 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->WAVE_LENGHT:I */
	 /* .line 72 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->animationTimer:I */
	 /* .line 73 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_animID:I */
	 /* .line 74 */
	 /* iput v3, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_vel_x:F */
	 /* .line 75 */
	 /* iput v3, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x:F */
	 /* .line 76 */
	 /* iput v3, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
	 /* .line 77 */
	 /* iput v3, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_y:F */
	 /* .line 88 */
	 /* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->update_checked:Z */
	 /* .line 90 */
	 /* const-wide v0, 0x401921fb54442d18L # 6.283185307179586 */
	 /* iput-wide v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->twoPI:D */
	 /* .line 92 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.font = v0;
	 /* .line 93 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.font2 = v0;
	 /* .line 94 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.alpha = v0;
	 /* .line 593 */
	 /* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->moved:Z */
	 /* .line 594 */
	 /* iput v3, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
	 /* .line 595 */
	 /* iput v3, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
	 /* .line 765 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/views/MenuView$1; */
	 final String v1 = "updateThread"; // const-string v1, "updateThread"
	 /* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/views/MenuView$1;-><init>(Lde/nurogames/android/ticb/base/views/MenuView;Ljava/lang/String;)V */
	 this.updateThread = v0;
	 /* .line 108 */
	 (( de.nurogames.android.ticb.base.views.MenuView ) p0 ).setFocusable ( v4 ); // invoke-virtual {p0, v4}, Lde/nurogames/android/ticb/base/views/MenuView;->setFocusable(Z)V
	 /* .line 109 */
	 (( de.nurogames.android.ticb.base.views.MenuView ) p0 ).setKeepScreenOn ( v4 ); // invoke-virtual {p0, v4}, Lde/nurogames/android/ticb/base/views/MenuView;->setKeepScreenOn(Z)V
	 /* .line 110 */
	 (( de.nurogames.android.ticb.base.views.MenuView ) p0 ).setOnTouchListener ( p0 ); // invoke-virtual {p0, p0}, Lde/nurogames/android/ticb/base/views/MenuView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
	 /* .line 112 */
	 return;
} // .end method
private void checkForLove ( ) {
	 /* .locals 10 */
	 /* .prologue */
	 /* const/16 v9, 0xb */
	 int v8 = 1; // const/4 v8, 0x1
	 int v7 = 2; // const/4 v7, 0x2
	 int v6 = 5; // const/4 v6, 0x5
	 /* .line 252 */
	 java.util.Calendar .getInstance ( );
	 /* .line 254 */
	 /* .local v3, "rightNow":Ljava/util/Calendar; */
	 /* sget-boolean v4, Lde/nurogames/android/ticb/base/core/AppResources;->love_shown:Z */
	 /* if-nez v4, :cond_4 */
	 /* .line 257 */
	 v4 = 	 (( java.util.Calendar ) v3 ).get ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/Calendar;->get(I)I
	 /* const/16 v5, 0x12 */
	 /* if-ne v4, v5, :cond_0 */
	 v4 = 	 (( java.util.Calendar ) v3 ).get ( v7 ); // invoke-virtual {v3, v7}, Ljava/util/Calendar;->get(I)I
	 /* if-eq v4, v7, :cond_1 */
	 /* .line 259 */
} // :cond_0
v4 = (( java.util.Calendar ) v3 ).get ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/Calendar;->get(I)I
/* const/16 v5, 0x19 */
/* if-ne v4, v5, :cond_4 */
v4 = (( java.util.Calendar ) v3 ).get ( v7 ); // invoke-virtual {v3, v7}, Ljava/util/Calendar;->get(I)I
/* if-ne v4, v9, :cond_4 */
/* .line 264 */
} // :cond_1
de.nurogames.android.ticb.base.core.AppResources.love_shown = (v8!= 0);
/* .line 266 */
/* new-instance v1, Landroid/app/Dialog; */
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getContext()Landroid/content/Context;
/* invoke-direct {v1, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V */
/* .line 267 */
/* .local v1, "dialog":Landroid/app/Dialog; */
(( android.app.Dialog ) v1 ).setContentView ( v4 ); // invoke-virtual {v1, v4}, Landroid/app/Dialog;->setContentView(I)V
/* .line 268 */
final String v4 = "I love you!"; // const-string v4, "I love you!"
(( android.app.Dialog ) v1 ).setTitle ( v4 ); // invoke-virtual {v1, v4}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V
/* .line 269 */
(( android.app.Dialog ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/Dialog;->show()V
/* .line 271 */
(( android.app.Dialog ) v1 ).findViewById ( v4 ); // invoke-virtual {v1, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/TextView; */
/* .line 272 */
/* .local v2, "info":Landroid/widget/TextView; */
v4 = (( java.util.Calendar ) v3 ).get ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/Calendar;->get(I)I
/* if-ne v4, v8, :cond_2 */
/* .line 273 */
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).getString ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 274 */
} // :cond_2
v4 = (( java.util.Calendar ) v3 ).get ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/Calendar;->get(I)I
/* if-ne v4, v9, :cond_3 */
/* .line 275 */
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).getString ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 277 */
} // :cond_3
(( android.app.Dialog ) v1 ).findViewById ( v4 ); // invoke-virtual {v1, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
/* .line 278 */
/* .local v0, "close":Landroid/widget/Button; */
/* new-instance v4, Lde/nurogames/android/ticb/base/views/MenuView$2; */
/* invoke-direct {v4, p0, v1}, Lde/nurogames/android/ticb/base/views/MenuView$2;-><init>(Lde/nurogames/android/ticb/base/views/MenuView;Landroid/app/Dialog;)V */
(( android.widget.Button ) v0 ).setOnClickListener ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 286 */
} // .end local v0 # "close":Landroid/widget/Button;
} // .end local v1 # "dialog":Landroid/app/Dialog;
} // .end local v2 # "info":Landroid/widget/TextView;
} // :cond_4
return;
} // .end method
private void doClickFX ( ) {
/* .locals 3 */
/* .prologue */
/* .line 758 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = de.nurogames.android.ticb.base.tinysanta.vibrator;
/* const-wide/16 v1, 0x28 */
(( android.os.Vibrator ) v0 ).vibrate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 759 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v0 );
/* .line 760 */
return;
} // .end method
private void executeMenuAction ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "id" # I */
/* .prologue */
int v3 = 3; // const/4 v3, 0x3
int v5 = 2; // const/4 v5, 0x2
int v4 = 4; // const/4 v4, 0x4
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* .line 381 */
java.lang.System .gc ( );
/* .line 386 */
/* if-nez p1, :cond_2 */
/* .line 387 */
/* .line 388 */
v0 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_07_PLAY_DEFAULT_MODE;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v0,v1 );
/* .line 389 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objDifficultyChooser; */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgDifficultyChooserBG;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgDifficultyChooserBG;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgDifficultyChooserBG;
/* invoke-direct {v0, v1, v2, v3}, Lde/nurogames/android/ticb/base/objects/objDifficultyChooser;-><init>(IILandroid/graphics/Bitmap;)V */
/* .line 479 */
} // :cond_0
} // :goto_0
/* if-lt p1, v4, :cond_13 */
int v0 = 7; // const/4 v0, 0x7
/* if-gt p1, v0, :cond_13 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->showOptionsMenu:Z */
/* if-nez v0, :cond_13 */
/* .line 493 */
} // :cond_1
} // :goto_1
return;
/* .line 392 */
} // :cond_2
/* if-ne p1, v1, :cond_3 */
/* .line 393 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v3 );
/* .line 396 */
} // :cond_3
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->use_crosspromo_shop:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* if-ne p1, v5, :cond_5 */
/* .line 398 */
v0 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_17_CLICKED_MORE_GAMES;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v0,v1 );
/* .line 399 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
/* if-nez v0, :cond_0 */
/* .line 400 */
v0 = de.nurogames.android.ticb.base.tinysanta.diag;
v0 = (( de.nurogames.android.ticb.base.core.systemDiagnostic ) v0 ).detectInternet ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/systemDiagnostic;->detectInternet()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 401 */
v0 = de.nurogames.android.ticb.base.tinysanta.shopMngr;
v0 = (( de.nurogames.android.ticb.base.core.ShopMngr ) v0 ).getShopItemCount ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/ShopMngr;->getShopItemCount()I
/* if-nez v0, :cond_4 */
/* .line 402 */
v0 = de.nurogames.android.ticb.base.tinysanta.shopMngr;
(( de.nurogames.android.ticb.base.core.ShopMngr ) v0 ).loadDataFromServer ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/ShopMngr;->loadDataFromServer()V
/* .line 404 */
} // :cond_4
v0 = de.nurogames.android.ticb.base.tinysanta.chartboost;
(( de.nurogames.android.ticb.base.CBMngr ) v0 ).showMoreApps ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/CBMngr;->showMoreApps()V
/* .line 408 */
} // :cond_5
/* if-ne p1, v3, :cond_7 */
/* .line 409 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->showOptionsMenu:Z */
if ( v2 != null) { // if-eqz v2, :cond_6
} // :goto_2
de.nurogames.android.ticb.base.core.AppResources.showOptionsMenu = (v0!= 0);
/* .line 410 */
v0 = this.menuButtons;
/* aget-object v0, v0, p1 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->showOptionsMenu:Z */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isToggled ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
} // :cond_6
/* move v0, v1 */
/* .line 409 */
/* .line 413 */
} // :cond_7
/* if-ne p1, v4, :cond_8 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->showOptionsMenu:Z */
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 414 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v4 );
/* .line 417 */
} // :cond_8
int v2 = 5; // const/4 v2, 0x5
/* if-ne p1, v2, :cond_a */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->showOptionsMenu:Z */
if ( v2 != null) { // if-eqz v2, :cond_a
/* .line 418 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->useSounds:Z */
if ( v2 != null) { // if-eqz v2, :cond_9
} // :goto_3
de.nurogames.android.ticb.base.core.AppResources.useSounds = (v0!= 0);
/* .line 419 */
v0 = this.menuButtons;
/* aget-object v0, v0, p1 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useSounds:Z */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isToggled ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
} // :cond_9
/* move v0, v1 */
/* .line 418 */
/* .line 422 */
} // :cond_a
int v2 = 6; // const/4 v2, 0x6
/* if-ne p1, v2, :cond_d */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->showOptionsMenu:Z */
if ( v2 != null) { // if-eqz v2, :cond_d
/* .line 423 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->useMusic:Z */
if ( v2 != null) { // if-eqz v2, :cond_b
} // :goto_4
de.nurogames.android.ticb.base.core.AppResources.useMusic = (v0!= 0);
/* .line 424 */
v0 = this.menuButtons;
/* aget-object v0, v0, p1 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useMusic:Z */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isToggled ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 425 */
v0 = de.nurogames.android.ticb.base.core.AppResources.music_menu;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 426 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->useMusic:Z */
/* if-nez v0, :cond_c */
v0 = de.nurogames.android.ticb.base.core.AppResources.music_menu;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 427 */
v0 = de.nurogames.android.ticb.base.core.AppResources.music_menu;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* goto/16 :goto_0 */
} // :cond_b
/* move v0, v1 */
/* .line 423 */
/* .line 428 */
} // :cond_c
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->useMusic:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = de.nurogames.android.ticb.base.core.AppResources.music_menu;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
/* if-nez v0, :cond_0 */
/* .line 429 */
v0 = de.nurogames.android.ticb.base.core.AppResources.music_menu;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* goto/16 :goto_0 */
/* .line 432 */
} // :cond_d
int v0 = 7; // const/4 v0, 0x7
/* if-ne p1, v0, :cond_e */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->showOptionsMenu:Z */
if ( v0 != null) { // if-eqz v0, :cond_e
/* .line 433 */
int v0 = 5; // const/4 v0, 0x5
de.nurogames.android.ticb.base.tinysanta .flipView ( v0 );
/* goto/16 :goto_0 */
/* .line 436 */
} // :cond_e
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_openfeint:Z */
if ( v0 != null) { // if-eqz v0, :cond_f
/* const/16 v0, 0x8 */
/* if-ne p1, v0, :cond_f */
/* .line 437 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
/* if-nez v0, :cond_0 */
/* .line 438 */
v0 = de.nurogames.android.ticb.base.tinysanta.diag;
v0 = (( de.nurogames.android.ticb.base.core.systemDiagnostic ) v0 ).detectInternet ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/systemDiagnostic;->detectInternet()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 439 */
v0 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_19_CLICKED_OPENFEINT;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v0,v1 );
/* goto/16 :goto_0 */
/* .line 445 */
} // :cond_f
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_facebook:Z */
if ( v0 != null) { // if-eqz v0, :cond_10
/* const/16 v0, 0x9 */
/* if-eq p1, v0, :cond_0 */
/* .line 461 */
} // :cond_10
/* const/16 v0, 0xc */
/* if-ne p1, v0, :cond_11 */
/* .line 462 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->startGameEndless()V */
/* goto/16 :goto_0 */
/* .line 466 */
} // :cond_11
/* const/16 v0, 0xd */
/* if-ne p1, v0, :cond_12 */
/* .line 467 */
/* if-lt v0, v2, :cond_0 */
/* .line 468 */
java.lang.System .exit ( v1 );
/* goto/16 :goto_0 */
/* .line 472 */
} // :cond_12
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_inapp_market:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v0, 0xe */
/* if-ne p1, v0, :cond_0 */
/* .line 473 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/InAppMngr; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/core/InAppMngr;-><init>()V */
/* .line 474 */
int v0 = 6; // const/4 v0, 0x6
de.nurogames.android.ticb.base.tinysanta .flipView ( v0 );
/* goto/16 :goto_0 */
/* .line 482 */
} // :cond_13
/* const/16 v0, 0xd */
/* if-ne p1, v0, :cond_14 */
/* if-lt v0, v1, :cond_1 */
/* .line 485 */
} // :cond_14
/* const/16 v0, 0x8 */
/* if-lt p1, v0, :cond_15 */
/* const/16 v0, 0xb */
/* if-gt p1, v0, :cond_15 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
/* if-nez v0, :cond_1 */
/* .line 486 */
} // :cond_15
/* if-ne p1, v5, :cond_16 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
/* if-nez v0, :cond_1 */
/* .line 490 */
} // :cond_16
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->doClickFX()V */
/* goto/16 :goto_1 */
} // .end method
private void getChangesLogAlreadySeen ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 1; // const/4 v7, 0x1
int v6 = 0; // const/4 v6, 0x0
/* .line 848 */
int v1 = 0; // const/4 v1, 0x0
/* .line 851 */
/* .local v1, "packageInfo":Landroid/content/pm/PackageInfo; */
try { // :try_start_0
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getContext()Landroid/content/Context;
(( android.content.Context ) v3 ).getPackageManager ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getContext()Landroid/content/Context;
(( android.content.Context ) v4 ).getPackageName ( ); // invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* const/16 v5, 0x80 */
(( android.content.pm.PackageManager ) v3 ).getPackageInfo ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 858 */
v3 = this.versionName;
final String v4 = "1.00"; // const-string v4, "1.00"
v3 = (( java.lang.String ) v3 ).equalsIgnoreCase ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v3, :cond_0 */
v3 = this.versionName;
final String v4 = "1,00"; // const-string v4, "1,00"
v3 = (( java.lang.String ) v3 ).equalsIgnoreCase ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 859 */
} // :cond_0
de.nurogames.android.ticb.base.views.MenuView.clogshown = (v7!= 0);
/* .line 864 */
} // :goto_0
return;
/* .line 852 */
/* :catch_0 */
/* move-exception v0 */
/* .line 854 */
/* .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
de.nurogames.android.ticb.base.views.MenuView.clogshown = (v7!= 0);
/* .line 862 */
} // .end local v0 # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
} // :cond_1
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getContext()Landroid/content/Context;
final String v4 = "NuroTinyBee_Changelog"; // const-string v4, "NuroTinyBee_Changelog"
(( android.content.Context ) v3 ).getSharedPreferences ( v4, v6 ); // invoke-virtual {v3, v4, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 863 */
/* .local v2, "settings":Landroid/content/SharedPreferences; */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "changelogshown_"; // const-string v4, "changelogshown_"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v4 = this.versionName;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
de.nurogames.android.ticb.base.views.MenuView.clogshown = (v3!= 0);
} // .end method
private void initView ( ) {
/* .locals 13 */
/* .prologue */
int v12 = 6; // const/4 v12, 0x6
int v11 = 5; // const/4 v11, 0x5
int v10 = 1; // const/4 v10, 0x1
int v1 = 0; // const/4 v1, 0x0
int v9 = 0; // const/4 v9, 0x0
/* .line 118 */
/* const/16 v0, 0xe */
/* new-array v0, v0, [I */
/* .line 121 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Play;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x3 */
/* sub-int/2addr v2, v3 */
/* aput v2, v0, v9 */
int v2 = 2; // const/4 v2, 0x2
/* .line 123 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Shop;
/* aget-object v4, v4, v9 */
v4 = (( android.graphics.Bitmap ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v3, v4 */
/* aput v3, v0, v2 */
int v2 = 4; // const/4 v2, 0x4
/* .line 127 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Settings;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* aput v3, v0, v2 */
/* .line 128 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Settings;
/* aget-object v2, v2, v9 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Help;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v2, v3 */
/* aput v2, v0, v11 */
/* .line 129 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Settings;
/* aget-object v2, v2, v9 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Help;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Sound;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v2, v3 */
/* aput v2, v0, v12 */
int v2 = 7; // const/4 v2, 0x7
/* .line 130 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Settings;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Help;
/* aget-object v4, v4, v9 */
v4 = (( android.graphics.Bitmap ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Sound;
/* aget-object v4, v4, v9 */
v4 = (( android.graphics.Bitmap ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Music;
/* aget-object v4, v4, v9 */
v4 = (( android.graphics.Bitmap ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v3, v4 */
/* aput v3, v0, v2 */
/* const/16 v2, 0x8 */
/* .line 133 */
/* aput v3, v0, v2 */
/* const/16 v2, 0x9 */
/* .line 134 */
/* aput v3, v0, v2 */
/* const/16 v2, 0xa */
/* .line 135 */
/* aput v3, v0, v2 */
/* const/16 v2, 0xc */
/* .line 141 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_PlayEndless;
/* aget-object v4, v4, v9 */
v4 = (( android.graphics.Bitmap ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v4, v4 */
/* const v5, 0x3f99999a # 1.2f */
/* mul-float/2addr v4, v5 */
/* float-to-int v4, v4 */
/* sub-int/2addr v3, v4 */
/* aput v3, v0, v2 */
/* const/16 v2, 0xd */
/* .line 144 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgFullScreenExit;
v4 = (( android.graphics.Bitmap ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v3, v4 */
/* aput v3, v0, v2 */
/* .line 118 */
this.main_menu_buttons_x = v0;
/* .line 148 */
/* const/16 v0, 0xe */
/* new-array v0, v0, [I */
/* .line 151 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Play;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v3, v3, 0x4 */
/* sub-int/2addr v2, v3 */
/* aput v2, v0, v9 */
/* .line 152 */
/* int-to-float v2, v2 */
/* const v3, 0x3ee147ae # 0.44f */
/* mul-float/2addr v2, v3 */
/* float-to-int v2, v2 */
/* aput v2, v0, v10 */
int v2 = 2; // const/4 v2, 0x2
/* .line 153 */
/* int-to-float v3, v3 */
/* const v4, 0x3ecccccd # 0.4f */
/* mul-float/2addr v3, v4 */
/* float-to-int v3, v3 */
/* aput v3, v0, v2 */
int v2 = 3; // const/4 v2, 0x3
/* .line 154 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Settings;
/* aget-object v4, v4, v9 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* aput v3, v0, v2 */
int v2 = 4; // const/4 v2, 0x4
/* .line 157 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Help;
/* aget-object v4, v4, v9 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* aput v3, v0, v2 */
/* .line 158 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Sound;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v2, v3 */
/* aput v2, v0, v11 */
/* .line 159 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Music;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* aput v2, v0, v12 */
int v2 = 7; // const/4 v2, 0x7
/* .line 160 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Credits;
/* aget-object v4, v4, v9 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/lit8 v4, v4, 0x8 */
/* sub-int/2addr v3, v4 */
/* aput v3, v0, v2 */
/* const/16 v2, 0x8 */
/* .line 163 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_SocialBox;
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v4, v4, 0x2 */
/* sub-int/2addr v3, v4 */
/* aput v3, v0, v2 */
/* const/16 v2, 0x9 */
/* .line 164 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_SocialBox;
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v4, v4, 0x2 */
/* sub-int/2addr v3, v4 */
/* aput v3, v0, v2 */
/* const/16 v2, 0xa */
/* .line 165 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_SocialBox;
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v4, v4, 0x2 */
/* sub-int/2addr v3, v4 */
/* aput v3, v0, v2 */
/* const/16 v2, 0xc */
/* .line 171 */
/* aput v3, v0, v2 */
/* .line 148 */
this.main_menu_buttons_y = v0;
/* .line 179 */
v7 = this.menuButtons;
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* aget v2, v2, v9 */
v3 = this.main_menu_buttons_y;
/* aget v3, v3, v9 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Play;
/* aget-object v4, v4, v9 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Play;
/* aget-object v5, v5, v10 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v9 */
/* .line 180 */
v7 = this.menuButtons;
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* aget v2, v2, v10 */
v3 = this.main_menu_buttons_y;
/* aget v3, v3, v10 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Highscore;
/* aget-object v4, v4, v9 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Highscore;
/* aget-object v5, v5, v10 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v10 */
/* .line 181 */
v7 = this.menuButtons;
int v8 = 2; // const/4 v8, 0x2
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
int v4 = 2; // const/4 v4, 0x2
/* aget v3, v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Shop;
/* aget-object v4, v4, v9 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Shop;
/* aget-object v5, v5, v10 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 182 */
v7 = this.menuButtons;
int v8 = 3; // const/4 v8, 0x3
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
int v3 = 3; // const/4 v3, 0x3
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
int v4 = 3; // const/4 v4, 0x3
/* aget v3, v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Settings;
/* aget-object v4, v4, v9 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Settings;
/* aget-object v5, v5, v10 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 183 */
v7 = this.menuButtons;
int v8 = 4; // const/4 v8, 0x4
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
int v3 = 4; // const/4 v3, 0x4
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
int v4 = 4; // const/4 v4, 0x4
/* aget v3, v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Help;
/* aget-object v4, v4, v9 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Help;
/* aget-object v5, v5, v10 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 184 */
v7 = this.menuButtons;
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* aget v2, v2, v11 */
v3 = this.main_menu_buttons_y;
/* aget v3, v3, v11 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Sound;
/* aget-object v4, v4, v9 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Sound;
/* aget-object v5, v5, v10 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v11 */
/* .line 185 */
v7 = this.menuButtons;
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* aget v2, v2, v12 */
v3 = this.main_menu_buttons_y;
/* aget v3, v3, v12 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Music;
/* aget-object v4, v4, v9 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Music;
/* aget-object v5, v5, v10 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v12 */
/* .line 186 */
v7 = this.menuButtons;
int v8 = 7; // const/4 v8, 0x7
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
int v3 = 7; // const/4 v3, 0x7
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
int v4 = 7; // const/4 v4, 0x7
/* aget v3, v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Credits;
/* aget-object v4, v4, v9 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_Credits;
/* aget-object v5, v5, v10 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 187 */
v7 = this.menuButtons;
/* const/16 v8, 0x8 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* const/16 v3, 0x8 */
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
/* const/16 v4, 0x8 */
/* aget v3, v3, v4 */
/* move-object v4, v1 */
/* move-object v5, v1 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 188 */
v7 = this.menuButtons;
/* const/16 v8, 0x9 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* const/16 v3, 0x9 */
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
/* const/16 v4, 0x9 */
/* aget v3, v3, v4 */
/* move-object v4, v1 */
/* move-object v5, v1 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 189 */
v7 = this.menuButtons;
/* const/16 v8, 0xa */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* const/16 v3, 0xa */
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
/* const/16 v4, 0xa */
/* aget v3, v3, v4 */
/* move-object v4, v1 */
/* move-object v5, v1 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 190 */
v7 = this.menuButtons;
/* const/16 v8, 0xb */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* const/16 v3, 0xb */
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
/* const/16 v4, 0xb */
/* aget v3, v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgDemoBanner;
v5 = de.nurogames.android.ticb.base.core.AppResources.imgDemoBanner;
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 191 */
v7 = this.menuButtons;
/* const/16 v8, 0xc */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* const/16 v3, 0xc */
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
/* const/16 v4, 0xc */
/* aget v3, v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_PlayEndless;
/* aget-object v4, v4, v9 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_PlayEndless;
/* aget-object v5, v5, v10 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 192 */
v7 = this.menuButtons;
/* const/16 v8, 0xd */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
v2 = this.main_menu_buttons_x;
/* const/16 v3, 0xd */
/* aget v2, v2, v3 */
v3 = this.main_menu_buttons_y;
/* const/16 v4, 0xd */
/* aget v3, v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgFullScreenExit;
v5 = de.nurogames.android.ticb.base.core.AppResources.imgFullScreenExit;
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* aput-object v0, v7, v8 */
/* .line 195 */
v0 = this.menuButtons;
int v1 = 3; // const/4 v1, 0x3
/* aget-object v0, v0, v1 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->showOptionsMenu:Z */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isToggled ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 196 */
v0 = this.menuButtons;
/* aget-object v0, v0, v11 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useSounds:Z */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isToggled ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 197 */
v0 = this.menuButtons;
/* aget-object v0, v0, v12 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->useMusic:Z */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isToggled ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 200 */
v0 = de.nurogames.android.ticb.base.tinysanta.diag;
v0 = (( de.nurogames.android.ticb.base.core.systemDiagnostic ) v0 ).detectInternet ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/systemDiagnostic;->detectInternet()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->update_checked:Z */
/* if-nez v0, :cond_0 */
/* .line 201 */
/* iput-boolean v10, p0, Lde/nurogames/android/ticb/base/views/MenuView;->update_checked:Z */
/* .line 202 */
v0 = de.nurogames.android.ticb.base.tinysanta.tkom_update_mngr;
(( de.nurogames.android.ticb.base.core.UpdateMngr ) v0 ).loadDataFromServer ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/UpdateMngr;->loadDataFromServer()V
/* .line 203 */
v0 = de.nurogames.android.ticb.base.tinysanta.tkom_update_mngr;
(( de.nurogames.android.ticb.base.core.UpdateMngr ) v0 ).checkUpdateIsNewer ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/UpdateMngr;->checkUpdateIsNewer()V
/* .line 206 */
} // :cond_0
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
this.session_text = v0;
/* .line 209 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->checkForLove()V */
/* .line 219 */
v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
final String v1 = "font.otf"; // const-string v1, "font.otf"
android.graphics.Typeface .createFromAsset ( v0,v1 );
/* .line 221 */
/* .local v6, "tf":Landroid/graphics/Typeface; */
v0 = this.font;
(( android.graphics.Paint ) v0 ).setTypeface ( v6 ); // invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 222 */
v0 = this.font2;
(( android.graphics.Paint ) v0 ).setTypeface ( v6 ); // invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 224 */
/* if-ge v0, v1, :cond_1 */
/* .line 225 */
v0 = this.font;
/* const/high16 v1, 0x41200000 # 10.0f */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 226 */
v0 = this.font2;
/* const/high16 v1, 0x41200000 # 10.0f */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 233 */
} // :goto_0
v0 = this.font;
/* const/16 v1, 0x6e */
/* const/16 v2, 0x46 */
v1 = android.graphics.Color .rgb ( v1,v2,v9 );
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 234 */
v0 = this.font;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v10 ); // invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 236 */
v0 = this.font2;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 237 */
v0 = this.font2;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v10 ); // invoke-virtual {v0, v10}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 239 */
v0 = this.alpha;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v9 ); // invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 240 */
v0 = this.alpha;
/* const/16 v1, 0xa2 */
(( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
/* .line 242 */
return;
/* .line 229 */
} // :cond_1
v0 = this.font;
/* const/high16 v1, 0x41c00000 # 24.0f */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 230 */
v0 = this.font2;
/* const/high16 v1, 0x41c00000 # 24.0f */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
} // .end method
private void saveChangesLogAlreadySeen ( ) {
/* .locals 7 */
/* .prologue */
/* .line 867 */
int v2 = 0; // const/4 v2, 0x0
/* .line 870 */
/* .local v2, "packageInfo":Landroid/content/pm/PackageInfo; */
try { // :try_start_0
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getContext()Landroid/content/Context;
(( android.content.Context ) v4 ).getPackageManager ( ); // invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getContext()Landroid/content/Context;
(( android.content.Context ) v5 ).getPackageName ( ); // invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* const/16 v6, 0x80 */
(( android.content.pm.PackageManager ) v4 ).getPackageInfo ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 876 */
v4 = this.versionName;
final String v5 = "1.00"; // const-string v5, "1.00"
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v4, :cond_0 */
v4 = this.versionName;
final String v5 = "1,00"; // const-string v5, "1,00"
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 886 */
} // :cond_0
} // :goto_0
return;
/* .line 871 */
/* :catch_0 */
/* move-exception v0 */
/* .line 872 */
/* .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
(( android.content.pm.PackageManager$NameNotFoundException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
/* .line 879 */
} // .end local v0 # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
} // :cond_1
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getContext()Landroid/content/Context;
final String v5 = "NuroTinyBee_Changelog"; // const-string v5, "NuroTinyBee_Changelog"
int v6 = 0; // const/4 v6, 0x0
(( android.content.Context ) v4 ).getSharedPreferences ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 880 */
/* .local v3, "settings":Landroid/content/SharedPreferences; */
/* .line 882 */
/* .local v1, "editor":Landroid/content/SharedPreferences$Editor; */
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "changelogshown_"; // const-string v5, "changelogshown_"
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v5 = this.versionName;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v5 = 1; // const/4 v5, 0x1
/* .line 884 */
} // .end method
private void showChangeLogDialog ( ) {
/* .locals 3 */
/* .prologue */
/* .line 890 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->saveChangesLogAlreadySeen()V */
/* .line 892 */
/* new-instance v0, Landroid/app/Dialog; */
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V */
/* .line 893 */
/* .local v0, "changelog":Landroid/app/Dialog; */
(( android.app.Dialog ) v0 ).setContentView ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/Dialog;->setContentView(I)V
/* .line 894 */
final String v2 = "Change Log"; // const-string v2, "Change Log"
(( android.app.Dialog ) v0 ).setTitle ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V
/* .line 895 */
(( android.app.Dialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->show()V
/* .line 898 */
int v2 = 1; // const/4 v2, 0x1
de.nurogames.android.ticb.base.views.MenuView.clogshown = (v2!= 0);
/* .line 900 */
(( android.app.Dialog ) v0 ).findViewById ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/Button; */
/* .line 901 */
/* .local v1, "close":Landroid/widget/Button; */
/* new-instance v2, Lde/nurogames/android/ticb/base/views/MenuView$3; */
/* invoke-direct {v2, p0, v0}, Lde/nurogames/android/ticb/base/views/MenuView$3;-><init>(Lde/nurogames/android/ticb/base/views/MenuView;Landroid/app/Dialog;)V */
(( android.widget.Button ) v1 ).setOnClickListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 906 */
return;
} // .end method
private void startGameEasy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 496 */
v0 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_09_PLAY_DIFFICULTY_KIDS;
int v1 = 1; // const/4 v1, 0x1
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v0,v1 );
/* .line 497 */
int v0 = 0; // const/4 v0, 0x0
/* .line 498 */
int v0 = 2; // const/4 v0, 0x2
de.nurogames.android.ticb.base.tinysanta .flipView ( v0 );
/* .line 499 */
int v0 = 0; // const/4 v0, 0x0
/* .line 500 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->doClickFX()V */
/* .line 501 */
return;
} // .end method
private void startGameEndless ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 520 */
v0 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_08_PLAY_ENDLESS_MODE;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v0,v1 );
/* .line 521 */
/* .line 522 */
/* .line 523 */
int v0 = 2; // const/4 v0, 0x2
de.nurogames.android.ticb.base.tinysanta .flipView ( v0 );
/* .line 524 */
int v0 = 0; // const/4 v0, 0x0
/* .line 525 */
return;
} // .end method
private void startGameHard ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 2; // const/4 v2, 0x2
/* .line 512 */
v0 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_11_PLAY_DIFFICULTY_HARD;
int v1 = 1; // const/4 v1, 0x1
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v0,v1 );
/* .line 513 */
/* .line 514 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v2 );
/* .line 515 */
int v0 = 0; // const/4 v0, 0x0
/* .line 516 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->doClickFX()V */
/* .line 517 */
return;
} // .end method
private void startGameMedium ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 504 */
v0 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_10_PLAY_DIFFICULTY_NORMAL;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v0,v1 );
/* .line 505 */
/* .line 506 */
int v0 = 2; // const/4 v0, 0x2
de.nurogames.android.ticb.base.tinysanta .flipView ( v0 );
/* .line 507 */
int v0 = 0; // const/4 v0, 0x0
/* .line 508 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->doClickFX()V */
/* .line 509 */
return;
} // .end method
/* # virtual methods */
public Integer getState ( ) {
/* .locals 1 */
/* .prologue */
/* .line 836 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->mMode:I */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 6 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 298 */
v0 = de.nurogames.android.ticb.base.views.MenuView.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->onDraw(Landroid/graphics/Canvas;)V
/* .line 301 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_hellowin:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* sget-boolean v0, Lde/nurogames/android/ticb/base/tinysanta;->showHellowinsDialog:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 305 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHWMessageBox;
/* .line 306 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgHWMessageBox;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* .line 307 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHWMessageBox;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v3, v3, 0x3 */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* .line 304 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v5 ); // invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 311 */
v0 = this.session_text;
/* int-to-float v1, v1 */
v2 = this.font;
v3 = this.session_text;
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHWMessageBox;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v3, v3 */
/* const v4, 0x3d4ccccd # 0.05f */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.font2;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 315 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMenuBee;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_animID:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x:F */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_y:F */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v5 ); // invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 318 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
/* if-nez v0, :cond_1 */
/* .line 319 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_SocialBox;
/* .line 320 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_SocialBox;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* .line 321 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_SocialBox;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* .line 319 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v5 ); // invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 326 */
} // :cond_1
/* sget-boolean v0, Lde/nurogames/android/ticb/base/tinysanta;->showHellowinsDialog:Z */
/* if-nez v0, :cond_2 */
/* .line 328 */
v0 = de.nurogames.android.ticb.base.views.MenuView.difficulty_chooser;
/* if-nez v0, :cond_2 */
/* .line 329 */
v0 = this.menuButtons;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 330 */
v0 = this.menuButtons;
/* const/16 v1, 0xc */
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 335 */
} // :cond_2
v0 = this.menuButtons;
int v1 = 1; // const/4 v1, 0x1
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 338 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_crosspromo_shop:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
/* if-nez v0, :cond_3 */
/* .line 339 */
v0 = this.menuButtons;
int v1 = 2; // const/4 v1, 0x2
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 342 */
} // :cond_3
v0 = this.menuButtons;
int v1 = 3; // const/4 v1, 0x3
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 345 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
/* if-lez v0, :cond_6 */
/* .line 346 */
v0 = this.menuButtons;
int v1 = 4; // const/4 v1, 0x4
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 347 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
/* const/16 v1, 0x28 */
/* if-le v0, v1, :cond_4 */
v0 = this.menuButtons;
int v1 = 5; // const/4 v1, 0x5
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 348 */
} // :cond_4
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
/* const/16 v1, 0x50 */
/* if-le v0, v1, :cond_5 */
v0 = this.menuButtons;
int v1 = 6; // const/4 v1, 0x6
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 349 */
} // :cond_5
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
/* const/16 v1, 0x78 */
/* if-le v0, v1, :cond_6 */
v0 = this.menuButtons;
int v1 = 7; // const/4 v1, 0x7
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 353 */
} // :cond_6
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_openfeint:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
/* if-nez v0, :cond_7 */
/* .line 354 */
v0 = this.menuButtons;
/* const/16 v1, 0x8 */
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 355 */
v0 = this.menuButtons;
/* const/16 v1, 0x9 */
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 356 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_pocketchange:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = this.menuButtons;
/* const/16 v1, 0xa */
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 360 */
} // :cond_7
/* if-nez v0, :cond_8 */
/* .line 361 */
v0 = this.menuButtons;
/* const/16 v1, 0xb */
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 364 */
} // :cond_8
/* if-lt v0, v1, :cond_9 */
/* .line 365 */
v0 = this.menuButtons;
/* const/16 v1, 0xd */
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 368 */
} // :cond_9
v0 = de.nurogames.android.ticb.base.views.MenuView.difficulty_chooser;
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 369 */
v0 = de.nurogames.android.ticb.base.views.MenuView.difficulty_chooser;
(( de.nurogames.android.ticb.base.objects.objDifficultyChooser ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objDifficultyChooser;->onDraw(Landroid/graphics/Canvas;)V
/* .line 371 */
} // :cond_a
return;
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 6 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .param p2, "arg1" # Landroid/view/MotionEvent; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* .line 603 */
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v1, :cond_9 */
/* .line 604 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/MenuView;->moved:Z */
/* .line 607 */
v1 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
/* .line 608 */
v1 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
/* .line 610 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/tinysanta;->showHellowinsDialog:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 614 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHWMessageBox;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_1 */
/* .line 615 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
/* .line 617 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_1 */
/* .line 618 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHWMessageBox;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
/* .line 621 */
de.nurogames.android.ticb.base.tinysanta.showHellowinsDialog = (v4!= 0);
/* .line 622 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->startGameEndless()V */
/* .line 752 */
} // :cond_0
} // :goto_0
/* .line 627 */
} // :cond_1
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_2 */
/* .line 628 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHWMessageBox;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_2 */
/* .line 630 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_2 */
/* .line 631 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHWMessageBox;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_2 */
/* .line 634 */
de.nurogames.android.ticb.base.tinysanta.showHellowinsDialog = (v4!= 0);
/* .line 635 */
de.hellowins.Hellowins .getInstance ( );
v2 = de.nurogames.android.ticb.base.tinysanta.sTinyBee;
/* .line 636 */
v1 = de.nurogames.android.ticb.base.tinysanta.sTinyBee;
(( android.app.Activity ) v1 ).finish ( ); // invoke-virtual {v1}, Landroid/app/Activity;->finish()V
/* .line 643 */
} // :cond_2
/* sget-boolean v1, Lde/nurogames/android/ticb/base/tinysanta;->showHellowinsDialog:Z */
/* if-nez v1, :cond_0 */
/* .line 644 */
v1 = de.nurogames.android.ticb.base.views.MenuView.difficulty_chooser;
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 648 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.easy;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_3 */
/* .line 649 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.easy;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.easy;
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_3 */
/* .line 651 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.easy;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_3 */
/* .line 652 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.easy;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.easy;
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_3 */
/* .line 655 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->startGameEasy()V */
/* .line 660 */
} // :cond_3
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.normal;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_4 */
/* .line 661 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.normal;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.normal;
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_4 */
/* .line 663 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.normal;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_4 */
/* .line 664 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.normal;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.normal;
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_4 */
/* .line 667 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->startGameMedium()V */
/* .line 672 */
} // :cond_4
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.hard;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_5 */
/* .line 673 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.hard;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.hard;
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_5 */
/* .line 675 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.hard;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_5 */
/* .line 676 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.hard;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.hard;
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_5 */
/* .line 679 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->startGameHard()V */
/* .line 684 */
} // :cond_5
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.cancel;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_0 */
/* .line 685 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.cancel;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.cancel;
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_0 */
/* .line 687 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.cancel;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_0 */
/* .line 688 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.cancel;
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = de.nurogames.android.ticb.base.objects.objDifficultyChooser.cancel;
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_0 */
/* .line 691 */
int v1 = 0; // const/4 v1, 0x0
/* .line 692 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->doClickFX()V */
/* goto/16 :goto_0 */
/* .line 701 */
} // :cond_6
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x:F */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_7 */
/* .line 702 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x:F */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuBee;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_animID:I */
/* aget-object v3, v3, v4 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_7 */
/* .line 704 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_y:F */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_7 */
/* .line 705 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_y:F */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuBee;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_animID:I */
/* aget-object v3, v3, v4 */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_7 */
/* .line 708 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v1 );
/* .line 709 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgMenuBee;
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_animID:I */
/* aget-object v2, v2, v3 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x:F */
/* .line 710 */
/* const/16 v1, 0x140 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->animationTimer:I */
/* .line 714 */
} // :cond_7
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "x":I */
} // :goto_1
v1 = this.menuButtons;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_0 */
/* .line 718 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = this.menuButtons;
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_8 */
/* .line 719 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
v2 = this.menuButtons;
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).X ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v3 = this.menuButtons;
/* aget-object v3, v3, v0 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Width ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_8 */
/* .line 721 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = this.menuButtons;
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v2, v2 */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_8 */
/* .line 722 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
v2 = this.menuButtons;
/* aget-object v2, v2, v0 */
v2 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v2 ).Y ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v3 = this.menuButtons;
/* aget-object v3, v3, v0 */
v3 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).Height ( ); // invoke-virtual {v3}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_8 */
/* .line 724 */
v1 = this.menuButtons;
/* aget-object v1, v1, v0 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( v5 ); // invoke-virtual {v1, v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 714 */
} // :cond_8
/* add-int/lit8 v0, v0, 0x1 */
/* .line 734 */
} // .end local v0 # "x":I
} // :cond_9
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne v1, v5, :cond_b */
/* .line 735 */
int v0 = 0; // const/4 v0, 0x0
/* .restart local v0 # "x":I */
} // :goto_2
v1 = this.menuButtons;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_0 */
/* .line 736 */
v1 = this.menuButtons;
/* aget-object v1, v1, v0 */
v1 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked()Z
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 737 */
v1 = this.menuButtons;
/* aget-object v1, v1, v0 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).isClicked ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 738 */
/* invoke-direct {p0, v0}, Lde/nurogames/android/ticb/base/views/MenuView;->executeMenuAction(I)V */
/* .line 735 */
} // :cond_a
/* add-int/lit8 v0, v0, 0x1 */
/* .line 746 */
} // .end local v0 # "x":I
} // :cond_b
v1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_0 */
/* .line 747 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/views/MenuView;->moved:Z */
/* .line 748 */
v1 = (( android.view.MotionEvent ) p2 ).getRawX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchX:F */
/* .line 749 */
v1 = (( android.view.MotionEvent ) p2 ).getRawY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->lastTouchY:F */
/* goto/16 :goto_0 */
} // .end method
public void setState ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "state" # I */
/* .prologue */
/* .line 794 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->mMode:I */
/* .line 795 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_4 */
/* .line 797 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_chartboost:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = de.nurogames.android.ticb.base.tinysanta.chartboost;
(( de.nurogames.android.ticb.base.CBMngr ) v0 ).getDelegate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/CBMngr;->getDelegate()Lcom/chartboost/sdk/ChartBoostDelegate;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 798 */
v0 = de.nurogames.android.ticb.base.tinysanta.chartboost;
int v1 = 0; // const/4 v1, 0x0
(( de.nurogames.android.ticb.base.CBMngr ) v0 ).setDelegate ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/CBMngr;->setDelegate(Lcom/chartboost/sdk/ChartBoostDelegate;)V
/* .line 799 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core.AppResources.chartboost_ad_shown = (v0!= 0);
/* .line 802 */
} // :cond_0
/* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v2, -0x3f200000 # -7.0f */
/* invoke-direct {v0, v1, v2}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* .line 805 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->initView()V */
/* .line 808 */
de.nurogames.android.ticb.base.core.AppResources .startMenuMusic ( );
/* .line 811 */
de.nurogames.android.ticb.base.core.AppResources .clearSplashScreensForMemory ( );
/* .line 814 */
de.nurogames.android.ticb.base.core.AppResources .loadGameTerrainTextures ( );
/* .line 817 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_crosspromo_shop:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
/* if-nez v0, :cond_1 */
v0 = de.nurogames.android.ticb.base.tinysanta.shopMngr;
(( de.nurogames.android.ticb.base.core.ShopMngr ) v0 ).getBrandNew ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/ShopMngr;->getBrandNew()V
/* .line 820 */
} // :cond_1
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->TELEKOM_BUILD:Z */
/* if-nez v0, :cond_2 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->getChangesLogAlreadySeen()V */
/* .line 823 */
} // :cond_2
/* sget-boolean v0, Lde/nurogames/android/ticb/base/views/MenuView;->clogshown:Z */
/* if-nez v0, :cond_3 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->showChangeLogDialog()V */
/* .line 825 */
} // :cond_3
java.lang.System .gc ( );
/* .line 828 */
(( de.nurogames.android.ticb.base.views.MenuView ) p0 ).update ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/MenuView;->update()V
/* .line 833 */
} // :cond_4
return;
} // .end method
public void update ( ) {
/* .locals 15 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* const/high16 v14, 0x40000000 # 2.0f */
/* const v13, 0x3dcccccd # 0.1f */
int v12 = 0; // const/4 v12, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 533 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->mMode:I */
/* if-ne v2, v0, :cond_4 */
/* .line 536 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->runtime:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->runtime:I */
/* .line 539 */
v2 = de.nurogames.android.ticb.base.views.MenuView.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v2 ).animate ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->animate()V
/* .line 542 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->showOptionsMenu:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 543 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
/* const/16 v3, 0xa0 */
/* if-ge v2, v3, :cond_1 */
/* .line 544 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
/* rem-int/lit8 v2, v2, 0x28 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->chkval:I */
/* .line 545 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->chkval:I */
/* if-nez v2, :cond_0 */
v2 = de.nurogames.android.ticb.base.core.AppResources.SND_HONEY;
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/MenuView;->chkval:I */
/* aget v2, v2, v3 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v2 );
/* .line 546 */
} // :cond_0
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
/* add-int/lit8 v2, v2, 0x4 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
/* .line 552 */
} // :cond_1
} // :goto_0
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_animID:I */
/* if-nez v2, :cond_6 */
} // :goto_1
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_animID:I */
/* .line 555 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->CURVE_OFFSET:I */
/* int-to-double v2, v0 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->CURVE_AMP:I */
/* int-to-double v4, v0 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->PHASE_SHIFT:I */
/* int-to-double v6, v0 */
/* iget-wide v8, p0, Lde/nurogames/android/ticb/base/views/MenuView;->twoPI:D */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->runtime:I */
/* int-to-double v10, v0 */
/* mul-double/2addr v8, v10 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->WAVE_LENGHT:I */
/* int-to-double v10, v0 */
/* div-double/2addr v8, v10 */
/* add-double/2addr v6, v8 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v4, v6 */
/* add-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_y:F */
/* .line 558 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->animationTimer:I */
/* if-lez v0, :cond_8 */
/* .line 560 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
/* cmpl-float v0, v0, v12 */
/* if-ltz v0, :cond_7 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_vel_x:F */
/* add-float/2addr v0, v13 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_vel_x:F */
/* .line 563 */
} // :goto_2
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_vel_x:F */
/* add-float/2addr v0, v2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
/* .line 565 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
/* int-to-float v2, v2 */
/* cmpl-float v0, v0, v2 */
/* if-lez v0, :cond_2 */
/* .line 566 */
/* neg-int v0, v0 */
/* int-to-float v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
/* .line 568 */
} // :cond_2
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_vel_x:F */
/* cmpg-float v0, v0, v14 */
/* if-gez v0, :cond_3 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
/* cmpl-float v0, v0, v12 */
/* if-ltz v0, :cond_3 */
/* .line 569 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->runtime:I */
/* .line 570 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->animationTimer:I */
/* .line 572 */
} // :cond_3
v1 = de.nurogames.android.ticb.base.core.AppResources.imgMenuBee;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_animID:I */
/* aget-object v1, v1, v2 */
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v1, v1, 0x2 */
/* sub-int/2addr v0, v1 */
/* int-to-float v0, v0 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x:F */
/* .line 574 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->animationTimer:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->animationTimer:I */
/* .line 583 */
} // :goto_3
v0 = this.mRedrawHandler;
/* const-wide/16 v1, 0x19 */
(( de.nurogames.android.ticb.base.views.MenuView$RefreshHandler ) v0 ).sleep ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/nurogames/android/ticb/base/views/MenuView$RefreshHandler;->sleep(J)V
/* .line 586 */
} // :cond_4
return;
/* .line 549 */
} // :cond_5
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/MenuView;->pop_delay:I */
} // :cond_6
/* move v0, v1 */
/* .line 552 */
/* .line 561 */
} // :cond_7
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_vel_x:F */
/* sub-float/2addr v0, v13 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_vel_x:F */
/* .line 577 */
} // :cond_8
v1 = de.nurogames.android.ticb.base.core.AppResources.imgMenuBee;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_animID:I */
/* aget-object v1, v1, v2 */
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v1, v1, 0x2 */
/* sub-int/2addr v0, v1 */
/* int-to-float v0, v0 */
/* const/high16 v1, 0x41f80000 # 31.0f */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_y:F */
/* sub-float/2addr v1, v2 */
/* const/high16 v2, 0x40200000 # 2.5f */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x:F */
/* .line 578 */
/* iput v14, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_vel_x:F */
/* .line 579 */
/* iput v12, p0, Lde/nurogames/android/ticb/base/views/MenuView;->bee_x_offset:F */
} // .end method
