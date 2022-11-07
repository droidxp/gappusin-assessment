public class org.anddev.andengine.entity.particle.ParticleSystem extends org.anddev.andengine.entity.Entity {
	 /* # static fields */
	 private static final Integer BLENDFUNCTION_DESTINATION_DEFAULT;
	 private static final Integer BLENDFUNCTION_SOURCE_DEFAULT;
	 /* # instance fields */
	 private final POSITION_OFFSET;
	 private Integer mDestinationBlendFunction;
	 private final org.anddev.andengine.entity.particle.emitter.IParticleEmitter mParticleEmitter;
	 private Integer mParticleInitializerCount;
	 private final java.util.ArrayList mParticleInitializers;
	 private Integer mParticleModifierCount;
	 private final java.util.ArrayList mParticleModifiers;
	 private final org.anddev.andengine.entity.particle.Particle mParticles;
	 private Integer mParticlesAlive;
	 private Float mParticlesDueToSpawn;
	 private final Integer mParticlesMaximum;
	 private Boolean mParticlesSpawnEnabled;
	 private final Float mRateMaximum;
	 private final Float mRateMinimum;
	 private org.anddev.andengine.opengl.vertex.RectangleVertexBuffer mSharedParticleVertexBuffer;
	 private Integer mSourceBlendFunction;
	 private final org.anddev.andengine.opengl.texture.region.TextureRegion mTextureRegion;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.ParticleSystem ( ) {
		 /* .locals 6 */
		 /* const/high16 v2, 0x3f000000 # 0.5f */
		 /* new-instance v1, Lorg/anddev/andengine/entity/particle/emitter/RectangleParticleEmitter; */
		 /* mul-float v0, p3, v2 */
		 /* add-float/2addr v0, p1 */
		 /* mul-float/2addr v2, p4 */
		 /* add-float/2addr v2, p2 */
		 /* invoke-direct {v1, v0, v2, p3, p4}, Lorg/anddev/andengine/entity/particle/emitter/RectangleParticleEmitter;-><init>(FFFF)V */
		 /* move-object v0, p0 */
		 /* move v2, p5 */
		 /* move v3, p6 */
		 /* move v4, p7 */
		 /* move-object v5, p8 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/particle/ParticleSystem;-><init>(Lorg/anddev/andengine/entity/particle/emitter/IParticleEmitter;FFILorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.particle.ParticleSystem ( ) {
		 /* .locals 2 */
		 int v1 = 1; // const/4 v1, 0x1
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, v0}, Lorg/anddev/andengine/entity/Entity;-><init>(FF)V */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [F */
		 this.POSITION_OFFSET = v0;
		 /* iput v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mSourceBlendFunction:I */
		 /* const/16 v0, 0x303 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mDestinationBlendFunction:I */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mParticleInitializers = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mParticleModifiers = v0;
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesSpawnEnabled:Z */
		 this.mParticleEmitter = p1;
		 /* new-array v0, p4, [Lorg/anddev/andengine/entity/particle/Particle; */
		 this.mParticles = v0;
		 /* iput p2, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mRateMinimum:F */
		 /* iput p3, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mRateMaximum:F */
		 /* iput p4, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesMaximum:I */
		 this.mTextureRegion = p5;
		 v0 = this.mParticleEmitter;
		 (( org.anddev.andengine.entity.particle.ParticleSystem ) p0 ).registerUpdateHandler ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
		 return;
	 } // .end method
	 private Float determineCurrentRate ( ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mRateMinimum:F */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mRateMaximum:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mRateMinimum:F */
	 } // :goto_0
} // :cond_0
v0 = org.anddev.andengine.util.MathUtils.RANDOM;
v0 = (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mRateMaximum:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mRateMinimum:F */
/* sub-float/2addr v1, v2 */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mRateMinimum:F */
/* add-float/2addr v0, v1 */
} // .end method
private void spawnParticle ( ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
v0 = this.mParticles;
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
/* iget v2, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesMaximum:I */
/* if-ge v1, v2, :cond_0 */
/* aget-object v2, v0, v1 */
v3 = this.mParticleEmitter;
v4 = this.POSITION_OFFSET;
v3 = this.POSITION_OFFSET;
int v4 = 0; // const/4 v4, 0x0
/* aget v3, v3, v4 */
v4 = this.POSITION_OFFSET;
/* aget v4, v4, v7 */
if ( v2 != null) { // if-eqz v2, :cond_1
	 (( org.anddev.andengine.entity.particle.Particle ) v2 ).reset ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/entity/particle/Particle;->reset()V
	 (( org.anddev.andengine.entity.particle.Particle ) v2 ).setPosition ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lorg/anddev/andengine/entity/particle/Particle;->setPosition(FF)V
	 /* move-object v1, v2 */
} // :goto_0
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mSourceBlendFunction:I */
/* iget v2, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mDestinationBlendFunction:I */
(( org.anddev.andengine.entity.particle.Particle ) v1 ).setBlendFunction ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lorg/anddev/andengine/entity/particle/Particle;->setBlendFunction(II)V
v2 = this.mParticleInitializers;
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleInitializerCount:I */
/* sub-int/2addr v0, v7 */
/* move v3, v0 */
} // :goto_1
/* if-gez v3, :cond_3 */
v2 = this.mParticleModifiers;
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleModifierCount:I */
/* sub-int/2addr v0, v7 */
/* move v3, v0 */
} // :goto_2
/* if-gez v3, :cond_4 */
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
} // :cond_0
return;
} // :cond_1
/* if-nez v1, :cond_2 */
/* new-instance v2, Lorg/anddev/andengine/entity/particle/Particle; */
v5 = this.mTextureRegion;
/* invoke-direct {v2, v3, v4, v5}, Lorg/anddev/andengine/entity/particle/Particle;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
(( org.anddev.andengine.entity.particle.Particle ) v2 ).getVertexBuffer ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/entity/particle/Particle;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;
this.mSharedParticleVertexBuffer = v3;
} // :goto_3
/* aput-object v2, v0, v1 */
/* move-object v1, v2 */
} // :cond_2
/* new-instance v2, Lorg/anddev/andengine/entity/particle/Particle; */
v5 = this.mTextureRegion;
v6 = this.mSharedParticleVertexBuffer;
/* invoke-direct {v2, v3, v4, v5, v6}, Lorg/anddev/andengine/entity/particle/Particle;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;)V */
} // :cond_3
(( java.util.ArrayList ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/particle/initializer/IParticleInitializer; */
/* add-int/lit8 v0, v3, -0x1 */
/* move v3, v0 */
} // :cond_4
(( java.util.ArrayList ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/particle/modifier/IParticleModifier; */
/* add-int/lit8 v0, v3, -0x1 */
/* move v3, v0 */
} // .end method
private void spawnParticles ( Float p0 ) {
/* .locals 3 */
v0 = /* invoke-direct {p0}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->determineCurrentRate()F */
/* mul-float/2addr v0, p1 */
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesDueToSpawn:F */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesDueToSpawn:F */
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesMaximum:I */
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
/* sub-int/2addr v0, v1 */
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesDueToSpawn:F */
v1 = android.util.FloatMath .floor ( v1 );
/* float-to-int v1, v1 */
v0 = java.lang.Math .min ( v0,v1 );
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesDueToSpawn:F */
/* int-to-float v2, v0 */
/* sub-float/2addr v1, v2 */
/* iput v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesDueToSpawn:F */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lt v1, v0, :cond_0 */
return;
} // :cond_0
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->spawnParticle()V */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
/* # virtual methods */
public void addParticleInitializer ( org.anddev.andengine.entity.particle.initializer.IParticleInitializer p0 ) {
/* .locals 1 */
v0 = this.mParticleInitializers;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleInitializerCount:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleInitializerCount:I */
return;
} // .end method
public void addParticleModifier ( org.anddev.andengine.entity.particle.modifier.IParticleModifier p0 ) {
/* .locals 1 */
v0 = this.mParticleModifiers;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleModifierCount:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleModifierCount:I */
return;
} // .end method
public org.anddev.andengine.entity.particle.emitter.IParticleEmitter getParticleEmitter ( ) {
/* .locals 1 */
v0 = this.mParticleEmitter;
} // .end method
public Boolean isParticlesSpawnEnabled ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesSpawnEnabled:Z */
} // .end method
protected void onManagedDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 3 */
v0 = this.mParticles;
/* iget v1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
} // :goto_0
/* if-gez v1, :cond_0 */
return;
} // :cond_0
/* aget-object v2, v0, v1 */
(( org.anddev.andengine.entity.particle.Particle ) v2 ).onDraw ( p1, p2 ); // invoke-virtual {v2, p1, p2}, Lorg/anddev/andengine/entity/particle/Particle;->onDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
protected void onManagedUpdate ( Float p0 ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
/* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/Entity;->onManagedUpdate(F)V */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesSpawnEnabled:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/particle/ParticleSystem;->spawnParticles(F)V */
} // :cond_0
v1 = this.mParticles;
v2 = this.mParticleModifiers;
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleModifierCount:I */
/* sub-int v3, v0, v7 */
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
/* sub-int/2addr v0, v7 */
/* move v4, v0 */
} // :goto_0
/* if-gez v4, :cond_1 */
return;
} // :cond_1
/* aget-object v5, v1, v4 */
/* move v6, v3 */
} // :goto_1
/* if-gez v6, :cond_3 */
(( org.anddev.andengine.entity.particle.Particle ) v5 ).onUpdate ( p1 ); // invoke-virtual {v5, p1}, Lorg/anddev/andengine/entity/particle/Particle;->onUpdate(F)V
/* iget-boolean v0, v5, Lorg/anddev/andengine/entity/particle/Particle;->mDead:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
/* sub-int/2addr v0, v7 */
/* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
/* aget-object v6, v1, v0 */
/* aput-object v6, v1, v4 */
/* aput-object v5, v1, v0 */
} // :cond_2
/* add-int/lit8 v0, v4, -0x1 */
/* move v4, v0 */
} // :cond_3
(( java.util.ArrayList ) v2 ).get ( v6 ); // invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/particle/modifier/IParticleModifier; */
/* add-int/lit8 v0, v6, -0x1 */
/* move v6, v0 */
} // .end method
public void removeParticleInitializer ( org.anddev.andengine.entity.particle.initializer.IParticleInitializer p0 ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleInitializerCount:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleInitializerCount:I */
v0 = this.mParticleInitializers;
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
return;
} // .end method
public void removeParticleModifier ( org.anddev.andengine.entity.particle.modifier.IParticleModifier p0 ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleModifierCount:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticleModifierCount:I */
v0 = this.mParticleModifiers;
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
return;
} // .end method
public void reset ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lorg/anddev/andengine/entity/Entity;->reset()V */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesDueToSpawn:F */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesAlive:I */
return;
} // .end method
public void setBlendFunction ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mSourceBlendFunction:I */
/* iput p2, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mDestinationBlendFunction:I */
return;
} // .end method
public void setParticlesSpawnEnabled ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/entity/particle/ParticleSystem;->mParticlesSpawnEnabled:Z */
return;
} // .end method
