package com.hildi.javacore.sprint3.task8;

import java.util.List;

public class Calculator {

    /**
     * @param mediaItems возвращает общее количество дней, потраченных на просмотр фильмов и сериалов
     * @return
     */
    public static double calculate(List<MediaItem> mediaItems) {
        double minutes = 0;
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Movie) {
                minutes += mediaItem.getRuntime();
            } else if (mediaItem instanceof Series) {
                minutes += mediaItem.getRuntime() * ((Series) mediaItem).getSeriesCount();
            }
        }
        return minutes / (60*24);
    }

}