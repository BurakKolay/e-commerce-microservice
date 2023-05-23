package com.burakkolay.commonpackage.events.stock;

import com.burakkolay.commonpackage.events.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDeletedEvent implements Event {
    private UUID categoryId;
}
