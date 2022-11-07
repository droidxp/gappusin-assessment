public class de.nurogames.android.ticb.base.objects.objTerrainMap {
	 /* .source "objTerrainMap.java" */
	 /* # static fields */
	 private static final Float CHECKPOINT_INCREMENT;
	 static I CURVE_AMP;
	 static I CURVE_OFFSET;
	 private static final Float FIRST_CHECKPOINT;
	 static I PHASE_SHIFT;
	 static I WAVE_LENGHT;
	 private static java.util.Vector assets;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Vector", */
	 /* "<", */
	 /* "Lde/nurogames/android/ticb/base/objects/objTerrainAsset;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static de.nurogames.android.ticb.base.core.Vector3D autojump_vectors;
private static android.graphics.BitmapShader bitmap_shader;
public static de.nurogames.android.ticb.base.objects.objCam cam;
private static java.util.Vector drop_indi;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Lde/nurogames/android/ticb/base/objects/objScoreIndicator;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.util.Vector drops;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Lde/nurogames/android/ticb/base/objects/objHoneyDrop;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.util.Iterator i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Iterator", */
/* "<", */
/* "Lde/nurogames/android/ticb/base/core/particle;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static Integer lastSegment;
private static java.util.Hashtable lcm;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Hashtable", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static java.util.Vector levelMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Lde/nurogames/android/ticb/base/core/Vector3D;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static Integer level_jump_max;
private static Integer level_jump_min;
static final line_colors;
private static android.graphics.LinearGradient linearshader_darkening;
private static android.graphics.LinearGradient linearshader_waterbase;
private static de.nurogames.android.ticb.base.objects.objTerrainAsset mObjTerrainAssetItem;
private static Float map_fall_rate;
private static final android.graphics.Path map_grnd;
private static de.nurogames.android.ticb.base.core.Vector3D null_vector;
private static de.nurogames.android.ticb.base.core.particle p;
private static de.nurogames.android.ticb.base.core.Vector3D player;
private static java.util.Vector pollem;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Lde/nurogames/android/ticb/base/objects/objPollem;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static de.nurogames.android.ticb.base.objects.objPollem pollemItem;
private static java.util.Vector rainParticles;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Lde/nurogames/android/ticb/base/core/particle;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final Float raise_interval;
private static android.graphics.Typeface tf;
private static de.nurogames.android.ticb.base.core.Vector3D v3D;
private static de.nurogames.android.ticb.base.core.Vector3D v3Db;
private static de.nurogames.android.ticb.base.core.Vector3D vCurLevelSeg;
private static de.nurogames.android.ticb.base.core.Vector3D vec3D;
private static Integer water_bottom;
private static final Integer water_radius;
private static Integer water_top;
/* # instance fields */
private Float AUTOJUMP_X_VELOCITY;
private final Integer CHECKPOINT_TIME;
private final Float CHECKPOINT_TIME_EASY;
private final Float CHECKPOINT_TIME_HARD;
private final Float CHECKPOINT_TIME_NORMAL;
private Float ENDLESS_LEVEL_BONUS;
private Integer FONT_MEDIUM;
public Boolean GAME_COMPLETED;
public Boolean GAME_OVER;
private final Integer GAME_TIME_PRE;
private final Integer HCOMB_INTERVAL;
private Integer HCOMB_TO_MAP_OFFSET;
private final Integer HONEY_INTERVAL;
private Integer HONEY_ROW_LENGTH;
private Integer HONEY_SPACING;
private Integer HONEY_TO_MAP_OFFSET;
private Integer LEVEL_INDICATOR_FONTSIZE;
private Integer MAX_DROP_SNDS;
private Integer MAX_LEVELS;
private Integer MAX_LEVEL_SEGMENTS;
private final Integer POLLEM_INTERVAL;
private Float POLLEM_SPEED;
private Integer SEGMENT_WIDTH;
java.lang.Thread addThread;
Integer anim_pollem_size;
Integer asset_size;
private Integer bad_weather_end_anim_x_speed;
private Integer bad_weather_width;
private Integer bee_center;
java.lang.Thread buildMapThread;
private Float cam_n_double_display_X;
private Float cam_n_double_display_Y;
private Float cam_x;
private Float cam_y;
private Integer center;
private Float check;
java.lang.Thread checkpointThread;
private Float checkpoint_raise;
public Integer checkpoints;
private Integer cnt;
private Integer cur_level;
private Integer distance_to_checkpoint;
private final Integer double_display_height;
private final Integer double_display_width;
Integer draw_pollem_size;
private Integer draw_water_times;
private Integer drop_snd_id;
Integer dropindi_size;
Integer drops_size;
public Integer endless_mode_checkpoint_cnt;
private fetched_all_honey;
private Float fx;
public Float gameTimer;
private Float hive_x;
private Float hive_y;
private Integer honey_drop_this_level;
private Integer ispre;
private Float item_w_h;
private Float item_x_w;
private Integer ival;
public Float lastCheckpoint;
private Integer levelSegmentIndex;
private Float level_ending_offset;
private Integer level_indicator_x;
private Integer level_indicator_y;
private Float level_xpos;
private Float level_ypos;
private final android.graphics.Paint mDarkeningPaint;
private final android.graphics.Paint mTerrainFillPaint;
private final android.graphics.Paint mTerrainLinePaint;
private final android.graphics.Paint mUIPaintFillWhite;
private final android.graphics.Paint mUIPaintStrokeWhite;
private final android.graphics.Paint mWaterPaint;
private Integer map_size;
private de.nurogames.android.ticb.base.objects.objHoneyDrop mobjHoneyDrop;
de.nurogames.android.ticb.base.core.Vector3D newRainVector;
public Float nextCheckpoint;
private Float nextMapY;
public Boolean outro_anim_done;
private Float playerY;
private Integer pollembonus;
private Integer rain_drop_len;
private Integer rain_lifetime;
private Integer release_delay;
private final java.util.Random rnd;
private Integer score;
private de.nurogames.android.ticb.base.objects.objScoreIndicator score_indicator;
private Integer size;
private Float sum;
private Double time_last_honey_collected;
private Integer total_segments_width;
private Double twoPI;
private final unlock_at;
private Boolean use_particles;
private de.nurogames.android.ticb.base.core.Vector3D v3DplayerPos;
private Float val;
private Integer water_max;
private Integer water_min;
private Float water_rect_radius;
private Integer water_tile_width;
private Float wave_scale_factor;
private Integer x;
private Double x2times_pi_multiply_levelx;
private Integer you;
private Float yourpos;
/* # direct methods */
static de.nurogames.android.ticb.base.objects.objTerrainMap ( ) {
/* .locals 9 */
/* .prologue */
/* const/16 v8, 0x8c */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v7, 0x14 */
int v6 = 4; // const/4 v6, 0x4
int v5 = 0; // const/4 v5, 0x0
/* .line 57 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 58 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 62 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 65 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 68 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objCam; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objCam;-><init>()V */
/* .line 86 */
/* new-instance v0, Landroid/graphics/Path; */
/* invoke-direct {v0}, Landroid/graphics/Path;-><init>()V */
/* .line 153 */
/* .line 154 */
/* .line 156 */
/* mul-int/lit8 v0, v0, 0x2 */
/* .line 157 */
/* .line 174 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* invoke-direct {v0, v1, v1}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* .line 233 */
/* new-array v0, v7, [I */
/* .line 234 */
/* const/16 v1, 0x45 */
/* const/16 v2, 0x16 */
v1 = android.graphics.Color .rgb ( v1,v8,v2 );
/* aput v1, v0, v5 */
int v1 = 1; // const/4 v1, 0x1
/* .line 235 */
/* const/16 v2, 0xb2 */
/* const/16 v3, 0x86 */
/* const/16 v4, 0x36 */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* .line 236 */
/* const/16 v2, 0x99 */
/* const/16 v3, 0xd2 */
/* const/16 v4, 0xe8 */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* .line 237 */
/* const/16 v2, 0x4d */
/* const/16 v3, 0x3f */
/* const/16 v4, 0x2b */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* .line 238 */
/* const/16 v1, 0x9e */
/* const/16 v2, 0x76 */
/* const/16 v3, 0x35 */
v1 = android.graphics.Color .rgb ( v1,v2,v3 );
/* aput v1, v0, v6 */
int v1 = 5; // const/4 v1, 0x5
/* .line 239 */
/* const/16 v2, 0xb4 */
v2 = android.graphics.Color .rgb ( v8,v2,v5 );
/* aput v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
/* .line 240 */
/* const/16 v2, 0x6b */
/* const/16 v3, 0x71 */
/* const/16 v4, 0x74 */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
int v1 = 7; // const/4 v1, 0x7
/* .line 241 */
/* const/16 v2, 0xd2 */
/* const/16 v3, 0x89 */
/* const/16 v4, 0x4d */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0x8 */
/* .line 242 */
/* const/16 v2, 0x64 */
/* const/16 v3, 0x9c */
/* const/16 v4, 0xb2 */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0x9 */
/* .line 243 */
/* const/16 v2, 0x33 */
/* const/16 v3, 0x7b */
/* const/16 v4, 0xe */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0xa */
/* .line 244 */
/* const/16 v2, 0x42 */
/* const/16 v3, 0x34 */
/* const/16 v4, 0x1d */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0xb */
/* .line 245 */
/* const/16 v2, 0xbf */
/* const/16 v3, 0x83 */
/* const/16 v4, 0x21 */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0xc */
/* .line 246 */
/* const/16 v2, 0x32 */
/* const/16 v3, 0x74 */
/* const/16 v4, 0xd */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0xd */
/* .line 247 */
/* const/16 v2, 0x5e */
/* const/16 v3, 0x54 */
/* const/16 v4, 0x49 */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0xe */
/* .line 248 */
/* const/16 v2, 0x9f */
/* const/16 v3, 0x81 */
/* const/16 v4, 0x2c */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0xf */
/* .line 249 */
/* const/16 v2, 0xdd */
/* const/16 v3, 0xb1 */
/* const/16 v4, 0x2b */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0x10 */
/* .line 250 */
/* const/16 v2, 0x45 */
/* const/16 v3, 0x16 */
v2 = android.graphics.Color .rgb ( v2,v8,v3 );
/* aput v2, v0, v1 */
/* const/16 v1, 0x11 */
/* .line 251 */
/* const/16 v2, 0x2f */
/* const/16 v3, 0x1c */
/* const/16 v4, 0x11 */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0x12 */
/* .line 252 */
/* const/16 v2, 0x72 */
/* const/16 v3, 0x77 */
/* const/16 v4, 0x7b */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* const/16 v1, 0x13 */
/* .line 253 */
/* const/16 v2, 0x93 */
/* const/16 v3, 0xaa */
/* const/16 v4, 0xbb */
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
/* aput v2, v0, v1 */
/* .line 233 */
/* .line 268 */
/* filled-new-array {v7, v6}, [I */
v1 = java.lang.Integer.TYPE;
java.lang.reflect.Array .newInstance ( v1,v0 );
/* check-cast v0, [[I */
/* .line 270 */
/* filled-new-array {v7, v6}, [I */
v1 = java.lang.Integer.TYPE;
java.lang.reflect.Array .newInstance ( v1,v0 );
/* check-cast v0, [[I */
/* .line 272 */
/* filled-new-array {v7, v6}, [I */
v1 = java.lang.Integer.TYPE;
java.lang.reflect.Array .newInstance ( v1,v0 );
/* check-cast v0, [[I */
return;
} // .end method
public de.nurogames.android.ticb.base.objects.objTerrainMap ( ) {
/* .locals 8 */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
int v7 = -1; // const/4 v7, -0x1
/* const/high16 v6, 0x41200000 # 10.0f */
int v2 = 0; // const/4 v2, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 283 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 36 */
/* const-wide v0, 0x401921fb54442d18L # 6.283185307179586 */
/* iput-wide v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->twoPI:D */
/* .line 41 */
/* new-instance v0, Ljava/util/Random; */
/* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
this.rnd = v0;
/* .line 44 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
this.mTerrainFillPaint = v0;
/* .line 45 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
this.mTerrainLinePaint = v0;
/* .line 46 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
this.mDarkeningPaint = v0;
/* .line 47 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
this.mWaterPaint = v0;
/* .line 48 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
this.mUIPaintStrokeWhite = v0;
/* .line 49 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
this.mUIPaintFillWhite = v0;
/* .line 59 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drop_snd_id:I */
/* .line 78 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgWaterBack;
v0 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_tile_width:I */
/* .line 89 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* .line 92 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* .line 93 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
/* .line 104 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->rain_drop_len:I */
/* .line 106 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->map_size:I */
/* .line 123 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVELS:I */
/* .line 126 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVELS:I */
/* new-array v0, v0, [Z */
this.fetched_all_honey = v0;
/* .line 128 */
/* const/16 v0, 0x730 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->CHECKPOINT_TIME:I */
/* .line 129 */
/* const/16 v0, 0x190 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_TIME_PRE:I */
/* .line 133 */
/* const/high16 v0, 0x440a0000 # 552.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->CHECKPOINT_TIME_HARD:F */
/* .line 134 */
/* const/high16 v0, 0x44660000 # 920.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->CHECKPOINT_TIME_NORMAL:F */
/* .line 135 */
/* const/high16 v0, 0x44a10000 # 1288.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->CHECKPOINT_TIME_EASY:F */
/* .line 137 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
/* .line 138 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_OVER:Z */
/* .line 161 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->AUTOJUMP_X_VELOCITY:F */
/* .line 164 */
int v0 = 5; // const/4 v0, 0x5
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_end_anim_x_speed:I */
/* .line 167 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->outro_anim_done:Z */
/* .line 171 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->hive_x:F */
/* .line 172 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->hive_y:F */
/* .line 176 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HCOMB_TO_MAP_OFFSET:I */
/* .line 177 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_SPACING:I */
/* .line 178 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_TO_MAP_OFFSET:I */
/* .line 179 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_ROW_LENGTH:I */
/* .line 181 */
/* const/16 v0, 0x9c4 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_INTERVAL:I */
/* .line 182 */
/* const/16 v0, 0x1388 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HCOMB_INTERVAL:I */
/* .line 183 */
/* const/16 v0, 0xfa0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->POLLEM_INTERVAL:I */
/* .line 198 */
/* iput v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x:I */
/* .line 203 */
v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v0 = (( android.content.res.Resources ) v0 ).getInteger ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->pollembonus:I */
/* .line 206 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_x:F */
/* .line 207 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_y:F */
/* .line 208 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_n_double_display_X:F */
/* .line 209 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_n_double_display_Y:F */
/* .line 211 */
/* mul-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->double_display_width:I */
/* .line 212 */
/* mul-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->double_display_height:I */
/* .line 214 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->wave_scale_factor:F */
/* .line 218 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->FONT_MEDIUM:I */
/* .line 220 */
/* const/16 v0, 0x8 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_DROP_SNDS:I */
/* .line 229 */
/* const/high16 v0, 0x40b00000 # 5.5f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->POLLEM_SPEED:F */
/* .line 231 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->use_particles:Z */
/* .line 257 */
/* const/16 v0, 0x14 */
/* new-array v0, v0, [I */
/* fill-array-data v0, :array_0 */
/* .line 261 */
this.unlock_at = v0;
/* .line 478 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap$1; */
final String v1 = "addSegmentsThread"; // const-string v1, "addSegmentsThread"
/* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap$1;-><init>(Lde/nurogames/android/ticb/base/objects/objTerrainMap;Ljava/lang/String;)V */
this.addThread = v0;
/* .line 987 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* const/high16 v1, -0x3f800000 # -4.0f */
/* invoke-direct {v0, v1, v6}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
this.newRainVector = v0;
/* .line 1192 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap$2; */
final String v1 = "checkpointThread"; // const-string v1, "checkpointThread"
/* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap$2;-><init>(Lde/nurogames/android/ticb/base/objects/objTerrainMap;Ljava/lang/String;)V */
this.checkpointThread = v0;
/* .line 1200 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap$3; */
final String v1 = "buildMapThread"; // const-string v1, "buildMapThread"
/* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap$3;-><init>(Lde/nurogames/android/ticb/base/objects/objTerrainMap;Ljava/lang/String;)V */
this.buildMapThread = v0;
/* .line 285 */
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) p0 ).getTerrainConfig ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->getTerrainConfig()V
/* .line 287 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .line 288 */
/* new-instance v1, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->AUTOJUMP_X_VELOCITY:F */
/* const/high16 v3, -0x3f700000 # -4.5f */
/* invoke-direct {v1, v2, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* aput-object v1, v0, v5 */
/* .line 289 */
/* new-instance v1, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->AUTOJUMP_X_VELOCITY:F */
/* const/high16 v3, -0x3f300000 # -6.5f */
/* invoke-direct {v1, v2, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* aput-object v1, v0, v4 */
int v1 = 2; // const/4 v1, 0x2
/* .line 290 */
/* new-instance v2, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->AUTOJUMP_X_VELOCITY:F */
/* const/high16 v4, -0x3ef80000 # -8.5f */
/* invoke-direct {v2, v3, v4}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* aput-object v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* .line 291 */
/* new-instance v2, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->AUTOJUMP_X_VELOCITY:F */
/* const/high16 v4, -0x3ed80000 # -10.5f */
/* invoke-direct {v2, v3, v4}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* aput-object v2, v0, v1 */
/* .line 287 */
/* .line 294 */
/* int-to-float v0, v0 */
/* const/high16 v1, 0x3fc00000 # 1.5f */
/* mul-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_rect_radius:F */
/* .line 297 */
v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
final String v1 = "font.otf"; // const-string v1, "font.otf"
android.graphics.Typeface .createFromAsset ( v0,v1 );
/* .line 299 */
v0 = this.mUIPaintStrokeWhite;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 300 */
v0 = this.mUIPaintStrokeWhite;
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.tf;
(( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 301 */
v0 = this.mUIPaintStrokeWhite;
v1 = android.graphics.Paint$Style.STROKE;
(( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
/* .line 302 */
v0 = this.mUIPaintStrokeWhite;
/* const/high16 v1, 0x40000000 # 2.0f */
(( android.graphics.Paint ) v0 ).setStrokeWidth ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
/* .line 303 */
v0 = this.mUIPaintStrokeWhite;
(( android.graphics.Paint ) v0 ).setColor ( v7 ); // invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V
/* .line 305 */
v0 = this.mUIPaintFillWhite;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 306 */
v0 = this.mUIPaintFillWhite;
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.tf;
(( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 307 */
v0 = this.mUIPaintFillWhite;
v1 = android.graphics.Paint$Style.FILL;
(( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
/* .line 308 */
v0 = this.mUIPaintFillWhite;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->LEVEL_INDICATOR_FONTSIZE:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 309 */
v0 = this.mUIPaintFillWhite;
(( android.graphics.Paint ) v0 ).setColor ( v7 ); // invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V
/* .line 311 */
v0 = this.mWaterPaint;
v1 = android.graphics.Paint$Style.FILL;
(( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
/* .line 312 */
v0 = this.mWaterPaint;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 314 */
v0 = this.mTerrainFillPaint;
v1 = android.graphics.Paint$Style.FILL;
(( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
/* .line 315 */
v0 = this.mTerrainFillPaint;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 317 */
v0 = this.mTerrainLinePaint;
v1 = android.graphics.Paint$Style.STROKE;
(( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
/* .line 318 */
v0 = this.mTerrainLinePaint;
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.tf;
(( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 319 */
v0 = this.mTerrainLinePaint;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 320 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/_Display;->isHardwareAccelerated:Z */
/* if-nez v0, :cond_0 */
/* .line 321 */
v0 = this.mTerrainLinePaint;
/* const/high16 v1, 0x40400000 # 3.0f */
(( android.graphics.Paint ) v0 ).setStrokeWidth ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
/* .line 325 */
} // :goto_0
return;
/* .line 323 */
} // :cond_0
v0 = this.mTerrainLinePaint;
(( android.graphics.Paint ) v0 ).setStrokeWidth ( v6 ); // invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V
/* .line 257 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x4e20 */
/* 0xa604 */
/* 0xfde8 */
/* 0x155cc */
/* 0x1adb0 */
/* 0x20594 */
/* 0x25d78 */
/* 0x2b55c */
/* 0x30d40 */
/* 0x36524 */
/* 0x3bd08 */
/* 0x414ec */
/* 0x46cd0 */
/* 0x4c4b4 */
/* 0x51c98 */
/* 0x5747c */
/* 0x5cc60 */
/* 0x62444 */
/* 0x67c28 */
/* 0x6d40c */
} // .end array-data
} // .end method
static Integer access$0 ( de.nurogames.android.ticb.base.objects.objTerrainMap p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 88 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVEL_SEGMENTS:I */
} // .end method
static void access$1 ( de.nurogames.android.ticb.base.objects.objTerrainMap p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 456 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->addSegment()V */
return;
} // .end method
static void access$2 ( de.nurogames.android.ticb.base.objects.objTerrainMap p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 648 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->doCheckpoints()V */
return;
} // .end method
static void access$3 ( de.nurogames.android.ticb.base.objects.objTerrainMap p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 765 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->buildMap()V */
return;
} // .end method
private void addSegment ( ) {
/* .locals 5 */
/* .prologue */
/* .line 459 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->SEGMENT_WIDTH:I */
/* int-to-float v1, v1 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* .line 462 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* .line 463 */
/* new-instance v1, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .line 464 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* .line 465 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->wave_scale_factor:F */
/* mul-float/2addr v3, v4 */
/* .line 463 */
/* invoke-direct {v1, v2, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* .line 462 */
(( java.util.Vector ) v0 ).addElement ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
/* .line 468 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->autoAddItemToMap()V */
/* .line 471 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->isNextLevelIncoming()V */
/* .line 474 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->isMapChange()V */
/* .line 476 */
return;
} // .end method
private void addSingleCoinToMap ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* .line 1236 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.drops;
/* new-instance v1, Lde/nurogames/android/ticb/base/objects/objHoneyDrop; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, p1, p2, v2}, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;-><init>(III)V */
(( java.util.Vector ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 1237 */
return;
} // .end method
private void addSingleCombToMap ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* .line 1240 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.drops;
/* new-instance v1, Lde/nurogames/android/ticb/base/objects/objHoneyDrop; */
int v2 = 4; // const/4 v2, 0x4
/* invoke-direct {v1, p1, p2, v2}, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;-><init>(III)V */
(( java.util.Vector ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 1241 */
return;
} // .end method
private void addSinglePollem ( Float p0, Float p1 ) {
/* .locals 2 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 1245 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollem;
/* new-instance v1, Lde/nurogames/android/ticb/base/objects/objPollem; */
/* invoke-direct {v1, p1, p2}, Lde/nurogames/android/ticb/base/objects/objPollem;-><init>(FF)V */
(( java.util.Vector ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 1246 */
return;
} // .end method
private void addTerrainObject ( Float p0, Float p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .param p3, "type" # I */
/* .prologue */
/* .line 1250 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.assets;
/* new-instance v1, Lde/nurogames/android/ticb/base/objects/objTerrainAsset; */
/* invoke-direct {v1, p1, p2, p3}, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;-><init>(FFI)V */
(( java.util.Vector ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 1251 */
return;
} // .end method
private void autoAddItemToMap ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 543 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->size:I */
/* .line 544 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->size:I */
(( java.util.Vector ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .line 547 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
v1 = this.rnd;
/* const/16 v2, 0xa */
v1 = (( java.util.Random ) v1 ).nextInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
/* mul-int/lit8 v1, v1, 0x1e */
/* add-int/lit16 v1, v1, 0xc8 */
/* int-to-float v1, v1 */
/* rem-float/2addr v0, v1 */
/* cmpl-float v0, v0, v5 */
/* if-nez v0, :cond_0 */
/* .line 549 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.vec3D;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* .line 550 */
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.vec3D;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 551 */
v2 = this.rnd;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgLevelAsset;
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* aget-object v3, v3, v4 */
/* array-length v3, v3 */
v2 = (( java.util.Random ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I
/* .line 548 */
/* invoke-direct {p0, v0, v1, v2}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->addTerrainObject(FFI)V */
/* .line 554 */
} // :cond_0
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* const/high16 v1, 0x457a0000 # 4000.0f */
/* rem-float/2addr v0, v1 */
/* cmpl-float v0, v0, v5 */
/* if-nez v0, :cond_1 */
/* .line 556 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.vec3D;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* .line 557 */
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.vec3D;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
v2 = this.rnd;
/* const/16 v3, 0x12c */
v2 = (( java.util.Random ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* .line 555 */
/* invoke-direct {p0, v0, v1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->addSinglePollem(FF)V */
/* .line 561 */
} // :cond_1
/* const v0, 0x46afc800 # 22500.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->val:F */
/* .line 563 */
/* if-nez v0, :cond_3 */
/* .line 564 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->val:F */
/* mul-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->check:F */
/* .line 570 */
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cnt:I */
} // :goto_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cnt:I */
/* const/16 v1, 0x8 */
/* if-lt v0, v1, :cond_4 */
/* .line 590 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* const v1, 0x459c4000 # 5000.0f */
/* rem-float/2addr v0, v1 */
/* cmpl-float v0, v0, v5 */
/* if-nez v0, :cond_2 */
/* .line 591 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.vec3D;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* float-to-int v0, v0 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HCOMB_TO_MAP_OFFSET:I */
/* invoke-direct {p0, v0, v1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->addSingleCombToMap(II)V */
/* .line 593 */
} // :cond_2
return;
/* .line 567 */
} // :cond_3
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->val:F */
/* mul-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->check:F */
/* .line 572 */
} // :cond_4
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cnt:I */
/* mul-int/lit16 v0, v0, 0x9c4 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ival:I */
/* .line 574 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ival:I */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->check:F */
/* add-float/2addr v1, v2 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_5 */
/* .line 575 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ival:I */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_ROW_LENGTH:I */
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->check:F */
/* add-float/2addr v1, v2 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_5 */
/* .line 578 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_SPACING:I */
/* int-to-float v1, v1 */
/* rem-float/2addr v0, v1 */
/* cmpl-float v0, v0, v5 */
/* if-nez v0, :cond_5 */
/* .line 580 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.vec3D;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* float-to-int v0, v0 */
/* .line 581 */
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.vec3D;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* float-to-int v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_TO_MAP_OFFSET:I */
/* sub-int/2addr v1, v2 */
/* .line 579 */
/* invoke-direct {p0, v0, v1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->addSingleCoinToMap(II)V */
/* .line 570 */
} // :cond_5
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cnt:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cnt:I */
} // .end method
private void buildMap ( ) {
/* .locals 3 */
/* .prologue */
/* .line 767 */
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_x:F */
/* .line 768 */
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_y:F */
/* .line 769 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_x:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->double_display_width:I */
/* int-to-float v1, v1 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_n_double_display_X:F */
/* .line 770 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_y:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->double_display_height:I */
/* int-to-float v1, v1 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_n_double_display_Y:F */
/* .line 773 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
/* .line 774 */
} // :goto_0
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
(( java.util.Vector ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_x:F */
/* cmpg-float v0, v0, v1 */
/* if-ltz v0, :cond_1 */
/* .line 778 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
/* .line 781 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
(( java.util.Vector ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .line 784 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.map_grnd;
(( android.graphics.Path ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/graphics/Path;->reset()V
/* .line 785 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.map_grnd;
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.vCurLevelSeg;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.vCurLevelSeg;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 788 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->map_size:I */
/* .line 790 */
} // :goto_1
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.vCurLevelSeg;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_n_double_display_X:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* .line 792 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->map_size:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 789 */
/* if-gt v0, v1, :cond_2 */
/* .line 801 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.map_grnd;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_n_double_display_X:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_n_double_display_Y:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 802 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.map_grnd;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_x:F */
/* const/high16 v2, 0x41a00000 # 20.0f */
/* sub-float/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cam_n_double_display_Y:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 805 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.map_grnd;
(( android.graphics.Path ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/graphics/Path;->close()V
/* .line 807 */
return;
/* .line 775 */
} // :cond_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
/* .line 795 */
} // :cond_2
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
/* .line 796 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->levelSegmentIndex:I */
(( java.util.Vector ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .line 797 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.map_grnd;
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.vCurLevelSeg;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.vCurLevelSeg;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
} // .end method
private Float calculateNextMapSegment ( ) {
/* .locals 15 */
/* .prologue */
int v14 = 3; // const/4 v14, 0x3
int v13 = 2; // const/4 v13, 0x2
int v12 = 1; // const/4 v12, 0x1
int v10 = 0; // const/4 v10, 0x0
/* .line 600 */
/* iget-wide v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->twoPI:D */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* float-to-double v2, v2 */
/* mul-double/2addr v0, v2 */
/* iput-wide v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x2times_pi_multiply_levelx:D */
/* .line 601 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ispre:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* .line 604 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.CURVE_OFFSET;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v0, v0, v1 */
/* aget v0, v0, v10 */
/* int-to-double v0, v0 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.CURVE_AMP;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v2, v2, v3 */
/* aget v2, v2, v10 */
/* int-to-double v2, v2 */
v4 = de.nurogames.android.ticb.base.objects.objTerrainMap.PHASE_SHIFT;
/* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v4, v4, v5 */
/* aget v4, v4, v10 */
/* int-to-double v4, v4 */
/* iget-wide v6, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x2times_pi_multiply_levelx:D */
v8 = de.nurogames.android.ticb.base.objects.objTerrainMap.WAVE_LENGHT;
/* iget v9, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v8, v8, v9 */
/* aget v8, v8, v10 */
/* int-to-double v8, v8 */
/* div-double/2addr v6, v8 */
/* add-double/2addr v4, v6 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* mul-double/2addr v2, v4 */
/* add-double/2addr v0, v2 */
/* .line 605 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.CURVE_OFFSET;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v2, v2, v3 */
/* aget v2, v2, v12 */
/* int-to-double v2, v2 */
v4 = de.nurogames.android.ticb.base.objects.objTerrainMap.CURVE_AMP;
/* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v4, v4, v5 */
/* aget v4, v4, v12 */
/* int-to-double v4, v4 */
v6 = de.nurogames.android.ticb.base.objects.objTerrainMap.PHASE_SHIFT;
/* iget v7, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v6, v6, v7 */
/* aget v6, v6, v12 */
/* int-to-double v6, v6 */
/* iget-wide v8, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x2times_pi_multiply_levelx:D */
v10 = de.nurogames.android.ticb.base.objects.objTerrainMap.WAVE_LENGHT;
/* iget v11, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v10, v10, v11 */
/* aget v10, v10, v12 */
/* int-to-double v10, v10 */
/* div-double/2addr v8, v10 */
/* add-double/2addr v6, v8 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v4, v6 */
/* add-double/2addr v2, v4 */
/* .line 604 */
/* add-double/2addr v0, v2 */
/* .line 606 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.CURVE_OFFSET;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v2, v2, v3 */
/* aget v2, v2, v13 */
/* int-to-double v2, v2 */
v4 = de.nurogames.android.ticb.base.objects.objTerrainMap.CURVE_AMP;
/* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v4, v4, v5 */
/* aget v4, v4, v13 */
/* int-to-double v4, v4 */
v6 = de.nurogames.android.ticb.base.objects.objTerrainMap.PHASE_SHIFT;
/* iget v7, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v6, v6, v7 */
/* aget v6, v6, v13 */
/* int-to-double v6, v6 */
/* iget-wide v8, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x2times_pi_multiply_levelx:D */
v10 = de.nurogames.android.ticb.base.objects.objTerrainMap.WAVE_LENGHT;
/* iget v11, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v10, v10, v11 */
/* aget v10, v10, v13 */
/* int-to-double v10, v10 */
/* div-double/2addr v8, v10 */
/* add-double/2addr v6, v8 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v4, v6 */
/* add-double/2addr v2, v4 */
/* .line 604 */
/* add-double/2addr v0, v2 */
/* .line 607 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.CURVE_OFFSET;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v2, v2, v3 */
/* aget v2, v2, v14 */
/* int-to-double v2, v2 */
v4 = de.nurogames.android.ticb.base.objects.objTerrainMap.CURVE_AMP;
/* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v4, v4, v5 */
/* aget v4, v4, v14 */
/* int-to-double v4, v4 */
v6 = de.nurogames.android.ticb.base.objects.objTerrainMap.PHASE_SHIFT;
/* iget v7, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v6, v6, v7 */
/* aget v6, v6, v14 */
/* int-to-double v6, v6 */
/* iget-wide v8, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x2times_pi_multiply_levelx:D */
v10 = de.nurogames.android.ticb.base.objects.objTerrainMap.WAVE_LENGHT;
/* iget v11, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->cur_level:I */
/* aget-object v10, v10, v11 */
/* aget v10, v10, v14 */
/* int-to-double v10, v10 */
/* div-double/2addr v8, v10 */
/* add-double/2addr v6, v8 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v4, v6 */
/* add-double/2addr v2, v4 */
/* .line 603 */
/* add-double/2addr v0, v2 */
/* double-to-float v0, v0 */
} // .end method
private void checkAutoJump ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 618 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->yourpos:F */
/* .line 620 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->yourpos:F */
/* int-to-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->yourpos:F */
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* .line 622 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v0 );
/* .line 624 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->playerY:F */
/* .line 626 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->playerY:F */
/* const/high16 v1, -0x3d380000 # -100.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_1 */
/* .line 627 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.autojump_vectors;
/* aget-object v0, v0, v2 */
/* .line 635 */
} // :goto_0
de.nurogames.android.ticb.base.objects.objBee.autojump = (v3!= 0);
/* .line 637 */
/* .line 639 */
/* .line 642 */
} // :cond_0
return;
/* .line 628 */
} // :cond_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->playerY:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_2 */
/* .line 629 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.autojump_vectors;
/* aget-object v0, v0, v3 */
/* .line 630 */
} // :cond_2
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->playerY:F */
/* const/high16 v1, 0x43160000 # 150.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_3 */
/* .line 631 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.autojump_vectors;
int v1 = 2; // const/4 v1, 0x2
/* aget-object v0, v0, v1 */
/* .line 633 */
} // :cond_3
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.autojump_vectors;
int v1 = 3; // const/4 v1, 0x3
/* aget-object v0, v0, v1 */
} // .end method
private void checkNextLevel ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* const v6, 0x46afc800 # 22500.0f */
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* .line 663 */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_4 */
/* .line 665 */
/* .line 668 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v1 );
/* .line 671 */
/* if-nez v1, :cond_5 */
/* .line 672 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* const/high16 v3, 0x42c80000 # 100.0f */
/* div-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* .line 677 */
} // :cond_0
} // :goto_0
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVELS:I */
/* add-int/lit8 v2, v2, -0x1 */
/* if-ge v1, v2, :cond_6 */
/* .line 680 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->honey_drop_this_level:I */
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.lcm;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
java.lang.Integer .valueOf ( v3 );
(( java.util.Hashtable ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* if-ne v2, v1, :cond_1 */
/* .line 681 */
v1 = this.fetched_all_honey;
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* aput-boolean v5, v1, v2 */
/* .line 683 */
} // :cond_1
/* iput v7, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->honey_drop_this_level:I */
/* .line 686 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->roundBonusTime()V */
/* .line 689 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* .line 690 */
/* if-ne v1, v5, :cond_2 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* .line 691 */
} // :cond_2
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->lastCheckpoint:F */
/* .line 692 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
/* add-float/2addr v1, v6 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
/* .line 695 */
/* new-instance v1, Landroid/graphics/BitmapShader; */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgGTex;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* aget-object v2, v2, v3 */
v3 = android.graphics.Shader$TileMode.REPEAT;
v4 = android.graphics.Shader$TileMode.REPEAT;
/* invoke-direct {v1, v2, v3, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V */
/* .line 697 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 698 */
/* .local v0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v1 = "level#"; // const-string v1, "level#"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* add-int/lit8 v3, v3, 0x1 */
java.lang.String .valueOf ( v3 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = " of "; // const-string v3, " of "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVELS:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 699 */
v1 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_15_REACHED_LEVEL;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v1,v0,v5 );
/* .line 733 */
} // .end local v0 # "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
} // :cond_3
} // :goto_1
v1 = this.mTerrainFillPaint;
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.bitmap_shader;
(( android.graphics.Paint ) v1 ).setShader ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
/* .line 734 */
v1 = this.mTerrainLinePaint;
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.line_colors;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* aget v2, v2, v3 */
(( android.graphics.Paint ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 737 */
} // :cond_4
return;
/* .line 673 */
} // :cond_5
/* if-ne v1, v5, :cond_0 */
/* .line 674 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* const/high16 v3, 0x41200000 # 10.0f */
/* div-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* goto/16 :goto_0 */
/* .line 704 */
} // :cond_6
/* if-nez v1, :cond_7 */
/* .line 706 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
/* .line 707 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_OVER:Z */
/* .line 708 */
/* iput v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 711 */
} // :cond_7
/* if-ne v1, v5, :cond_3 */
/* .line 713 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->roundBonusTime()V */
/* .line 715 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* add-int/lit8 v1, v1, 0x1 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* .line 718 */
/* iput v7, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* .line 719 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->lastCheckpoint:F */
/* .line 720 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
/* add-float/2addr v1, v6 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
/* .line 722 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 723 */
/* .restart local v0 # "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v1 = "level#"; // const-string v1, "level#"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* add-int/lit8 v3, v3, 0x1 */
java.lang.String .valueOf ( v3 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = " of ENDLESS"; // const-string v3, " of ENDLESS"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 724 */
v1 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_15_REACHED_LEVEL;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v1,v0,v5 );
/* .line 727 */
/* new-instance v1, Landroid/graphics/BitmapShader; */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgGTex;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* aget-object v2, v2, v3 */
v3 = android.graphics.Shader$TileMode.REPEAT;
v4 = android.graphics.Shader$TileMode.REPEAT;
/* invoke-direct {v1, v2, v3, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V */
} // .end method
private void doCheckpoints ( ) {
/* .locals 4 */
/* .prologue */
/* .line 651 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkAutoJump()V */
/* .line 654 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkNextLevel()V */
/* .line 656 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* if-lez v0, :cond_0 */
v0 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v1 = this.unlock_at;
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ispre:I */
/* add-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x1 */
/* aget v1, v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->release_delay:I */
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* .line 657 */
int v0 = 0; // const/4 v0, 0x0
de.nurogames.android.ticb.base.objects.objBee.autojump = (v0!= 0);
/* .line 659 */
} // :cond_0
return;
} // .end method
private void drawBadWeather ( android.graphics.Canvas p0 ) {
/* .locals 7 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 992 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_OVER:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
/* if-nez v0, :cond_1 */
/* .line 995 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_width:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_end_anim_x_speed:I */
/* sub-int/2addr v0, v1 */
/* if-lez v0, :cond_2 */
/* .line 996 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_width:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_end_anim_x_speed:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_width:I */
/* .line 1000 */
} // :goto_0
v0 = de.nurogames.android.ticb.base.core.AppResources.imgBadWaether;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1003 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgBadWaether;
/* .line 1004 */
v1 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_width:I */
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* .line 1005 */
v2 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 1006 */
int v3 = 0; // const/4 v3, 0x0
/* .line 1002 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 1009 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.rainParticles;
/* .line 1010 */
/* new-instance v1, Lde/nurogames/android/ticb/base/core/particle; */
/* .line 1011 */
/* new-instance v2, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .line 1012 */
v3 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v4, 0x42f00000 # 120.0f */
/* sub-float/2addr v3, v4 */
v4 = this.rnd;
v5 = de.nurogames.android.ticb.base.core.AppResources.imgBadWaether;
v5 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* iget v6, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_width:I */
/* sub-int/2addr v5, v6 */
v4 = (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
/* int-to-float v4, v4 */
/* add-float/2addr v3, v4 */
/* .line 1013 */
v4 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v4, v4, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* const/high16 v5, 0x42200000 # 40.0f */
/* add-float/2addr v4, v5 */
/* .line 1011 */
/* invoke-direct {v2, v3, v4}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
/* .line 1014 */
v3 = de.nurogames.android.ticb.base.objects.objTerrainMap.null_vector;
/* .line 1015 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->rain_lifetime:I */
/* .line 1010 */
/* invoke-direct {v1, v2, v3, v4}, Lde/nurogames/android/ticb/base/core/particle;-><init>(Lde/nurogames/android/ticb/base/core/Vector3D;Lde/nurogames/android/ticb/base/core/Vector3D;I)V */
/* .line 1009 */
(( java.util.Vector ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 1018 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.rainParticles;
(( java.util.Vector ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;
/* .line 1019 */
} // :cond_0
} // :goto_1
v0 = v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.i;
/* if-nez v0, :cond_3 */
/* .line 1032 */
} // :cond_1
return;
/* .line 997 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_width:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->outro_anim_done:Z */
/* .line 1021 */
} // :cond_3
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.i;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/particle; */
/* .line 1022 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.p;
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.p;
v1 = this.pos;
v2 = this.newRainVector;
de.nurogames.android.ticb.base.core.VectorMath .add ( v1,v2 );
this.pos = v1;
/* .line 1023 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.p;
v0 = this.pos;
/* iget v1, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.p;
v0 = this.pos;
/* iget v2, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.p;
v0 = this.pos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->rain_drop_len:I */
/* int-to-float v3, v3 */
/* add-float/2addr v3, v0 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.p;
v0 = this.pos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->rain_drop_len:I */
/* int-to-float v4, v4 */
/* sub-float v4, v0, v4 */
v5 = this.mUIPaintStrokeWhite;
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V */
/* .line 1024 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.p;
/* iget v1, v0, Lde/nurogames/android/ticb/base/core/particle;->life:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, v0, Lde/nurogames/android/ticb/base/core/particle;->life:I */
/* .line 1025 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.p;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/particle;->life:I */
/* if-gtz v0, :cond_0 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.i;
} // .end method
private void drawDrops ( android.graphics.Canvas p0 ) {
/* .locals 9 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 899 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.drops;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drops_size:I */
/* .line 900 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drops_size:I */
/* if-lt v1, v2, :cond_0 */
/* .line 972 */
} // :goto_1
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.drop_indi;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->dropindi_size:I */
/* .line 973 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_2
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->dropindi_size:I */
/* if-lt v1, v2, :cond_6 */
/* .line 980 */
return;
/* .line 903 */
} // :cond_0
try { // :try_start_0
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.drops;
(( java.util.Vector ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/objects/objHoneyDrop; */
this.mobjHoneyDrop = v2;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 908 */
v2 = this.mobjHoneyDrop;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mX:I */
v3 = this.mobjHoneyDrop;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mW:I */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->item_x_w:F */
/* .line 911 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->item_x_w:F */
v3 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_1 */
/* .line 913 */
v2 = this.mobjHoneyDrop;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mX:I */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->double_display_width:I */
/* int-to-float v4, v4 */
/* add-float/2addr v3, v4 */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_1 */
/* .line 915 */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
this.v3DplayerPos = v2;
/* .line 919 */
v2 = this.v3DplayerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bee_center:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
v3 = this.mobjHoneyDrop;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mX:I */
/* int-to-float v3, v3 */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_1 */
/* .line 921 */
v2 = this.v3DplayerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bee_center:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->item_x_w:F */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_1 */
/* .line 923 */
v2 = this.v3DplayerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
v3 = this.mobjHoneyDrop;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mY:I */
/* int-to-float v3, v3 */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_1 */
/* .line 925 */
v2 = this.v3DplayerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
v3 = this.mobjHoneyDrop;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mY:I */
v4 = this.mobjHoneyDrop;
/* iget v4, v4, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mH:I */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_1 */
/* .line 929 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drop_snd_id:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_DROP_SNDS:I */
/* rem-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, 0x1 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v2 );
/* .line 931 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* long-to-double v2, v2 */
/* iput-wide v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->time_last_honey_collected:D */
/* .line 932 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drop_snd_id:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drop_snd_id:I */
/* .line 935 */
v2 = this.mobjHoneyDrop;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->dropType:I */
/* if-nez v2, :cond_5 */
/* .line 936 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->honey_drop_this_level:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->honey_drop_this_level:I */
/* .line 937 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 941 */
} // :goto_3
v2 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
v3 = this.mobjHoneyDrop;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->dropType:I */
/* aget v2, v2, v3 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->score:I */
/* .line 942 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->score:I */
/* add-int/2addr v2, v3 */
/* .line 945 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.drop_indi;
/* .line 946 */
/* new-instance v3, Lde/nurogames/android/ticb/base/objects/objScoreIndicator; */
/* .line 947 */
v4 = this.mobjHoneyDrop;
/* iget v4, v4, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mX:I */
/* add-int/lit8 v4, v4, 0x18 */
/* .line 948 */
v5 = this.mobjHoneyDrop;
/* iget v5, v5, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mY:I */
/* add-int/lit8 v5, v5, -0x18 */
/* .line 949 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v7, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->score:I */
/* add-int/lit8 v8, v8, 0x1 */
/* mul-int/2addr v7, v8 */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 950 */
/* iget v7, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->FONT_MEDIUM:I */
/* .line 946 */
/* invoke-direct {v3, v4, v5, v6, v7}, Lde/nurogames/android/ticb/base/objects/objScoreIndicator;-><init>(IILjava/lang/String;I)V */
/* .line 945 */
(( java.util.Vector ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 953 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.drops;
(( java.util.Vector ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;
/* .line 959 */
} // :cond_1
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.drops;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* if-ge v1, v2, :cond_2 */
/* .line 960 */
v2 = this.mobjHoneyDrop;
(( de.nurogames.android.ticb.base.objects.objHoneyDrop ) v2 ).onDraw ( p1 ); // invoke-virtual {v2, p1}, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->onDraw(Landroid/graphics/Canvas;)V
/* .line 962 */
} // :cond_2
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* long-to-double v2, v2 */
/* iget-wide v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->time_last_honey_collected:D */
/* sub-double/2addr v2, v4 */
/* const-wide v4, 0x409f400000000000L # 2000.0 */
/* cmpl-double v2, v2, v4 */
/* if-lez v2, :cond_3 */
/* .line 963 */
int v2 = 0; // const/4 v2, 0x0
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drop_snd_id:I */
/* .line 965 */
} // :cond_3
v2 = this.mobjHoneyDrop;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mX:I */
/* int-to-float v2, v2 */
v3 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v4, 0x42480000 # 50.0f */
/* sub-float/2addr v3, v4 */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_4 */
/* .line 966 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.drops;
(( java.util.Vector ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;
/* .line 900 */
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
/* goto/16 :goto_0 */
/* .line 904 */
/* :catch_0 */
/* move-exception v0 */
/* .line 905 */
/* .local v0, "e":Ljava/lang/Exception; */
/* goto/16 :goto_1 */
/* .line 939 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_5
/* add-int/lit8 v2, v2, 0x1 */
/* goto/16 :goto_3 */
/* .line 974 */
} // :cond_6
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.drop_indi;
(( java.util.Vector ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/objects/objScoreIndicator; */
this.score_indicator = v2;
/* .line 975 */
v2 = this.score_indicator;
(( de.nurogames.android.ticb.base.objects.objScoreIndicator ) v2 ).onDraw ( p1 ); // invoke-virtual {v2, p1}, Lde/nurogames/android/ticb/base/objects/objScoreIndicator;->onDraw(Landroid/graphics/Canvas;)V
/* .line 973 */
/* add-int/lit8 v1, v1, 0x1 */
/* goto/16 :goto_2 */
} // .end method
private void isMapChange ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 513 */
v0 = /* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->calculateNextMapSegment()F */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextMapY:F */
/* .line 516 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->distance_to_checkpoint:I */
/* if-ge v0, v1, :cond_1 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->distance_to_checkpoint:I */
/* if-lez v0, :cond_1 */
/* .line 517 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* .line 518 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
/* .line 519 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* cmpl-float v0, v0, v5 */
/* if-nez v0, :cond_0 */
/* .line 520 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
v2 = this.rnd;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgLevelAsset;
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* aget-object v3, v3, v4 */
/* array-length v3, v3 */
v2 = (( java.util.Random ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I
/* invoke-direct {p0, v0, v1, v2}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->addTerrainObject(FFI)V */
/* .line 535 */
} // :cond_0
} // :goto_0
return;
/* .line 523 */
} // :cond_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* float-to-int v0, v0 */
/* if-lez v0, :cond_2 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextMapY:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_2 */
/* .line 524 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* .line 525 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* const v2, 0x3f8ccccd # 1.1f */
/* mul-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
/* .line 529 */
} // :cond_2
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextMapY:F */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
/* .line 530 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
/* cmpl-float v0, v0, v5 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 531 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
v2 = this.rnd;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgLevelAsset;
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* aget-object v3, v3, v4 */
/* array-length v3, v3 */
v2 = (( java.util.Random ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I
/* invoke-direct {p0, v0, v1, v2}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->addTerrainObject(FFI)V */
/* .line 532 */
} // :cond_3
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ending_offset:F */
} // .end method
private void isNextLevelIncoming ( ) {
/* .locals 2 */
/* .prologue */
/* .line 502 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
v1 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->double_display_width:I */
/* int-to-float v1, v1 */
/* sub-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->distance_to_checkpoint:I */
/* .line 503 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->distance_to_checkpoint:I */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVELS:I */
/* add-int/lit8 v1, v1, -0x1 */
/* if-ge v0, v1, :cond_0 */
/* .line 504 */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ispre:I */
/* .line 506 */
} // :goto_0
return;
/* .line 505 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ispre:I */
} // .end method
private void pruneSegments ( ) {
/* .locals 1 */
/* .prologue */
/* .line 493 */
v0 = this.addThread;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 494 */
return;
} // .end method
private void roundBonusTime ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 744 */
/* if-ne v0, v2, :cond_0 */
/* .line 745 */
/* if-nez v0, :cond_3 */
/* .line 746 */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_1 */
/* .line 747 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* const/high16 v1, 0x440a0000 # 552.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* .line 759 */
} // :cond_0
} // :goto_0
return;
/* .line 748 */
} // :cond_1
/* if-ne v0, v2, :cond_2 */
/* .line 749 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* const/high16 v1, 0x44660000 # 920.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* .line 750 */
} // :cond_2
/* if-nez v0, :cond_0 */
/* .line 751 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* const/high16 v1, 0x44a10000 # 1288.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* .line 754 */
} // :cond_3
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* const/high16 v1, 0x44e60000 # 1840.0f */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ENDLESS_LEVEL_BONUS:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* .line 755 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* rem-int/lit8 v0, v0, 0x5 */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ENDLESS_LEVEL_BONUS:F */
/* const v1, 0x3e4ccccd # 0.2f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* .line 756 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ENDLESS_LEVEL_BONUS:F */
/* const v1, 0x3dcccccd # 0.1f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ENDLESS_LEVEL_BONUS:F */
} // .end method
/* # virtual methods */
public void animatePollem ( ) {
/* .locals 10 */
/* .prologue */
/* const/high16 v9, 0x41c00000 # 24.0f */
/* .line 1056 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollem;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->anim_pollem_size:I */
/* .line 1057 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->anim_pollem_size:I */
/* if-lt v1, v2, :cond_0 */
/* .line 1107 */
} // :goto_1
return;
/* .line 1060 */
} // :cond_0
try { // :try_start_0
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollem;
(( java.util.Vector ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/objects/objPollem; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1065 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objPollem;->mX:F */
v3 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objPollem;->mW:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->item_w_h:F */
/* .line 1067 */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* .line 1070 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objPollem;->mX:F */
v3 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v4, 0x42480000 # 50.0f */
/* sub-float/2addr v3, v4 */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_1 */
/* .line 1071 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollem;
(( java.util.Vector ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;
/* .line 1073 */
} // :cond_1
/* sget-boolean v2, Lde/nurogames/android/ticb/base/views/TinyBeeView;->GAME_PAUSED:Z */
/* if-nez v2, :cond_2 */
/* .line 1076 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v3, v2, Lde/nurogames/android/ticb/base/objects/objPollem;->mX:F */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->POLLEM_SPEED:F */
/* add-float/2addr v3, v4 */
/* iput v3, v2, Lde/nurogames/android/ticb/base/objects/objPollem;->mX:F */
/* .line 1080 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.player;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* add-float/2addr v2, v9 */
v3 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objPollem;->mX:F */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_2 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.player;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* add-float/2addr v2, v9 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->item_w_h:F */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_2 */
/* .line 1082 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.player;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
v3 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objPollem;->mY:F */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_2 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.player;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
v3 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v3, v3, Lde/nurogames/android/ticb/base/objects/objPollem;->mY:F */
v4 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v4, v4, Lde/nurogames/android/ticb/base/objects/objPollem;->mH:I */
/* int-to-float v4, v4 */
/* add-float/2addr v3, v4 */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_2 */
/* .line 1086 */
de.nurogames.android.ticb.base.core.AppResources .playSFX ( v2 );
/* .line 1089 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 1090 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->pollembonus:I */
/* add-int/2addr v2, v3 */
/* .line 1093 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.drop_indi;
/* .line 1094 */
/* new-instance v3, Lde/nurogames/android/ticb/base/objects/objScoreIndicator; */
/* .line 1095 */
v4 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v4, v4, Lde/nurogames/android/ticb/base/objects/objPollem;->mX:F */
/* float-to-int v4, v4 */
/* add-int/lit8 v4, v4, 0x18 */
/* .line 1096 */
v5 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
/* iget v5, v5, Lde/nurogames/android/ticb/base/objects/objPollem;->mY:F */
/* float-to-int v5, v5 */
/* add-int/lit8 v5, v5, -0x18 */
/* .line 1097 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v7, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->pollembonus:I */
/* add-int/lit8 v8, v8, 0x1 */
/* mul-int/2addr v7, v8 */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 1098 */
/* iget v7, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->FONT_MEDIUM:I */
/* .line 1094 */
/* invoke-direct {v3, v4, v5, v6, v7}, Lde/nurogames/android/ticb/base/objects/objScoreIndicator;-><init>(IILjava/lang/String;I)V */
/* .line 1093 */
(( java.util.Vector ) v2 ).add ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 1101 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollem;
(( java.util.Vector ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;
/* .line 1057 */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
/* goto/16 :goto_0 */
/* .line 1061 */
/* :catch_0 */
/* move-exception v0 */
/* .line 1062 */
/* .local v0, "e":Ljava/lang/Exception; */
/* goto/16 :goto_1 */
} // .end method
public Integer checkpointTime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1260 */
/* if-nez v0, :cond_0 */
/* .line 1261 */
/* const/16 v0, 0x190 */
/* .line 1263 */
} // :goto_0
} // :cond_0
/* const/16 v0, 0x730 */
} // .end method
public void doTimers ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
/* const/high16 v2, 0x40a00000 # 5.0f */
int v4 = 0; // const/4 v4, 0x0
/* .line 432 */
/* if-nez v0, :cond_2 */
/* .line 433 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v2, 0x3fc00000 # 1.5f */
/* div-float/2addr v1, v2 */
/* const/high16 v2, 0x40b00000 # 5.5f */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 446 */
} // :cond_0
} // :goto_0
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* cmpg-float v0, v0, v4 */
/* if-gtz v0, :cond_1 */
/* .line 447 */
de.nurogames.android.ticb.base.core.AppResources .switchMusic_GameToGameOver ( );
/* .line 448 */
/* iput v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 449 */
/* iput-boolean v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_OVER:Z */
/* .line 451 */
} // :cond_1
return;
/* .line 434 */
} // :cond_2
/* if-ne v0, v5, :cond_0 */
/* .line 435 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 438 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* sub-float/2addr v0, v2 */
/* cmpl-float v0, v0, v4 */
/* if-lez v0, :cond_3 */
/* .line 439 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* add-float/2addr v0, v2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 440 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* sub-float/2addr v0, v2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* .line 441 */
} // :cond_3
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* cmpl-float v0, v0, v4 */
/* if-lez v0, :cond_0 */
/* .line 442 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 443 */
/* iput v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoint_raise:F */
} // .end method
public void drawMap ( android.graphics.Canvas p0 ) {
/* .locals 8 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* const/high16 v7, 0x43960000 # 300.0f */
int v1 = 0; // const/4 v1, 0x0
int v6 = 2; // const/4 v6, 0x2
/* .line 820 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/_Display;->isHardwareAccelerated:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 822 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->map_size:I */
/* .line 824 */
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* cmpg-float v0, v0, v7 */
/* if-gez v0, :cond_0 */
/* .line 827 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
(( java.util.Vector ) v0 ).get ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v2, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 828 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
(( java.util.Vector ) v0 ).get ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* add-float/2addr v0, v3 */
v3 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* sub-float/2addr v0, v3 */
/* float-to-int v0, v0 */
/* int-to-float v3, v0 */
/* .line 829 */
/* int-to-float v4, v0 */
/* .line 830 */
v5 = this.mTerrainFillPaint;
/* move-object v0, p1 */
/* .line 825 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 834 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
(( java.util.Vector ) v0 ).get ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v2, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 835 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
(( java.util.Vector ) v0 ).get ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* add-float/2addr v0, v3 */
v3 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* sub-float/2addr v0, v3 */
/* float-to-int v0, v0 */
/* int-to-float v3, v0 */
/* .line 836 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
int v4 = 3; // const/4 v4, 0x3
(( java.util.Vector ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v4, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 837 */
v5 = this.mTerrainLinePaint;
/* move-object v0, p1 */
/* .line 832 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V */
/* .line 841 */
} // :cond_0
/* iput v6, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x:I */
} // :goto_0
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->map_size:I */
/* add-int/lit8 v1, v1, -0x1 */
/* if-lt v0, v1, :cond_2 */
/* .line 886 */
} // :goto_1
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* cmpg-float v0, v0, v7 */
/* if-gez v0, :cond_1 */
/* .line 887 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHiveStart;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->hive_x:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->hive_y:F */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 890 */
} // :cond_1
return;
/* .line 843 */
} // :cond_2
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x:I */
/* add-int/lit8 v1, v1, -0x1 */
(( java.util.Vector ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .line 844 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.levelMap;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x:I */
(( java.util.Vector ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .line 846 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.v3D;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v1 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* sub-float/2addr v0, v1 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fx:F */
/* .line 849 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fx:F */
/* .line 850 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.v3D;
/* iget v2, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 851 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fx:F */
/* .line 852 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.v3D;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* int-to-float v4, v4 */
/* add-float/2addr v4, v0 */
/* .line 853 */
v5 = this.mTerrainFillPaint;
/* move-object v0, p1 */
/* .line 848 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V */
/* .line 856 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->fx:F */
/* .line 857 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.v3D;
/* iget v2, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 858 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.v3Db;
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v3 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* sub-float/2addr v0, v3 */
/* add-float/2addr v3, v0 */
/* .line 859 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.v3Db;
/* iget v4, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 860 */
v5 = this.mTerrainLinePaint;
/* move-object v0, p1 */
/* .line 855 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V */
/* .line 841 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->x:I */
/* .line 870 */
} // :cond_3
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.map_grnd;
v1 = this.mTerrainFillPaint;
(( android.graphics.Canvas ) p1 ).drawPath ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
/* .line 873 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->use_particles:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 874 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.map_grnd;
v1 = this.mDarkeningPaint;
(( android.graphics.Canvas ) p1 ).drawPath ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
/* .line 877 */
} // :cond_4
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.map_grnd;
v1 = this.mTerrainLinePaint;
(( android.graphics.Canvas ) p1 ).drawPath ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
/* goto/16 :goto_1 */
} // .end method
public void drawNextLevelInfo ( android.graphics.Canvas p0 ) {
/* .locals 4 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 1174 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->you:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->center:I */
/* if-lt v0, v1, :cond_0 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->you:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_max:I */
/* if-gt v0, v1, :cond_0 */
/* .line 1177 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgLevelIndicator;
v2 = de.nurogames.android.ticb.base.core.AppResources.imgLevelIndicator;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x42a00000 # 80.0f */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 1179 */
/* if-nez v0, :cond_1 */
/* .line 1180 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_indicator_x:I */
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_indicator_y:I */
/* int-to-float v2, v2 */
v3 = this.mUIPaintFillWhite;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 1185 */
} // :cond_0
} // :goto_0
return;
/* .line 1181 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 1182 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_indicator_x:I */
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_indicator_y:I */
/* int-to-float v2, v2 */
v3 = this.mUIPaintFillWhite;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
} // .end method
public void drawPollem ( android.graphics.Canvas p0 ) {
/* .locals 2 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 1042 */
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollem;
v1 = (( java.util.Vector ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/Vector;->size()I
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->draw_pollem_size:I */
/* .line 1043 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "x":I */
} // :goto_0
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->draw_pollem_size:I */
/* if-lt v0, v1, :cond_0 */
/* .line 1051 */
return;
/* .line 1046 */
} // :cond_0
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollem;
(( java.util.Vector ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v1, Lde/nurogames/android/ticb/base/objects/objPollem; */
/* .line 1047 */
v1 = de.nurogames.android.ticb.base.objects.objTerrainMap.pollemItem;
(( de.nurogames.android.ticb.base.objects.objPollem ) v1 ).onDraw ( p1 ); // invoke-virtual {v1, p1}, Lde/nurogames/android/ticb/base/objects/objPollem;->onDraw(Landroid/graphics/Canvas;)V
/* .line 1043 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void drawTerrainAssets ( android.graphics.Canvas p0 ) {
/* .locals 5 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 1117 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.assets;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->asset_size:I */
/* .line 1118 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->asset_size:I */
/* if-lt v1, v2, :cond_0 */
/* .line 1136 */
} // :goto_1
return;
/* .line 1121 */
} // :cond_0
try { // :try_start_0
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.assets;
(( java.util.Vector ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/objects/objTerrainAsset; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1126 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.mObjTerrainAssetItem;
(( de.nurogames.android.ticb.base.objects.objTerrainAsset ) v2 ).onDraw ( p1 ); // invoke-virtual {v2, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->onDraw(Landroid/graphics/Canvas;)V
/* .line 1129 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.mObjTerrainAssetItem;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->mX:F */
v3 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v3, v3, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v4, 0x42f00000 # 120.0f */
/* sub-float/2addr v3, v4 */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_1 */
/* .line 1130 */
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.assets;
(( java.util.Vector ) v2 ).remove ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;
/* .line 1131 */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 1118 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
/* .line 1122 */
/* :catch_0 */
/* move-exception v0 */
/* .line 1123 */
/* .local v0, "e":Ljava/lang/Exception; */
} // .end method
public void drawWater ( android.graphics.Canvas p0 ) {
/* .locals 7 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 1148 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->total_segments_width:I */
/* int-to-float v1, v1 */
/* sub-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->you:I */
/* .line 1151 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->center:I */
/* sub-int/2addr v0, v1 */
/* int-to-float v1, v0 */
/* int-to-float v2, v0 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->center:I */
/* int-to-float v0, v0 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_rect_radius:F */
/* add-float/2addr v3, v0 */
/* int-to-float v4, v0 */
v5 = this.mWaterPaint;
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 1154 */
/* int-to-float v0, v0 */
/* const/high16 v1, 0x40200000 # 2.5f */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_tile_width:I */
/* int-to-float v1, v1 */
/* div-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->draw_water_times:I */
/* .line 1155 */
int v6 = 0; // const/4 v6, 0x0
/* .local v6, "x":I */
} // :goto_0
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->draw_water_times:I */
/* if-lt v6, v0, :cond_1 */
/* .line 1158 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->you:I */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_max:I */
/* if-le v0, v1, :cond_0 */
/* .line 1159 */
/* const v0, 0x46afc800 # 22500.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->sum:F */
/* .line 1160 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_min:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->sum:F */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_min:I */
/* .line 1161 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_max:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->sum:F */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_max:I */
/* .line 1162 */
/* const/high16 v0, 0x3f000000 # 0.5f */
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v2, 0x3f800000 # 1.0f */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_min:I */
/* int-to-float v3, v3 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_max:I */
/* int-to-float v4, v4 */
v0 = de.nurogames.android.ticb.base.core.VectorMath .map ( v0,v1,v2,v3,v4 );
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->center:I */
/* .line 1165 */
} // :cond_0
return;
/* .line 1156 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.core.AppResources.imgWaterBack;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->center:I */
/* sub-int/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_tile_width:I */
/* mul-int/2addr v2, v6 */
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 1155 */
/* add-int/lit8 v6, v6, 0x1 */
} // .end method
public Boolean fetchedAllHoney ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "level" # I */
/* .prologue */
/* .line 1267 */
v0 = this.fetched_all_honey;
/* array-length v0, v0 */
/* if-nez v0, :cond_0 */
/* .line 1268 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1270 */
} // :goto_0
} // :cond_0
v0 = this.fetched_all_honey;
/* aget-boolean v0, v0, p1 */
} // .end method
void getTerrainConfig ( ) {
/* .locals 11 */
/* .prologue */
int v10 = 4; // const/4 v10, 0x4
int v9 = 3; // const/4 v9, 0x3
int v8 = 2; // const/4 v8, 0x2
int v7 = 1; // const/4 v7, 0x1
int v6 = 0; // const/4 v6, 0x0
/* .line 1275 */
v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 1277 */
/* .local v0, "res":Landroid/content/res/Resources; */
/* const/16 v1, 0x14 */
/* new-array v1, v1, [[I */
/* .line 1278 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v6 */
/* .line 1279 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v7 */
/* .line 1280 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v8 */
/* .line 1281 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v9 */
/* .line 1282 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v10 */
int v2 = 5; // const/4 v2, 0x5
/* .line 1283 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
int v2 = 6; // const/4 v2, 0x6
/* .line 1284 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
int v2 = 7; // const/4 v2, 0x7
/* .line 1285 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x8 */
/* .line 1286 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x9 */
/* .line 1287 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xa */
/* .line 1288 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xb */
/* .line 1289 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xc */
/* .line 1290 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xd */
/* .line 1291 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xe */
/* .line 1292 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xf */
/* .line 1293 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x10 */
/* .line 1294 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x11 */
/* .line 1295 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x12 */
/* .line 1296 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x13 */
/* .line 1297 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* .line 1277 */
/* .line 1300 */
/* const/16 v1, 0x14 */
/* new-array v1, v1, [[I */
/* .line 1301 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v6 */
/* .line 1302 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v7 */
/* .line 1303 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v8 */
/* .line 1304 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v9 */
/* .line 1305 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v10 */
int v2 = 5; // const/4 v2, 0x5
/* .line 1306 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
int v2 = 6; // const/4 v2, 0x6
/* .line 1307 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
int v2 = 7; // const/4 v2, 0x7
/* .line 1308 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x8 */
/* .line 1309 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x9 */
/* .line 1310 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xa */
/* .line 1311 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xb */
/* .line 1312 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xc */
/* .line 1313 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xd */
/* .line 1314 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xe */
/* .line 1315 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xf */
/* .line 1316 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x10 */
/* .line 1317 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x11 */
/* .line 1318 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x12 */
/* .line 1319 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x13 */
/* .line 1320 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* .line 1300 */
/* .line 1323 */
/* const/16 v1, 0x14 */
/* new-array v1, v1, [[I */
/* .line 1324 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v6 */
/* .line 1325 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v7 */
/* .line 1326 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v8 */
/* .line 1327 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v9 */
/* .line 1328 */
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v2, v1, v10 */
int v2 = 5; // const/4 v2, 0x5
/* .line 1329 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
int v2 = 6; // const/4 v2, 0x6
/* .line 1330 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
int v2 = 7; // const/4 v2, 0x7
/* .line 1331 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x8 */
/* .line 1332 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x9 */
/* .line 1333 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xa */
/* .line 1334 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xb */
/* .line 1335 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xc */
/* .line 1336 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xd */
/* .line 1337 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xe */
/* .line 1338 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xf */
/* .line 1339 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x10 */
/* .line 1340 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x11 */
/* .line 1341 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x12 */
/* .line 1342 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x13 */
/* .line 1343 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aput-object v3, v1, v2 */
/* .line 1323 */
/* .line 1346 */
/* const/16 v1, 0x14 */
/* new-array v1, v1, [[I */
/* .line 1348 */
/* new-array v2, v10, [I */
/* .line 1349 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v6 */
/* .line 1350 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v7 */
/* .line 1351 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v8 */
/* .line 1352 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v9 */
/* aput-object v2, v1, v6 */
/* .line 1353 */
/* new-array v2, v10, [I */
/* .line 1354 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v6 */
/* .line 1355 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v7 */
/* .line 1356 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v8 */
/* .line 1357 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v9 */
/* aput-object v2, v1, v7 */
/* .line 1358 */
/* new-array v2, v10, [I */
/* .line 1359 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v6 */
/* .line 1360 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v7 */
/* .line 1361 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v8 */
/* .line 1362 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v9 */
/* aput-object v2, v1, v8 */
/* .line 1363 */
/* new-array v2, v10, [I */
/* .line 1364 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v6 */
/* .line 1365 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v7 */
/* .line 1366 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v8 */
/* .line 1367 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v9 */
/* aput-object v2, v1, v9 */
/* .line 1368 */
/* new-array v2, v10, [I */
/* .line 1369 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v6 */
/* .line 1370 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v7 */
/* .line 1371 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v8 */
/* .line 1372 */
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v2, v9 */
/* aput-object v2, v1, v10 */
int v2 = 5; // const/4 v2, 0x5
/* .line 1373 */
/* new-array v3, v10, [I */
/* .line 1374 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1375 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1376 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1377 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
int v2 = 6; // const/4 v2, 0x6
/* .line 1378 */
/* new-array v3, v10, [I */
/* .line 1379 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1380 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1381 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1382 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
int v2 = 7; // const/4 v2, 0x7
/* .line 1383 */
/* new-array v3, v10, [I */
/* .line 1384 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1385 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1386 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1387 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x8 */
/* .line 1388 */
/* new-array v3, v10, [I */
/* .line 1389 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1390 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1391 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1392 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x9 */
/* .line 1393 */
/* new-array v3, v10, [I */
/* .line 1394 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1395 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1396 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1397 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xa */
/* .line 1398 */
/* new-array v3, v10, [I */
/* .line 1399 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1400 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1401 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1402 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xb */
/* .line 1403 */
/* new-array v3, v10, [I */
/* .line 1404 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1405 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1406 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1407 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xc */
/* .line 1408 */
/* new-array v3, v10, [I */
/* .line 1409 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1410 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1411 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1412 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xd */
/* .line 1413 */
/* new-array v3, v10, [I */
/* .line 1414 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1415 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1416 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1417 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xe */
/* .line 1418 */
/* new-array v3, v10, [I */
/* .line 1419 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1420 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1421 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1422 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0xf */
/* .line 1423 */
/* new-array v3, v10, [I */
/* .line 1424 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1425 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1426 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1427 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x10 */
/* .line 1428 */
/* new-array v3, v10, [I */
/* .line 1429 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1430 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1431 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1432 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x11 */
/* .line 1433 */
/* new-array v3, v10, [I */
/* .line 1434 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1435 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1436 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1437 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x12 */
/* .line 1438 */
/* new-array v3, v10, [I */
/* .line 1439 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1440 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1441 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1442 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* const/16 v2, 0x13 */
/* .line 1443 */
/* new-array v3, v10, [I */
/* .line 1444 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v6 */
/* .line 1445 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v7 */
/* .line 1446 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v8 */
/* .line 1447 */
(( android.content.res.Resources ) v0 ).getIntArray ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v3, v9 */
/* aput-object v3, v1, v2 */
/* .line 1346 */
/* .line 1450 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->FONT_MEDIUM:I */
/* .line 1451 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HCOMB_TO_MAP_OFFSET:I */
/* .line 1452 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_TO_MAP_OFFSET:I */
/* .line 1453 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_SPACING:I */
/* .line 1454 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->HONEY_ROW_LENGTH:I */
/* .line 1456 */
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v1, v1, v2 */
v1 = java.lang.Float .parseFloat ( v1 );
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->AUTOJUMP_X_VELOCITY:F */
/* .line 1457 */
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v1, v1, v2 */
v1 = java.lang.Float .parseFloat ( v1 );
/* .line 1459 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* .line 1460 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* .line 1462 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->rain_drop_len:I */
/* .line 1464 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_indicator_x:I */
/* .line 1465 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_indicator_y:I */
/* .line 1467 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->LEVEL_INDICATOR_FONTSIZE:I */
/* .line 1469 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* .line 1470 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* .line 1472 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->release_delay:I */
/* .line 1474 */
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v1, v1, v2 */
v1 = java.lang.Float .parseFloat ( v1 );
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->wave_scale_factor:F */
/* .line 1476 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/_Display;->isHardwareAccelerated:Z */
/* if-nez v1, :cond_0 */
/* .line 1477 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->hive_x:F */
/* .line 1478 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->hive_y:F */
/* .line 1484 */
} // :goto_0
return;
/* .line 1480 */
} // :cond_0
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->hive_x:F */
/* .line 1481 */
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->hive_y:F */
} // .end method
public void init ( ) {
/* .locals 12 */
/* .prologue */
/* const/high16 v4, 0x43af0000 # 350.0f */
/* const/high16 v2, 0x43480000 # 200.0f */
/* const/16 v11, 0x14 */
int v1 = 0; // const/4 v1, 0x0
int v10 = 0; // const/4 v10, 0x0
/* .line 333 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.cam;
(( de.nurogames.android.ticb.base.objects.objCam ) v0 ).init ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objCam;->init()V
/* .line 335 */
/* iput v11, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->SEGMENT_WIDTH:I */
/* .line 336 */
/* int-to-float v0, v0 */
/* const/high16 v3, 0x40200000 # 2.5f */
/* mul-float/2addr v0, v3 */
/* float-to-int v0, v0 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->SEGMENT_WIDTH:I */
/* div-int/2addr v0, v3 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVEL_SEGMENTS:I */
/* .line 337 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVEL_SEGMENTS:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->SEGMENT_WIDTH:I */
/* mul-int/2addr v0, v3 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->total_segments_width:I */
/* .line 340 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->lastCheckpoint:F */
/* .line 341 */
/* const v0, 0x469c4000 # 20000.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->nextCheckpoint:F */
/* .line 342 */
/* iput v10, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* .line 343 */
/* iput v10, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* .line 344 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_xpos:F */
/* .line 345 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->level_ypos:F */
/* .line 346 */
/* .line 349 */
/* iput-boolean v10, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_OVER:Z */
/* .line 350 */
/* iput-boolean v10, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->GAME_COMPLETED:Z */
/* .line 352 */
/* iput-boolean v10, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->outro_anim_done:Z */
/* .line 354 */
/* if-nez v0, :cond_3 */
/* .line 355 */
/* const/high16 v0, 0x43c80000 # 400.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 360 */
} // :cond_0
} // :goto_0
int v8 = 0; // const/4 v8, 0x0
/* .local v8, "i":I */
} // :goto_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVEL_SEGMENTS:I */
/* if-lt v8, v0, :cond_4 */
/* .line 363 */
/* const v0, 0x3f333333 # 0.7f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->ENDLESS_LEVEL_BONUS:F */
/* .line 366 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 367 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 368 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 369 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 372 */
/* new-instance v0, Landroid/graphics/BitmapShader; */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgGTex;
/* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* aget-object v3, v3, v5 */
v5 = android.graphics.Shader$TileMode.REPEAT;
v6 = android.graphics.Shader$TileMode.REPEAT;
/* invoke-direct {v0, v3, v5, v6}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V */
/* .line 373 */
v0 = this.mTerrainFillPaint;
v3 = de.nurogames.android.ticb.base.objects.objTerrainMap.bitmap_shader;
(( android.graphics.Paint ) v0 ).setShader ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
/* .line 374 */
v0 = this.mTerrainFillPaint;
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->SEGMENT_WIDTH:I */
/* int-to-float v3, v3 */
(( android.graphics.Paint ) v0 ).setStrokeWidth ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V
/* .line 376 */
v0 = this.mTerrainLinePaint;
v3 = de.nurogames.android.ticb.base.objects.objTerrainMap.line_colors;
/* aget v3, v3, v10 */
(( android.graphics.Paint ) v0 ).setColor ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V
/* .line 378 */
/* new-instance v0, Landroid/graphics/LinearGradient; */
/* const v5, -0xff5501 */
/* const v6, -0xff9b6a */
v7 = android.graphics.Shader$TileMode.CLAMP;
/* move v3, v1 */
/* invoke-direct/range {v0 ..v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V */
/* .line 379 */
v0 = this.mWaterPaint;
v3 = de.nurogames.android.ticb.base.objects.objTerrainMap.linearshader_waterbase;
(( android.graphics.Paint ) v0 ).setShader ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
/* .line 381 */
/* new-instance v0, Landroid/graphics/LinearGradient; */
/* const/high16 v6, -0x56000000 */
v7 = android.graphics.Shader$TileMode.CLAMP;
/* move v3, v1 */
/* move v5, v10 */
/* invoke-direct/range {v0 ..v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V */
/* .line 382 */
v0 = this.mDarkeningPaint;
v2 = de.nurogames.android.ticb.base.objects.objTerrainMap.linearshader_darkening;
(( android.graphics.Paint ) v0 ).setShader ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
/* .line 384 */
/* const/16 v0, 0x4650 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_min:I */
/* .line 385 */
/* const/16 v0, 0x55f0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_max:I */
/* .line 386 */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_min:I */
/* int-to-float v3, v3 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->water_max:I */
/* int-to-float v4, v4 */
v0 = de.nurogames.android.ticb.base.core.VectorMath .map ( v0,v1,v2,v3,v4 );
/* float-to-int v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->center:I */
/* .line 389 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 391 */
/* if-nez v0, :cond_5 */
/* .line 392 */
int v0 = 4; // const/4 v0, 0x4
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVELS:I */
/* .line 396 */
} // :cond_1
} // :goto_2
/* iput v10, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->honey_drop_this_level:I */
/* .line 397 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVELS:I */
/* new-array v0, v0, [Z */
this.fetched_all_honey = v0;
/* .line 400 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgBadWaether;
v0 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bad_weather_width:I */
/* .line 403 */
/* new-instance v0, Ljava/util/Hashtable; */
/* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
/* .line 404 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/_Display;->isHardwareAccelerated:Z */
/* if-nez v0, :cond_7 */
/* .line 405 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.lcm;
java.lang.Integer .valueOf ( v10 );
/* const/16 v2, 0x38 */
java.lang.Integer .valueOf ( v2 );
(( java.util.Hashtable ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 406 */
int v9 = 1; // const/4 v9, 0x1
/* .local v9, "x":I */
} // :goto_3
/* if-lt v9, v11, :cond_6 */
/* .line 416 */
} // :cond_2
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/_Display;->useHighRes:Z */
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 417 */
/* const/16 v0, 0x3c */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->rain_lifetime:I */
/* .line 422 */
} // :goto_4
v0 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v0, v0, v10 */
/* const/16 v1, 0x9 */
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v10 */
v0 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->bee_center:I */
/* .line 424 */
return;
/* .line 356 */
} // .end local v8 # "i":I
} // .end local v9 # "x":I
} // :cond_3
int v3 = 1; // const/4 v3, 0x1
/* if-ne v0, v3, :cond_0 */
/* .line 357 */
/* const/high16 v0, 0x44e60000 # 1840.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* goto/16 :goto_0 */
/* .line 361 */
/* .restart local v8 # "i":I */
} // :cond_4
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->addSegment()V */
/* .line 360 */
/* add-int/lit8 v8, v8, 0x1 */
/* goto/16 :goto_1 */
/* .line 393 */
} // :cond_5
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
/* .line 394 */
/* iput v11, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->MAX_LEVELS:I */
/* .line 407 */
/* .restart local v9 # "x":I */
} // :cond_6
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.lcm;
java.lang.Integer .valueOf ( v9 );
/* const/16 v2, 0x40 */
java.lang.Integer .valueOf ( v2 );
(( java.util.Hashtable ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 406 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 410 */
} // .end local v9 # "x":I
} // :cond_7
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.lcm;
java.lang.Integer .valueOf ( v10 );
/* const/16 v2, 0x30 */
java.lang.Integer .valueOf ( v2 );
(( java.util.Hashtable ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 411 */
int v9 = 1; // const/4 v9, 0x1
/* .restart local v9 # "x":I */
} // :goto_5
/* if-ge v9, v11, :cond_2 */
/* .line 412 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.lcm;
java.lang.Integer .valueOf ( v9 );
/* const/16 v2, 0x38 */
java.lang.Integer .valueOf ( v2 );
(( java.util.Hashtable ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 411 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 419 */
} // :cond_8
/* const/16 v0, 0x1e */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->rain_lifetime:I */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 1 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 1208 */
v0 = de.nurogames.android.ticb.base.objects.objTerrainMap.cam;
(( de.nurogames.android.ticb.base.objects.objCam ) v0 ).setZoom ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objCam;->setZoom()V
/* .line 1210 */
v0 = this.checkpointThread;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 1213 */
/* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drawBadWeather(Landroid/graphics/Canvas;)V */
/* .line 1217 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/_Display;->isHardwareAccelerated:Z */
/* if-nez v0, :cond_0 */
/* .line 1219 */
v0 = this.buildMapThread;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 1221 */
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) p0 ).drawMap ( p1 ); // invoke-virtual {p0, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drawMap(Landroid/graphics/Canvas;)V
/* .line 1224 */
} // :cond_0
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->pruneSegments()V */
/* .line 1227 */
/* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->drawDrops(Landroid/graphics/Canvas;)V */
/* .line 1229 */
return;
} // .end method
