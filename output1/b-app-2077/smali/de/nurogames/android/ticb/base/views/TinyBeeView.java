public class de.nurogames.android.ticb.base.views.TinyBeeView extends de.nurogames.android.ticb.base.views.ViewPlus implements android.view.View$OnTouchListener {
	 /* .source "TinyBeeView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/views/TinyBeeView$RefreshHandler; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer GAME_OVER;
public static Boolean GAME_PAUSED;
private static final Integer GAME_RUNNING;
private static de.nurogames.android.ticb.base.objects.objAnimBackground background;
private static Integer check;
static java.util.Map checkmap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static Integer gameState;
private static android.graphics.Typeface gf;
private static Integer list_top;
private static android.graphics.Paint mMediumGrayPaint;
private static android.graphics.Paint mMediumWhitePaint;
private static android.graphics.Paint mPaint;
private static de.nurogames.android.ticb.base.objects.objPauseOverlay pause_overlay;
public static de.nurogames.android.ticb.base.objects.objBee player;
private static Integer post_check;
private static de.nurogames.android.ticb.base.objects.objLevelProgressBar progress;
public static Boolean r1;
public static Boolean r2;
public static Boolean r3;
private static Integer screen_darkening_max;
private static Integer screen_darkening_steps;
private static de.nurogames.android.ticb.base.core.Vector3D startVelocity;
public static Integer taskFinishTimer;
public static de.nurogames.android.ticb.base.objects.objTerrainMap terrain;
private static android.graphics.Typeface tf;
public static Float tinybee_pos_x;
private static Integer water_max;
private static Integer water_min;
/* # instance fields */
private Integer FONT_LARGE;
private Integer FONT_MEDIUM;
private Integer FONT_SMALL;
java.lang.Thread animatePollem;
java.lang.Thread camThread;
private Integer cam_player_space;
private Boolean counter_is_shown;
private Boolean counter_started;
Long drawingTime;
private Integer fade_out_alpha;
private java.lang.String game_complete_text;
private java.lang.String gameover_level_reached;
Boolean isPreGameState;
Integer level;
private Integer list_spacing;
private list_x;
private Integer mMode;
private de.nurogames.android.ticb.base.views.TinyBeeView$RefreshHandler mRedrawHandler;
de.nurogames.android.ticb.base.objects.objCam m_objCam;
private de.nurogames.android.ticb.base.objects.objMenuButton menuButtons;
private Integer nScore;
private Float player_start_velocity_x;
private Float player_start_velocity_y;
private de.nurogames.android.ticb.base.objects.objPopUpDialog popUp_AskExit;
private Integer runtime;
private Integer score_x;
private Integer score_y;
private java.text.DecimalFormat secsformat;
private Boolean show_exit_dialog;
private Boolean show_newgame_dialog;
private de.nurogames.android.ticb.base.objects.objGameStartCounter startCounter;
private java.lang.String task_info;
private Float task_info_width;
private Integer taskinfobar_x;
java.lang.Thread timerAndPlayerThread;
java.lang.Thread updateThread;
Float zoomfactor;
/* # direct methods */
static de.nurogames.android.ticb.base.views.TinyBeeView ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 103 */
/* .line 107 */
/* .line 108 */
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v0!= 0);
/* .line 109 */
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v0!= 0);
/* .line 110 */
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v0!= 0);
/* .line 125 */
/* const/16 v0, 0x8e */
/* .line 126 */
int v0 = 4; // const/4 v0, 0x4
/* .line 131 */
/* const/16 v0, 0x4650 */
/* .line 132 */
/* const/16 v0, 0x55f0 */
/* .line 140 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
/* .line 141 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
/* .line 142 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
/* .line 144 */
int v0 = 0; // const/4 v0, 0x0
/* .line 583 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public de.nurogames.android.ticb.base.views.TinyBeeView ( ) {
/* .locals 5 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "attrs" # Landroid/util/AttributeSet; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 159 */
/* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/ViewPlus;-><init>(Landroid/content/Context;)V */
/* .line 50 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->mMode:I */
/* .line 53 */
/* new-instance v0, Lde/nurogames/android/ticb/base/views/TinyBeeView$RefreshHandler; */
/* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView$RefreshHandler;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;)V */
this.mRedrawHandler = v0;
/* .line 56 */
/* new-instance v0, Ljava/text/DecimalFormat; */
final String v1 = "##0.00"; // const-string v1, "##0.00"
/* invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
this.secsformat = v0;
/* .line 60 */
/* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
/* .line 61 */
/* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_newgame_dialog:Z */
/* .line 64 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [Lde/nurogames/android/ticb/base/objects/objMenuButton; */
this.menuButtons = v0;
/* .line 68 */
/* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_started:Z */
/* .line 69 */
/* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_is_shown:Z */
/* .line 97 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
/* .line 99 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->runtime:I */
/* .line 104 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* .line 112 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->cam_player_space:I */
/* .line 117 */
/* iput v4, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->player_start_velocity_x:F */
/* .line 118 */
/* iput v4, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->player_start_velocity_y:F */
/* .line 120 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_LARGE:I */
/* .line 121 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* .line 122 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_SMALL:I */
/* .line 124 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* .line 134 */
final String v0 = ""; // const-string v0, ""
this.gameover_level_reached = v0;
/* .line 137 */
/* new-array v0, v3, [Ljava/lang/String; */
final String v1 = ""; // const-string v1, ""
/* aput-object v1, v0, v2 */
this.game_complete_text = v0;
/* .line 342 */
/* new-instance v0, Lde/nurogames/android/ticb/base/views/TinyBeeView$1; */
final String v1 = "timerAndPlayerThread"; // const-string v1, "timerAndPlayerThread"
/* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/views/TinyBeeView$1;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;Ljava/lang/String;)V */
this.timerAndPlayerThread = v0;
/* .line 352 */
/* new-instance v0, Lde/nurogames/android/ticb/base/views/TinyBeeView$2; */
final String v1 = "cameraThread"; // const-string v1, "cameraThread"
/* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/views/TinyBeeView$2;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;Ljava/lang/String;)V */
this.camThread = v0;
/* .line 358 */
/* new-instance v0, Lde/nurogames/android/ticb/base/views/TinyBeeView$3; */
final String v1 = "terrainPollemThread"; // const-string v1, "terrainPollemThread"
/* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/views/TinyBeeView$3;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;Ljava/lang/String;)V */
this.animatePollem = v0;
/* .line 1532 */
/* new-instance v0, Lde/nurogames/android/ticb/base/views/TinyBeeView$4; */
final String v1 = "update_main_thread"; // const-string v1, "update_main_thread"
/* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/views/TinyBeeView$4;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;Ljava/lang/String;)V */
this.updateThread = v0;
/* .line 163 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).setFocusableInTouchMode ( v3 ); // invoke-virtual {p0, v3}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->setFocusableInTouchMode(Z)V
/* .line 164 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).setKeepScreenOn ( v3 ); // invoke-virtual {p0, v3}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->setKeepScreenOn(Z)V
/* .line 165 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).setOnTouchListener ( p0 ); // invoke-virtual {p0, p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
/* .line 166 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).setDrawingCacheEnabled ( v2 ); // invoke-virtual {p0, v2}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->setDrawingCacheEnabled(Z)V
/* .line 167 */
/* const/high16 v0, 0x80000 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).setDrawingCacheQuality ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->setDrawingCacheQuality(I)V
/* .line 169 */
/* const/16 v1, 0xb */
/* if-lt v0, v1, :cond_0 */
/* .line 170 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).setActivated ( v3 ); // invoke-virtual {p0, v3}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->setActivated(Z)V
/* .line 173 */
} // :cond_0
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_1 */
/* .line 174 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).setImportantForAccessibility ( v3 ); // invoke-virtual {p0, v3}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->setImportantForAccessibility(I)V
/* .line 178 */
} // :cond_1
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->setupGame()V */
/* .line 180 */
return;
} // .end method
static void access$0 ( de.nurogames.android.ticb.base.views.TinyBeeView p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 544 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doTimers()V */
return;
} // .end method
static Integer access$1 ( de.nurogames.android.ticb.base.views.TinyBeeView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 112 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->cam_player_space:I */
} // .end method
static void access$2 ( de.nurogames.android.ticb.base.views.TinyBeeView p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1491 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->showAdBannerEndExitToMenu()V */
return;
} // .end method
private void checkScoreForNewRecord ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
/* .line 939 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
v1 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
v1 = (( de.nurogames.android.ticb.base.core.DataManager ) v1 ).BestScore ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/DataManager;->BestScore(I)I
/* if-le v0, v1, :cond_0 */
/* .line 941 */
v0 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v0 ).isRekord ( v4 ); // invoke-virtual {v0, v4}, Lde/nurogames/android/ticb/base/core/DataManager;->isRekord(Z)V
/* .line 943 */
/* if-nez v0, :cond_1 */
/* .line 944 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v0, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->level:I */
/* .line 949 */
} // :goto_0
v0 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
/* .line 950 */
/* const/16 v1, 0xa */
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
/* .line 951 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
/* aput v3, v1, v2 */
/* .line 952 */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v3, 0x41200000 # 10.0f */
/* div-float/2addr v2, v3 */
/* float-to-int v2, v2 */
/* aput v2, v1, v4 */
int v2 = 2; // const/4 v2, 0x2
/* .line 953 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objBee;->topSpeed:F */
/* float-to-int v3, v3 */
/* aput v3, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
/* .line 954 */
/* aput v3, v1, v2 */
int v2 = 4; // const/4 v2, 0x4
/* .line 955 */
/* aput v3, v1, v2 */
int v2 = 5; // const/4 v2, 0x5
/* .line 956 */
/* aput v3, v1, v2 */
int v2 = 6; // const/4 v2, 0x6
/* .line 957 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* aput v3, v1, v2 */
int v2 = 7; // const/4 v2, 0x7
/* .line 958 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
/* aput v3, v1, v2 */
/* const/16 v2, 0x8 */
/* .line 959 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
/* aput v3, v1, v2 */
/* const/16 v2, 0x9 */
/* .line 960 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->level:I */
/* aput v3, v1, v2 */
/* .line 949 */
(( de.nurogames.android.ticb.base.core.DataManager ) v0 ).Scores ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/nurogames/android/ticb/base/core/DataManager;->Scores([II)V
/* .line 963 */
v0 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v0 ).saveHighscores ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/core/DataManager;->saveHighscores(I)V
/* .line 977 */
} // :cond_0
return;
/* .line 946 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v0, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->level:I */
} // .end method
public static checkTaskRequirements ( ) {
/* .locals 8 */
/* .prologue */
/* const/16 v6, 0x8 */
/* const/16 v5, 0x14 */
int v7 = 2; // const/4 v7, 0x2
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* .line 587 */
/* .line 588 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r1:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 589 */
} // :cond_0
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r2:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 590 */
} // :cond_1
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r3:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 593 */
} // :cond_2
/* if-nez v1, :cond_d */
/* .line 594 */
/* if-nez v1, :cond_c */
/* .line 595 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* int-to-float v4, v4 */
/* cmpl-float v1, v1, v4 */
/* if-lez v1, :cond_9 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* int-to-float v4, v4 */
/* cmpg-float v1, v1, v4 */
/* if-gez v1, :cond_9 */
/* move v1, v2 */
} // :goto_0
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 596 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* if-ge v1, v7, :cond_a */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* if-lt v1, v6, :cond_a */
/* move v1, v2 */
} // :goto_1
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 597 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* if-ge v1, v7, :cond_b */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v3 ); // invoke-virtual {v1, v3}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_b
/* move v1, v2 */
} // :goto_2
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* .line 692 */
} // :cond_3
} // :goto_3
/* .line 693 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r1:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
/* add-int/lit8 v1, v1, 0x1 */
/* .line 694 */
} // :cond_4
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r2:Z */
if ( v1 != null) { // if-eqz v1, :cond_5
/* add-int/lit8 v1, v1, 0x1 */
/* .line 695 */
} // :cond_5
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r3:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
/* add-int/lit8 v1, v1, 0x1 */
/* .line 698 */
} // :cond_6
/* if-eq v1, v4, :cond_7 */
/* .line 699 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v1 );
/* .line 701 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.checkmap;
/* .line 702 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.checkmap;
final String v4 = "task#"; // const-string v4, "task#"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 703 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.checkmap;
final String v4 = "subtask#"; // const-string v4, "subtask#"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* sget-boolean v6, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r1:Z */
java.lang.String .valueOf ( v6 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = ","; // const-string v6, ","
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* sget-boolean v6, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r2:Z */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v6 = ","; // const-string v6, ","
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* sget-boolean v6, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r3:Z */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 704 */
v1 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_14_FINISHED_SUBTASK;
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.checkmap;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v1,v4,v2 );
/* .line 708 */
} // :cond_7
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r1:Z */
if ( v1 != null) { // if-eqz v1, :cond_8
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r2:Z */
if ( v1 != null) { // if-eqz v1, :cond_8
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r3:Z */
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 709 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 710 */
/* .line 712 */
/* const/16 v1, 0x78 */
/* .line 713 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v1 );
/* .line 714 */
v1 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v1 ).saveTaskOnly ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/core/DataManager;->saveTaskOnly(I)V
/* .line 716 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 717 */
/* .local v0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v1 = "task#"; // const-string v1, "task#"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 718 */
v1 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_13_FINISHED_TASKS;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v1,v0,v2 );
/* .line 722 */
} // :cond_8
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [Z */
/* sget-boolean v4, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r1:Z */
/* aput-boolean v4, v1, v3 */
/* sget-boolean v3, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r2:Z */
/* aput-boolean v3, v1, v2 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/views/TinyBeeView;->r3:Z */
/* aput-boolean v2, v1, v7 */
} // .end local v0 # "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
} // :cond_9
/* move v1, v3 */
/* .line 595 */
/* goto/16 :goto_0 */
} // :cond_a
/* move v1, v3 */
/* .line 596 */
/* goto/16 :goto_1 */
} // :cond_b
/* move v1, v3 */
/* .line 597 */
/* goto/16 :goto_2 */
/* .line 600 */
} // :cond_c
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v3!= 0);
/* .line 601 */
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v3!= 0);
/* .line 602 */
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v3!= 0);
/* goto/16 :goto_3 */
/* .line 606 */
} // :cond_d
/* if-ne v1, v2, :cond_3 */
/* .line 608 */
/* if-nez v1, :cond_11 */
/* .line 609 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* int-to-float v4, v4 */
/* cmpl-float v1, v1, v4 */
/* if-lez v1, :cond_e */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* int-to-float v4, v4 */
/* cmpg-float v1, v1, v4 */
/* if-gez v1, :cond_e */
/* move v1, v2 */
} // :goto_4
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 610 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* if-ge v1, v7, :cond_f */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* if-lt v1, v6, :cond_f */
/* move v1, v2 */
} // :goto_5
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 611 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* if-ge v1, v7, :cond_10 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v3 ); // invoke-virtual {v1, v3}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_10
/* move v1, v2 */
} // :goto_6
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_e
/* move v1, v3 */
/* .line 609 */
} // :cond_f
/* move v1, v3 */
/* .line 610 */
} // :cond_10
/* move v1, v3 */
/* .line 611 */
/* .line 613 */
} // :cond_11
/* if-ne v1, v2, :cond_15 */
/* .line 614 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* if-lt v1, v7, :cond_12 */
/* move v1, v2 */
} // :goto_7
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 615 */
/* const/16 v4, 0x96 */
/* if-lt v1, v4, :cond_13 */
/* move v1, v2 */
} // :goto_8
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 616 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* const/16 v4, 0xf */
/* if-lt v1, v4, :cond_14 */
/* move v1, v2 */
} // :goto_9
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_12
/* move v1, v3 */
/* .line 614 */
} // :cond_13
/* move v1, v3 */
/* .line 615 */
} // :cond_14
/* move v1, v3 */
/* .line 616 */
/* .line 618 */
} // :cond_15
/* if-ne v1, v7, :cond_18 */
/* .line 619 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
int v4 = 3; // const/4 v4, 0x3
/* if-lt v1, v4, :cond_16 */
/* move v1, v2 */
} // :goto_a
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 620 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 621 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* const/16 v4, 0x19 */
/* if-lt v1, v4, :cond_17 */
/* move v1, v2 */
} // :goto_b
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_16
/* move v1, v3 */
/* .line 619 */
} // :cond_17
/* move v1, v3 */
/* .line 621 */
/* .line 623 */
} // :cond_18
int v4 = 3; // const/4 v4, 0x3
/* if-ne v1, v4, :cond_1c */
/* .line 624 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
int v4 = 4; // const/4 v4, 0x4
/* if-lt v1, v4, :cond_19 */
/* move v1, v2 */
} // :goto_c
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 625 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
/* int-to-float v1, v1 */
/* const v4, 0x42d73334 # 107.600006f */
/* cmpl-float v1, v1, v4 */
/* if-ltz v1, :cond_1a */
/* move v1, v2 */
} // :goto_d
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 626 */
/* const/16 v4, 0xc8 */
/* if-lt v1, v4, :cond_1b */
/* const/16 v4, 0xa */
/* if-lt v1, v4, :cond_1b */
/* move v1, v2 */
} // :goto_e
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_19
/* move v1, v3 */
/* .line 624 */
} // :cond_1a
/* move v1, v3 */
/* .line 625 */
} // :cond_1b
/* move v1, v3 */
/* .line 626 */
/* .line 628 */
} // :cond_1c
int v4 = 4; // const/4 v4, 0x4
/* if-ne v1, v4, :cond_20 */
/* .line 629 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
int v4 = 6; // const/4 v4, 0x6
/* if-lt v1, v4, :cond_1d */
/* move v1, v2 */
} // :goto_f
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 630 */
/* const/16 v4, 0xfa */
/* if-lt v1, v4, :cond_1e */
/* const/16 v4, 0xf */
/* if-lt v1, v4, :cond_1e */
/* move v1, v2 */
} // :goto_10
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 631 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* const/16 v4, 0x1e */
/* if-lt v1, v4, :cond_1f */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
/* if-gt v1, v6, :cond_1f */
/* move v1, v2 */
} // :goto_11
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_1d
/* move v1, v3 */
/* .line 629 */
} // :cond_1e
/* move v1, v3 */
/* .line 630 */
} // :cond_1f
/* move v1, v3 */
/* .line 631 */
/* .line 633 */
} // :cond_20
int v4 = 5; // const/4 v4, 0x5
/* if-ne v1, v4, :cond_24 */
/* .line 634 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
int v4 = 5; // const/4 v4, 0x5
/* if-lt v1, v4, :cond_21 */
/* move v1, v2 */
} // :goto_12
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 635 */
/* const/16 v4, 0x190 */
/* if-lt v1, v4, :cond_22 */
/* move v1, v2 */
} // :goto_13
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 636 */
/* const/16 v4, 0xa */
/* if-lt v1, v4, :cond_23 */
/* move v1, v2 */
} // :goto_14
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_21
/* move v1, v3 */
/* .line 634 */
} // :cond_22
/* move v1, v3 */
/* .line 635 */
} // :cond_23
/* move v1, v3 */
/* .line 636 */
/* .line 638 */
} // :cond_24
int v4 = 6; // const/4 v4, 0x6
/* if-ne v1, v4, :cond_28 */
/* .line 639 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v3 ); // invoke-virtual {v1, v3}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_25
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_25
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v7 ); // invoke-virtual {v1, v7}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_25
/* move v1, v2 */
} // :goto_15
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 640 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* const/16 v4, 0x28 */
/* if-lt v1, v4, :cond_26 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
/* const/16 v4, 0xc */
/* if-gt v1, v4, :cond_26 */
/* move v1, v2 */
} // :goto_16
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 641 */
/* const/16 v4, 0x15e */
/* if-lt v1, v4, :cond_27 */
/* const/16 v4, 0xc */
/* if-lt v1, v4, :cond_27 */
/* move v1, v2 */
} // :goto_17
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_25
/* move v1, v3 */
/* .line 639 */
} // :cond_26
/* move v1, v3 */
/* .line 640 */
} // :cond_27
/* move v1, v3 */
/* .line 641 */
/* .line 643 */
} // :cond_28
int v4 = 7; // const/4 v4, 0x7
/* if-ne v1, v4, :cond_2c */
/* .line 644 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
/* int-to-float v1, v1 */
/* const v4, 0x42ef3333 # 119.6f */
/* cmpl-float v1, v1, v4 */
/* if-ltz v1, :cond_29 */
/* move v1, v2 */
} // :goto_18
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 645 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetMax:I */
/* const/16 v4, 0xf */
/* if-lt v1, v4, :cond_2a */
/* move v1, v2 */
} // :goto_19
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 646 */
/* const/16 v4, 0xf */
/* if-lt v1, v4, :cond_2b */
/* move v1, v2 */
} // :goto_1a
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_29
/* move v1, v3 */
/* .line 644 */
} // :cond_2a
/* move v1, v3 */
/* .line 645 */
} // :cond_2b
/* move v1, v3 */
/* .line 646 */
/* .line 648 */
} // :cond_2c
/* if-ne v1, v6, :cond_30 */
/* .line 649 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
int v4 = 7; // const/4 v4, 0x7
/* if-lt v1, v4, :cond_2d */
/* move v1, v2 */
} // :goto_1b
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 650 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_2e
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
int v4 = 5; // const/4 v4, 0x5
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_2e
/* move v1, v2 */
} // :goto_1c
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 651 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* const/16 v4, 0x50 */
/* if-lt v1, v4, :cond_2f */
/* move v1, v2 */
} // :goto_1d
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_2d
/* move v1, v3 */
/* .line 649 */
} // :cond_2e
/* move v1, v3 */
/* .line 650 */
} // :cond_2f
/* move v1, v3 */
/* .line 651 */
/* .line 653 */
} // :cond_30
/* const/16 v4, 0x9 */
/* if-ne v1, v4, :cond_34 */
/* .line 654 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v3 ); // invoke-virtual {v1, v3}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_31
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_31
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v7 ); // invoke-virtual {v1, v7}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_31
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
int v4 = 3; // const/4 v4, 0x3
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_31
/* move v1, v2 */
} // :goto_1e
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 655 */
/* if-lt v1, v5, :cond_32 */
/* move v1, v2 */
} // :goto_1f
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 656 */
/* if-lt v1, v5, :cond_33 */
/* move v1, v2 */
} // :goto_20
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_31
/* move v1, v3 */
/* .line 654 */
} // :cond_32
/* move v1, v3 */
/* .line 655 */
} // :cond_33
/* move v1, v3 */
/* .line 656 */
/* .line 658 */
} // :cond_34
/* const/16 v4, 0xa */
/* if-ne v1, v4, :cond_38 */
/* .line 659 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* const/16 v4, 0xc */
/* if-lt v1, v4, :cond_35 */
/* move v1, v2 */
} // :goto_21
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 660 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetMax:I */
/* if-lt v1, v5, :cond_36 */
/* move v1, v2 */
} // :goto_22
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 661 */
/* const/16 v4, 0x1f4 */
/* if-lt v1, v4, :cond_37 */
/* move v1, v2 */
} // :goto_23
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_35
/* move v1, v3 */
/* .line 659 */
} // :cond_36
/* move v1, v3 */
/* .line 660 */
} // :cond_37
/* move v1, v3 */
/* .line 661 */
/* .line 663 */
} // :cond_38
/* const/16 v4, 0xb */
/* if-ne v1, v4, :cond_3c */
/* .line 664 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* const/16 v4, 0x32 */
/* if-lt v1, v4, :cond_39 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
/* if-gt v1, v5, :cond_39 */
/* move v1, v2 */
} // :goto_24
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 665 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
/* int-to-float v1, v1 */
/* const v4, 0x40528f5c # 3.29f */
/* cmpl-float v1, v1, v4 */
/* if-ltz v1, :cond_3a */
/* move v1, v2 */
} // :goto_25
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 666 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* const/16 v4, 0x9 */
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_3b
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* const/16 v4, 0xe */
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_3b
/* move v1, v2 */
} // :goto_26
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_39
/* move v1, v3 */
/* .line 664 */
} // :cond_3a
/* move v1, v3 */
/* .line 665 */
} // :cond_3b
/* move v1, v3 */
/* .line 666 */
/* .line 668 */
} // :cond_3c
/* const/16 v4, 0xc */
/* if-ne v1, v4, :cond_40 */
/* .line 669 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* const/16 v4, 0x10 */
/* if-lt v1, v4, :cond_3d */
/* move v1, v2 */
} // :goto_27
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 670 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetMax:I */
/* const/16 v4, 0x19 */
/* if-lt v1, v4, :cond_3e */
/* move v1, v2 */
} // :goto_28
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 671 */
/* const/16 v4, 0x19 */
/* if-lt v1, v4, :cond_3f */
/* move v1, v2 */
} // :goto_29
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_3d
/* move v1, v3 */
/* .line 669 */
} // :cond_3e
/* move v1, v3 */
/* .line 670 */
} // :cond_3f
/* move v1, v3 */
/* .line 671 */
/* .line 673 */
} // :cond_40
/* const/16 v4, 0xd */
/* if-ne v1, v4, :cond_43 */
/* .line 674 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/tinysanta;->device_is_upside_down:Z */
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 675 */
/* if-lt v1, v5, :cond_41 */
/* move v1, v2 */
} // :goto_2a
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 676 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* const/16 v4, 0x3c */
/* if-lt v1, v4, :cond_42 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
/* if-gt v1, v5, :cond_42 */
/* move v1, v2 */
} // :goto_2b
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_41
/* move v1, v3 */
/* .line 675 */
} // :cond_42
/* move v1, v3 */
/* .line 676 */
/* .line 678 */
} // :cond_43
/* const/16 v4, 0xe */
/* if-ne v1, v4, :cond_47 */
/* .line 679 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v6 ); // invoke-virtual {v1, v6}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_44
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* const/16 v4, 0x11 */
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).fetchedAllHoney ( v4 ); // invoke-virtual {v1, v4}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fetchedAllHoney(I)Z
if ( v1 != null) { // if-eqz v1, :cond_44
/* move v1, v2 */
} // :goto_2c
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v1!= 0);
/* .line 680 */
/* const/16 v4, 0x28 */
/* if-lt v1, v4, :cond_45 */
/* move v1, v2 */
} // :goto_2d
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v1!= 0);
/* .line 681 */
/* const/16 v4, 0x28 */
/* if-lt v1, v4, :cond_46 */
/* move v1, v2 */
} // :goto_2e
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v1!= 0);
/* goto/16 :goto_3 */
} // :cond_44
/* move v1, v3 */
/* .line 679 */
} // :cond_45
/* move v1, v3 */
/* .line 680 */
} // :cond_46
/* move v1, v3 */
/* .line 681 */
/* .line 685 */
} // :cond_47
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v3!= 0);
/* .line 686 */
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v3!= 0);
/* .line 687 */
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v3!= 0);
/* goto/16 :goto_3 */
} // .end method
private void doClickFX ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1189 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->useVibra:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = de.nurogames.android.ticb.base.tinysanta.vibrator;
/* const-wide/16 v1, 0x28 */
(( android.os.Vibrator ) v0 ).vibrate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 1190 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v0 );
/* .line 1191 */
return;
} // .end method
private void doTimers ( ) {
/* .locals 3 */
/* .prologue */
/* .line 547 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) v0 ).doTimers ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->doTimers()V
/* .line 550 */
/* int-to-float v0, v0 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v2, 0x41200000 # 10.0f */
/* div-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* add-int/lit8 v1, v1, 0x1 */
/* mul-int/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
/* .line 554 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->runtime:I */
/* const/16 v1, 0x28 */
/* if-lt v0, v1, :cond_1 */
/* .line 557 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/tinysanta;->isHellowinsGame:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 559 */
de.hellowins.Hellowins .getInstance ( );
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
/* .line 562 */
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_1 */
/* .line 564 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->runtime:I */
/* .line 565 */
de.nurogames.android.ticb.base.views.TinyBeeView .checkTaskRequirements ( );
/* .line 567 */
/* new-instance v0, Ljava/lang/StringBuilder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getStringArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v1, v1, v2 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getStringArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.task_info = v0;
/* .line 568 */
/* int-to-float v0, v0 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v2 = this.task_info;
v1 = (( android.graphics.Paint ) v1 ).measureText ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->task_info_width:F */
/* .line 575 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v0, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_OVER:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 576 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).gameOver ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->gameOver()V
/* .line 578 */
} // :cond_2
return;
} // .end method
private void drawGameEndingScreen ( android.graphics.Canvas p0 ) {
/* .locals 12 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v11 = 3; // const/4 v11, 0x3
/* const/high16 v10, 0x40000000 # 2.0f */
int v9 = 0; // const/4 v9, 0x0
int v8 = 2; // const/4 v8, 0x2
int v7 = 1; // const/4 v7, 0x1
/* .line 807 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 808 */
(( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
/* .line 810 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.tf;
(( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 811 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v1 = android.graphics.Paint$Style.FILL;
(( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
/* .line 814 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v0, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 816 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* add-int/2addr v0, v1 */
/* if-ge v0, v1, :cond_3 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* .line 818 */
} // :goto_0
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
v1 = android.graphics.Color .argb ( v1,v9,v9,v9 );
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 819 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* int-to-float v3, v0 */
/* int-to-float v4, v0 */
v5 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 822 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgGameCompleted;
v2 = de.nurogames.android.ticb.base.core.AppResources.imgGameCompleted;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x42000000 # 32.0f */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 824 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 825 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_LARGE:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 827 */
v0 = this.game_complete_text;
/* aget-object v0, v0, v9 */
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v3 = this.game_complete_text;
/* aget-object v3, v3, v9 */
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v10 */
/* sub-float/2addr v1, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 829 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_SMALL:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 830 */
/* if-nez v0, :cond_4 */
/* .line 831 */
v0 = this.game_complete_text;
/* aget-object v0, v0, v7 */
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v3 = this.game_complete_text;
/* aget-object v3, v3, v7 */
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v10 */
/* sub-float/2addr v1, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 832 */
v0 = this.game_complete_text;
/* aget-object v0, v0, v8 */
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v3 = this.game_complete_text;
/* aget-object v3, v3, v8 */
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v10 */
/* sub-float/2addr v1, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 833 */
v0 = this.game_complete_text;
/* aget-object v0, v0, v11 */
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v3 = this.game_complete_text;
/* aget-object v3, v3, v11 */
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v10 */
/* sub-float/2addr v1, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x4 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 835 */
v0 = this.menuButtons;
/* aget-object v0, v0, v11 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 841 */
} // :cond_1
} // :goto_1
v0 = this.menuButtons;
/* aget-object v0, v0, v7 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 842 */
v0 = this.menuButtons;
/* aget-object v0, v0, v8 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 845 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 846 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* const/16 v1, 0x6e */
/* const/16 v2, 0x46 */
v1 = android.graphics.Color .rgb ( v1,v2,v9 );
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 847 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getStringArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v3, v3, v4 */
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v10 */
/* sub-float/2addr v1, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x6 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 849 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 850 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 851 */
/* .local v6, "score":Ljava/lang/String; */
/* int-to-float v0, v0 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v1 = (( android.graphics.Paint ) v1 ).measureText ( v6 ); // invoke-virtual {v1, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v1, v10 */
/* sub-float/2addr v0, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v2, v2, 0x7 */
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v6, v0, v1, v2 ); // invoke-virtual {p1, v6, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 853 */
v0 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
v0 = (( de.nurogames.android.ticb.base.core.DataManager ) v0 ).isRekord ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/DataManager;->isRekord()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 854 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgNewRecord;
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgNewRecord;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v2, v2 */
/* const v3, 0x3f99999a # 1.2f */
/* mul-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* const/high16 v2, 0x41c00000 # 24.0f */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 931 */
} // .end local v6 # "score":Ljava/lang/String;
} // :cond_2
} // :goto_2
return;
/* .line 816 */
} // :cond_3
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* goto/16 :goto_0 */
/* .line 836 */
} // :cond_4
/* if-ne v0, v7, :cond_1 */
/* .line 837 */
v0 = this.game_complete_text;
/* aget-object v0, v0, v7 */
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v3 = this.game_complete_text;
/* aget-object v3, v3, v7 */
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v10 */
/* sub-float/2addr v1, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 838 */
v0 = this.game_complete_text;
/* aget-object v0, v0, v8 */
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v3 = this.game_complete_text;
/* aget-object v3, v3, v8 */
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v10 */
/* sub-float/2addr v1, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_1 */
/* .line 858 */
} // :cond_5
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v0, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->outro_anim_done:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 860 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* add-int/2addr v0, v1 */
/* if-ge v0, v1, :cond_7 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* .line 862 */
} // :goto_3
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
v1 = android.graphics.Color .argb ( v1,v9,v9,v9 );
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 863 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* int-to-float v3, v0 */
/* int-to-float v4, v0 */
v5 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 866 */
/* if-ge v0, v1, :cond_8 */
/* .line 867 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgGameOver;
/* int-to-float v1, v1 */
/* const v2, 0x3f19999a # 0.6f */
/* mul-float/2addr v1, v2 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgGameOver;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* const/high16 v2, 0x41e00000 # 28.0f */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 874 */
} // :goto_4
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 875 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 876 */
/* if-nez v0, :cond_9 */
/* .line 877 */
/* new-instance v0, Ljava/lang/StringBuilder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getStringArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v1, v1, v2 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.gameover_level_reached = v0;
/* .line 882 */
} // :goto_5
/* if-ge v0, v1, :cond_a */
/* .line 883 */
v0 = this.gameover_level_reached;
/* int-to-float v1, v1 */
/* const v2, 0x3f19999a # 0.6f */
/* mul-float/2addr v1, v2 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v3 = this.gameover_level_reached;
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v10 */
/* sub-float/2addr v1, v2 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgGameOver;
v2 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/lit8 v2, v2, 0x20 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 891 */
} // :goto_6
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 892 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_LARGE:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 893 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v9 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 896 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 897 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* const/16 v1, 0x6e */
/* const/16 v2, 0x46 */
v1 = android.graphics.Color .rgb ( v1,v2,v9 );
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 898 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 899 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 900 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 901 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 902 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x4 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 903 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x5 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 904 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v11 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 905 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v11 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 906 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v11 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 908 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 909 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v8 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 910 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v2, 0x41200000 # 10.0f */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v8 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 911 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.secsformat;
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objBee;->topSpeed:F */
/* float-to-double v2, v2 */
(( java.text.DecimalFormat ) v1 ).format ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v8 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 912 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v8 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 913 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v8 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x4 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 914 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v8 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x5 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 915 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.secsformat;
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x42200000 # 40.0f */
/* div-float/2addr v2, v3 */
/* float-to-double v2, v2 */
(( java.text.DecimalFormat ) v1 ).format ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "s"; // const-string v1, "s"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
int v2 = 4; // const/4 v2, 0x4
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 916 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
int v2 = 4; // const/4 v2, 0x4
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 917 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
int v2 = 4; // const/4 v2, 0x4
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 920 */
v0 = this.menuButtons;
/* aget-object v0, v0, v7 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 921 */
v0 = this.menuButtons;
/* aget-object v0, v0, v8 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 923 */
/* if-nez v0, :cond_6 */
/* .line 924 */
v0 = this.menuButtons;
/* aget-object v0, v0, v11 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 926 */
} // :cond_6
v0 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
v0 = (( de.nurogames.android.ticb.base.core.DataManager ) v0 ).isRekord ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/DataManager;->isRekord()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 927 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgNewRecord;
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgNewRecord;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v2, v2 */
/* const v3, 0x3f99999a # 1.2f */
/* mul-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* const/high16 v2, 0x41c00000 # 24.0f */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_2 */
/* .line 860 */
} // :cond_7
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* goto/16 :goto_3 */
/* .line 870 */
} // :cond_8
v0 = de.nurogames.android.ticb.base.core.AppResources.imgGameOver;
v2 = de.nurogames.android.ticb.base.core.AppResources.imgGameOver;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x42000000 # 32.0f */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_4 */
/* .line 879 */
} // :cond_9
/* new-instance v0, Ljava/lang/StringBuilder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getStringArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v1, v1, v2 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.gameover_level_reached = v0;
/* goto/16 :goto_5 */
/* .line 886 */
} // :cond_a
v0 = this.gameover_level_reached;
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
v3 = this.gameover_level_reached;
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v10 */
/* sub-float/2addr v1, v2 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgGameOver;
v2 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/lit8 v2, v2, 0x28 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_6 */
} // .end method
private void drawUI ( android.graphics.Canvas p0 ) {
/* .locals 4 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 737 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
/* if-lez v0, :cond_0 */
/* .line 738 */
v0 = de.hellowins.Hellowins .getInstance ( );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 739 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Score: "; // const-string v1, "Score: "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_x:I */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_y:I */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumWhitePaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 740 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Time: "; // const-string v1, "Time: "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_x:I */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_y:I */
/* add-int/lit8 v2, v2, 0x18 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumWhitePaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 741 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Rank: "; // const-string v1, "Rank: "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
de.hellowins.Hellowins .getInstance ( );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_x:I */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_y:I */
/* add-int/lit8 v2, v2, 0x30 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumWhitePaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 749 */
} // :cond_0
} // :goto_0
v0 = this.menuButtons;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 752 */
/* if-lez v0, :cond_1 */
/* .line 755 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgTaskInfobar;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->taskinfobar_x:I */
/* int-to-float v1, v1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 758 */
v0 = this.task_info;
/* .line 759 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->task_info_width:F */
/* .line 760 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* int-to-float v2, v2 */
/* .line 761 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
/* .line 758 */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 765 */
/* add-int/lit8 v0, v0, -0x1 */
/* .line 768 */
} // :cond_1
return;
/* .line 744 */
} // :cond_2
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_x:I */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_y:I */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumWhitePaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
} // .end method
private void getGameCompleteText ( ) {
/* .locals 2 */
/* .prologue */
/* .line 775 */
/* if-nez v0, :cond_5 */
/* .line 776 */
/* if-ne v0, v1, :cond_1 */
/* .line 777 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* .line 798 */
} // :cond_0
} // :goto_0
return;
/* .line 778 */
} // :cond_1
/* if-ne v0, v1, :cond_2 */
/* .line 779 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* .line 780 */
} // :cond_2
/* if-ne v0, v1, :cond_3 */
/* .line 781 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* .line 782 */
} // :cond_3
/* if-ne v0, v1, :cond_4 */
/* .line 783 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* .line 785 */
} // :cond_4
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* .line 786 */
} // :cond_5
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 787 */
/* if-ne v0, v1, :cond_6 */
/* .line 788 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* .line 789 */
} // :cond_6
/* if-ne v0, v1, :cond_7 */
/* .line 790 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* .line 791 */
} // :cond_7
/* if-ne v0, v1, :cond_8 */
/* .line 792 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* goto/16 :goto_0 */
/* .line 793 */
} // :cond_8
/* if-ne v0, v1, :cond_9 */
/* .line 794 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* goto/16 :goto_0 */
/* .line 796 */
} // :cond_9
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.game_complete_text = v0;
/* goto/16 :goto_0 */
} // .end method
private void newGame ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 292 */
/* .line 294 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->player_start_velocity_x:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->player_start_velocity_y:F */
/* invoke-direct {v0, v1, v2}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* .line 297 */
v0 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v0 ).isRekord ( v3 ); // invoke-virtual {v0, v3}, Lde/nurogames/android/ticb/base/core/DataManager;->isRekord(Z)V
/* .line 300 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 303 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* new-instance v1, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* const/high16 v2, -0x3cb80000 # -200.0f */
/* invoke-direct {v1, v2, v4}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
(( java.util.Vector ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 306 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objAnimBackground; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objAnimBackground;-><init>()V */
/* .line 308 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.cam;
this.m_objCam = v0;
/* .line 311 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) v0 ).init ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->init()V
/* .line 314 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v0 ).init ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objBee;->init()V
/* .line 317 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;-><init>()V */
this.startCounter = v0;
/* .line 320 */
/* iput v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
/* .line 321 */
de.nurogames.android.ticb.base.objects.objBee.autojump = (v3!= 0);
/* .line 324 */
de.nurogames.android.ticb.base.views.TinyBeeView.r1 = (v3!= 0);
/* .line 325 */
de.nurogames.android.ticb.base.views.TinyBeeView.r2 = (v3!= 0);
/* .line 326 */
de.nurogames.android.ticb.base.views.TinyBeeView.r3 = (v3!= 0);
/* .line 329 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_started:Z */
/* .line 332 */
/* iput v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->fade_out_alpha:I */
/* .line 335 */
/* .line 336 */
return;
} // .end method
private void pauseGame ( ) {
/* .locals 1 */
/* .prologue */
/* .line 997 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
de.nurogames.android.ticb.base.views.TinyBeeView.GAME_PAUSED = (v0!= 0);
/* .line 998 */
return;
/* .line 997 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
private void setupGame ( ) {
/* .locals 12 */
/* .prologue */
int v11 = 2; // const/4 v11, 0x2
/* const v10, 0x3f4ccccd # 0.8f */
int v1 = 0; // const/4 v1, 0x0
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
/* .line 188 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mPaint;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v9 ); // invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 189 */
v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
final String v2 = "font.otf"; // const-string v2, "font.otf"
android.graphics.Typeface .createFromAsset ( v0,v2 );
/* .line 190 */
v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
final String v2 = "font_ingame.ttf"; // const-string v2, "font_ingame.ttf"
android.graphics.Typeface .createFromAsset ( v0,v2 );
/* .line 193 */
v6 = this.menuButtons;
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 194 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgPauseIcon;
/* aget-object v3, v3, v8 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0xc */
/* .line 195 */
/* const/16 v3, 0xc */
/* .line 196 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgPauseIcon;
/* aget-object v4, v4, v8 */
/* .line 197 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgPauseIcon;
/* aget-object v5, v5, v9 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 193 */
/* aput-object v0, v6, v8 */
/* .line 200 */
v6 = this.menuButtons;
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 202 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_PlayAgain;
/* aget-object v3, v3, v8 */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int v3, v2, v3 */
/* .line 203 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_PlayAgain;
/* aget-object v4, v2, v8 */
/* .line 204 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_PlayAgain;
/* aget-object v5, v2, v9 */
/* move v2, v8 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 200 */
/* aput-object v0, v6, v9 */
/* .line 207 */
v6 = this.menuButtons;
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 208 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_BackToMenu;
/* aget-object v3, v3, v8 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* .line 209 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_BackToMenu;
/* aget-object v4, v4, v8 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* .line 210 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_BackToMenu;
/* aget-object v4, v4, v8 */
/* .line 211 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuButton_BackToMenu;
/* aget-object v5, v5, v9 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 207 */
/* aput-object v0, v6, v11 */
/* .line 213 */
v6 = this.menuButtons;
int v7 = 3; // const/4 v7, 0x3
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 216 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgDemoBanner;
v5 = de.nurogames.android.ticb.base.core.AppResources.imgDemoBanner;
/* move v2, v8 */
/* move v3, v8 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 213 */
/* aput-object v0, v6, v7 */
/* .line 219 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;-><init>()V */
/* .line 222 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objPopUpDialog; */
/* .line 223 */
/* .line 224 */
/* .line 225 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgAbortDialogBG;
/* invoke-direct {v0, v1, v2, v3}, Lde/nurogames/android/ticb/base/objects/objPopUpDialog;-><init>(IILandroid/graphics/Bitmap;)V */
/* .line 222 */
this.popUp_AskExit = v0;
/* .line 228 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objAnimBackground; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objAnimBackground;-><init>()V */
/* .line 231 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objBee; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objBee;-><init>()V */
/* .line 234 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;-><init>()V */
/* .line 237 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar; */
/* .line 238 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgProgressMain;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* .line 239 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgProgressMain;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/lit8 v3, v3, 0xc */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* .line 237 */
/* invoke-direct {v0, v1, v2}, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;-><init>(FF)V */
/* .line 242 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->cam_player_space:I */
/* .line 243 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_LARGE:I */
/* .line 244 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* .line 245 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_SMALL:I */
/* .line 246 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* .line 247 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->list_spacing:I */
/* .line 248 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_x:I */
/* .line 249 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->score_y:I */
/* .line 251 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v0 = java.lang.Float .parseFloat ( v0 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->player_start_velocity_x:F */
/* .line 252 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v0 = java.lang.Float .parseFloat ( v0 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->player_start_velocity_y:F */
/* .line 254 */
int v0 = 5; // const/4 v0, 0x5
/* new-array v0, v0, [I */
/* .line 255 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* aput v1, v0, v8 */
/* .line 256 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* aput v1, v0, v9 */
/* .line 257 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* aput v1, v0, v11 */
int v1 = 3; // const/4 v1, 0x3
/* .line 258 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* .line 259 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
/* .line 254 */
this.list_x = v0;
/* .line 262 */
/* if-ne v0, v1, :cond_0 */
/* .line 263 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_SMALL:I */
/* int-to-float v0, v0 */
/* mul-float/2addr v0, v10 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_SMALL:I */
/* .line 264 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* int-to-float v0, v0 */
/* mul-float/2addr v0, v10 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* .line 265 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_LARGE:I */
/* int-to-float v0, v0 */
/* mul-float/2addr v0, v10 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_LARGE:I */
/* .line 269 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumWhitePaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 270 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumWhitePaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 271 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumWhitePaint;
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.gf;
(( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 273 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumGrayPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->FONT_MEDIUM:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 274 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumGrayPaint;
/* const v1, -0xbbbbbc */
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 275 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.mMediumGrayPaint;
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.tf;
(( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 277 */
/* .line 279 */
/* new-instance v0, Ljava/lang/StringBuilder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getStringArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v1, v1, v2 */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getStringArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.task_info = v0;
/* .line 281 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgTaskInfobar;
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v1, v1, 0x2 */
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->taskinfobar_x:I */
/* .line 283 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getGameCompleteText()V */
/* .line 284 */
return;
} // .end method
private void showAdBannerEndExitToMenu ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 1493 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->use_chartboost:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/AppResources;->chartboost_ad_shown:Z */
/* if-nez v0, :cond_0 */
/* .line 1495 */
v0 = de.nurogames.android.ticb.base.tinysanta.chartboost;
(( de.nurogames.android.ticb.base.CBMngr ) v0 ).showInterstitial ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/CBMngr;->showInterstitial()V
/* .line 1497 */
v0 = de.nurogames.android.ticb.base.tinysanta.chartboost;
/* new-instance v1, Lde/nurogames/android/ticb/base/views/TinyBeeView$7; */
/* invoke-direct {v1, p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView$7;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;)V */
(( de.nurogames.android.ticb.base.CBMngr ) v0 ).setDelegate ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/CBMngr;->setDelegate(Lcom/chartboost/sdk/ChartBoostDelegate;)V
/* .line 1520 */
de.nurogames.android.ticb.base.core.AppResources.chartboost_ad_shown = (v2!= 0);
/* .line 1527 */
} // :goto_0
return;
/* .line 1523 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v0 ).init ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objBee;->init()V
/* .line 1524 */
de.nurogames.android.ticb.base.tinysanta .flipView ( v2 );
} // .end method
private void showCounter ( ) {
/* .locals 2 */
/* .prologue */
/* .line 513 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_is_shown:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_started:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
/* if-nez v0, :cond_0 */
/* .line 516 */
v0 = this.startCounter;
/* const/16 v1, 0x19 */
(( de.nurogames.android.ticb.base.objects.objGameStartCounter ) v0 ).TimeShown ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->TimeShown(I)V
/* .line 519 */
v0 = this.startCounter;
/* iget v0, v0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->timeLeftMS:I */
/* if-gez v0, :cond_0 */
/* .line 522 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v0 );
/* .line 523 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v0 );
/* .line 526 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.startVelocity;
/* .line 529 */
int v0 = 0; // const/4 v0, 0x0
this.startCounter = v0;
/* .line 530 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_started:Z */
/* .line 532 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/tinysanta;->isHellowinsGame:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 533 */
de.hellowins.Hellowins .getInstance ( );
/* .line 534 */
int v0 = 1; // const/4 v0, 0x1
de.nurogames.android.ticb.base.tinysanta.wasHellowinsSessionRunnning = (v0!= 0);
/* .line 538 */
} // :cond_0
return;
} // .end method
private void showNoTasksAvailableInThisModeDialog ( ) {
/* .locals 5 */
/* .prologue */
/* .line 1167 */
/* new-instance v1, Landroid/app/AlertDialog$Builder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getContext()Landroid/content/Context;
/* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 1169 */
/* .local v1, "builder":Landroid/app/AlertDialog$Builder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getStringArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v2, v2, v3 */
(( java.lang.String ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;
(( android.app.AlertDialog$Builder ) v1 ).setMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 1170 */
int v3 = 0; // const/4 v3, 0x0
(( android.app.AlertDialog$Builder ) v2 ).setCancelable ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
/* .line 1171 */
final String v3 = "ok"; // const-string v3, "ok"
/* new-instance v4, Lde/nurogames/android/ticb/base/views/TinyBeeView$6; */
/* invoke-direct {v4, p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView$6;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;)V */
(( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 1178 */
final String v2 = "Info"; // const-string v2, "Info"
(( android.app.AlertDialog$Builder ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 1180 */
(( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 1181 */
/* .local v0, "alert":Landroid/app/AlertDialog; */
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
/* .line 1183 */
return;
} // .end method
private void showRatingDialog ( ) {
/* .locals 5 */
/* .prologue */
/* .line 1585 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/AppResources;->device_has_no_google_support:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 1586 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->showAdBannerEndExitToMenu()V */
/* .line 1628 */
} // :goto_0
return;
/* .line 1590 */
} // :cond_0
v2 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
v2 = (( de.nurogames.android.ticb.base.core.DataManager ) v2 ).hasUserRated ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/DataManager;->hasUserRated()Z
/* if-nez v2, :cond_1 */
/* if-nez v2, :cond_1 */
/* .line 1592 */
/* new-instance v1, Landroid/app/AlertDialog$Builder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getContext()Landroid/content/Context;
/* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 1593 */
/* .local v1, "builder":Landroid/app/AlertDialog$Builder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getStringArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v2, v2, v3 */
(( java.lang.String ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;
(( android.app.AlertDialog$Builder ) v1 ).setMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 1594 */
int v3 = 0; // const/4 v3, 0x0
(( android.app.AlertDialog$Builder ) v2 ).setCancelable ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
/* .line 1595 */
final String v3 = "Yes"; // const-string v3, "Yes"
/* new-instance v4, Lde/nurogames/android/ticb/base/views/TinyBeeView$8; */
/* invoke-direct {v4, p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView$8;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;)V */
(( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 1611 */
final String v3 = "No"; // const-string v3, "No"
/* new-instance v4, Lde/nurogames/android/ticb/base/views/TinyBeeView$9; */
/* invoke-direct {v4, p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView$9;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;)V */
(( android.app.AlertDialog$Builder ) v2 ).setNegativeButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 1620 */
(( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 1621 */
/* .local v0, "alert":Landroid/app/AlertDialog; */
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
/* .line 1625 */
} // .end local v0 # "alert":Landroid/app/AlertDialog;
} // .end local v1 # "builder":Landroid/app/AlertDialog$Builder;
} // :cond_1
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->showAdBannerEndExitToMenu()V */
} // .end method
private void showTaskHelpDialog ( ) {
/* .locals 5 */
/* .prologue */
/* .line 1144 */
/* new-instance v1, Landroid/app/AlertDialog$Builder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getContext()Landroid/content/Context;
/* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 1146 */
/* .local v1, "builder":Landroid/app/AlertDialog$Builder; */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getStringArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v2, v2, v3 */
(( java.lang.String ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;
(( android.app.AlertDialog$Builder ) v1 ).setMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 1147 */
int v3 = 0; // const/4 v3, 0x0
(( android.app.AlertDialog$Builder ) v2 ).setCancelable ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
/* .line 1148 */
final String v3 = "ok"; // const-string v3, "ok"
/* new-instance v4, Lde/nurogames/android/ticb/base/views/TinyBeeView$5; */
/* invoke-direct {v4, p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView$5;-><init>(Lde/nurogames/android/ticb/base/views/TinyBeeView;)V */
(( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 1155 */
final String v2 = "Info"; // const-string v2, "Info"
(( android.app.AlertDialog$Builder ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 1157 */
(( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 1158 */
/* .local v0, "alert":Landroid/app/AlertDialog; */
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
/* .line 1160 */
return;
} // .end method
/* # virtual methods */
public void cancelGame ( ) {
/* .locals 1 */
/* .prologue */
/* .line 983 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
/* .line 984 */
return;
} // .end method
public void gameOver ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 1; // const/4 v5, 0x1
/* .line 1006 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->checkScoreForNewRecord()V */
/* .line 1009 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 1010 */
/* .local v0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v1 = "score"; // const-string v1, "score"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->nScore:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 1011 */
final String v1 = "multiplicator"; // const-string v1, "multiplicator"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 1012 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_OVER:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
/* if-nez v1, :cond_2 */
/* .line 1013 */
v1 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_01_SCORE_REACHED_AT_GAMEOVER;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v1,v0,v5 );
/* .line 1021 */
} // :cond_0
} // :goto_0
v1 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
/* .line 1022 */
int v2 = 7; // const/4 v2, 0x7
/* new-array v2, v2, [I */
/* .line 1023 */
v3 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v4, 0x41200000 # 10.0f */
/* div-float/2addr v3, v4 */
/* float-to-int v3, v3 */
/* aput v3, v2, v6 */
/* .line 1024 */
/* aput v3, v2, v5 */
int v3 = 2; // const/4 v3, 0x2
/* .line 1025 */
/* aput v4, v2, v3 */
int v3 = 3; // const/4 v3, 0x3
/* .line 1026 */
/* aput v4, v2, v3 */
int v3 = 4; // const/4 v3, 0x4
/* .line 1027 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v4, v4, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* aput v4, v2, v3 */
int v3 = 5; // const/4 v3, 0x5
/* .line 1028 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v4, v4, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
/* aput v4, v2, v3 */
int v3 = 6; // const/4 v3, 0x6
/* .line 1029 */
/* aput v4, v2, v3 */
/* .line 1021 */
(( de.nurogames.android.ticb.base.core.DataManager ) v1 ).saveOverall ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/DataManager;->saveOverall([I)V
/* .line 1038 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
/* if-nez v1, :cond_1 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iput-boolean v5, v1, Lde/nurogames/android/ticb/base/objects/objBee;->isGameOver:Z */
/* .line 1040 */
} // :cond_1
/* new-instance v1, Lde/nurogames/android/ticb/base/core/Vector3D; */
int v2 = 0; // const/4 v2, 0x0
/* const/high16 v3, -0x3f200000 # -7.0f */
/* invoke-direct {v1, v2, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* .line 1042 */
/* .line 1043 */
return;
/* .line 1015 */
} // :cond_2
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_OVER:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 1016 */
v1 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_02_SCORE_REACHED_AT_COMPLETE;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v1,v0,v5 );
/* .line 1017 */
v1 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_12_FINISHED_ALL_LEVELS;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v1,v5 );
} // .end method
public Integer getState ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1576 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->mMode:I */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 3 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 367 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.background;
(( de.nurogames.android.ticb.base.objects.objAnimBackground ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->onDraw(Landroid/graphics/Canvas;)V
/* .line 370 */
v0 = this.camThread;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 373 */
(( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 376 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->zoomfactor:F */
/* .line 378 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->zoomfactor:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->zoomfactor:F */
(( android.graphics.Canvas ) p1 ).scale ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V
/* .line 381 */
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* neg-float v0, v0 */
v1 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* neg-float v1, v1 */
(( android.graphics.Canvas ) p1 ).translate ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 384 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) v0 ).drawWater ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drawWater(Landroid/graphics/Canvas;)V
/* .line 387 */
v0 = this.animatePollem;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 388 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) v0 ).drawPollem ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drawPollem(Landroid/graphics/Canvas;)V
/* .line 395 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->onDraw(Landroid/graphics/Canvas;)V
/* .line 397 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/_Display;->isHardwareAccelerated:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 398 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
/* if-nez v0, :cond_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
/* if-nez v0, :cond_0 */
/* .line 399 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* add-float/2addr v0, v1 */
/* .line 401 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* sub-float/2addr v0, v1 */
(( android.graphics.Canvas ) p1 ).translate ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 404 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) v0 ).drawMap ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drawMap(Landroid/graphics/Canvas;)V
/* .line 407 */
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* neg-float v0, v0 */
/* add-float/2addr v0, v1 */
(( android.graphics.Canvas ) p1 ).translate ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 415 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objBee;->onDraw(Landroid/graphics/Canvas;)V
/* .line 418 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v0 ).onDrawUI ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objBee;->onDrawUI(Landroid/graphics/Canvas;)V
/* .line 421 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) v0 ).drawTerrainAssets ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drawTerrainAssets(Landroid/graphics/Canvas;)V
/* .line 424 */
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v1 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
(( android.graphics.Canvas ) p1 ).translate ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 427 */
(( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
/* .line 430 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_8 */
/* .line 433 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
/* if-nez v0, :cond_2 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.progress;
(( de.nurogames.android.ticb.base.objects.objLevelProgressBar ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->onDraw(Landroid/graphics/Canvas;)V
/* .line 436 */
} // :cond_2
/* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->drawUI(Landroid/graphics/Canvas;)V */
/* .line 439 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) v0 ).drawNextLevelInfo ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drawNextLevelInfo(Landroid/graphics/Canvas;)V
/* .line 442 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 443 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
(( de.nurogames.android.ticb.base.objects.objPauseOverlay ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->onDraw(Landroid/graphics/Canvas;)V
/* .line 463 */
} // :cond_3
} // :goto_0
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
/* if-nez v0, :cond_4 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_newgame_dialog:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 464 */
} // :cond_4
v0 = this.popUp_AskExit;
(( de.nurogames.android.ticb.base.objects.objPopUpDialog ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objPopUpDialog;->onDraw(Landroid/graphics/Canvas;)V
/* .line 466 */
} // :cond_5
return;
/* .line 446 */
} // :cond_6
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_is_shown:Z */
/* if-nez v0, :cond_7 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
/* if-nez v0, :cond_7 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_newgame_dialog:Z */
/* if-nez v0, :cond_7 */
/* .line 449 */
v0 = this.timerAndPlayerThread;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 453 */
} // :cond_7
v0 = this.startCounter;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 454 */
v0 = this.startCounter;
(( de.nurogames.android.ticb.base.objects.objGameStartCounter ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->onDraw(Landroid/graphics/Canvas;)V
/* .line 459 */
} // :cond_8
/* if-nez v0, :cond_3 */
/* .line 460 */
/* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->drawGameEndingScreen(Landroid/graphics/Canvas;)V */
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 11 */
/* .param p1, "arg0" # Landroid/view/View; */
/* .param p2, "arg1" # Landroid/view/MotionEvent; */
/* .prologue */
int v10 = 4; // const/4 v10, 0x4
int v9 = 2; // const/4 v9, 0x2
int v8 = 3; // const/4 v8, 0x3
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 1204 */
v2 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
/* .line 1205 */
/* .local v2, "touchX":F */
v3 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
/* .line 1210 */
/* .local v3, "touchY":F */
v6 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v6, :cond_18 */
/* .line 1213 */
/* iget-boolean v6, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_newgame_dialog:Z */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 1217 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.yes;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-lez v6, :cond_2 */
/* .line 1218 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.yes;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
/* aget-object v7, v7, v4 */
v7 = (( android.graphics.Bitmap ) v7 ).getWidth ( ); // invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gez v6, :cond_2 */
/* .line 1220 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.yes;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-lez v6, :cond_2 */
/* .line 1221 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.yes;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
/* aget-object v7, v7, v4 */
v7 = (( android.graphics.Bitmap ) v7 ).getHeight ( ); // invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gez v6, :cond_2 */
/* .line 1224 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1225 */
/* .line 1226 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_newgame_dialog:Z */
/* .line 1227 */
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).isClicked ( v4 ); // invoke-virtual {v6, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 1228 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->newGame()V */
/* .line 1229 */
/* sget-boolean v6, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
if ( v6 != null) { // if-eqz v6, :cond_1
} // :goto_0
de.nurogames.android.ticb.base.views.TinyBeeView.GAME_PAUSED = (v4!= 0);
/* .line 1481 */
} // :cond_0
} // :goto_1
} // :cond_1
/* move v4, v5 */
/* .line 1229 */
/* .line 1233 */
} // :cond_2
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.no;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-lez v6, :cond_0 */
/* .line 1234 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.no;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
/* aget-object v7, v7, v4 */
v7 = (( android.graphics.Bitmap ) v7 ).getWidth ( ); // invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gez v6, :cond_0 */
/* .line 1236 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.no;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-lez v6, :cond_0 */
/* .line 1237 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.no;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
/* aget-object v7, v7, v4 */
v7 = (( android.graphics.Bitmap ) v7 ).getHeight ( ); // invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gez v6, :cond_0 */
/* .line 1240 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1241 */
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).isClicked ( v4 ); // invoke-virtual {v6, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 1242 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_newgame_dialog:Z */
/* .line 1248 */
} // :cond_3
/* iget-boolean v6, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
if ( v6 != null) { // if-eqz v6, :cond_7
/* .line 1252 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.yes;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-lez v6, :cond_6 */
/* .line 1253 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.yes;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
/* aget-object v7, v7, v4 */
v7 = (( android.graphics.Bitmap ) v7 ).getWidth ( ); // invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gez v6, :cond_6 */
/* .line 1255 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.yes;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-lez v6, :cond_6 */
/* .line 1256 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.yes;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
/* aget-object v7, v7, v4 */
v7 = (( android.graphics.Bitmap ) v7 ).getHeight ( ); // invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gez v6, :cond_6 */
/* .line 1259 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1260 */
/* .line 1261 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
/* .line 1262 */
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).isClicked ( v4 ); // invoke-virtual {v6, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 1265 */
/* sget-boolean v4, Lde/nurogames/android/ticb/base/tinysanta;->isHellowinsGame:Z */
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 1267 */
de.hellowins.Hellowins .getInstance ( );
v6 = de.nurogames.android.ticb.base.tinysanta.sTinyBee;
/* goto/16 :goto_1 */
/* .line 1272 */
} // :cond_4
/* if-nez v4, :cond_5 */
/* .line 1273 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->showAdBannerEndExitToMenu()V */
/* goto/16 :goto_1 */
/* .line 1275 */
} // :cond_5
de.nurogames.android.ticb.base.tinysanta .flipView ( v5 );
/* goto/16 :goto_1 */
/* .line 1283 */
} // :cond_6
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.no;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-lez v6, :cond_f */
/* .line 1284 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.no;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
/* aget-object v7, v7, v4 */
v7 = (( android.graphics.Bitmap ) v7 ).getWidth ( ); // invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gez v6, :cond_f */
/* .line 1286 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.no;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-lez v6, :cond_f */
/* .line 1287 */
v6 = de.nurogames.android.ticb.base.objects.objPopUpDialog.no;
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
/* aget-object v7, v7, v4 */
v7 = (( android.graphics.Bitmap ) v7 ).getHeight ( ); // invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gez v6, :cond_f */
/* .line 1290 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1291 */
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).isClicked ( v4 ); // invoke-virtual {v6, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 1292 */
/* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
/* goto/16 :goto_1 */
/* .line 1299 */
} // :cond_7
/* sget-boolean v6, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
if ( v6 != null) { // if-eqz v6, :cond_f
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v6, v6, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
/* if-nez v6, :cond_f */
/* .line 1302 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-ltz v6, :cond_9 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v4 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Width ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gtz v6, :cond_9 */
/* .line 1304 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-ltz v6, :cond_9 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v4 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Height ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gtz v6, :cond_9 */
/* .line 1307 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1308 */
/* sget-boolean v6, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
if ( v6 != null) { // if-eqz v6, :cond_8
/* move v6, v4 */
} // :goto_2
de.nurogames.android.ticb.base.views.TinyBeeView.GAME_PAUSED = (v6!= 0);
/* .line 1309 */
v6 = this.menuButtons;
/* aget-object v6, v6, v5 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).isClicked ( v4 ); // invoke-virtual {v6, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 1310 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
/* iput v4, v6, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->mViewMode:I */
/* .line 1311 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).isToggled ( v4 ); // invoke-virtual {v6, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* goto/16 :goto_1 */
} // :cond_8
/* move v6, v5 */
/* .line 1308 */
/* .line 1315 */
} // :cond_9
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v5 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-ltz v6, :cond_a */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v5 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v5 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Width ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gtz v6, :cond_a */
/* .line 1317 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v5 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-ltz v6, :cond_a */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v5 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v5 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Height ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gtz v6, :cond_a */
/* .line 1320 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1321 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).setNewGameDialog ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->setNewGameDialog()V
/* goto/16 :goto_1 */
/* .line 1325 */
} // :cond_a
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v9 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-ltz v6, :cond_b */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v9 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v9 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Width ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gtz v6, :cond_b */
/* .line 1327 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v9 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-ltz v6, :cond_b */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v9 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v9 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Height ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gtz v6, :cond_b */
/* .line 1330 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1331 */
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).cancelGame ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->cancelGame()V
/* goto/16 :goto_1 */
/* .line 1335 */
} // :cond_b
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-ltz v6, :cond_d */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v8 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Width ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gtz v6, :cond_d */
/* .line 1337 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-ltz v6, :cond_d */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v8 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Height ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gtz v6, :cond_d */
/* .line 1339 */
/* if-nez v6, :cond_d */
/* .line 1342 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1343 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
/* iget v6, v6, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->mViewMode:I */
/* if-nez v6, :cond_c */
/* .line 1344 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
/* iput v5, v4, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->mViewMode:I */
/* .line 1345 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v4 = this.menuButtons;
/* aget-object v4, v4, v8 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).isToggled ( v5 ); // invoke-virtual {v4, v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* goto/16 :goto_1 */
/* .line 1347 */
} // :cond_c
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
/* iput v4, v6, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->mViewMode:I */
/* .line 1348 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).isToggled ( v4 ); // invoke-virtual {v6, v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* goto/16 :goto_1 */
/* .line 1352 */
} // :cond_d
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-ltz v6, :cond_e */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v8 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Width ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gtz v6, :cond_e */
/* .line 1354 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-ltz v6, :cond_e */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v8 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Height ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gtz v6, :cond_e */
/* .line 1356 */
/* if-ne v6, v5, :cond_e */
/* .line 1359 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->showNoTasksAvailableInThisModeDialog()V */
/* goto/16 :goto_1 */
/* .line 1364 */
} // :cond_e
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v10 */
if ( v6 != null) { // if-eqz v6, :cond_f
/* .line 1365 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v10 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-ltz v6, :cond_f */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v10 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v10 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Width ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gtz v6, :cond_f */
/* .line 1367 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v10 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-ltz v6, :cond_f */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v10 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v7 = this.menuButtons;
/* aget-object v7, v7, v10 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Height ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gtz v6, :cond_f */
/* .line 1369 */
v6 = de.nurogames.android.ticb.base.views.TinyBeeView.pause_overlay;
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).isToggled ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled()Z
if ( v6 != null) { // if-eqz v6, :cond_f
/* .line 1372 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1373 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->showTaskHelpDialog()V */
/* goto/16 :goto_1 */
/* .line 1378 */
} // :cond_f
/* sget-boolean v6, Lde/nurogames/android/ticb/base/tinysanta;->isHellowinsGame:Z */
/* if-nez v6, :cond_10 */
/* .line 1381 */
if ( v6 != null) { // if-eqz v6, :cond_10
/* sget-boolean v6, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
/* if-nez v6, :cond_10 */
/* iget-boolean v6, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_is_shown:Z */
/* if-nez v6, :cond_10 */
/* iget-boolean v6, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
/* if-nez v6, :cond_10 */
/* .line 1384 */
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v2, v6 */
/* if-ltz v6, :cond_10 */
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).X ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v7 = this.menuButtons;
/* aget-object v7, v7, v4 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Width ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v2, v6 */
/* if-gtz v6, :cond_10 */
/* .line 1386 */
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v6, v6 */
/* cmpl-float v6, v3, v6 */
/* if-ltz v6, :cond_10 */
v6 = this.menuButtons;
/* aget-object v6, v6, v4 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Y ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v7 = this.menuButtons;
/* aget-object v7, v7, v4 */
v7 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v7 ).Height ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v6, v7 */
/* int-to-float v6, v6 */
/* cmpg-float v6, v3, v6 */
/* if-gtz v6, :cond_10 */
/* .line 1389 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1390 */
v6 = this.menuButtons;
/* aget-object v4, v6, v4 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).isClicked ( v5 ); // invoke-virtual {v4, v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isClicked(Z)V
/* .line 1391 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->pauseGame()V */
/* goto/16 :goto_1 */
/* .line 1399 */
} // :cond_10
/* if-nez v4, :cond_17 */
/* .line 1402 */
v4 = this.menuButtons;
/* aget-object v4, v4, v5 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).X ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v4, v4 */
/* cmpl-float v4, v2, v4 */
/* if-ltz v4, :cond_12 */
v4 = this.menuButtons;
/* aget-object v4, v4, v5 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).X ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v6 = this.menuButtons;
/* aget-object v6, v6, v5 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Width ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v4, v6 */
/* int-to-float v4, v4 */
/* cmpg-float v4, v2, v4 */
/* if-gtz v4, :cond_12 */
/* .line 1404 */
v4 = this.menuButtons;
/* aget-object v4, v4, v5 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).Y ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v4, v4 */
/* cmpl-float v4, v3, v4 */
/* if-ltz v4, :cond_12 */
v4 = this.menuButtons;
/* aget-object v4, v4, v5 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).Y ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v6 = this.menuButtons;
/* aget-object v6, v6, v5 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Height ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v4, v6 */
/* int-to-float v4, v4 */
/* cmpg-float v4, v3, v4 */
/* if-gtz v4, :cond_12 */
/* .line 1406 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v4, v4, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->outro_anim_done:Z */
/* if-nez v4, :cond_11 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v4, v4, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
if ( v4 != null) { // if-eqz v4, :cond_12
/* .line 1410 */
} // :cond_11
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1411 */
de.nurogames.android.ticb.base.core.AppResources .switchMusic_GameOverToGame ( );
/* .line 1412 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->newGame()V */
/* goto/16 :goto_1 */
/* .line 1416 */
} // :cond_12
v4 = this.menuButtons;
/* aget-object v4, v4, v9 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).X ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v4, v4 */
/* cmpl-float v4, v2, v4 */
/* if-ltz v4, :cond_14 */
v4 = this.menuButtons;
/* aget-object v4, v4, v9 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).X ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v6 = this.menuButtons;
/* aget-object v6, v6, v9 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Width ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v4, v6 */
/* int-to-float v4, v4 */
/* cmpg-float v4, v2, v4 */
/* if-gtz v4, :cond_14 */
/* .line 1418 */
v4 = this.menuButtons;
/* aget-object v4, v4, v9 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).Y ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v4, v4 */
/* cmpl-float v4, v3, v4 */
/* if-ltz v4, :cond_14 */
v4 = this.menuButtons;
/* aget-object v4, v4, v9 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).Y ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v6 = this.menuButtons;
/* aget-object v6, v6, v9 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Height ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v4, v6 */
/* int-to-float v4, v4 */
/* cmpg-float v4, v3, v4 */
/* if-gtz v4, :cond_14 */
/* .line 1420 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v4, v4, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->outro_anim_done:Z */
/* if-nez v4, :cond_13 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v4, v4, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
if ( v4 != null) { // if-eqz v4, :cond_14
/* .line 1423 */
} // :cond_13
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->doClickFX()V */
/* .line 1427 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->showRatingDialog()V */
/* goto/16 :goto_1 */
/* .line 1432 */
} // :cond_14
/* if-nez v4, :cond_0 */
/* .line 1434 */
v4 = this.menuButtons;
/* aget-object v4, v4, v8 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).X ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
/* int-to-float v4, v4 */
/* cmpl-float v4, v2, v4 */
/* if-ltz v4, :cond_0 */
v4 = this.menuButtons;
/* aget-object v4, v4, v8 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).X ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X()I
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Width ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Width()I
/* add-int/2addr v4, v6 */
/* int-to-float v4, v4 */
/* cmpg-float v4, v2, v4 */
/* if-gtz v4, :cond_0 */
/* .line 1436 */
v4 = this.menuButtons;
/* aget-object v4, v4, v8 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).Y ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
/* int-to-float v4, v4 */
/* cmpl-float v4, v3, v4 */
/* if-ltz v4, :cond_0 */
v4 = this.menuButtons;
/* aget-object v4, v4, v8 */
v4 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v4 ).Y ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y()I
v6 = this.menuButtons;
/* aget-object v6, v6, v8 */
v6 = (( de.nurogames.android.ticb.base.objects.objMenuButton ) v6 ).Height ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Height()I
/* add-int/2addr v4, v6 */
/* int-to-float v4, v4 */
/* cmpg-float v4, v3, v4 */
/* if-gtz v4, :cond_0 */
/* .line 1438 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v4, v4, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->outro_anim_done:Z */
/* if-nez v4, :cond_15 */
v4 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget-boolean v4, v4, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 1445 */
} // :cond_15
try { // :try_start_0
/* sget-boolean v4, Lde/nurogames/android/ticb/base/core/AppResources;->AMAZON_BUILD:Z */
if ( v4 != null) { // if-eqz v4, :cond_16
/* .line 1446 */
/* new-instance v1, Landroid/content/Intent; */
final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "http://www.amazon.com/gp/mas/dl/android?p="; // const-string v7, "http://www.amazon.com/gp/mas/dl/android?p="
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = de.nurogames.android.ticb.base.core.AppResources.FULL_PACKAGE;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v6 );
/* invoke-direct {v1, v4, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 1450 */
/* .local v1, "myIntent":Landroid/content/Intent; */
} // :goto_3
(( de.nurogames.android.ticb.base.views.TinyBeeView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getContext()Landroid/content/Context;
(( android.content.Context ) v4 ).startActivity ( v1 ); // invoke-virtual {v4, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_1 */
/* .line 1453 */
} // .end local v1 # "myIntent":Landroid/content/Intent;
/* :catch_0 */
/* move-exception v0 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* goto/16 :goto_1 */
/* .line 1448 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_16
try { // :try_start_1
/* new-instance v1, Landroid/content/Intent; */
final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "https://play.google.com/store/search?q="; // const-string v7, "https://play.google.com/store/search?q="
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = de.nurogames.android.ticb.base.core.AppResources.FULL_PACKAGE;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "&c=apps"; // const-string v7, "&c=apps"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v6 );
/* invoke-direct {v1, v4, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .restart local v1 # "myIntent":Landroid/content/Intent; */
/* .line 1460 */
} // .end local v1 # "myIntent":Landroid/content/Intent;
} // :cond_17
/* if-ne v4, v5, :cond_0 */
/* .line 1461 */
/* sget-boolean v4, Lde/nurogames/android/ticb/base/objects/objBee;->autojump:Z */
/* if-nez v4, :cond_0 */
/* .line 1462 */
/* goto/16 :goto_1 */
/* .line 1471 */
} // :cond_18
v6 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne v6, v5, :cond_19 */
/* .line 1472 */
if ( v6 != null) { // if-eqz v6, :cond_0
/* goto/16 :goto_1 */
/* .line 1479 */
} // :cond_19
v4 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne v4, v9, :cond_0 */
/* goto/16 :goto_1 */
} // .end method
public void setNewGameDialog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 990 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_newgame_dialog:Z */
/* .line 991 */
return;
} // .end method
public void setState ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "state" # I */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 1560 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->mMode:I */
/* .line 1561 */
/* if-ne p1, v0, :cond_2 */
/* .line 1563 */
de.nurogames.android.ticb.base.core.AppResources .switchMusic_MenuToGame ( );
/* .line 1565 */
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->newGame()V */
/* .line 1567 */
} // :cond_0
v0 = this.updateThread;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 1572 */
} // :cond_1
} // :goto_0
return;
/* .line 1570 */
} // :cond_2
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* sget-boolean v1, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
de.nurogames.android.ticb.base.views.TinyBeeView.GAME_PAUSED = (v0!= 0);
} // .end method
public void update ( ) {
/* .locals 3 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* .line 474 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->mMode:I */
/* if-ne v0, v2, :cond_2 */
/* .line 476 */
/* if-nez v0, :cond_3 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->show_exit_dialog:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* move v0, v1 */
} // :goto_0
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->isPreGameState:Z */
/* .line 477 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->isPreGameState:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 480 */
v0 = this.startCounter;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 481 */
/* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_is_shown:Z */
/* .line 484 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->showCounter()V */
/* .line 497 */
} // :cond_0
} // :goto_1
v0 = de.hellowins.Hellowins .getInstance ( );
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = de.hellowins.Hellowins .getInstance ( );
/* if-nez v0, :cond_1 */
/* .line 498 */
de.nurogames.android.ticb.base.views.TinyBeeView.GAME_PAUSED = (v2!= 0);
/* .line 501 */
} // :cond_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->runtime:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->runtime:I */
/* .line 504 */
v0 = this.mRedrawHandler;
/* const-wide/16 v1, 0x19 */
(( de.nurogames.android.ticb.base.views.TinyBeeView$RefreshHandler ) v0 ).sleep ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/nurogames/android/ticb/base/views/TinyBeeView$RefreshHandler;->sleep(J)V
/* .line 506 */
} // :cond_2
return;
} // :cond_3
/* move v0, v2 */
/* .line 476 */
/* .line 488 */
} // :cond_4
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/views/TinyBeeView;->counter_is_shown:Z */
/* .line 490 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.progress;
(( de.nurogames.android.ticb.base.objects.objLevelProgressBar ) v0 ).animate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->animate()V
/* .line 492 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.background;
(( de.nurogames.android.ticb.base.objects.objAnimBackground ) v0 ).animate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->animate()V
} // .end method
