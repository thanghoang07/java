package tuan9;

import java.util.List;

public class ListMoveUtil
{
    enum Position
    {
        BEFORE, AFTER
    };

    /**
     * Moves element `elementToMove` to be just before or just after `targetElement`.
     *
     * @param list
     * @param elementToMove
     * @param targetElement
     * @param pos
     */
    public static <T> void moveElementTo( List<T> list, T elementToMove, T targetElement, Position pos )
    {
        if ( elementToMove.equals( targetElement ) )
        {
            return;
        }
        int srcIndex = list.indexOf( elementToMove );
        int targetIndex = list.indexOf( targetElement );
        if ( srcIndex < 0 )
        {
            throw new IllegalArgumentException( "Element: " + elementToMove + " not in the list!" );
        }
        if ( targetIndex < 0 )
        {
            throw new IllegalArgumentException( "Element: " + targetElement + " not in the list!" );
        }
        list.remove( elementToMove );

        // if the element to move is after the targetelement in the list, just remove it
        // else the element to move is before the targetelement. When we removed it, the targetindex should be decreased by one
        if ( srcIndex < targetIndex )
        {
            targetIndex -= 1;
        }
        switch ( pos )
        {
            case AFTER:
                list.add( targetIndex + 1, elementToMove );
                break;
            case BEFORE:
                list.add( targetIndex, elementToMove );
                break;
        }
    }
}
