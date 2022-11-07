public class de.nurogames.android.ticb.base.objects.objBee {
	 /* .source "objBee.java" */
	 /* # static fields */
	 private static final Integer AIR_BONUS_TIME;
	 private static final Integer BEE_DEAD;
	 private static final Integer BEE_FAST;
	 private static final Integer BEE_HEAVY;
	 private static final Integer BEE_SLOW;
	 private static final Float BOOST_GRAVITY;
	 private static final Float BOOST_UP_GRAVITY;
	 private static final Float GRAVITY;
	 private static final Float MIN_X_SPEED;
	 private static final Integer MOVE_RESULT_OUCH;
	 private static final Integer MOVE_RESULT_SWEET;
	 public static Boolean autojump;
	 public static Integer bee_id;
	 public static Integer bonusPts;
	 private static de.nurogames.android.ticb.base.core.Vector3D c;
	 public static Integer currentTask;
	 private static de.nurogames.android.ticb.base.core.Vector3D d;
	 public static Integer hcombCount;
	 public static Integer honeyCount;
	 private static Float max_bee_rotation;
	 private static Float min_bee_rotation;
	 private static de.nurogames.android.ticb.base.core.Vector3D origin;
	 public static de.nurogames.android.ticb.base.core.Vector3D playerPos;
	 public static de.nurogames.android.ticb.base.core.Vector3D playerVel;
	 public static Integer pollenCount;
	 private static de.nurogames.android.ticb.base.core.Vector3D segment;
	 public static Integer timerAir;
	 private static de.nurogames.android.ticb.base.core.Vector3D toPlayer;
	 /* # instance fields */
	 private Integer AIR_BONUS_MULT;
	 private Integer ANGLE_HORIZONTAL;
	 private Integer BEE_MAX_HEIGHT;
	 private Integer CRITICAL_FALL_SPEED;
	 private Integer EXCLAIM_TIME;
	 private Float FPS_minus_once;
	 private Float FPS_plus_onceNhalf;
	 private Float angle;
	 private Integer bee_animid;
	 private Integer bee_rotationid;
	 java.lang.Thread beerotation;
	 private Integer exclaimTimer;
	 private Integer exclaimType;
	 public Boolean isGameOver;
	 private Boolean isGrounded;
	 private Boolean isLocked;
	 private Integer levelSegmentIndex;
	 public Integer maxAir;
	 public Integer maxSlog;
	 private Float multiplier;
	 public Integer ouchCount;
	 private Integer playerHeight;
	 private Integer playerWidth;
	 private Integer playerYOffset;
	 private Float player_segment_dotproduct;
	 private java.util.Random rnd;
	 private Float rotation;
	 private Integer rotation_degree;
	 private Boolean slogging;
	 public Integer sweetChain;
	 public Integer sweetCount;
	 public Integer sweetMax;
	 public Integer timerSlog;
	 public Float topSpeed;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.objects.objBee ( ) {
		 /* .locals 8 */
		 /* .prologue */
		 int v7 = 0; // const/4 v7, 0x0
		 /* const-wide/high16 v5, 0x3ff0000000000000L # 1.0 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 26 */
		 /* .line 38 */
		 /* const-wide v0, 0x3fc6666660000000L # 0.17499999701976776 */
		 java.lang.Math .sqrt ( v5,v6 );
		 /* move-result-wide v2 */
		 /* mul-double/2addr v0, v2 */
		 /* double-to-float v0, v0 */
		 /* .line 39 */
		 /* const-wide v0, 0x3ff4ccccc0000000L # 1.2999999523162842 */
		 java.lang.Math .sqrt ( v5,v6 );
		 /* move-result-wide v2 */
		 /* mul-double/2addr v0, v2 */
		 /* double-to-float v0, v0 */
		 /* .line 40 */
		 /* const-wide v0, 0x3fc999999999999aL # 0.2 */
		 java.lang.Math .sqrt ( v5,v6 );
		 /* move-result-wide v2 */
		 /* mul-double/2addr v0, v2 */
		 /* double-to-float v0, v0 */
		 /* .line 52 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* invoke-direct {v0, v4, v4}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
		 /* .line 53 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* invoke-direct {v0, v4, v4}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
		 /* .line 91 */
		 /* .line 93 */
		 de.nurogames.android.ticb.base.objects.objBee.autojump = (v7!= 0);
		 /* .line 101 */
		 /* const v0, -0x3db86666 # -49.9f */
		 /* .line 102 */
		 /* const v0, 0x4247999a # 49.9f */
		 /* .line 111 */
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.objects.objBee ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* const/16 v3, 0x9 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 120 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 20 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 this.rnd = v0;
		 /* .line 22 */
		 /* const/high16 v0, -0x3de00000 # -40.0f */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->FPS_minus_once:F */
		 /* .line 23 */
		 /* const/high16 v0, 0x42700000 # 60.0f */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->FPS_plus_onceNhalf:F */
		 /* .line 33 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->AIR_BONUS_MULT:I */
		 /* .line 43 */
		 /* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
		 /* .line 46 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
		 /* .line 69 */
		 /* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGameOver:Z */
		 /* .line 89 */
		 /* const/16 v0, 0x14 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->EXCLAIM_TIME:I */
		 /* .line 95 */
		 /* const/16 v0, -0x15e */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->BEE_MAX_HEIGHT:I */
		 /* .line 97 */
		 /* const/16 v0, 0xb4 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->ANGLE_HORIZONTAL:I */
		 /* .line 99 */
		 /* const/16 v0, 0xe */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->CRITICAL_FALL_SPEED:I */
		 /* .line 103 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->rotation_degree:I */
		 /* .line 182 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objBee$1; */
		 final String v1 = "bee_rotation"; // const-string v1, "bee_rotation"
		 /* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/objects/objBee$1;-><init>(Lde/nurogames/android/ticb/base/objects/objBee;Ljava/lang/String;)V */
		 this.beerotation = v0;
		 /* .line 123 */
		 de.nurogames.android.ticb.base.objects.objBee .generateRotations ( );
		 /* .line 125 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
		 /* aget-object v0, v0, v2 */
		 /* aget-object v0, v0, v3 */
		 /* aget-object v0, v0, v2 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->playerWidth:I */
		 /* .line 126 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
		 /* aget-object v0, v0, v2 */
		 /* aget-object v0, v0, v3 */
		 /* aget-object v0, v0, v2 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->playerHeight:I */
		 /* .line 128 */
		 /* .line 129 */
		 return;
	 } // .end method
	 static void access$0 ( de.nurogames.android.ticb.base.objects.objBee p0, Float p1 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 47 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->rotation:F */
		 return;
	 } // .end method
	 static Float access$1 ( de.nurogames.android.ticb.base.objects.objBee p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 47 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->rotation:F */
	 } // .end method
	 static Float access$2 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 101 */
	 } // .end method
	 static Float access$3 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 102 */
	 } // .end method
	 static Integer access$4 ( de.nurogames.android.ticb.base.objects.objBee p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 103 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->rotation_degree:I */
	 } // .end method
	 static void access$5 ( de.nurogames.android.ticb.base.objects.objBee p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 46 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
		 return;
	 } // .end method
	 static Integer access$6 ( de.nurogames.android.ticb.base.objects.objBee p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 43 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
	 } // .end method
	 static void access$7 ( de.nurogames.android.ticb.base.objects.objBee p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 43 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
		 return;
	 } // .end method
	 public static void generateRotations ( ) {
		 /* .locals 21 */
		 /* .prologue */
		 /* .line 436 */
		 /* const/16 v16, 0x4 */
		 /* .line 437 */
		 /* .local v16, "degree_per_step":I */
		 /* const/16 v19, 0x8 */
		 /* .line 438 */
		 /* .local v19, "steps":I */
		 v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
		 /* array-length v14, v1 */
		 /* .line 439 */
		 /* .local v14, "bees":I */
		 /* add-int/lit8 v15, v19, 0x1 */
		 /* .line 440 */
		 /* .local v15, "cnt":I */
		 /* const/16 v18, 0x1 */
		 /* .local v18, "s":I */
	 } // :goto_0
	 /* move/from16 v0, v18 */
	 /* if-le v0, v15, :cond_0 */
	 /* .line 474 */
	 return;
	 /* .line 442 */
} // :cond_0
/* const/16 v20, 0x0 */
/* .local v20, "x":I */
} // :goto_1
/* move/from16 v0, v20 */
/* if-lt v0, v14, :cond_1 */
/* .line 440 */
/* add-int/lit8 v18, v18, 0x1 */
/* .line 444 */
} // :cond_1
/* const/16 v17, 0x9 */
/* .line 447 */
/* .local v17, "master":I */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
/* aget-object v1, v1, v17 */
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
v4 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 448 */
/* .local v4, "w":I */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
/* aget-object v1, v1, v17 */
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
v5 = (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 451 */
/* .local v5, "h":I */
/* new-instance v6, Landroid/graphics/Matrix; */
/* invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V */
/* .line 454 */
/* .local v6, "mtxa":Landroid/graphics/Matrix; */
/* mul-int v1, v18, v16 */
/* neg-int v1, v1 */
/* int-to-float v1, v1 */
(( android.graphics.Matrix ) v6 ).postRotate ( v1 ); // invoke-virtual {v6, v1}, Landroid/graphics/Matrix;->postRotate(F)Z
/* .line 455 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
/* sub-int v2, v17, v18 */
/* aget-object v8, v1, v2 */
int v9 = 0; // const/4 v9, 0x0
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
/* aget-object v1, v1, v17 */
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v7 = 1; // const/4 v7, 0x1
/* invoke-static/range {v1 ..v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v1, v8, v9 */
/* .line 456 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
/* sub-int v2, v17, v18 */
/* aget-object v8, v1, v2 */
int v9 = 1; // const/4 v9, 0x1
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
/* aget-object v1, v1, v17 */
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v7 = 1; // const/4 v7, 0x1
/* invoke-static/range {v1 ..v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v1, v8, v9 */
/* .line 457 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
/* sub-int v2, v17, v18 */
/* aget-object v8, v1, v2 */
int v9 = 0; // const/4 v9, 0x0
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
/* aget-object v1, v1, v17 */
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v7 = 1; // const/4 v7, 0x1
/* invoke-static/range {v1 ..v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v1, v8, v9 */
/* .line 458 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
/* sub-int v2, v17, v18 */
/* aget-object v8, v1, v2 */
int v9 = 1; // const/4 v9, 0x1
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
/* aget-object v1, v1, v17 */
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v7 = 1; // const/4 v7, 0x1
/* invoke-static/range {v1 ..v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v1, v8, v9 */
/* .line 459 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 2; // const/4 v2, 0x2
/* aget-object v1, v1, v2 */
/* sub-int v2, v17, v18 */
/* aget-object v8, v1, v2 */
int v9 = 0; // const/4 v9, 0x0
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 2; // const/4 v2, 0x2
/* aget-object v1, v1, v2 */
/* aget-object v1, v1, v17 */
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v7 = 1; // const/4 v7, 0x1
/* invoke-static/range {v1 ..v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v1, v8, v9 */
/* .line 460 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 3; // const/4 v2, 0x3
/* aget-object v1, v1, v2 */
/* sub-int v2, v17, v18 */
/* aget-object v8, v1, v2 */
int v9 = 0; // const/4 v9, 0x0
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 3; // const/4 v2, 0x3
/* aget-object v1, v1, v2 */
/* aget-object v1, v1, v17 */
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v7 = 1; // const/4 v7, 0x1
/* invoke-static/range {v1 ..v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v1, v8, v9 */
/* .line 462 */
/* new-instance v12, Landroid/graphics/Matrix; */
/* invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V */
/* .line 464 */
/* .local v12, "mtxb":Landroid/graphics/Matrix; */
/* mul-int v1, v18, v16 */
/* int-to-float v1, v1 */
(( android.graphics.Matrix ) v12 ).postRotate ( v1 ); // invoke-virtual {v12, v1}, Landroid/graphics/Matrix;->postRotate(F)Z
/* .line 465 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
/* add-int v2, v17, v18 */
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v7 = 0; // const/4 v7, 0x0
/* aget-object v3, v3, v7 */
/* aget-object v3, v3, v17 */
int v7 = 0; // const/4 v7, 0x0
/* aget-object v7, v3, v7 */
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v13 = 1; // const/4 v13, 0x1
/* move v10, v4 */
/* move v11, v5 */
/* invoke-static/range {v7 ..v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v3, v1, v2 */
/* .line 466 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
/* add-int v2, v17, v18 */
/* aget-object v1, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v7 = 0; // const/4 v7, 0x0
/* aget-object v3, v3, v7 */
/* aget-object v3, v3, v17 */
int v7 = 1; // const/4 v7, 0x1
/* aget-object v7, v3, v7 */
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v13 = 1; // const/4 v13, 0x1
/* move v10, v4 */
/* move v11, v5 */
/* invoke-static/range {v7 ..v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v3, v1, v2 */
/* .line 467 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
/* add-int v2, v17, v18 */
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v7 = 1; // const/4 v7, 0x1
/* aget-object v3, v3, v7 */
/* aget-object v3, v3, v17 */
int v7 = 0; // const/4 v7, 0x0
/* aget-object v7, v3, v7 */
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v13 = 1; // const/4 v13, 0x1
/* move v10, v4 */
/* move v11, v5 */
/* invoke-static/range {v7 ..v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v3, v1, v2 */
/* .line 468 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v1, v1, v2 */
/* add-int v2, v17, v18 */
/* aget-object v1, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v7 = 1; // const/4 v7, 0x1
/* aget-object v3, v3, v7 */
/* aget-object v3, v3, v17 */
int v7 = 1; // const/4 v7, 0x1
/* aget-object v7, v3, v7 */
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v13 = 1; // const/4 v13, 0x1
/* move v10, v4 */
/* move v11, v5 */
/* invoke-static/range {v7 ..v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v3, v1, v2 */
/* .line 469 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 2; // const/4 v2, 0x2
/* aget-object v1, v1, v2 */
/* add-int v2, v17, v18 */
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v7 = 2; // const/4 v7, 0x2
/* aget-object v3, v3, v7 */
/* aget-object v3, v3, v17 */
int v7 = 0; // const/4 v7, 0x0
/* aget-object v7, v3, v7 */
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v13 = 1; // const/4 v13, 0x1
/* move v10, v4 */
/* move v11, v5 */
/* invoke-static/range {v7 ..v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v3, v1, v2 */
/* .line 470 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v2 = 3; // const/4 v2, 0x3
/* aget-object v1, v1, v2 */
/* add-int v2, v17, v18 */
/* aget-object v1, v1, v2 */
int v2 = 0; // const/4 v2, 0x0
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v7 = 3; // const/4 v7, 0x3
/* aget-object v3, v3, v7 */
/* aget-object v3, v3, v17 */
int v7 = 0; // const/4 v7, 0x0
/* aget-object v7, v3, v7 */
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v13 = 1; // const/4 v13, 0x1
/* move v10, v4 */
/* move v11, v5 */
/* invoke-static/range {v7 ..v13}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* aput-object v3, v1, v2 */
/* .line 442 */
/* add-int/lit8 v20, v20, 0x1 */
/* goto/16 :goto_1 */
} // .end method
/* # virtual methods */
public void animate ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 261 */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_0 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* const/high16 v1, -0x3f000000 # -8.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* .line 262 */
v0 = de.nurogames.android.ticb.base.core.AppResources.SND_BEE_YEEPEE;
v1 = this.rnd;
v2 = de.nurogames.android.ticb.base.core.AppResources.SND_BEE_YEEPEE;
/* array-length v2, v2 */
v1 = (( java.util.Random ) v1 ).nextInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
/* aget v0, v0, v1 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v0 );
/* .line 265 */
} // :cond_0
/* sget-boolean v0, Lde/nurogames/android/ticb/base/objects/objBee;->autojump:Z */
/* if-nez v0, :cond_2 */
/* .line 267 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGrounded:Z */
/* if-nez v0, :cond_3 */
/* .line 269 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 280 */
} // :cond_1
} // :goto_0
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->slogging:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 282 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->timerSlog:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->timerSlog:I */
/* .line 283 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_2 */
/* .line 284 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* const/high16 v2, 0x40000000 # 2.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 294 */
} // :cond_2
} // :goto_1
return;
/* .line 271 */
} // :cond_3
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGrounded:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-lez v0, :cond_1 */
/* .line 273 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
v0 = java.lang.Math .max ( v0,v1 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
/* .line 274 */
/* const/16 v1, 0x78 */
/* if-le v0, v1, :cond_4 */
/* .line 275 */
/* add-int/lit8 v1, v1, -0x78 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->AIR_BONUS_MULT:I */
/* mul-int/2addr v1, v2 */
/* add-int/2addr v0, v1 */
/* .line 276 */
} // :cond_4
/* .line 286 */
} // :cond_5
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->slogging:Z */
/* if-nez v0, :cond_2 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->timerSlog:I */
/* if-lez v0, :cond_2 */
/* .line 288 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->timerSlog:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->maxSlog:I */
v0 = java.lang.Math .max ( v0,v1 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->maxSlog:I */
/* .line 289 */
/* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->timerSlog:I */
} // .end method
public void init ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 135 */
v2 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v2, v3 */
/* .line 136 */
/* .local v0, "vX":I */
v2 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v2, v3 */
/* .line 137 */
/* .local v1, "vY":I */
/* new-instance v2, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* int-to-float v3, v0 */
/* int-to-float v4, v1 */
/* invoke-direct {v2, v3, v4}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* .line 140 */
/* new-instance v2, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* const/high16 v3, -0x3f200000 # -7.0f */
/* invoke-direct {v2, v6, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* .line 143 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGrounded:Z */
/* .line 144 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isLocked:Z */
/* .line 145 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGameOver:Z */
/* .line 148 */
/* .line 149 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->timerSlog:I */
/* .line 151 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
/* .line 152 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->maxSlog:I */
/* .line 154 */
/* iput v6, p0, Lde/nurogames/android/ticb/base/objects/objBee;->topSpeed:F */
/* .line 156 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
/* .line 158 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* .line 159 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetChain:I */
/* .line 160 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetMax:I */
/* .line 162 */
/* .line 164 */
/* .line 165 */
/* .line 166 */
/* .line 168 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objBee;->exclaimTimer:I */
/* .line 171 */
/* .line 174 */
int v2 = 1; // const/4 v2, 0x1
/* .line 176 */
/* sget-boolean v2, Lde/nurogames/android/ticb/base/core/_Display;->useHighRes:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* const/high16 v2, 0x40000000 # 2.0f */
} // :goto_0
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->multiplier:F */
/* .line 178 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->playerHeight:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgOuch;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v3, v3 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objBee;->multiplier:F */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* float-to-int v2, v2 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->playerYOffset:I */
/* .line 180 */
return;
/* .line 176 */
} // :cond_0
/* const/high16 v2, 0x3fc00000 # 1.5f */
} // .end method
public void landingResult ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "result" # I */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
/* .line 408 */
/* if-ne p1, v3, :cond_2 */
/* .line 409 */
v0 = de.nurogames.android.ticb.base.core.AppResources.SND_BEE_OUCHED;
v1 = this.rnd;
v2 = de.nurogames.android.ticb.base.core.AppResources.SND_BEE_OUCHED;
/* array-length v2, v2 */
v1 = (( java.util.Random ) v1 ).nextInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
/* aget v0, v0, v1 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v0 );
/* .line 410 */
/* if-ne v0, v3, :cond_0 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->FPS_minus_once:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 411 */
} // :cond_0
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
/* .line 412 */
/* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->exclaimType:I */
/* .line 413 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->EXCLAIM_TIME:I */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->exclaimTimer:I */
/* .line 429 */
} // :cond_1
} // :goto_0
return;
/* .line 415 */
} // :cond_2
/* if-nez p1, :cond_1 */
/* .line 416 */
v0 = de.nurogames.android.ticb.base.core.AppResources.SND_BEE_SWEET;
v1 = this.rnd;
v2 = de.nurogames.android.ticb.base.core.AppResources.SND_BEE_SWEET;
/* array-length v2, v2 */
v1 = (( java.util.Random ) v1 ).nextInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
/* aget v0, v0, v1 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v0 );
/* .line 417 */
/* if-ne v0, v3, :cond_3 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->FPS_plus_onceNhalf:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 418 */
} // :cond_3
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
/* .line 419 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetChain:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetChain:I */
/* .line 420 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetMax:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetChain:I */
v0 = java.lang.Math .max ( v0,v1 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetMax:I */
/* .line 422 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->exclaimType:I */
/* .line 424 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->EXCLAIM_TIME:I */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->exclaimTimer:I */
/* .line 426 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetChain:I */
/* mul-int/lit8 v1, v1, 0x19 */
/* add-int/2addr v0, v1 */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 7 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v4, 0x40000000 # 2.0f */
/* .line 209 */
v0 = this.beerotation;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 212 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGameOver:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 214 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v1 = 3; // const/4 v1, 0x3
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v6 */
/* .line 215 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v2, v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
/* aget-object v2, v2, v3 */
/* aget-object v2, v2, v6 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* .line 216 */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* add-float/2addr v2, v4 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v3, v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
/* aget-object v3, v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
/* aget-object v3, v3, v4 */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v3, v3 */
/* sub-float/2addr v2, v3 */
/* .line 213 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v5 ); // invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 233 */
} // :goto_0
return;
/* .line 219 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v1, 0x41080000 # 8.5f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_1 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_1 */
/* .line 221 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
int v1 = 1; // const/4 v1, 0x1
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
/* aget-object v0, v0, v1 */
/* .line 222 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v2, v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
/* aget-object v2, v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
/* aget-object v2, v2, v3 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* .line 223 */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* add-float/2addr v2, v4 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v3, v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
/* aget-object v3, v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
/* aget-object v3, v3, v4 */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v3, v3 */
/* sub-float/2addr v2, v3 */
/* .line 220 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v5 ); // invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 228 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
/* aget-object v0, v0, v1 */
/* .line 229 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v2, v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
/* aget-object v2, v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
/* aget-object v2, v2, v3 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* .line 230 */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* add-float/2addr v2, v4 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v3, v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_rotationid:I */
/* aget-object v3, v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objBee;->bee_animid:I */
/* aget-object v3, v3, v4 */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v3, v3 */
/* sub-float/2addr v2, v3 */
/* .line 227 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v5 ); // invoke-virtual {p1, v0, v1, v2, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_0 */
} // .end method
public void onDrawUI ( android.graphics.Canvas p0 ) {
/* .locals 5 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 238 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->exclaimTimer:I */
/* if-lez v0, :cond_0 */
/* .line 240 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->exclaimType:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
/* .line 242 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgOuch;
/* .line 243 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->playerWidth:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* .line 244 */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->playerYOffset:I */
/* int-to-float v3, v3 */
/* sub-float/2addr v2, v3 */
/* .line 241 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v4 ); // invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 254 */
} // :goto_0
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->exclaimTimer:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->exclaimTimer:I */
/* .line 257 */
} // :cond_0
return;
/* .line 248 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.core.AppResources.imgSweet;
/* .line 249 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->playerWidth:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* .line 250 */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->playerYOffset:I */
/* int-to-float v3, v3 */
/* sub-float/2addr v2, v3 */
/* .line 247 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v4 ); // invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
} // .end method
public void playerPhysics ( ) {
/* .locals 9 */
/* .prologue */
int v8 = 2; // const/4 v8, 0x2
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
int v7 = 0; // const/4 v7, 0x0
/* .line 302 */
/* if-ne v0, v8, :cond_7 */
/* .line 303 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v3, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* add-float/2addr v3, v4 */
/* iput v3, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 304 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* cmpg-float v0, v0, v7 */
/* if-gez v0, :cond_0 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v3, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* add-float/2addr v3, v4 */
/* iput v3, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 310 */
} // :cond_0
} // :goto_0
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGrounded:Z */
if ( v0 != null) { // if-eqz v0, :cond_8
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
de.nurogames.android.ticb.base.core.VectorMath .length ( v0 );
/* move-result-wide v3 */
/* const-wide/high16 v5, 0x4010000000000000L # 4.0 */
/* cmpg-double v0, v3, v5 */
/* if-lez v0, :cond_1 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* cmpg-float v0, v0, v7 */
/* if-gtz v0, :cond_8 */
/* .line 312 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
de.nurogames.android.ticb.base.core.VectorMath .normalize ( v0 );
/* .line 314 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* const/high16 v3, 0x40800000 # 4.0f */
de.nurogames.android.ticb.base.core.VectorMath .multiply ( v0,v3 );
/* .line 316 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* cmpg-float v0, v0, v7 */
/* if-gtz v0, :cond_2 */
/* .line 317 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* const/high16 v3, -0x40800000 # -1.0f */
de.nurogames.android.ticb.base.core.VectorMath .multiply ( v0,v3 );
/* .line 319 */
} // :cond_2
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->slogging:Z */
/* .line 325 */
} // :goto_1
v0 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
v3 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
de.nurogames.android.ticb.base.core.VectorMath .add ( v0,v3 );
/* .line 327 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->BEE_MAX_HEIGHT:I */
/* int-to-float v3, v3 */
/* cmpg-float v0, v0, v3 */
/* if-gtz v0, :cond_3 */
/* .line 328 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* cmpg-float v0, v0, v7 */
/* if-gez v0, :cond_3 */
/* .line 329 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v3, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* const v4, 0x3e99999a # 0.3f */
/* add-float/2addr v3, v4 */
/* iput v3, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 333 */
} // :cond_3
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
/* .line 334 */
} // :goto_2
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
(( java.util.Vector ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v3 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* cmpg-float v0, v0, v3 */
/* if-ltz v0, :cond_9 */
/* .line 337 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
/* .line 340 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
(( java.util.Vector ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .line 341 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
/* add-int/lit8 v3, v3, 0x1 */
(( java.util.Vector ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
v3 = de.nurogames.android.ticb.base.objects.objBee.origin;
de.nurogames.android.ticb.base.core.VectorMath .subtract ( v0,v3 );
/* .line 342 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
v3 = de.nurogames.android.ticb.base.objects.objBee.origin;
de.nurogames.android.ticb.base.core.VectorMath .subtract ( v0,v3 );
/* .line 343 */
v0 = de.nurogames.android.ticb.base.objects.objBee.toPlayer;
v3 = de.nurogames.android.ticb.base.objects.objBee.segment;
de.nurogames.android.ticb.base.core.VectorMath .cross ( v0,v3 );
/* .line 344 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
v3 = de.nurogames.android.ticb.base.objects.objBee.segment;
de.nurogames.android.ticb.base.core.VectorMath .cross ( v0,v3 );
/* .line 346 */
v0 = de.nurogames.android.ticb.base.objects.objBee.c;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* cmpg-float v0, v0, v7 */
/* if-gez v0, :cond_4 */
v0 = de.nurogames.android.ticb.base.objects.objBee.d;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* cmpg-float v0, v0, v7 */
/* if-ltz v0, :cond_5 */
} // :cond_4
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isLocked:Z */
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 349 */
} // :cond_5
v0 = de.nurogames.android.ticb.base.objects.objBee.origin;
/* .line 350 */
v3 = de.nurogames.android.ticb.base.objects.objBee.segment;
v4 = de.nurogames.android.ticb.base.objects.objBee.toPlayer;
v5 = de.nurogames.android.ticb.base.objects.objBee.segment;
v4 = de.nurogames.android.ticb.base.core.VectorMath .dotProduct ( v4,v5 );
v5 = de.nurogames.android.ticb.base.objects.objBee.segment;
v6 = de.nurogames.android.ticb.base.objects.objBee.segment;
v5 = de.nurogames.android.ticb.base.core.VectorMath .dotProduct ( v5,v6 );
/* div-float/2addr v4, v5 */
de.nurogames.android.ticb.base.core.VectorMath .multiply ( v3,v4 );
/* .line 348 */
de.nurogames.android.ticb.base.core.VectorMath .add ( v0,v3 );
/* .line 352 */
v0 = de.nurogames.android.ticb.base.objects.objBee.segment;
de.nurogames.android.ticb.base.core.VectorMath .normalize ( v0 );
/* .line 354 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGrounded:Z */
if ( v0 != null) { // if-eqz v0, :cond_a
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
/* if-eq v0, v3, :cond_a */
/* .line 356 */
v0 = de.nurogames.android.ticb.base.objects.objBee.segment;
v3 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
de.nurogames.android.ticb.base.core.VectorMath .length ( v3 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
de.nurogames.android.ticb.base.core.VectorMath .multiply ( v0,v3 );
/* .line 377 */
} // :goto_3
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* const v3, 0x3f7fbe77 # 0.999f */
de.nurogames.android.ticb.base.core.VectorMath .multiply ( v0,v3 );
/* .line 379 */
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGrounded:Z */
/* .line 385 */
} // :goto_4
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGrounded:Z */
if ( v0 != null) { // if-eqz v0, :cond_e
/* if-ne v0, v8, :cond_e */
/* move v0, v1 */
} // :goto_5
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isLocked:Z */
/* .line 388 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
/* .line 391 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/objects/objBee;->autojump:Z */
/* if-nez v0, :cond_6 */
/* .line 392 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->topSpeed:F */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v0 = java.lang.Math .max ( v0,v1 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->topSpeed:F */
/* .line 394 */
} // :cond_6
return;
/* .line 307 */
} // :cond_7
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v3, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* add-float/2addr v3, v4 */
/* iput v3, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* goto/16 :goto_0 */
/* .line 322 */
} // :cond_8
/* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->slogging:Z */
/* goto/16 :goto_1 */
/* .line 335 */
} // :cond_9
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->levelSegmentIndex:I */
/* goto/16 :goto_2 */
/* .line 360 */
} // :cond_a
v0 = de.nurogames.android.ticb.base.objects.objBee.segment;
v3 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
v0 = de.nurogames.android.ticb.base.core.VectorMath .dotProduct ( v0,v3 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->player_segment_dotproduct:F */
/* .line 362 */
v0 = de.nurogames.android.ticb.base.objects.objBee.segment;
v3 = de.nurogames.android.ticb.base.objects.objBee.segment;
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objBee;->player_segment_dotproduct:F */
de.nurogames.android.ticb.base.core.VectorMath .multiply ( v3,v4 );
v0 = de.nurogames.android.ticb.base.core.VectorMath .calculateAngle ( v0,v3 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->angle:F */
/* .line 364 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->angle:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->ANGLE_HORIZONTAL:I */
/* int-to-float v3, v3 */
/* cmpg-float v0, v0, v3 */
/* if-gtz v0, :cond_c */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->CRITICAL_FALL_SPEED:I */
/* int-to-float v3, v3 */
/* cmpl-float v0, v0, v3 */
/* if-lez v0, :cond_c */
/* if-le v0, v8, :cond_c */
/* .line 365 */
(( de.nurogames.android.ticb.base.objects.objBee ) p0 ).landingResult ( v1 ); // invoke-virtual {p0, v1}, Lde/nurogames/android/ticb/base/objects/objBee;->landingResult(I)V
/* .line 366 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->sweetChain:I */
/* .line 373 */
} // :cond_b
} // :goto_6
v0 = de.nurogames.android.ticb.base.objects.objBee.segment;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->player_segment_dotproduct:F */
de.nurogames.android.ticb.base.core.VectorMath .multiply ( v0,v3 );
/* goto/16 :goto_3 */
/* .line 369 */
} // :cond_c
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGrounded:Z */
/* if-nez v0, :cond_b */
/* .line 370 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objBee;->angle:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->ANGLE_HORIZONTAL:I */
/* int-to-float v3, v3 */
/* cmpl-float v0, v0, v3 */
/* if-ltz v0, :cond_b */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objBee;->CRITICAL_FALL_SPEED:I */
/* int-to-float v3, v3 */
/* cmpl-float v0, v0, v3 */
/* if-lez v0, :cond_b */
/* .line 371 */
(( de.nurogames.android.ticb.base.objects.objBee ) p0 ).landingResult ( v2 ); // invoke-virtual {p0, v2}, Lde/nurogames/android/ticb/base/objects/objBee;->landingResult(I)V
/* .line 382 */
} // :cond_d
/* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/objects/objBee;->isGrounded:Z */
/* goto/16 :goto_4 */
} // :cond_e
/* move v0, v2 */
/* .line 385 */
/* goto/16 :goto_5 */
} // .end method
