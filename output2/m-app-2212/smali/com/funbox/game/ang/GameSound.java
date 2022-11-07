public class com.funbox.game.ang.GameSound {
	 /* .source "GameSound.java" */
	 /* # instance fields */
	 public final Integer ST_ANIMAL_HITED;
	 public final Integer ST_ANIMAL_SOUND;
	 public final Integer ST_ANIMAL_SOUND2;
	 public final Integer ST_ANIMAL_SOUND3;
	 public final Integer ST_ANIMAL_SOUND4;
	 public final Integer ST_BOMB;
	 public final Integer ST_BULLET;
	 public final Integer ST_HIT;
	 public final Integer ST_MUSIC;
	 public final Integer ST_NEXT_LEVEL;
	 public final Integer ST_NONE;
	 private final Integer mAnimalHitSoundId;
	 private final Integer mAnimalSoundId;
	 private final Integer mAnimalSoundId2;
	 private final Integer mAnimalSoundId3;
	 private final Integer mAnimalSoundId4;
	 private final Integer mBombSoundId;
	 private final Integer mBulletSoundId;
	 private final Integer mHitSoundId;
	 private final Integer mLevelSoundId;
	 private final Integer mMusicId;
	 public Boolean mMusicOn;
	 public Boolean mSoundOn;
	 public Boolean mVibrateOn;
	 /* # direct methods */
	 public com.funbox.game.ang.GameSound ( ) {
		 /* .locals 1 */
		 /* .param p1, "bMusicOn" # Z */
		 /* .param p2, "bSoundOn" # Z */
		 /* .param p3, "bVibrateOn" # Z */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_MUSIC:I */
		 /* .line 5 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_HIT:I */
		 /* .line 6 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_ANIMAL_HITED:I */
		 /* .line 8 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_ANIMAL_SOUND:I */
		 /* .line 9 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_ANIMAL_SOUND2:I */
		 /* .line 10 */
		 int v0 = 6; // const/4 v0, 0x6
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_ANIMAL_SOUND3:I */
		 /* .line 11 */
		 int v0 = 7; // const/4 v0, 0x7
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_ANIMAL_SOUND4:I */
		 /* .line 13 */
		 /* const/16 v0, 0x8 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_NEXT_LEVEL:I */
		 /* .line 14 */
		 /* const/16 v0, 0x9 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_BULLET:I */
		 /* .line 15 */
		 /* const/16 v0, 0xa */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_BOMB:I */
		 /* .line 16 */
		 /* const/16 v0, 0xb */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->ST_NONE:I */
		 /* .line 20 */
		 /* const v0, 0x7f04000d */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mMusicId:I */
		 /* .line 21 */
		 /* const v0, 0x7f04000a */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mHitSoundId:I */
		 /* .line 22 */
		 /* const v0, 0x7f040006 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mAnimalSoundId:I */
		 /* .line 23 */
		 /* const v0, 0x7f040007 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mAnimalSoundId2:I */
		 /* .line 24 */
		 /* const v0, 0x7f040008 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mAnimalSoundId3:I */
		 /* .line 25 */
		 /* const v0, 0x7f040009 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mAnimalSoundId4:I */
		 /* .line 26 */
		 /* const v0, 0x7f040003 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mAnimalHitSoundId:I */
		 /* .line 27 */
		 /* const v0, 0x7f04000b */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mBulletSoundId:I */
		 /* .line 28 */
		 /* const v0, 0x7f04000e */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mLevelSoundId:I */
		 /* .line 29 */
		 /* const/high16 v0, 0x7f040000 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GameSound;->mBombSoundId:I */
		 /* .line 39 */
		 /* iput-boolean p1, p0, Lcom/funbox/game/ang/GameSound;->mMusicOn:Z */
		 /* .line 40 */
		 /* iput-boolean p2, p0, Lcom/funbox/game/ang/GameSound;->mSoundOn:Z */
		 /* .line 41 */
		 /* iput-boolean p3, p0, Lcom/funbox/game/ang/GameSound;->mVibrateOn:Z */
		 /* .line 42 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getSoundResIdByType ( Integer p0 ) {
		 /* .locals 6 */
		 /* .param p1, "st" # I */
		 /* .prologue */
		 int v5 = 7; // const/4 v5, 0x7
		 int v4 = 6; // const/4 v4, 0x6
		 int v3 = 5; // const/4 v3, 0x5
		 int v2 = 4; // const/4 v2, 0x4
		 /* .line 46 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 47 */
		 /* .local v0, "resId":I */
		 int v1 = 2; // const/4 v1, 0x2
		 /* if-ne p1, v1, :cond_1 */
		 /* .line 48 */
		 /* const v0, 0x7f04000a */
		 /* .line 74 */
	 } // :cond_0
} // :goto_0
/* .line 49 */
} // :cond_1
int v1 = 3; // const/4 v1, 0x3
/* if-ne p1, v1, :cond_2 */
/* .line 50 */
/* const v0, 0x7f040003 */
/* .line 51 */
} // :cond_2
/* if-eq p1, v2, :cond_3 */
/* .line 52 */
/* if-eq p1, v3, :cond_3 */
/* .line 53 */
/* if-eq p1, v4, :cond_3 */
/* .line 54 */
/* if-ne p1, v5, :cond_7 */
/* .line 56 */
} // :cond_3
/* if-ne p1, v2, :cond_4 */
/* .line 57 */
/* const v0, 0x7f040006 */
/* .line 58 */
} // :cond_4
/* if-ne p1, v3, :cond_5 */
/* .line 59 */
/* const v0, 0x7f040007 */
/* .line 60 */
} // :cond_5
/* if-ne p1, v4, :cond_6 */
/* .line 61 */
/* const v0, 0x7f040008 */
/* .line 62 */
} // :cond_6
/* if-ne p1, v5, :cond_0 */
/* .line 63 */
/* const v0, 0x7f040009 */
/* .line 65 */
} // :cond_7
/* const/16 v1, 0x8 */
/* if-ne p1, v1, :cond_8 */
/* .line 66 */
/* const v0, 0x7f04000e */
/* .line 67 */
} // :cond_8
/* const/16 v1, 0x9 */
/* if-ne p1, v1, :cond_9 */
/* .line 68 */
/* const v0, 0x7f04000b */
/* .line 69 */
} // :cond_9
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v1, :cond_a */
/* .line 70 */
/* const v0, 0x7f04000d */
/* .line 71 */
} // :cond_a
/* const/16 v1, 0xa */
/* if-ne p1, v1, :cond_0 */
/* .line 72 */
/* const/high16 v0, 0x7f040000 */
} // .end method
