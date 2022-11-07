public abstract class de.hellowins.HellowinsInterface {
	 /* .source "HellowinsInterface.java" */
	 /* # virtual methods */
	 public abstract void apiFinishGame ( android.content.Context p0, Integer p1 ) {
	 } // .end method
	 public abstract void apiStartGame ( ) {
	 } // .end method
	 public abstract void apiUpdatePoints ( Integer p0 ) {
	 } // .end method
	 public abstract void clearLog ( ) {
	 } // .end method
	 public abstract void computeUrl ( java.lang.String p0 ) {
	 } // .end method
	 public abstract Integer getHighscore ( ) {
	 } // .end method
	 public abstract Integer getLevel ( ) {
	 } // .end method
	 public abstract java.lang.String getLog ( ) {
	 } // .end method
	 public abstract java.lang.String getRanking ( ) {
	 } // .end method
	 public abstract Integer getRemainingPercent ( ) {
	 } // .end method
	 public abstract java.lang.String getRemainingTime ( ) {
	 } // .end method
	 public abstract java.lang.String getVersion ( ) {
	 } // .end method
	 public abstract Boolean init ( android.app.Activity p0 ) {
	 } // .end method
	 public abstract Boolean init ( android.app.Activity p0, Boolean p1 ) {
	 } // .end method
	 public abstract Boolean isGameFinished ( ) {
	 } // .end method
	 public abstract Boolean isGameRunning ( ) {
	 } // .end method
	 public abstract Boolean isInitialized ( ) {
	 } // .end method
	 public abstract void registerUpdateHandler ( de.hellowins.HellowinsUpdateHandler p0 ) {
	 } // .end method
	 public abstract void unRegisterUpdateHandler ( de.hellowins.HellowinsUpdateHandler p0 ) {
	 } // .end method
