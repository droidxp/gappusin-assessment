class com.funbox.game.ang.Animal {
	 /* .source "Animal.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/funbox/game/ang/Animal$ANIMAL_SITE;, */
	 /* Lcom/funbox/game/ang/Animal$ANIMAL_STATUS;, */
	 /* Lcom/funbox/game/ang/Animal$ANIMAL_TYPE; */
	 /* } */
} // .end annotation
/* # static fields */
private static $SWITCH_TABLE$com$funbox$game$angrypoke$Animal$ANIMAL_SITE; //synthetic
private static $SWITCH_TABLE$com$funbox$game$angrypoke$Animal$ANIMAL_STATUS; //synthetic
/* # instance fields */
private Boolean mAlive;
private android.graphics.Bitmap mBmp;
private Integer mBmpId;
private final I mBodyPos;
private final Float mDownHitInc;
private final Float mDownInc;
private Boolean mIsHit;
private Boolean mIsSound;
private final Integer mMoveMaxH;
public Integer mNowX;
public Integer mNowY;
public Integer mOrgX;
public Integer mOrgY;
private com.funbox.game.ang.Animal$ANIMAL_SITE mSite;
private Integer mSpeed;
private com.funbox.game.ang.Animal$ANIMAL_STATUS mStatus;
private com.funbox.game.ang.Animal$ANIMAL_TYPE mType;
/* # direct methods */
static $SWITCH_TABLE$com$funbox$game$angrypoke$Animal$ANIMAL_SITE ( ) { //synthethic
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 6 */
	 v0 = com.funbox.game.ang.Animal.$SWITCH_TABLE$com$funbox$game$angrypoke$Animal$ANIMAL_SITE;
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :goto_0
} // :cond_0
com.funbox.game.ang.Animal$ANIMAL_SITE .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
	 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.B1;
	 v1 = 	 (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
	 int v2 = 7; // const/4 v2, 0x7
	 /* aput v2, v0, v1 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_8 */
} // :goto_1
try { // :try_start_1
	 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.B2;
	 v1 = 	 (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
	 /* const/16 v2, 0x8 */
	 /* aput v2, v0, v1 */
	 /* :try_end_1 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_7 */
} // :goto_2
try { // :try_start_2
	 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.B3;
	 v1 = 	 (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
	 /* const/16 v2, 0x9 */
	 /* aput v2, v0, v1 */
	 /* :try_end_2 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_6 */
} // :goto_3
try { // :try_start_3
	 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M1;
	 v1 = 	 (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
	 int v2 = 4; // const/4 v2, 0x4
	 /* aput v2, v0, v1 */
	 /* :try_end_3 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_5 */
} // :goto_4
try { // :try_start_4
	 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M2;
	 v1 = 	 (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
	 int v2 = 5; // const/4 v2, 0x5
	 /* aput v2, v0, v1 */
	 /* :try_end_4 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_4 ..:try_end_4} :catch_4 */
} // :goto_5
try { // :try_start_5
	 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M3;
	 v1 = 	 (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
	 int v2 = 6; // const/4 v2, 0x6
	 /* aput v2, v0, v1 */
	 /* :try_end_5 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_5 ..:try_end_5} :catch_3 */
} // :goto_6
try { // :try_start_6
	 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.T1;
	 v1 = 	 (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
	 int v2 = 1; // const/4 v2, 0x1
	 /* aput v2, v0, v1 */
	 /* :try_end_6 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_6 ..:try_end_6} :catch_2 */
} // :goto_7
try { // :try_start_7
	 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.T2;
	 v1 = 	 (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
	 int v2 = 2; // const/4 v2, 0x2
	 /* aput v2, v0, v1 */
	 /* :try_end_7 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_7 ..:try_end_7} :catch_1 */
} // :goto_8
try { // :try_start_8
	 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.T3;
	 v1 = 	 (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
	 int v2 = 3; // const/4 v2, 0x3
	 /* aput v2, v0, v1 */
	 /* :try_end_8 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_8 ..:try_end_8} :catch_0 */
} // :goto_9
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
/* :catch_2 */
/* move-exception v1 */
/* :catch_3 */
/* move-exception v1 */
/* :catch_4 */
/* move-exception v1 */
/* :catch_5 */
/* move-exception v1 */
/* :catch_6 */
/* move-exception v1 */
/* :catch_7 */
/* move-exception v1 */
/* :catch_8 */
/* move-exception v1 */
} // .end method
static $SWITCH_TABLE$com$funbox$game$angrypoke$Animal$ANIMAL_STATUS ( ) { //synthethic
/* .locals 3 */
/* .prologue */
/* .line 6 */
v0 = com.funbox.game.ang.Animal.$SWITCH_TABLE$com$funbox$game$angrypoke$Animal$ANIMAL_STATUS;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
} // :cond_0
com.funbox.game.ang.Animal$ANIMAL_STATUS .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
v1 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_DOWN;
v1 = (( com.funbox.game.ang.Animal$ANIMAL_STATUS ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_STATUS;->ordinal()I
int v2 = 3; // const/4 v2, 0x3
/* aput v2, v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_3 */
} // :goto_1
try { // :try_start_1
v1 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_FINISH;
v1 = (( com.funbox.game.ang.Animal$ANIMAL_STATUS ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_STATUS;->ordinal()I
int v2 = 4; // const/4 v2, 0x4
/* aput v2, v0, v1 */
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_2 */
} // :goto_2
try { // :try_start_2
v1 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_STOP;
v1 = (( com.funbox.game.ang.Animal$ANIMAL_STATUS ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_STATUS;->ordinal()I
int v2 = 2; // const/4 v2, 0x2
/* aput v2, v0, v1 */
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_1 */
} // :goto_3
try { // :try_start_3
v1 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_UP;
v1 = (( com.funbox.game.ang.Animal$ANIMAL_STATUS ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_STATUS;->ordinal()I
int v2 = 1; // const/4 v2, 0x1
/* aput v2, v0, v1 */
/* :try_end_3 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_0 */
} // :goto_4
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
/* :catch_2 */
/* move-exception v1 */
/* :catch_3 */
/* move-exception v1 */
} // .end method
public com.funbox.game.ang.Animal ( ) {
/* .locals 6 */
/* .param p1, "site" # Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
int v3 = 2; // const/4 v3, 0x2
/* .line 63 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 8 */
/* const/16 v0, 0x9 */
/* new-array v0, v0, [[I */
/* new-array v1, v3, [I */
/* fill-array-data v1, :array_0 */
/* aput-object v1, v0, v4 */
/* new-array v1, v3, [I */
/* fill-array-data v1, :array_1 */
/* aput-object v1, v0, v5 */
/* new-array v1, v3, [I */
/* fill-array-data v1, :array_2 */
/* aput-object v1, v0, v3 */
int v1 = 3; // const/4 v1, 0x3
/* .line 9 */
/* new-array v2, v3, [I */
/* fill-array-data v2, :array_3 */
/* aput-object v2, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* new-array v2, v3, [I */
/* fill-array-data v2, :array_4 */
/* aput-object v2, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* new-array v2, v3, [I */
/* fill-array-data v2, :array_5 */
/* aput-object v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
/* .line 10 */
/* new-array v2, v3, [I */
/* fill-array-data v2, :array_6 */
/* aput-object v2, v0, v1 */
int v1 = 7; // const/4 v1, 0x7
/* new-array v2, v3, [I */
/* fill-array-data v2, :array_7 */
/* aput-object v2, v0, v1 */
/* const/16 v1, 0x8 */
/* new-array v2, v3, [I */
/* fill-array-data v2, :array_8 */
/* aput-object v2, v0, v1 */
this.mBodyPos = v0;
/* .line 13 */
/* const/16 v0, 0x30 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mMoveMaxH:I */
/* .line 14 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mDownInc:F */
/* .line 15 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mDownHitInc:F */
/* .line 64 */
this.mSite = p1;
/* .line 66 */
/* iput v5, p0, Lcom/funbox/game/ang/Animal;->mSpeed:I */
/* .line 68 */
(( com.funbox.game.ang.Animal ) p0 ).init ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Animal;->init()V
/* .line 70 */
/* iput-boolean v4, p0, Lcom/funbox/game/ang/Animal;->mAlive:Z */
/* .line 71 */
return;
/* .line 8 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x1f */
/* 0x6c */
} // .end array-data
/* :array_1 */
/* .array-data 4 */
/* 0x7e */
/* 0x6c */
} // .end array-data
/* :array_2 */
/* .array-data 4 */
/* 0xe3 */
/* 0x6c */
} // .end array-data
/* .line 9 */
/* :array_3 */
/* .array-data 4 */
/* 0x1a */
/* 0xc3 */
} // .end array-data
/* :array_4 */
/* .array-data 4 */
/* 0x7e */
/* 0xc3 */
} // .end array-data
/* :array_5 */
/* .array-data 4 */
/* 0xe5 */
/* 0xc3 */
} // .end array-data
/* .line 10 */
/* :array_6 */
/* .array-data 4 */
/* 0x17 */
/* 0x127 */
} // .end array-data
/* :array_7 */
/* .array-data 4 */
/* 0x7d */
/* 0x127 */
} // .end array-data
/* :array_8 */
/* .array-data 4 */
/* 0xe8 */
/* 0x127 */
} // .end array-data
} // .end method
/* # virtual methods */
public void End ( ) {
/* .locals 1 */
/* .prologue */
/* .line 193 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/funbox/game/ang/Animal;->mAlive:Z */
/* .line 194 */
return;
} // .end method
public Boolean getAlive ( ) {
/* .locals 1 */
/* .prologue */
/* .line 198 */
/* iget-boolean v0, p0, Lcom/funbox/game/ang/Animal;->mAlive:Z */
} // .end method
public android.graphics.Bitmap getBmp ( ) {
/* .locals 1 */
/* .prologue */
/* .line 155 */
v0 = this.mBmp;
} // .end method
public Integer getBmpId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 177 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mBmpId:I */
} // .end method
public com.funbox.game.ang.Animal$ANIMAL_SITE getSite ( ) {
/* .locals 1 */
/* .prologue */
/* .line 135 */
v0 = this.mSite;
} // .end method
public Integer getSpeed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 173 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mSpeed:I */
} // .end method
public com.funbox.game.ang.Animal$ANIMAL_STATUS getStatus ( ) {
/* .locals 1 */
/* .prologue */
/* .line 151 */
v0 = this.mStatus;
} // .end method
public com.funbox.game.ang.Animal$ANIMAL_TYPE getType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 139 */
v0 = this.mType;
} // .end method
public void init ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 4; // const/4 v6, 0x4
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 74 */
com.funbox.game.ang.Animal .$SWITCH_TABLE$com$funbox$game$angrypoke$Animal$ANIMAL_SITE ( );
v1 = this.mSite;
v1 = (( com.funbox.game.ang.Animal$ANIMAL_SITE ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_SITE;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
/* .line 131 */
} // :goto_0
return;
/* .line 76 */
/* :pswitch_0 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v2 */
/* aget v0, v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* .line 77 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v2 */
/* aget v0, v0, v3 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* .line 124 */
} // :goto_1
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mNowX:I */
/* .line 125 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* .line 128 */
v0 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_UP;
this.mStatus = v0;
/* .line 129 */
/* iput-boolean v2, p0, Lcom/funbox/game/ang/Animal;->mIsHit:Z */
/* .line 130 */
/* iput-boolean v2, p0, Lcom/funbox/game/ang/Animal;->mIsSound:Z */
/* .line 81 */
/* :pswitch_1 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v3 */
/* aget v0, v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* .line 82 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v3 */
/* aget v0, v0, v3 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* .line 86 */
/* :pswitch_2 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v4 */
/* aget v0, v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* .line 87 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v4 */
/* aget v0, v0, v3 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* .line 91 */
/* :pswitch_3 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v5 */
/* aget v0, v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* .line 92 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v5 */
/* aget v0, v0, v3 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* .line 96 */
/* :pswitch_4 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v6 */
/* aget v0, v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* .line 97 */
v0 = this.mBodyPos;
/* aget-object v0, v0, v6 */
/* aget v0, v0, v3 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* .line 101 */
/* :pswitch_5 */
v0 = this.mBodyPos;
int v1 = 5; // const/4 v1, 0x5
/* aget-object v0, v0, v1 */
/* aget v0, v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* .line 102 */
v0 = this.mBodyPos;
int v1 = 5; // const/4 v1, 0x5
/* aget-object v0, v0, v1 */
/* aget v0, v0, v3 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* .line 106 */
/* :pswitch_6 */
v0 = this.mBodyPos;
int v1 = 6; // const/4 v1, 0x6
/* aget-object v0, v0, v1 */
/* aget v0, v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* .line 107 */
v0 = this.mBodyPos;
int v1 = 6; // const/4 v1, 0x6
/* aget-object v0, v0, v1 */
/* aget v0, v0, v3 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* .line 111 */
/* :pswitch_7 */
v0 = this.mBodyPos;
int v1 = 7; // const/4 v1, 0x7
/* aget-object v0, v0, v1 */
/* aget v0, v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* .line 112 */
v0 = this.mBodyPos;
int v1 = 7; // const/4 v1, 0x7
/* aget-object v0, v0, v1 */
/* aget v0, v0, v3 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* goto/16 :goto_1 */
/* .line 116 */
/* :pswitch_8 */
v0 = this.mBodyPos;
/* const/16 v1, 0x8 */
/* aget-object v0, v0, v1 */
/* aget v0, v0, v2 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* .line 117 */
v0 = this.mBodyPos;
/* const/16 v1, 0x8 */
/* aget-object v0, v0, v1 */
/* aget v0, v0, v3 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* goto/16 :goto_1 */
/* .line 74 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_8 */
} // .end packed-switch
} // .end method
public Boolean isClickOk ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* const/16 v3, 0x19 */
int v2 = 0; // const/4 v2, 0x0
/* .line 239 */
/* iget-boolean v0, p0, Lcom/funbox/game/ang/Animal;->mIsHit:Z */
/* if-nez v0, :cond_0 */
v0 = this.mStatus;
v1 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_FINISH;
/* if-ne v0, v1, :cond_1 */
/* .line 240 */
} // :cond_0
final String v0 = "Animal"; // const-string v0, "Animal"
final String v1 = "isClickOk(), mStatus is FINISH/HIT"; // const-string v1, "isClickOk(), mStatus is FINISH/HIT"
android.util.Log .v ( v0,v1 );
/* move v0, v2 */
/* .line 250 */
} // :goto_0
/* .line 244 */
} // :cond_1
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* sub-int/2addr v0, v3 */
/* if-lt p1, v0, :cond_2 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mOrgX:I */
/* add-int/lit8 v0, v0, 0x45 */
/* add-int/lit8 v0, v0, 0x19 */
/* if-ge p1, v0, :cond_2 */
/* .line 245 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* sub-int/2addr v0, v3 */
/* if-le p2, v0, :cond_2 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* add-int/lit8 v0, v0, 0x37 */
/* if-ge p2, v0, :cond_2 */
/* .line 246 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
/* move v0, v2 */
/* .line 250 */
} // .end method
public Boolean isHit ( ) {
/* .locals 1 */
/* .prologue */
/* .line 259 */
/* iget-boolean v0, p0, Lcom/funbox/game/ang/Animal;->mIsHit:Z */
} // .end method
public Boolean isSoundNow ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 264 */
/* iget-boolean v0, p0, Lcom/funbox/game/ang/Animal;->mIsSound:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v2 */
/* .line 273 */
} // :goto_0
/* .line 267 */
} // :cond_0
v0 = this.mStatus;
v1 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_UP;
/* if-ne v0, v1, :cond_1 */
/* .line 268 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* iget v1, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* sub-int/2addr v0, v1 */
/* const/16 v1, 0xa */
/* if-le v0, v1, :cond_1 */
/* .line 270 */
/* iput-boolean v3, p0, Lcom/funbox/game/ang/Animal;->mIsSound:Z */
/* move v0, v3 */
/* .line 271 */
} // :cond_1
/* move v0, v2 */
/* .line 273 */
} // .end method
public Boolean move ( ) {
/* .locals 3 */
/* .prologue */
/* .line 202 */
com.funbox.game.ang.Animal .$SWITCH_TABLE$com$funbox$game$angrypoke$Animal$ANIMAL_STATUS ( );
v1 = this.mStatus;
v1 = (( com.funbox.game.ang.Animal$ANIMAL_STATUS ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/Animal$ANIMAL_STATUS;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
/* .line 235 */
} // :cond_0
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* .line 204 */
/* :pswitch_0 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* iget v1, p0, Lcom/funbox/game/ang/Animal;->mSpeed:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* .line 206 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* iget v1, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* sub-int/2addr v0, v1 */
/* const/16 v1, 0x30 */
/* if-lt v0, v1, :cond_0 */
/* .line 208 */
v0 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_STOP;
this.mStatus = v0;
/* .line 214 */
/* :pswitch_1 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mSpeed:I */
/* const/16 v1, 0x8 */
/* if-le v0, v1, :cond_1 */
/* .line 215 */
int v0 = 7; // const/4 v0, 0x7
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mSpeed:I */
/* .line 217 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/funbox/game/ang/Animal;->mIsHit:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 218 */
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lcom/funbox/game/ang/Animal;->mSpeed:I */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* add-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* .line 223 */
} // :goto_2
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* iget v1, p0, Lcom/funbox/game/ang/Animal;->mOrgY:I */
/* if-le v0, v1, :cond_0 */
/* .line 224 */
v0 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_FINISH;
this.mStatus = v0;
/* .line 225 */
(( com.funbox.game.ang.Animal ) p0 ).End ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Animal;->End()V
/* .line 226 */
int v0 = 0; // const/4 v0, 0x0
/* .line 220 */
} // :cond_2
/* iget v0, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lcom/funbox/game/ang/Animal;->mSpeed:I */
/* int-to-float v1, v1 */
int v2 = 0; // const/4 v2, 0x0
/* add-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* .line 231 */
/* :pswitch_2 */
v0 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_DOWN;
this.mStatus = v0;
/* .line 202 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void setBmp ( android.graphics.Bitmap p0 ) {
/* .locals 0 */
/* .param p1, "bmpAnimal" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 165 */
this.mBmp = p1;
/* .line 166 */
return;
} // .end method
public void setBmpId ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 181 */
/* iput p1, p0, Lcom/funbox/game/ang/Animal;->mBmpId:I */
/* .line 182 */
return;
} // .end method
public void setHit ( ) {
/* .locals 1 */
/* .prologue */
/* .line 254 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/funbox/game/ang/Animal;->mIsHit:Z */
/* .line 255 */
v0 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_STOP;
this.mStatus = v0;
/* .line 256 */
return;
} // .end method
public void setSpeed ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "v" # I */
/* .prologue */
/* .line 169 */
/* iput p1, p0, Lcom/funbox/game/ang/Animal;->mSpeed:I */
/* .line 170 */
return;
} // .end method
public void setStatus ( com.funbox.game.ang.Animal$ANIMAL_STATUS p0 ) {
/* .locals 0 */
/* .param p1, "status" # Lcom/funbox/game/ang/Animal$ANIMAL_STATUS; */
/* .prologue */
/* .line 147 */
this.mStatus = p1;
/* .line 148 */
return;
} // .end method
public void setType ( com.funbox.game.ang.Animal$ANIMAL_TYPE p0 ) {
/* .locals 0 */
/* .param p1, "at" # Lcom/funbox/game/ang/Animal$ANIMAL_TYPE; */
/* .prologue */
/* .line 143 */
this.mType = p1;
/* .line 144 */
return;
} // .end method
public void start ( ) {
/* .locals 1 */
/* .prologue */
/* .line 186 */
/* iget-boolean v0, p0, Lcom/funbox/game/ang/Animal;->mAlive:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 190 */
} // :goto_0
return;
/* .line 189 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/funbox/game/ang/Animal;->mAlive:Z */
} // .end method
