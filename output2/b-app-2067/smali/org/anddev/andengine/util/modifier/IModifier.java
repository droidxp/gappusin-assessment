public abstract class org.anddev.andengine.util.modifier.IModifier implements java.lang.Cloneable {
	 /* # interfaces */
	 /* # static fields */
	 public static final java.util.Comparator MODIFIER_COMPARATOR_DURATION_DESCENDING;
	 /* # direct methods */
	 static org.anddev.andengine.util.modifier.IModifier ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/IModifier$1; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/IModifier$1;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract void addModifierListener ( org.anddev.andengine.util.modifier.IModifier$IModifierListener p0 ) {
	 } // .end method
	 public abstract org.anddev.andengine.util.modifier.IModifier clone ( ) {
	 } // .end method
	 public abstract Float getDuration ( ) {
	 } // .end method
	 public abstract Float getSecondsElapsed ( ) {
	 } // .end method
	 public abstract Boolean isFinished ( ) {
	 } // .end method
	 public abstract Boolean isRemoveWhenFinished ( ) {
	 } // .end method
	 public abstract Float onUpdate ( Float p0, java.lang.Object p1 ) {
	 } // .end method
	 public abstract Boolean removeModifierListener ( org.anddev.andengine.util.modifier.IModifier$IModifierListener p0 ) {
	 } // .end method
	 public abstract void reset ( ) {
	 } // .end method
	 public abstract void setRemoveWhenFinished ( Boolean p0 ) {
	 } // .end method
