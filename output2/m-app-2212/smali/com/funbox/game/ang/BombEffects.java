class com.funbox.game.ang.BombEffects {
	 /* .source "BombEffects.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/funbox/game/ang/BombEffects$EFFECTS_TYPE; */
	 /* } */
} // .end annotation
/* # instance fields */
private Boolean mAlive;
private final mBombId;
private com.funbox.game.ang.BombEffects$EFFECTS_TYPE mEffectsType;
private final mFireId;
public final I mPos;
private Integer mStepId;
/* # direct methods */
public com.funbox.game.ang.BombEffects ( ) {
	 /* .locals 6 */
	 /* .prologue */
	 /* const/16 v1, 0x9 */
	 int v5 = 0; // const/4 v5, 0x0
	 int v4 = 2; // const/4 v4, 0x2
	 /* .line 53 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 8 */
	 /* const/16 v0, 0xa */
	 /* new-array v0, v0, [I */
	 /* fill-array-data v0, :array_0 */
	 /* .line 17 */
	 this.mBombId = v0;
	 /* .line 19 */
	 /* new-array v0, v1, [I */
	 /* fill-array-data v0, :array_1 */
	 /* .line 27 */
	 this.mFireId = v0;
	 /* .line 41 */
	 /* new-array v0, v1, [[I */
	 /* new-array v1, v4, [I */
	 /* const/16 v2, 0x1f */
	 /* aput v2, v1, v5 */
	 /* aput-object v1, v0, v5 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* new-array v2, v4, [I */
	 /* const/16 v3, 0x7e */
	 /* aput v3, v2, v5 */
	 /* aput-object v2, v0, v1 */
	 /* new-array v1, v4, [I */
	 /* const/16 v2, 0xe3 */
	 /* aput v2, v1, v5 */
	 /* aput-object v1, v0, v4 */
	 int v1 = 3; // const/4 v1, 0x3
	 /* .line 42 */
	 /* new-array v2, v4, [I */
	 /* fill-array-data v2, :array_2 */
	 /* aput-object v2, v0, v1 */
	 int v1 = 4; // const/4 v1, 0x4
	 /* new-array v2, v4, [I */
	 /* fill-array-data v2, :array_3 */
	 /* aput-object v2, v0, v1 */
	 int v1 = 5; // const/4 v1, 0x5
	 /* new-array v2, v4, [I */
	 /* fill-array-data v2, :array_4 */
	 /* aput-object v2, v0, v1 */
	 int v1 = 6; // const/4 v1, 0x6
	 /* .line 43 */
	 /* new-array v2, v4, [I */
	 /* fill-array-data v2, :array_5 */
	 /* aput-object v2, v0, v1 */
	 int v1 = 7; // const/4 v1, 0x7
	 /* new-array v2, v4, [I */
	 /* fill-array-data v2, :array_6 */
	 /* aput-object v2, v0, v1 */
	 /* const/16 v1, 0x8 */
	 /* new-array v2, v4, [I */
	 /* fill-array-data v2, :array_7 */
	 /* aput-object v2, v0, v1 */
	 this.mPos = v0;
	 /* .line 64 */
	 /* iput v5, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
	 /* .line 54 */
	 /* iput-boolean v5, p0, Lcom/funbox/game/ang/BombEffects;->mAlive:Z */
	 /* .line 55 */
	 /* iput v5, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
	 /* .line 56 */
	 v0 = com.funbox.game.ang.BombEffects$EFFECTS_TYPE.ET_BOMB;
	 this.mEffectsType = v0;
	 /* .line 57 */
	 return;
	 /* .line 8 */
	 /* :array_0 */
	 /* .array-data 4 */
	 /* 0x7f020013 */
	 /* 0x7f020014 */
	 /* 0x7f020015 */
	 /* 0x7f020016 */
	 /* 0x7f020017 */
	 /* 0x7f020018 */
	 /* 0x7f020019 */
	 /* 0x7f02001a */
	 /* 0x7f02001b */
	 /* 0x7f02001c */
} // .end array-data
/* .line 19 */
/* :array_1 */
/* .array-data 4 */
/* 0x7f020051 */
/* 0x7f020052 */
/* 0x7f020053 */
/* 0x7f020054 */
/* 0x7f020055 */
/* 0x7f020056 */
/* 0x7f020057 */
/* 0x7f020058 */
/* 0x7f020059 */
} // .end array-data
/* .line 42 */
/* :array_2 */
/* .array-data 4 */
/* 0x1a */
/* 0x57 */
} // .end array-data
/* :array_3 */
/* .array-data 4 */
/* 0x7e */
/* 0x57 */
} // .end array-data
/* :array_4 */
/* .array-data 4 */
/* 0xe5 */
/* 0x57 */
} // .end array-data
/* .line 43 */
/* :array_5 */
/* .array-data 4 */
/* 0x17 */
/* 0xbb */
} // .end array-data
/* :array_6 */
/* .array-data 4 */
/* 0x7d */
/* 0xbb */
} // .end array-data
/* :array_7 */
/* .array-data 4 */
/* 0xe8 */
/* 0xbb */
} // .end array-data
} // .end method
/* # virtual methods */
public void end ( ) {
/* .locals 1 */
/* .prologue */
/* .line 108 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/funbox/game/ang/BombEffects;->mAlive:Z */
/* .line 109 */
return;
} // .end method
public Integer getCurBmpId ( ) {
/* .locals 4 */
/* .prologue */
int v3 = -1; // const/4 v3, -0x1
/* .line 68 */
v1 = this.mEffectsType;
v2 = com.funbox.game.ang.BombEffects$EFFECTS_TYPE.ET_BOMB;
/* if-ne v1, v2, :cond_1 */
/* .line 69 */
/* iget v1, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
v2 = this.mBombId;
/* array-length v2, v2 */
/* if-lt v1, v2, :cond_0 */
/* move v1, v3 */
/* .line 81 */
} // :goto_0
/* .line 72 */
} // :cond_0
v1 = this.mBombId;
/* iget v2, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
/* aget v0, v1, v2 */
/* .local v0, "bmpId":I */
} // :goto_1
/* move v1, v0 */
/* .line 81 */
/* .line 75 */
} // .end local v0 # "bmpId":I
} // :cond_1
/* iget v1, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
v2 = this.mFireId;
/* array-length v2, v2 */
/* if-lt v1, v2, :cond_2 */
/* move v1, v3 */
/* .line 76 */
/* .line 78 */
} // :cond_2
v1 = this.mFireId;
/* iget v2, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
/* aget v0, v1, v2 */
/* .restart local v0 # "bmpId":I */
} // .end method
public com.funbox.game.ang.BombEffects$EFFECTS_TYPE getEffectType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 60 */
v0 = this.mEffectsType;
} // .end method
public Boolean isAlive ( ) {
/* .locals 1 */
/* .prologue */
/* .line 116 */
/* iget-boolean v0, p0, Lcom/funbox/game/ang/BombEffects;->mAlive:Z */
} // .end method
public Boolean nextStep ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 85 */
/* iget-boolean v0, p0, Lcom/funbox/game/ang/BombEffects;->mAlive:Z */
/* if-nez v0, :cond_0 */
/* move v0, v2 */
/* .line 97 */
} // :goto_0
/* .line 88 */
} // :cond_0
/* iget v0, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
/* .line 90 */
v0 = this.mEffectsType;
v1 = com.funbox.game.ang.BombEffects$EFFECTS_TYPE.ET_BOMB;
/* if-ne v0, v1, :cond_1 */
/* .line 91 */
/* iget v0, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
v1 = this.mBombId;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_2 */
/* move v0, v2 */
/* .line 92 */
/* .line 94 */
} // :cond_1
/* iget v0, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
v1 = this.mFireId;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_2 */
/* move v0, v2 */
/* .line 95 */
/* .line 97 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void ready ( ) {
/* .locals 1 */
/* .prologue */
/* .line 112 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/funbox/game/ang/BombEffects;->mAlive:Z */
/* .line 113 */
return;
} // .end method
public void start ( com.funbox.game.ang.BombEffects$EFFECTS_TYPE p0 ) {
/* .locals 1 */
/* .param p1, "et" # Lcom/funbox/game/ang/BombEffects$EFFECTS_TYPE; */
/* .prologue */
/* .line 102 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/funbox/game/ang/BombEffects;->mStepId:I */
/* .line 103 */
this.mEffectsType = p1;
/* .line 104 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/funbox/game/ang/BombEffects;->mAlive:Z */
/* .line 105 */
return;
} // .end method
